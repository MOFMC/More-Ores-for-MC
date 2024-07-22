package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.MOFMC;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 34, new int[]{3, 8, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f, 0.0f, () -> Ingredient.ofItems(ModItems.RUBY)), // {4, 8, 7, 3} toughness: 1.0f
    PYRITE("pyrite", 17, new int[]{2, 5, 3, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.PYRITE_INGOT)),
    TITANIUM("titanium", 30, new int[]{3, 6, 4, 2}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)), // toughness: 1.0F, knockbackResistance: 1.0F
    PURPLE_SAPPHIRE("purple_sapphire", 24, new int[]{3, 6, 4, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.PURPLE_SAPPHIRE)),
    TIN("tin", 9, new int[]{1, 4, 2, 1}, 2, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    RAINBOW("rainbow", 27, new int[]{3, 7, 5, 3}, 14, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            1.0F, 0.0F, () -> Ingredient.ofItems(ModItems.RAINBOW_GEM));
    ;

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MOFMC.MOD_ID + ":" + this.name;
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
