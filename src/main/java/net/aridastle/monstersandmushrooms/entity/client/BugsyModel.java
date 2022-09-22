package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Bugsy;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BugsyModel extends AnimatedGeoModel<Bugsy> {
    @Override
    public ResourceLocation getModelResource(Bugsy object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/bugsy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Bugsy object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/bugsy/bugsy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Bugsy animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/bugsy.animation.json");
    }
}
