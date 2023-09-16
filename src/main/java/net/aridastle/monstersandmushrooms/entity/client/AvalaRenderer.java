package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Avala;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class AvalaRenderer extends GeoEntityRenderer<Avala> {

    public AvalaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AvalaModel());
        this.shadowRadius = 0.3f;
    }

    public ResourceLocation getTextureLocation(Avala instance) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/avala/avala.png");
    }

     public RenderType getRenderType(Avala animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
