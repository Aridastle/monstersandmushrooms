package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ShroomsterStaffItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShroomsterStaffModel extends GeoModel<ShroomsterStaffItem> {
    @Override
    public ResourceLocation getModelResource(ShroomsterStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/shroomsterstaff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShroomsterStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/shroomsterstaff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShroomsterStaffItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/shroomsterstaff.animation.json");
    }
}