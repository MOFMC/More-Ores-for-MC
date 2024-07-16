package com.agmpenguin.mofmc.recipe;

import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;

public interface ModRecipes<T extends Recipe<?>> {
    public static final RecipeType<CraftingRecipe> DIAMOND_STONECUTTING = RecipeType.register("diamond_stonecutting");
}
