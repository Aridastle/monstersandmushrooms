package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GoatArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GoatArmorRenderer extends GeoArmorRenderer<GoatArmorItem> {
    public GoatArmorRenderer() {
        super(new GoatArmorModel());

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
