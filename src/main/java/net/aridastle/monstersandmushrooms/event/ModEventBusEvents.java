package net.aridastle.monstersandmushrooms.event;

import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.entity.client.armor.GoatArmorRenderer;
import net.aridastle.monstersandmushrooms.entity.custom.Bugsy;
import net.aridastle.monstersandmushrooms.entity.custom.Maggart;
import net.aridastle.monstersandmushrooms.item.custom.GoatArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = monstersandmushrooms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.AVALA.get(), Maggart.setAttributes());
        event.put(ModEntityTypes.BUGSY.get(), Bugsy.setAttributes());
        event.put(ModEntityTypes.GNOME.get(), Maggart.setAttributes());
        event.put(ModEntityTypes.MAGGART.get(), Maggart.setAttributes());
        event.put(ModEntityTypes.SHROOMSTER.get(), Maggart.setAttributes());
    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event){
        GeoArmorRenderer.registerArmorRenderer(GoatArmorItem.class, new GoatArmorRenderer());
    }
}
