package net.aridastle.monstersandmushrooms.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.TimeUtil;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.UUID;

public class Bugsy extends Monster implements GeoEntity, NeutralMob {

    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);
    public Bugsy(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    private static final UniformInt PERSISTENT_ANGER_TIME = TimeUtil.rangeOfSeconds(20, 39);
    private int remainingPersistentAngerTime;
    @Nullable
    private UUID persistentAngerTarget;
    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.00)
                .add(Attributes.ATTACK_DAMAGE, 3.0f)
                .add(Attributes.ATTACK_SPEED, 4.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.3f)
                .build();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(1, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this)).setAlertOthers());
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, this::isAngryAt));
        this.targetSelector.addGoal(4, new ResetUniversalAngerTargetGoal<>(this, true));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
    }

    private PlayState predicate(AnimationState state) {
        boolean walking = ((this.getDeltaMovement().x != 0.0) || (this.getDeltaMovement().z != 0.0));
        if (walking){
            state.getController().setAnimation(RawAnimation.begin().then("animation.bugsy.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        state.getController().setAnimation(RawAnimation.begin().then("animation.bugsy.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }
    private PlayState attackPredicate(AnimationState state) {
        if(this.swinging && state.getController().getAnimationState().equals(AnimationController.State.STOPPED)) {
            state.getController().forceAnimationReset();
            state.getController().setAnimation(RawAnimation.begin().then("animation.bugsy.attack", Animation.LoopType.PLAY_ONCE));
            this.swinging = false;
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController(this, "controller", 0, this::predicate));
        controllers.add(new AnimationController(this, "attackcontroller", 0, this::attackPredicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    @Override
    public int getRemainingPersistentAngerTime() {
        return this.remainingPersistentAngerTime;
    }

    @Override
    public void setRemainingPersistentAngerTime(int p_21673_) {
        this.remainingPersistentAngerTime = p_21673_;
    }

    @Nullable
    @Override
    public UUID getPersistentAngerTarget() {
        return this.persistentAngerTarget;
    }

    @Override
    public void setPersistentAngerTarget(@Nullable UUID p_21672_){
        this.persistentAngerTarget = p_21672_;

    }

    @Override
    public void startPersistentAngerTimer() {
        this.setRemainingPersistentAngerTime(PERSISTENT_ANGER_TIME.sample(this.random));
    }

    @Override
    public void setTarget(@Nullable LivingEntity p_21681_) {
        if (this.getTarget() == null && p_21681_ != null) {
            //this.playFirstAngerSoundIn = FIRST_ANGER_SOUND_DELAY.sample(this.random);
            //this.ticksUntilNextAlert = ALERT_INTERVAL.sample(this.random);
        }

        if (p_21681_ instanceof Player) {
            this.setLastHurtByPlayer((Player)p_21681_);
        }

        super.setTarget(p_21681_);
    }

    protected void playStepSound(BlockPos pos, BlockState blovkIn) {
        this.playSound(SoundEvents.MOSS_STEP, 0.15F, 1.0F);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ALLAY_AMBIENT_WITHOUT_ITEM;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.VEX_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.VEX_DEATH;
    }
    public static void applyChaosAround(ServerLevel p_219376_, Vec3 p_219377_, @javax.annotation.Nullable Entity p_219378_, int p_219379_) {
        int max = 5;
        int min = 0;
        int rand_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        MobEffectInstance mobeffectinstance = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500);
        if(rand_int == 0) {mobeffectinstance = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500);}
        else if (rand_int == 1) {mobeffectinstance = new MobEffectInstance(MobEffects.REGENERATION, 500);}
        else if (rand_int == 2){mobeffectinstance = new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500);}
        else if (rand_int == 3){mobeffectinstance = new MobEffectInstance(MobEffects.LEVITATION, 500);}
        else if (rand_int == 4){mobeffectinstance = new MobEffectInstance(MobEffects.GLOWING, 500);}
        else if (rand_int == 5){mobeffectinstance = new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 500);}
        else if (rand_int == 6){mobeffectinstance = new MobEffectInstance(MobEffects.DIG_SPEED, 500);}
        else if (rand_int == 7){mobeffectinstance = new MobEffectInstance(MobEffects.BLINDNESS, 500);}
        else if (rand_int == 8){mobeffectinstance = new MobEffectInstance(MobEffects.HUNGER, 500);}
        else if (rand_int == 9){mobeffectinstance = new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500);}
        MobEffectUtil.addEffectToPlayersAround(p_219376_, p_219378_, p_219377_, (double)p_219379_, mobeffectinstance, 200);
    }
    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide) {
            this.tickLeash();
            if (this.tickCount % 500 == 0) {
                this.updateControlFlags();
                applyChaosAround((ServerLevel) level(), this.position(), this, 20);
            }
        }

    }
}
