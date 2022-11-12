package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.EnderStaffItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class EnderStaffRenderer extends GeoItemRenderer<EnderStaffItem> {
    public EnderStaffRenderer() {
        super(new EnderStaffModel());
    }
}