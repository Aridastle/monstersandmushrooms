package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.EndArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EndArmorModel extends GeoModel<EndArmorItem> {
    @Override
    public ResourceLocation getModelResource(EndArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "endmedium");
    }

    @Override
    public ResourceLocation getTextureResource(EndArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"endmedium.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EndArmorItem animatable) {
        return null;
    }
}

