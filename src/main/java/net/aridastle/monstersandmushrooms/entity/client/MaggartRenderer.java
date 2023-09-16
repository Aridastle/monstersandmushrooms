package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Maggart;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class MaggartRenderer extends GeoEntityRenderer<Maggart> {

    public MaggartRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MaggartModel());
        this.shadowRadius = 0.3f;
    }

    public ResourceLocation getTextureLocation(Maggart instance) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/maggart/maggart.png");
    }

    public RenderType getRenderType(Maggart animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
