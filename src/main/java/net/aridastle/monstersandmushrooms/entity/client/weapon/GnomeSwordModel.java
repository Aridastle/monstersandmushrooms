package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.GnomeSwordItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GnomeSwordModel extends AnimatedGeoModel<GnomeSwordItem> {
    @Override
    public ResourceLocation getModelResource(GnomeSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/gnomesword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GnomeSwordItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/gnomesword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GnomeSwordItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/gnomesword.animation.json");
    }
}