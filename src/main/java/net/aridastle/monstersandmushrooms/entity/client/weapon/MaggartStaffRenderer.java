package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.MaggartStaffItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MaggartStaffRenderer extends GeoItemRenderer<MaggartStaffItem> {
    public MaggartStaffRenderer() {
        super(new MaggartStaffModel());
    }
}