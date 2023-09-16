package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ChorusSwordItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChorusSwordRenderer extends GeoItemRenderer<ChorusSwordItem> {
    public ChorusSwordRenderer() {
        super(new ChorusSwordModel());
    }
}
