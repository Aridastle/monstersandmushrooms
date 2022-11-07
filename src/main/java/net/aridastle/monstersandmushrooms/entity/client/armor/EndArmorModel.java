package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.EndArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EndArmorModel extends AnimatedGeoModel<EndArmorItem> {
    @Override
    public ResourceLocation getModelResource(EndArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/endmedium.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EndArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/endmedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EndArmorItem animatable) {
        return null;
    }
}

