package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.MeangreenWandItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MeangreenWandModel extends GeoModel<MeangreenWandItem> {
    @Override
    public ResourceLocation getModelResource(MeangreenWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/meangreenwand.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MeangreenWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/meangreenwand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MeangreenWandItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/meangreenwand.animation.json");
    }
}