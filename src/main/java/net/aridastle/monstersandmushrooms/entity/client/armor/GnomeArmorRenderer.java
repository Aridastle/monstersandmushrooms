package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GnomeArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GnomeArmorRenderer extends GeoArmorRenderer<GnomeArmorItem> {
    public GnomeArmorRenderer() {
        super(new GnomeArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}