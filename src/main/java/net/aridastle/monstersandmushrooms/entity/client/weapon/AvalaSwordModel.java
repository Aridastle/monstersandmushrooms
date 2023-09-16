package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.AvalaSwordItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AvalaSwordModel extends GeoModel<AvalaSwordItem> {
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
