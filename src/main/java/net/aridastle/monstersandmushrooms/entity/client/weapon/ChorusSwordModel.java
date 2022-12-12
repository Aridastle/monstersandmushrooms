package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ChorusSwordItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChorusSwordModel extends AnimatedGeoModel<ChorusSwordItem> {
    @Override
    public ResourceLocation getModelResource(ChorusSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/chorussword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChorusSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/chorussword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChorusSwordItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/chorussword.animation.json");
    }
}