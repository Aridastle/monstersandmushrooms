package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.StrayStaffItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class StrayStaffRenderer extends GeoItemRenderer<StrayStaffItem> {
    public StrayStaffRenderer() {
        super(new StrayStaffModel());
    }
}
