package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BlazeWandItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlazeWandModel extends AnimatedGeoModel<BlazeWandItem> {
    @Override
    public ResourceLocation getModelResource(BlazeWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/blazewand.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlazeWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/blazewand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BlazeWandItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/blazewand.animation.json");
    }
}