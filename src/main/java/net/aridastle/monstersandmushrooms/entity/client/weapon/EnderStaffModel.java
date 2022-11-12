package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.EnderStaffItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EnderStaffModel extends AnimatedGeoModel<EnderStaffItem> {
    @Override
    public ResourceLocation getModelResource(EnderStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "geo/endstaff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EnderStaffItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"textures/item/endstaff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EnderStaffItem animatable) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "animations/endstaff.animation.json");
    }
}