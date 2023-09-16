package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.MagmaCubeStaffItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MagmaCubeStaffModel extends GeoModel<MagmaCubeStaffItem> {
    @Override
    public ResourceLocation getModelResource(MagmaCubeStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/magmacubestaff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MagmaCubeStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/magmacubestaff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MagmaCubeStaffItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/magmacubestaff.animation.json");
    }
}