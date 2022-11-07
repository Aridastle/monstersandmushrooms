package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GnomeArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GnomeArmorModel extends AnimatedGeoModel<GnomeArmorItem> {
    @Override
    public ResourceLocation getModelResource(GnomeArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/gnomemedium.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GnomeArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/gnomemedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GnomeArmorItem animatable) {
        return null;
    }
}

