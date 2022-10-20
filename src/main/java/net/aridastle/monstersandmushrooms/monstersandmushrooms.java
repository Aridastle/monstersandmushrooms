package net.aridastle.monstersandmushrooms;

import com.mojang.logging.LogUtils;
import net.aridastle.monstersandmushrooms.block.ModBlocks;
import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.entity.client.*;
import net.aridastle.monstersandmushrooms.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(monstersandmushrooms.MOD_ID)
public class monstersandmushrooms
{
    public static final String MOD_ID = "monstersandmushrooms";
    private static final Logger LOGGER = LogUtils.getLogger();

    public monstersandmushrooms()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntityTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntityTypes.AVALA.get(), AvalaRenderer::new);
            EntityRenderers.register(ModEntityTypes.BUGSY.get(), BugsyRenderer::new);
            EntityRenderers.register(ModEntityTypes.GNOME.get(), GnomeRenderer::new);
            EntityRenderers.register(ModEntityTypes.MAGGART.get(), MaggartRenderer::new);
            EntityRenderers.register(ModEntityTypes.SHROOMSTER.get(), ShroomsterRenderer::new);
        }
    }
}
