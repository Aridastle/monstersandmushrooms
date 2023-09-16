package net.aridastle.monstersandmushrooms.item.custom;

import net.aridastle.monstersandmushrooms.entity.client.weapon.MaggartStaffRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.function.Consumer;

public class MaggartStaffItem extends SwordItem implements GeoAnimatable {
    public AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);

    public MaggartStaffItem(Tier ttier, int attack_damage, float attack_speed, Properties pproperties) {
        super(ttier, attack_damage, attack_speed, pproperties);
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new MaggartStaffRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController(this, "controller", 0, this::predicate));
    }

    private PlayState predicate(AnimationState state) {
        state.getController().setAnimation(RawAnimation.begin().then("animation.maggartstaff.aura", Animation.LoopType.LOOP));

        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    @Override
    public double getTick(Object object) {
        return 0;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            areaEffect(player,level);
            player.getCooldowns().addCooldown(this, 100);
        }

        return super.use(level, player, hand);
    }

    private void areaEffect(Player player, Level level) {
        Vec3 to = rangedEffect(player, level, 50);
        AreaEffectCloud lingeringPotion = new AreaEffectCloud(EntityType.AREA_EFFECT_CLOUD, level);
        lingeringPotion.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 2));
        lingeringPotion.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100));
        lingeringPotion.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100));
        lingeringPotion.moveTo(to);
        level.addFreshEntity(lingeringPotion);
    }
    private Vec3 rangedEffect(Player player, Level level, int range){
        Vec3 playerRot = player.getViewVector(0);
        Vec3 path = playerRot.scale(range);
        Vec3 from = player.getEyePosition(0);
        Vec3 to = from.add(path);

        BlockHitResult blockhit = level.clip(new ClipContext(from, to, ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, player));
        return blockhit.getLocation();
    }
}