package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.MaggartArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MaggartArmorRenderer extends GeoArmorRenderer<MaggartArmorItem> {
    public MaggartArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(monstersandmushrooms.MOD_ID, "maggartmedium")));
    }
}