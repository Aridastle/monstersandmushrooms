package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.GnomeSwordItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class GnomeSwordRenderer extends GeoItemRenderer<GnomeSwordItem> {
    public GnomeSwordRenderer() {
        super(new GnomeSwordModel());
    }
}