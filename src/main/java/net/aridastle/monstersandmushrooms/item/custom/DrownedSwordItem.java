package net.aridastle.monstersandmushrooms.item.custom;

import net.aridastle.monstersandmushrooms.entity.client.weapon.DrownedSwordRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
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

public class DrownedSwordItem extends SwordItem implements IAnimatable {
    public AnimationFactory factory = new AnimationFactory(this);

    public DrownedSwordItem(Tier ttier, int attack_damage, float attack_speed, Properties pproperties) {
        super(ttier, attack_damage, attack_speed, pproperties);
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            private final BlockEntityWithoutLevelRenderer renderer = new DrownedSwordRenderer();

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
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.drownedsword.aura", true));

        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            tridentSummon(player, level);
            player.getCooldowns().addCooldown(this, 50);
        }

        return super.use(level, player, hand);
    }

    private void tridentSummon(Player player, Level level) {
        ThrownTrident friendlyTrident = new ThrownTrident(EntityType.TRIDENT, level);
        Vec3 facing = player.getViewVector(1);
        friendlyTrident.moveTo(player.getPosition(0).x+facing.x,player.getPosition(0).y + 1.5, player.getPosition(0).z+facing.z );
        friendlyTrident.setDeltaMovement(facing.x * 2, facing.y * 2, facing.z * 2);
        level.addFreshEntity(friendlyTrident);
    }
}
