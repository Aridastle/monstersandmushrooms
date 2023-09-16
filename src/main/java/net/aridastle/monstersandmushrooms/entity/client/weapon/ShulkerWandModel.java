package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ShulkerWandItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShulkerWandModel extends GeoModel<ShulkerWandItem> {
    @Override
    public ResourceLocation getModelResource(ShulkerWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/endwand.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShulkerWandItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/endwand.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShulkerWandItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/endwand.animation.json");
    }
}