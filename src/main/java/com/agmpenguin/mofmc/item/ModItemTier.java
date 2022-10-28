package com.agmpenguin.mofmc.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    RUBY(3, 1796, 8.0F, 3.0F, 13, () -> {
        return Ingredient.fromItems(ModItems.RUBY.get());
    }),
    PYRITE_INGOT(0, 1796, 10.0F, 2.0F, 17, () -> {
        return Ingredient.fromItems(ModItems.PYRITE_INGOT.get());
    });

    /*
    level, uses, speed, attackDamageBonus, enchantmentValue
    public static final ForgeTier RUBY = new ForgeTier(2, 250, 6.0f,
            2.0f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));
    public static final ForgeTier FOOLS_GOLD_INGOT = new ForgeTier(2, 250, 6.0f,
            2.0f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.FOOLS_GOLD_INGOT.get()));
     */

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
