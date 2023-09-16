package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.WitherArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WitherArmorModel extends GeoModel<WitherArmorItem> {
    @Override
    public ResourceLocation getModelResource(WitherArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "witherlight");
    }

    @Override
    public ResourceLocation getTextureResource(WitherArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"witherlight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WitherArmorItem animatable) {
        return null;
    }
}
