package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GuardianArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GuardianArmorModel extends AnimatedGeoModel<GuardianArmorItem> {
    @Override
    public ResourceLocation getModelResource(GuardianArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/guardianmedium.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GuardianArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/guardianmedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GuardianArmorItem animatable) {
        return null;
    }
}

