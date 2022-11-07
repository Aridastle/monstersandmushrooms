package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.WardenArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WardenArmorModel extends AnimatedGeoModel<WardenArmorItem> {
    @Override
    public ResourceLocation getModelResource(WardenArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/wardenheavy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WardenArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/wardenheavy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WardenArmorItem animatable) {
        return null;
    }
}
