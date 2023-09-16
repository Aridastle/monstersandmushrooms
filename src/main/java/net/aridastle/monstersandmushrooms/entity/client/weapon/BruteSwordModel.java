package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BruteSwordItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BruteSwordModel extends GeoModel<BruteSwordItem> {
    @Override
    public ResourceLocation getModelResource(BruteSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/brutesword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BruteSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/brutesword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BruteSwordItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/brutesword.animation.json");
    }
}