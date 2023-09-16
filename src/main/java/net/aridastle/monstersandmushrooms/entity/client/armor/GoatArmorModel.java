package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GoatArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GoatArmorModel extends GeoModel<GoatArmorItem> {
    @Override
    public ResourceLocation getModelResource(GoatArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "goatheavy");
    }

    @Override
    public ResourceLocation getTextureResource(GoatArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"goatheavy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GoatArmorItem animatable) {
        return null;
    }
}
