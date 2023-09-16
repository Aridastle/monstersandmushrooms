package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Avala;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AvalaModel extends GeoModel<Avala> {
    @Override
    public ResourceLocation getModelResource(Avala object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/avala.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Avala object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/avala/avala.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Avala animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/avala.animation.json");
    }
}
