package net.aridastle.monstersandmushrooms.entity;

import net.aridastle.monstersandmushrooms.entity.custom.*;
import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, monstersandmushrooms.MOD_ID);

    public static final RegistryObject<EntityType<Avala>> AVALA =
            ENTITY_TYPES.register("avala", () -> EntityType.Builder.of(Avala::new,
                    MobCategory.MONSTER).sized(1.0f,2.2f).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "avala").toString()));

    public static final RegistryObject<EntityType<Bugsy>> BUGSY =
            ENTITY_TYPES.register("bugsy", () -> EntityType.Builder.of(Bugsy::new,
                    MobCategory.MONSTER).sized(0.4f,0.6f).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "bugsy").toString()));

    public static final RegistryObject<EntityType<Gnome>> GNOME =
            ENTITY_TYPES.register("gnome", () -> EntityType.Builder.of(Gnome::new,
                    MobCategory.MONSTER).sized(0.5f,1.0f).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "gnome").toString()));

    public static final RegistryObject<EntityType<Maggart>> MAGGART =
            ENTITY_TYPES.register("maggart", () -> EntityType.Builder.of(Maggart::new,
                    MobCategory.MONSTER).sized(0.8f,0.8f).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "maggart").toString()));

    public static final RegistryObject<EntityType<Shroomster>> SHROOMSTER =
            ENTITY_TYPES.register("shroomster", () -> EntityType.Builder.of(Shroomster::new,
                    MobCategory.MONSTER).sized(0.8f,2.0f).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "shroomster").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
