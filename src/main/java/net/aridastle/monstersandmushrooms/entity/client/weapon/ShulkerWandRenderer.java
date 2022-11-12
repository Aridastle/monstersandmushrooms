package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ShulkerWandItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ShulkerWandRenderer extends GeoItemRenderer<ShulkerWandItem> {
    public ShulkerWandRenderer() {
        super(new ShulkerWandModel());
    }
}