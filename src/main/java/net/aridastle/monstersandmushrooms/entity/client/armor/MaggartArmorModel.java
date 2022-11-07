package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.MaggartArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MaggartArmorModel extends AnimatedGeoModel<MaggartArmorItem> {
    @Override
    public ResourceLocation getModelResource(MaggartArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/maggartmedium.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MaggartArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/maggartmedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MaggartArmorItem animatable) {
        return null;
    }
}

