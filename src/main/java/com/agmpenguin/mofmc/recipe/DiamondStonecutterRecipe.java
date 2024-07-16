package com.agmpenguin.mofmc.recipe;

import com.agmpenguin.mofmc.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class DiamondStonecutterRecipe extends CuttingRecipe {
    public DiamondStonecutterRecipe(Identifier id, String group, Ingredient input, ItemStack output) {
        super(ModRecipes.DIAMOND_STONECUTTING, RecipeSerializer.STONECUTTING, id, group, input, output);
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return this.input.test(inventory.getStack(0));
    }

    @Override
    public ItemStack createIcon() {
        // return new ItemStack(ModBlocks.DIAMOND_STONECUTTER);
        return  null;
    }
}
