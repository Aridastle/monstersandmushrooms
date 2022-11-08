package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.AvalaSwordItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class AvalaSwordRenderer extends GeoItemRenderer<AvalaSwordItem> {
    public AvalaSwordRenderer() {
        super(new AvalaSwordModel());
    }
}
