package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ChorusSwordItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ChorusSwordRenderer extends GeoItemRenderer<ChorusSwordItem> {
    public ChorusSwordRenderer() {
        super(new ChorusSwordModel());
    }
}
