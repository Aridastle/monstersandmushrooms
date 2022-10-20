package net.aridastle.monstersandmushrooms.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.aridastle.monstersandmushrooms.entity.custom.Avala;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AvalaRenderer extends GeoEntityRenderer<Avala> {

    public AvalaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AvalaModel());
        this.shadowRadius = 0.3f;
    }

    public ResourceLocation getTextureLocation(Avala instance) {
        return new ResourceLocation(monstersandmushrooms.MOD_ID, "textures/entity/avala/avala.png");
    }

    public RenderType getRenderType(Avala animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
