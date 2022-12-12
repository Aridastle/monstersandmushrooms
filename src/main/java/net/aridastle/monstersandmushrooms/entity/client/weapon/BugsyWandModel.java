package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BugsyWandItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BugsyWandModel extends AnimatedGeoModel<BugsyWandItem> {
    @Override
    public ResourceLocation getModelResource(BugsyWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/bugsywand.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BugsyWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/bugsywand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BugsyWandItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/bugsywand.animation.json");
    }
}