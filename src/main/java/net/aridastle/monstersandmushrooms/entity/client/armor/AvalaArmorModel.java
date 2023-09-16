package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.AvalaArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AvalaArmorModel extends GeoModel<AvalaArmorItem> {
    @Override
    public ResourceLocation getModelResource(AvalaArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "avalaheavy");
    }

    @Override
    public ResourceLocation getTextureResource(AvalaArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"avalaheavy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AvalaArmorItem animatable) {
        return null;
    }
}
