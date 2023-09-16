package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BugsyWandItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BugsyWandRenderer extends GeoItemRenderer<BugsyWandItem> {
    public BugsyWandRenderer() {
        super(new BugsyWandModel());
    }
}