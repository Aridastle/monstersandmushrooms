package net.aridastle.monstersandmushrooms.item;

import net.aridastle.monstersandmushrooms.monstersandmushrooms;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    SUSPICIOUS_LEAF("suspicious_leaf", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.SUSPICIOUS_LEAF.get());
    }),
    EVOKER("evoker", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.TOTEM_OF_UNDYING);
    }),
    WITHER("wither", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.ANCIENT_DEBRIS);
    }),
    MAGIC_MUSHROOM("magic_mushroom", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.MAGIC_MUSHROOM.get());
    }),
    INSECT_LEG("insect_leg", 37, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.INSECT_LEG.get());
    }),
    RARE_EARTH("rare_earth", 37, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.RARE_EARTH.get());
    }),
    GUARDIAN("guardian", 37, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.SPONGE);
    }),
    END("end", 37, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.SHULKER_SHELL);
    }),
    GOAT("goat", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.GOAT_HORN);
    }),
    WARDEN("warden", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.SCULK_CATALYST);
    }),
    ICE_CRYSTAL("ice_crystal", 37, new int[]{5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.ICE_CRYSTAL.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return monstersandmushrooms.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
