package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.StrayStaffItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StrayStaffModel extends GeoModel<StrayStaffItem> {
    @Override
    public ResourceLocation getModelResource(StrayStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/straystaff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StrayStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/straystaff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StrayStaffItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/straystaff.animation.json");
    }
}