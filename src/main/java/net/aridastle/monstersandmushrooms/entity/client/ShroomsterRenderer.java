package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Shroomster;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class ShroomsterRenderer extends GeoEntityRenderer<Shroomster> {
    public ShroomsterRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ShroomsterModel());
        this.shadowRadius = 0.3f;
    }

    public ResourceLocation getTextureLocation(Shroomster instance) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/shroomster/shroomster.png");
    }

     public RenderType getRenderType(Shroomster animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
