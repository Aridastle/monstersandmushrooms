package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BugsyWandItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BugsyWandRenderer extends GeoItemRenderer<BugsyWandItem> {
    public BugsyWandRenderer() {
        super(new BugsyWandModel());
    }
}