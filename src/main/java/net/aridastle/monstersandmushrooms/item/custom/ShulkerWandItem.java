package net.aridastle.monstersandmushrooms.item.custom;

import net.aridastle.monstersandmushrooms.entity.client.weapon.ShulkerWandRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.item.Item;
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

public class ShulkerWandItem extends SwordItem implements GeoAnimatable {
    public AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);

    public ShulkerWandItem(Tier ttier, int attack_damage, float attack_speed, Item.Properties pproperties) {
        super(ttier, attack_damage, attack_speed, pproperties);
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new ShulkerWandRenderer();

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
        state.getController().setAnimation(RawAnimation.begin().then("animation.endwand.aura", Animation.LoopType.LOOP));

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
            bulletEffect(player,level);
            player.getCooldowns().addCooldown(this, 50);
        }

        return super.use(level, player, hand);
    }

    private void bulletEffect(Player player, Level level) {
        ShulkerBullet friendlyBullet = new ShulkerBullet(EntityType.SHULKER_BULLET, level);
        friendlyBullet.setOwner(player);
        Vec3 facing = player.getViewVector(1);
        friendlyBullet.moveTo(player.getPosition(0).x+facing.x,player.getPosition(0).y + 1.5, player.getPosition(0).z+facing.z );
        friendlyBullet.setDeltaMovement(facing.x * 3, facing.y * 3, facing.z * 3);
        level.addFreshEntity(friendlyBullet);
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
