package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 28, new int[]{3, 6, 8, 3}, 19, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.RUBY.get())),
    PYRITE("pyrite", 17, new int[]{1, 3, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_GOLD,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.PYRITE_INGOT.get())),
    TITANIUM("titanium", 28, new int[]{3, 4, 6, 3}, 16, SoundEvents.ARMOR_EQUIP_IRON,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.TITANIUM_ROD.get())),
    PURPLE_SAPPHIRE("purple_sapphire", 28, new int[]{2, 4, 6, 2}, 19, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.PURPLE_SAPPHIRE.get())),
    TIN("tin", 9, new int[]{1, 2, 4, 1}, 4, SoundEvents.ARMOR_EQUIP_GENERIC,
            2.0F, 0.0F, () -> Ingredient.of(ModItems.TIN_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] HEALTH_PER_SLOT = {13, 15, 16, 11};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return HEALTH_PER_SLOT[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.slotProtections[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return mofmc.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}