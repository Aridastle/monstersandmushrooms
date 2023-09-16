package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GuardianArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GuardianArmorModel extends GeoModel<GuardianArmorItem> {
    @Override
    public ResourceLocation getModelResource(GuardianArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "guardianmedium");
    }

    @Override
    public ResourceLocation getTextureResource(GuardianArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"guardianmedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GuardianArmorItem animatable) {
        return null;
    }
}

