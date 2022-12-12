package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ShroomsterStaffItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ShroomsterStaffRenderer extends GeoItemRenderer<ShroomsterStaffItem> {
    public ShroomsterStaffRenderer() {
        super(new ShroomsterStaffModel());
    }
}
