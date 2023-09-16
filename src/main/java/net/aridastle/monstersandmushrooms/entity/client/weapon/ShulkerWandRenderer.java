package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ShulkerWandItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ShulkerWandRenderer extends GeoItemRenderer<ShulkerWandItem> {
    public ShulkerWandRenderer() {
        super(new ShulkerWandModel());
    }
}