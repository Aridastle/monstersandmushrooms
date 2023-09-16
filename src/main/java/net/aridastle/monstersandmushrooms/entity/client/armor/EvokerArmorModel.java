package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.EvokerArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EvokerArmorModel extends GeoModel<EvokerArmorItem> {
    @Override
    public ResourceLocation getModelResource(EvokerArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "evokerlight");
    }

    @Override
    public ResourceLocation getTextureResource(EvokerArmorItem object) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID,"evokerlight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EvokerArmorItem animatable) {
        return null;
    }
}
