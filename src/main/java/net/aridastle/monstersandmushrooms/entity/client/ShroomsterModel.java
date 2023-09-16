package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Shroomster;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShroomsterModel extends GeoModel<Shroomster> {
    @Override
    public ResourceLocation getModelResource(Shroomster object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/shroomster.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Shroomster object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/shroomster/shroomster.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Shroomster animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/shroomster.animation.json");
    }
}
