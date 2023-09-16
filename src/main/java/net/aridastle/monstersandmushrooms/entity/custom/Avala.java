package net.aridastle.monstersandmushrooms.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class Avala extends Monster implements GeoEntity {

    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);
    public Avala(EntityType<? extends Monster> p_33002_, Level p_33003_) { super(p_33002_, p_33003_); }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 300.00)
                .add(Attributes.ATTACK_DAMAGE, 30.0f)
                .add(Attributes.ATTACK_SPEED, 2.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.1f)
                .build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(1, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this)).setAlertOthers());
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
    }

    private PlayState predicate(AnimationState state) {
        boolean walking = ((this.getDeltaMovement().x != 0.0) || (this.getDeltaMovement().z != 0.0));
        if (walking){
            state.getController().setAnimation(RawAnimation.begin().then("animation.avala.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        state.getController().setAnimation(RawAnimation.begin().then("animation.avala.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }
    private PlayState attackPredicate(AnimationState state) {
        if(this.swinging && state.getController().getAnimationState().equals(AnimationController.State.STOPPED)) {
            state.getController().forceAnimationReset();
            state.getController().setAnimation(RawAnimation.begin().then("animation.avala.attack", Animation.LoopType.PLAY_ONCE));
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

    protected void playStepSound(BlockPos pos, BlockState blovkIn) {
        this.playSound(SoundEvents.IRON_GOLEM_STEP, 0.5F, 1.0F);
    }
    protected SoundEvent getAmbientSound() {
        return SoundEvents.SNOW_GOLEM_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.IRON_GOLEM_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
    }
}
