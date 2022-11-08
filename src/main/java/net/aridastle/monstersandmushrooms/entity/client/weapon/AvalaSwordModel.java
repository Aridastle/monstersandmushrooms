package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.AvalaSwordItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AvalaSwordModel extends AnimatedGeoModel<AvalaSwordItem> {
    @Override
    public ResourceLocation getModelResource(AvalaSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/avalasword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AvalaSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/avalasword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AvalaSwordItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/avalasword.animation.json");
    }
}
