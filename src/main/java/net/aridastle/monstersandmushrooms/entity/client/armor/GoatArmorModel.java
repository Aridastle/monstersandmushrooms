package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GoatArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoatArmorModel extends AnimatedGeoModel<GoatArmorItem> {
    @Override
    public ResourceLocation getModelResource(GoatArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/goatheavy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GoatArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/goatheavy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GoatArmorItem animatable) {
        return null;
    }
}
