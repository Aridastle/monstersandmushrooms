package net.aridastle.monstersandmushrooms.event;

import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.entity.custom.Bugsy;
import net.aridastle.monstersandmushrooms.entity.custom.Maggart;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
}
