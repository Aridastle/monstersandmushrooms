package net.aridastle.monstersandmushrooms.entity;

import net.aridastle.monstersandmushrooms.entity.custom.Bugsy;
import net.aridastle.monstersandmushrooms.entity.custom.Maggart;
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

    public static final RegistryObject<EntityType<Bugsy>> BUGSY =
            ENTITY_TYPES.register("bugsy", () -> EntityType.Builder.of(Bugsy::new,
                    MobCategory.MONSTER).sized(0.4f,0.6f).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "bugsy").toString()));

    public static final RegistryObject<EntityType<Maggart>> MAGGART =
            ENTITY_TYPES.register("maggart", () -> EntityType.Builder.of(Maggart::new,
                    MobCategory.CREATURE).build(new ResourceLocation(monstersandmushrooms.MOD_ID, "maggart").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
