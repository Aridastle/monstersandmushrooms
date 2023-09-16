package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.BugsyArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BugsyArmorModel extends GeoModel<BugsyArmorItem> {
    @Override
    public ResourceLocation getModelResource(BugsyArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "bugsylight");
    }

    @Override
    public ResourceLocation getTextureResource(BugsyArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"bugsylight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BugsyArmorItem animatable) {
        return null;
    }
}
