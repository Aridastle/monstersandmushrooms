package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.MaggartArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MaggartArmorModel extends GeoModel<MaggartArmorItem> {
    @Override
    public ResourceLocation getModelResource(MaggartArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "maggartmedium");
    }

    @Override
    public ResourceLocation getTextureResource(MaggartArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"maggartmedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MaggartArmorItem animatable) {
        return null;
    }
}

