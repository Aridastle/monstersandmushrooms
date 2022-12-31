package net.aridastle.monstersandmushrooms.item.custom;

import com.google.common.collect.ImmutableMap;
import net.aridastle.monstersandmushrooms.item.ModArmorMaterials;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.Map;

public class BugsyArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModArmorMaterials.SUSPICIOUS_LEAF, new MobEffectInstance(MobEffects.LUCK, 200)).build();

    public BugsyArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<BugsyArmorItem>(this, "controller",
                20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1));
        }
        if (player.hurtTime < 1 && player.getLastHurtByMob() != null){
            if(!(player.getLastHurtByMob().hasEffect(MobEffects.WEAKNESS)
                    || player.getLastHurtByMob().hasEffect(MobEffects.POISON)
                    || player.getLastHurtByMob().hasEffect(MobEffects.MOVEMENT_SLOWDOWN)
                    || player.getLastHurtByMob().hasEffect(MobEffects.LEVITATION)
                    || player.getLastHurtByMob().hasEffect(MobEffects.GLOWING))){
            int max = 4;
            int min = 0;
            int rand_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(rand_int == 0) {player.getLastHurtByMob().addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100));}
            else if (rand_int == 1) {player.getLastHurtByMob().addEffect(new MobEffectInstance(MobEffects.POISON, 50));}
            else if (rand_int == 2){player.getLastHurtByMob().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100));}
            else if (rand_int == 3){player.getLastHurtByMob().addEffect(new MobEffectInstance(MobEffects.LEVITATION, 50));}
            else if (rand_int == 4){player.getLastHurtByMob().addEffect(new MobEffectInstance(MobEffects.GLOWING, 100));}
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}