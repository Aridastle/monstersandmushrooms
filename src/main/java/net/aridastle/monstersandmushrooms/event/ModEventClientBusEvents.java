package net.aridastle.monstersandmushrooms.event;

import net.aridastle.monstersandmushrooms.entity.client.armor.GoatArmorRenderer;
import net.aridastle.monstersandmushrooms.item.custom.GoatArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = monstersandmushrooms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(GoatArmorItem.class, new GoatArmorRenderer());
    }
}