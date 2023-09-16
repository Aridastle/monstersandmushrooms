package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.BruteSwordItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BruteSwordRenderer extends GeoItemRenderer<BruteSwordItem> {
    public BruteSwordRenderer() {
        super(new BruteSwordModel());
    }
}