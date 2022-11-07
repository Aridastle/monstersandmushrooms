package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.BugsyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BugsyArmorRenderer extends GeoArmorRenderer<BugsyArmorItem> {
    public BugsyArmorRenderer() {
        super(new BugsyArmorModel());

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