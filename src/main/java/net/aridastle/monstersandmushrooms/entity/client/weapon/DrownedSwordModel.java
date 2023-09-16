package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.DrownedSwordItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DrownedSwordModel extends GeoModel<DrownedSwordItem> {
    @Override
    public ResourceLocation getModelResource(DrownedSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/drownedsword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrownedSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/drownedsword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrownedSwordItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/drownedsword.animation.json");
    }
}