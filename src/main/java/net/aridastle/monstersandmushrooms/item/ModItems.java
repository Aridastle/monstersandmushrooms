package net.aridastle.monstersandmushrooms.item;

import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, monstersandmushrooms.MOD_ID);

    public static final RegistryObject<Item> MUSHROOM = ITEMS.register("mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));

    public static final RegistryObject<Item> EVIL_MUSHROOM = ITEMS.register("evil_mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> BUGSY_SPAWN_EGG = ITEMS.register("bugsy_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BUGSY, 0xe8b2c3, 0x598d47,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
