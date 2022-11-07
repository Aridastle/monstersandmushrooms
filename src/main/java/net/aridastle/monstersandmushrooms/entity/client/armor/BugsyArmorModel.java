package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.BugsyArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BugsyArmorModel extends AnimatedGeoModel<BugsyArmorItem> {
    @Override
    public ResourceLocation getModelResource(BugsyArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/bugsylight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BugsyArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/bugsylight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BugsyArmorItem animatable) {
        return null;
    }
}
