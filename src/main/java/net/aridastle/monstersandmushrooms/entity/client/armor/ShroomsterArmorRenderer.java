package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.ShroomsterArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ShroomsterArmorRenderer extends GeoArmorRenderer<ShroomsterArmorItem> {
    public ShroomsterArmorRenderer() {
        super(new ShroomsterArmorModel());

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
