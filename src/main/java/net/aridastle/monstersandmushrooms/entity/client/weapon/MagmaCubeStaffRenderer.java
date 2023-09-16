package net.aridastle.monstersandmushrooms.entity.client.weapon;

import net.aridastle.monstersandmushrooms.item.custom.MagmaCubeStaffItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MagmaCubeStaffRenderer extends GeoItemRenderer<MagmaCubeStaffItem> {
    public MagmaCubeStaffRenderer() {
        super(new MagmaCubeStaffModel());
    }
}