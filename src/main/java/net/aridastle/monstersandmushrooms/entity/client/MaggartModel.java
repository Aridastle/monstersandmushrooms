package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Maggart;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MaggartModel extends AnimatedGeoModel<Maggart> {
    @Override
    public ResourceLocation getModelResource(Maggart object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/maggart.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Maggart object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/maggart/maggart.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Maggart animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/maggart.animation.json");
    }
}
