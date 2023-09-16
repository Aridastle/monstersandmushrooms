package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.ShroomsterArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShroomsterArmorModel extends GeoModel<ShroomsterArmorItem> {
    @Override
    public ResourceLocation getModelResource(ShroomsterArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "shroomsterlight");
    }

    @Override
    public ResourceLocation getTextureResource(ShroomsterArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"shroomsterlight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShroomsterArmorItem animatable) {
        return null;
    }
}
