package net.aridastle.monstersandmushrooms.item;

import net.aridastle.monstersandmushrooms.entity.ModEntityTypes;
import net.aridastle.monstersandmushrooms.item.custom.*;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib3.model.AnimatedGeoModel;

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

    public static final Tier AVALA = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(ModItems.ICE_CRYSTAL.get());});
    public static final Tier BLAZE = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.BLAZE_ROD);});
    public static final Tier BRUTE = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.GILDED_BLACKSTONE);});
    public static final Tier BUGSY = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(ModItems.SUSPICIOUS_LEAF.get());});
    public static final Tier CHORUS = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.CHORUS_FRUIT);});
    public static final Tier DROWNED = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.NAUTILUS_SHELL);});
    public static final Tier ENDER = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.ENDER_PEARL);});
    public static final Tier GNOME = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.NEEDS_DIAMOND_TOOL, () -> {
        return Ingredient.of(ModItems.RARE_EARTH.get());});
    public static final Tier MAGGART = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(ModItems.INSECT_LEG.get());});
    public static final Tier MAGMACUBE = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.MAGMA_CREAM);});
    public static final Tier MEANGREEN = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.SLIME_BLOCK);});
    public static final Tier SHROOMSTER = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(ModItems.MAGIC_MUSHROOM.get());});
    public static final Tier SHULKER = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.SHULKER_SHELL);});
    public static final Tier STRAY = new ForgeTier(4, 2032, 7, 4, 15, BlockTags.FALL_DAMAGE_RESETTING, () -> {
        return Ingredient.of(Items.TIPPED_ARROW);});

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

    public static final RegistryObject<Item> AVALA_HELMET = ITEMS.register("avala_helmet",
            () -> new AvalaArmorItem(ModArmorMaterials.ICE_CRYSTAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> AVALA_CHESTPLATE = ITEMS.register("avala_chestplate",
            () -> new AvalaArmorItem(ModArmorMaterials.ICE_CRYSTAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> AVALA_LEGGINGS = ITEMS.register("avala_leggings",
            () -> new AvalaArmorItem(ModArmorMaterials.ICE_CRYSTAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> AVALA_BOOTS = ITEMS.register("avala_boots",
            () -> new AvalaArmorItem(ModArmorMaterials.ICE_CRYSTAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> BUGSY_HELMET = ITEMS.register("bugsy_helmet",
            () -> new BugsyArmorItem(ModArmorMaterials.SUSPICIOUS_LEAF, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> BUGSY_CHESTPLATE = ITEMS.register("bugsy_chestplate",
            () -> new BugsyArmorItem(ModArmorMaterials.SUSPICIOUS_LEAF, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> BUGSY_LEGGINGS = ITEMS.register("bugsy_leggings",
            () -> new BugsyArmorItem(ModArmorMaterials.SUSPICIOUS_LEAF, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> BUGSY_BOOTS = ITEMS.register("bugsy_boots",
            () -> new BugsyArmorItem(ModArmorMaterials.SUSPICIOUS_LEAF, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> END_HELMET = ITEMS.register("end_helmet",
            () -> new EndArmorItem(ModArmorMaterials.END, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> END_CHESTPLATE = ITEMS.register("end_chestplate",
            () -> new EndArmorItem(ModArmorMaterials.END, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> END_LEGGINGS = ITEMS.register("end_leggings",
            () -> new EndArmorItem(ModArmorMaterials.END, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> END_BOOTS = ITEMS.register("end_boots",
            () -> new EndArmorItem(ModArmorMaterials.END, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> EVOKER_HELMET = ITEMS.register("evoker_helmet",
            () -> new EvokerArmorItem(ModArmorMaterials.EVOKER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> EVOKER_CHESTPLATE = ITEMS.register("evoker_chestplate",
            () -> new EvokerArmorItem(ModArmorMaterials.EVOKER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> EVOKER_LEGGINGS = ITEMS.register("evoker_leggings",
            () -> new EvokerArmorItem(ModArmorMaterials.EVOKER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> EVOKER_BOOTS = ITEMS.register("evoker_boots",
            () -> new EvokerArmorItem(ModArmorMaterials.EVOKER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> GNOME_HELMET = ITEMS.register("gnome_helmet",
            () -> new GnomeArmorItem(ModArmorMaterials.RARE_EARTH, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> GNOME_CHESTPLATE = ITEMS.register("gnome_chestplate",
            () -> new GnomeArmorItem(ModArmorMaterials.RARE_EARTH, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> GNOME_LEGGINGS = ITEMS.register("gnome_leggings",
            () -> new GnomeArmorItem(ModArmorMaterials.RARE_EARTH, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> GNOME_BOOTS = ITEMS.register("gnome_boots",
            () -> new GnomeArmorItem(ModArmorMaterials.RARE_EARTH, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> GOAT_HELMET = ITEMS.register("goat_helmet",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> GOAT_CHESTPLATE = ITEMS.register("goat_chestplate",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> GOAT_LEGGINGS = ITEMS.register("goat_leggings",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> GOAT_BOOTS = ITEMS.register("goat_boots",
            () -> new GoatArmorItem(ModArmorMaterials.GOAT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> GUARDIAN_HELMET = ITEMS.register("guardian_helmet",
            () -> new GuardianArmorItem(ModArmorMaterials.GUARDIAN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> GUARDIAN_CHESTPLATE = ITEMS.register("guardian_chestplate",
            () -> new GuardianArmorItem(ModArmorMaterials.GUARDIAN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> GUARDIAN_LEGGINGS = ITEMS.register("guardian_leggings",
            () -> new GuardianArmorItem(ModArmorMaterials.GUARDIAN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> GUARDIAN_BOOTS = ITEMS.register("guardian_boots",
            () -> new GuardianArmorItem(ModArmorMaterials.GUARDIAN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> MAGGART_HELMET = ITEMS.register("maggart_helmet",
            () -> new MaggartArmorItem(ModArmorMaterials.INSECT_LEG, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> MAGGART_CHESTPLATE = ITEMS.register("maggart_chestplate",
            () -> new MaggartArmorItem(ModArmorMaterials.INSECT_LEG, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> MAGGART_LEGGINGS = ITEMS.register("maggart_leggings",
            () -> new MaggartArmorItem(ModArmorMaterials.INSECT_LEG, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> MAGGART_BOOTS = ITEMS.register("maggart_boots",
            () -> new MaggartArmorItem(ModArmorMaterials.INSECT_LEG, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> SHROOMSTER_HELMET = ITEMS.register("shroomster_helmet",
            () -> new ShroomsterArmorItem(ModArmorMaterials.MAGIC_MUSHROOM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> SHROOMSTER_CHESTPLATE = ITEMS.register("shroomster_chestplate",
            () -> new ShroomsterArmorItem(ModArmorMaterials.MAGIC_MUSHROOM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> SHROOMSTER_LEGGINGS = ITEMS.register("shroomster_leggings",
            () -> new ShroomsterArmorItem(ModArmorMaterials.MAGIC_MUSHROOM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> SHROOMSTER_BOOTS = ITEMS.register("shroomster_boots",
            () -> new ShroomsterArmorItem(ModArmorMaterials.MAGIC_MUSHROOM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> WARDEN_HELMET = ITEMS.register("warden_helmet",
            () -> new WardenArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> WARDEN_CHESTPLATE = ITEMS.register("warden_chestplate",
            () -> new WardenArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> WARDEN_LEGGINGS = ITEMS.register("warden_leggings",
            () -> new WardenArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> WARDEN_BOOTS = ITEMS.register("warden_boots",
            () -> new WardenArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<Item> WITHER_HELMET = ITEMS.register("wither_helmet",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(407)));
    public static final RegistryObject<Item> WITHER_CHESTPLATE = ITEMS.register("wither_chestplate",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(592)));
    public static final RegistryObject<Item> WITHER_LEGGINGS = ITEMS.register("wither_leggings",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(555)));
    public static final RegistryObject<Item> WITHER_BOOTS = ITEMS.register("wither_boots",
            () -> new WitherArmorItem(ModArmorMaterials.WITHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(481)));

    public static final RegistryObject<SwordItem> AVALASWORD = ITEMS.register("avalasword",
            () -> new AvalaSwordItem(AVALA, 4, (float) -2.4,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> DROWNEDSWORD = ITEMS.register("drownedsword",
            () -> new DrownedSwordItem(DROWNED, 4, (float) -2.4,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> BRUTESWORD = ITEMS.register("brutesword",
            () -> new BruteSwordItem(BRUTE, 4, (float) -2.4,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> CHORUSSWORD = ITEMS.register("chorussword",
            () -> new ChorusSwordItem(CHORUS, 4, (float) -2.4,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<PickaxeItem> GNOMESWORD = ITEMS.register("gnomesword",
            () -> new GnomeSwordItem(GNOME, 4, (float) -2.4,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));

    public static final RegistryObject<SwordItem> ENDSTAFF = ITEMS.register("endstaff",
            () -> new EnderStaffItem(ENDER, 3, (float) -2.2,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> STRAYSTAFF = ITEMS.register("straystaff",
            () -> new StrayStaffItem(STRAY, 3, (float) -2.2,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> MAGMACUBESTAFF = ITEMS.register("magmacubestaff",
            () -> new MagmaCubeStaffItem(MAGMACUBE, 3, (float) -2.2,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> MAGGARTSTAFF = ITEMS.register("maggartstaff",
            () -> new MaggartStaffItem(MAGGART, 3, (float) -2.2,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> SHROOMSTERSTAFF = ITEMS.register("shroomsterstaff",
            () -> new ShroomsterStaffItem(SHROOMSTER, 3, (float) -2.2,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));

    public static final RegistryObject<SwordItem> MEANGREENWAND = ITEMS.register("meangreenwand",
            () -> new MeangreenWandItem(MEANGREEN, 2, (float) -1.9,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> ENDWAND = ITEMS.register("endwand",
            () -> new ShulkerWandItem(SHULKER, 2, (float) -1.9,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> BLAZEWAND = ITEMS.register("blazewand",
            () -> new BlazeWandItem(BLAZE, 2, (float) -1.9,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static final RegistryObject<SwordItem> BUGSYWAND = ITEMS.register("bugsywand",
            () -> new BugsyWandItem(BUGSY, 2, (float) -1.9,
                    new Item.Properties().tab(ModCreativeModeTab.MONSTERSANDMUSHROOMS_TAB).durability(2032)));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
