package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.EndArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EndArmorRenderer extends GeoArmorRenderer<EndArmorItem> {
    public EndArmorRenderer() {
        super(new EndArmorModel());

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