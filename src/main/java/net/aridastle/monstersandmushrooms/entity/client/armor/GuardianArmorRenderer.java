package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.GuardianArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GuardianArmorRenderer extends GeoArmorRenderer<GuardianArmorItem> {
    public GuardianArmorRenderer() {
        super(new GuardianArmorModel());

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
