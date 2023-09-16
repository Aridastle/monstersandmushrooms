package net.aridastle.monstersandmushrooms;

import com.mojang.logging.LogUtils;
import net.aridastle.monstersandmushrooms.block.ModBlocks;
import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.entity.client.*;
import net.aridastle.monstersandmushrooms.item.ModCreativeModeTab;
import net.aridastle.monstersandmushrooms.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

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
        ModCreativeModeTab.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB.get()){
            event.accept(ModItems.AVALA_BOOTS);
            event.accept(ModItems.AVALA_CHESTPLATE);
            event.accept(ModItems.AVALA_HELMET);
            event.accept(ModItems.AVALA_LEGGINGS);
            event.accept(ModItems.AVALA_SPAWN_EGG);
            event.accept(ModItems.BUGSY_BOOTS);
            event.accept(ModItems.BUGSY_CHESTPLATE);
            event.accept(ModItems.BUGSY_HELMET);
            event.accept(ModItems.BUGSY_LEGGINGS);
            event.accept(ModItems.BUGSY_SPAWN_EGG);
            event.accept(ModItems.END_BOOTS);
            event.accept(ModItems.END_CHESTPLATE);
            event.accept(ModItems.END_LEGGINGS);
            event.accept(ModItems.END_HELMET);
            event.accept(ModItems.EVOKER_BOOTS);
            event.accept(ModItems.EVOKER_CHESTPLATE);
            event.accept(ModItems.EVOKER_HELMET);
            event.accept(ModItems.EVOKER_LEGGINGS);
            event.accept(ModItems.GNOME_BOOTS);
            event.accept(ModItems.GNOME_CHESTPLATE);
            event.accept(ModItems.GNOME_HELMET);
            event.accept(ModItems.GNOME_LEGGINGS);
            event.accept(ModItems.GNOME_SPAWN_EGG);
            event.accept(ModItems.GOAT_BOOTS);
            event.accept(ModItems.GOAT_CHESTPLATE);
            event.accept(ModItems.GOAT_HELMET);
            event.accept(ModItems.GOAT_LEGGINGS);
            event.accept(ModItems.GUARDIAN_BOOTS);
            event.accept(ModItems.GUARDIAN_CHESTPLATE);
            event.accept(ModItems.GUARDIAN_HELMET);
            event.accept(ModItems.GUARDIAN_LEGGINGS);
            event.accept(ModItems.MAGGART_BOOTS);
            event.accept(ModItems.MAGGART_CHESTPLATE);
            event.accept(ModItems.MAGGART_HELMET);
            event.accept(ModItems.MAGGART_LEGGINGS);
            event.accept(ModItems.MAGGART_SPAWN_EGG);
            event.accept(ModItems.SHROOMSTER_BOOTS);
            event.accept(ModItems.SHROOMSTER_CHESTPLATE);
            event.accept(ModItems.SHROOMSTER_HELMET);
            event.accept(ModItems.SHROOMSTER_LEGGINGS);
            event.accept(ModItems.SHROOMSTER_SPAWN_EGG);
            event.accept(ModItems.WARDEN_BOOTS);
            event.accept(ModItems.WARDEN_CHESTPLATE);
            event.accept(ModItems.WARDEN_HELMET);
            event.accept(ModItems.WARDEN_LEGGINGS);
            event.accept(ModItems.WITHER_BOOTS);
            event.accept(ModItems.WITHER_CHESTPLATE);
            event.accept(ModItems.WITHER_HELMET);
            event.accept(ModItems.WITHER_LEGGINGS);

            event.accept(ModItems.AVALASWORD);
            event.accept(ModItems.ENDSTAFF);
            event.accept(ModItems.ENDWAND);
            event.accept(ModItems.MEANGREENWAND);
            event.accept(ModItems.STRAYSTAFF);
            event.accept(ModItems.DROWNEDSWORD);
            event.accept(ModItems.MAGMACUBESTAFF);
            event.accept(ModItems.BRUTESWORD);
            event.accept(ModItems.BLAZEWAND);
            event.accept(ModItems.CHORUSSWORD);
            event.accept(ModItems.GNOMESWORD);
            event.accept(ModItems.MAGGARTSTAFF);
            event.accept(ModItems.BUGSYWAND);
            event.accept(ModItems.SHROOMSTERSTAFF);

            event.accept(ModItems.MAGIC_MUSHROOM);
            event.accept(ModItems.INSECT_LEG);
            event.accept(ModItems.ICE_CRYSTAL);
            event.accept(ModItems.RARE_EARTH);
            event.accept(ModItems.SUSPICIOUS_LEAF);
        }
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
