package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.AvalaArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AvalaArmorModel extends AnimatedGeoModel<AvalaArmorItem> {
    @Override
    public ResourceLocation getModelResource(AvalaArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/avalaheavy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AvalaArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/models/armor/avalaheavy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AvalaArmorItem animatable) {
        return null;
    }
}
