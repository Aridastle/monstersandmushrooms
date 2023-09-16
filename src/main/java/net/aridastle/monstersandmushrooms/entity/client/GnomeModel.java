package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Gnome;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GnomeModel extends GeoModel<Gnome> {
    @Override
    public ResourceLocation getModelResource(Gnome object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/gnome.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Gnome object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/gnome/gnome.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Gnome animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/gnome.animation.json");
    }
}
