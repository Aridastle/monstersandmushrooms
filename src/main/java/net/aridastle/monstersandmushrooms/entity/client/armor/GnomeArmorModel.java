package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GnomeArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GnomeArmorModel extends GeoModel<GnomeArmorItem> {
    @Override
    public ResourceLocation getModelResource(GnomeArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "gnomemedium");
    }

    @Override
    public ResourceLocation getTextureResource(GnomeArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"gnomemedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GnomeArmorItem animatable) {
        return null;
    }
}

