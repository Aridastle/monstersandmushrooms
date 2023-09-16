package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.DrownedSwordItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class DrownedSwordRenderer extends GeoItemRenderer<DrownedSwordItem> {
    public DrownedSwordRenderer() {
        super(new DrownedSwordModel());
    }
}