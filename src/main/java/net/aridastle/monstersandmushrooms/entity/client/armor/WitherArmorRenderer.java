package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.WitherArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WitherArmorRenderer extends GeoArmorRenderer<WitherArmorItem> {
    public WitherArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(monstersandmushrooms.MOD_ID, "witherlight")));
    }
}