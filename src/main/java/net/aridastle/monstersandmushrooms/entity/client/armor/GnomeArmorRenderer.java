package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GnomeArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GnomeArmorRenderer extends GeoArmorRenderer<GnomeArmorItem> {
    public GnomeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(monstersandmushrooms.MOD_ID, "gnomemedium")));
    }
}