package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.MaggartStaffItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MaggartStaffModel extends GeoModel<MaggartStaffItem> {
    @Override
    public ResourceLocation getModelResource(MaggartStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/maggartstaff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MaggartStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/maggartstaff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MaggartStaffItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/maggartstaff.animation.json");
    }
}