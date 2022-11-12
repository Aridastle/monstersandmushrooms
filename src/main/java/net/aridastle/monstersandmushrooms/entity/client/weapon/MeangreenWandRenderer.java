package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.MeangreenWandItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MeangreenWandRenderer extends GeoItemRenderer<MeangreenWandItem> {
    public MeangreenWandRenderer() {
        super(new MeangreenWandModel());
    }
}