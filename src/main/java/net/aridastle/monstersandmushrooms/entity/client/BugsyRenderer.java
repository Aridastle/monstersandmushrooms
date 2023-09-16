package net.aridastle.monstersandmushrooms.entity.client;

import net.aridastle.monstersandmushrooms.entity.custom.Bugsy;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class BugsyRenderer extends GeoEntityRenderer<Bugsy> {

    public BugsyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BugsyModel());
        this.shadowRadius = 0.3f;
    }

    public ResourceLocation getTextureLocation(Bugsy instance) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/bugsy/bugsy.png");
    }

     public RenderType getRenderType(Bugsy animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
