package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BlazeWandItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BlazeWandRenderer extends GeoItemRenderer<BlazeWandItem> {
    public BlazeWandRenderer() {
        super(new BlazeWandModel());
    }
}
