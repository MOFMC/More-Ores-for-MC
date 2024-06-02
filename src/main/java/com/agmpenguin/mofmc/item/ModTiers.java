package com.agmpenguin.mofmc.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.RegistryObject;

public class ModTiers {
    public static final ForgeTier RUBY = createForgeTier(3, 1790, 9.0f, 3.5f, 9, BlockTags.NEEDS_IRON_TOOL, ModItems.RUBY);
    public static final ForgeTier PYRITE = createForgeTier(1, 200, 5.0f, 1.0f, 7, BlockTags.NEEDS_IRON_TOOL, ModItems.PYRITE_INGOT);
    public static final ForgeTier TITANIUM = createForgeTier(2, 420, 4.0f, 2.0f, 12, BlockTags.NEEDS_IRON_TOOL, ModItems.TITANIUM_ROD);
    public static final ForgeTier PURPLE_SAPPHIRE = createForgeTier(3, 1323, 7.0f, 2.5f, 14, BlockTags.NEEDS_IRON_TOOL, ModItems.PURPLE_SAPPHIRE);
    public static final ForgeTier TIN = createForgeTier(0, 50, 2.0f, 0.0f, 3, BlockTags.NEEDS_STONE_TOOL, ModItems.TIN_INGOT);
    public static final ForgeTier RAINBOW = createForgeTier(3, 1474, 8.0f, 3.0f, 16, BlockTags.NEEDS_DIAMOND_TOOL, ModItems.RAINBOW_GEM);

    private static ForgeTier createForgeTier(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Block> toolTypeNeeded, RegistryObject<Item> Material) {
        return new ForgeTier(level, uses, speed, attackDamageBonus, enchantmentValue, toolTypeNeeded, () -> Ingredient.of(Material.get()));
    }
}
