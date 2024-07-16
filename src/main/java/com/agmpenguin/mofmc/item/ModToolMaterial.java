package com.agmpenguin.mofmc.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(3, 1790, 9.0f, 3.5f, 9, () -> Ingredient.ofItems(ModItems.RUBY)),
    PYRITE(1, 200, 5.0f, 1.0f, 7, () -> Ingredient.ofItems(ModItems.PYRITE_INGOT)),
    TITANIUM(2, 420, 4.0f, 2.0f, 12, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),
    PURPLE_SAPPHIRE(3, 1323, 7.0f, 2.5f, 14, () -> Ingredient.ofItems(ModItems.PURPLE_SAPPHIRE)),
    TIN(0, 50, 2.0f, 0.0f, 3, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    RAINBOW(3, 1474, 8.0f, 3.0f, 16, () -> Ingredient.ofItems(ModItems.RAINBOW_GEM))
    ;

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
