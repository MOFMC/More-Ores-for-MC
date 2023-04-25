package com.agmpenguin.mofmc.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.RegistryObject;

public class ModTiers {
    public static final ForgeTier RUBY = createForgeTier(2, 250, 6.0f, 2.0f, 14, BlockTags.NEEDS_IRON_TOOL, ModItems.RUBY);
    public static final ForgeTier PYRITE = createForgeTier(2, 250, 6.0f, 2.0f, 14, BlockTags.NEEDS_IRON_TOOL, ModItems.PYRITE_INGOT);
    public static final ForgeTier TITANIUM = createForgeTier(2, 250, 6.0f, 2.0f, 14, BlockTags.NEEDS_IRON_TOOL, ModItems.TITANIUM_ROD);
    public static final ForgeTier PURPLE_SAPPHIRE = createForgeTier(2, 250, 6.0f, 2.0f, 14, BlockTags.NEEDS_IRON_TOOL, ModItems.PURPLE_SAPPHIRE);

    private static ForgeTier createForgeTier(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Block> toolTypeNeeded, RegistryObject<Item> Material) {
        return new ForgeTier(level, uses, speed, attackDamageBonus, enchantmentValue, toolTypeNeeded, () -> Ingredient.of(Material.get()));
    }

}
