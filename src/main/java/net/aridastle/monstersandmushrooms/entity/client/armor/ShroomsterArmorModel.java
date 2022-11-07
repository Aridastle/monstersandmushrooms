package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.ShroomsterArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShroomsterArmorModel extends AnimatedGeoModel<ShroomsterArmorItem> {
    @Override
    public ResourceLocation getModelResource(ShroomsterArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/shroomsterlight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShroomsterArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/shroomsterlight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShroomsterArmorItem animatable) {
        return null;
    }
}
