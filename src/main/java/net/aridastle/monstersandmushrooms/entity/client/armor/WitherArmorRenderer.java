package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.WitherArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WitherArmorRenderer extends GeoArmorRenderer<WitherArmorItem> {
    public WitherArmorRenderer() {
        super(new WitherArmorModel());

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