package net.aridastle.monstersandmushrooms.item.custom;

import net.aridastle.monstersandmushrooms.entity.client.weapon.EnderStaffRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.function.Consumer;

public class EnderStaffItem extends SwordItem implements IAnimatable {
    public AnimationFactory factory = new AnimationFactory(this);

    public EnderStaffItem(Tier ttier, int attack_damage, float attack_speed, Properties pproperties) {
        super(ttier, attack_damage, attack_speed, pproperties);
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new EnderStaffRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.endstaff.aura", true));

        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            teleportEffect(player,level);
            player.getCooldowns().addCooldown(this, 100);
        }

        return super.use(level, player, hand);
    }

    private void teleportEffect(Player player, Level level) {
        Vec3 to = rangedEffect(player, level, 50);
        player.teleportTo(to.x, to.y, to.z);
        player.fallDistance = 0;
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
