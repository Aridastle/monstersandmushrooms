package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.EvokerArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EvokerArmorModel extends AnimatedGeoModel<EvokerArmorItem> {
    @Override
    public ResourceLocation getModelResource(EvokerArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/evokerlight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EvokerArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/evokerlight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EvokerArmorItem animatable) {
        return null;
    }
}
