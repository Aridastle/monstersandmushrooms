package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.MaggartArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MaggartArmorRenderer extends GeoArmorRenderer<MaggartArmorItem> {
    public MaggartArmorRenderer() {
        super(new MaggartArmorModel());

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