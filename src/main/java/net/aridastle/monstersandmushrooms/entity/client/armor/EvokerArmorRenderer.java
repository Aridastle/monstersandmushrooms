package net.aridastle.monstersandmushrooms.entity.client.armor;

import net.aridastle.monstersandmushrooms.item.custom.EvokerArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EvokerArmorRenderer extends GeoArmorRenderer<EvokerArmorItem> {
    public EvokerArmorRenderer() {
        super(new EvokerArmorModel());

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