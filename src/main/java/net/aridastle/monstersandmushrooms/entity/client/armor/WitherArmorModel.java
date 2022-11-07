package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.WitherArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WitherArmorModel extends AnimatedGeoModel<WitherArmorItem> {
    @Override
    public ResourceLocation getModelResource(WitherArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/witherlight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WitherArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/witherlight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WitherArmorItem animatable) {
        return null;
    }
}
