package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.ShroomsterStaffItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ShroomsterStaffRenderer extends GeoItemRenderer<ShroomsterStaffItem> {
    public ShroomsterStaffRenderer() {
        super(new ShroomsterStaffModel());
    }
}
