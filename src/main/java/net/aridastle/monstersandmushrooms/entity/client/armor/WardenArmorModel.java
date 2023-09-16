package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.WardenArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WardenArmorModel extends GeoModel<WardenArmorItem> {
    @Override
    public ResourceLocation getModelResource(WardenArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "wardenheavy");
    }

    @Override
    public ResourceLocation getTextureResource(WardenArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"wardenheavy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WardenArmorItem animatable) {
        return null;
    }
}
