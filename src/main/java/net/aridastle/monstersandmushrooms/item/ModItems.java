package net.aridastle.monstersandmushrooms.item;

import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.item.custom.GoatArmorItem;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, monstersandmushrooms.MOD_ID);

    public static final RegistryObject<Item> MAGIC_MUSHROOM = ITEMS.register("magic_mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> INSECT_LEG = ITEMS.register("insect_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> ICE_CRYSTAL = ITEMS.register("ice_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> RARE_EARTH = ITEMS.register("rare_earth",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> SUSPICIOUS_LEAF = ITEMS.register("suspicious_leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> AVALA_SPAWN_EGG = ITEMS.register("avala_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.AVALA, 0x4c4c4c, 0xaefefb,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> BUGSY_SPAWN_EGG = ITEMS.register("bugsy_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BUGSY, 0xe8b2c3, 0x598d47,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> GNOME_SPAWN_EGG = ITEMS.register("gnome_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GNOME, 0x210707, 0xd2ba9e,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> MAGGART_SPAWN_EGG = ITEMS.register("maggart_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MAGGART, 0x625770, 0x000000,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<ForgeSpawnEggItem> SHROOMSTER_SPAWN_EGG = ITEMS.register("shroomster_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SHROOMSTER, 0x5434a3, 0xffffff,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));

    public static final RegistryObject<Item> GOAT_HELMET = ITEMS.register("goat_helmet",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> GOAT_CHESTPLATE = ITEMS.register("goat_chestplate",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> GOAT_LEGGINGS = ITEMS.register("goat_leggings",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static final RegistryObject<Item> GOAT_BOOTS = ITEMS.register("goat_boots",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB)));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
