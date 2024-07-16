package com.agmpenguin.mofmc.datagen;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(
            ModItems.RAW_RUBY, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_RUBY_ORE);
    private static final List<ItemConvertible> PYRITE_SMELTABLES = List.of(
            ModItems.RAW_PYRITE, ModBlocks.PYRITE_ORE, ModBlocks.DEEPSLATE_PYRITE_ORE,  ModBlocks.NETHER_PYRITE_ORE, ModBlocks.END_PYRITE_ORE);
    private static final List<ItemConvertible> PURPLE_SAPPHIRE_SMELTABLES = List.of(
            ModItems.RAW_TITANIUM, ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE,  ModBlocks.NETHER_TITANIUM_ORE, ModBlocks.END_TITANIUM_ORE);
    private static final List<ItemConvertible> TITANIUM_SMELTABLES = List.of(
    ModItems.RAW_PURPLE_SAPPHIRE, ModBlocks.PURPLE_SAPPHIRE_ORE, ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE,  ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE, ModBlocks.END_PURPLE_SAPPHIRE_ORE);
    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(
            ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE,  ModBlocks.NETHER_TIN_ORE, ModBlocks.END_TIN_ORE);
    private static final List<ItemConvertible> RAINBOW_SMELTABLES = List.of(
            ModBlocks.RAINBOW_ORE, ModBlocks.DEEPSLATE_RAINBOW_ORE,  ModBlocks.NETHER_RAINBOW_ORE, ModBlocks.END_RAINBOW_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Ruby
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.7f, 100, "ruby");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUBY, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUBY_BLOCK);
        stairs(ModBlocks.RUBY_STAIRS, ModBlocks.RUBY_BLOCK, exporter);
        slab(ModBlocks.RUBY_SLAB, ModBlocks.RUBY_BLOCK, exporter);
        pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE, ModItems.RUBY, exporter);
        sword(ModItems.RUBY_SWORD, ModItems.RUBY, exporter);
        pickaxe(ModItems.RUBY_PICKAXE, ModItems.RUBY, exporter);
        axe(ModItems.RUBY_AXE, ModItems.RUBY, exporter);
        shovel(ModItems.RUBY_SHOVEL, ModItems.RUBY, exporter);
        hoe(ModItems.RUBY_HOE, ModItems.RUBY, exporter);
        helmet(ModItems.RUBY_HELMET, ModItems.RUBY, exporter);
        chestplate(ModItems.RUBY_CHESTPLATE, ModItems.RUBY, exporter);
        leggings(ModItems.RUBY_LEGGINGS, ModItems.RUBY, exporter);
        boots(ModItems.RUBY_BOOTS, ModItems.RUBY, exporter);
        // Pyrite
        offerSmelting(exporter, PYRITE_SMELTABLES, RecipeCategory.MISC, ModItems.PYRITE_INGOT, 0.7f, 200, "pyrite_ingot");
        offerBlasting(exporter, PYRITE_SMELTABLES, RecipeCategory.MISC, ModItems.PYRITE_INGOT, 0.7f, 100, "pyrite_ingot");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PYRITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.PYRITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PYRITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_PYRITE_BLOCK);
        stairs(ModBlocks.PYRITE_STAIRS, ModBlocks.PYRITE_BLOCK, exporter);
        slab(ModBlocks.PYRITE_SLAB, ModBlocks.PYRITE_BLOCK, exporter);
        pressurePlate(ModBlocks.PYRITE_PRESSURE_PLATE, ModItems.PYRITE_INGOT, exporter);
        sword(ModItems.PYRITE_SWORD, ModItems.PYRITE_INGOT, exporter);
        pickaxe(ModItems.PYRITE_PICKAXE, ModItems.PYRITE_INGOT, exporter);
        axe(ModItems.PYRITE_AXE, ModItems.PYRITE_INGOT, exporter);
        shovel(ModItems.PYRITE_SHOVEL, ModItems.PYRITE_INGOT, exporter);
        hoe(ModItems.PYRITE_HOE, ModItems.PYRITE_INGOT, exporter);
        helmet(ModItems.PYRITE_HELMET, ModItems.PYRITE_INGOT, exporter);
        chestplate(ModItems.PYRITE_CHESTPLATE, ModItems.PYRITE_INGOT, exporter);
        leggings(ModItems.PYRITE_LEGGINGS, ModItems.PYRITE_INGOT, exporter);
        boots(ModItems.PYRITE_BOOTS, ModItems.PYRITE_INGOT, exporter);
        // Titanium
        offerSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 0.7f, 200, "titanium_ingot");
        offerBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 0.7f, 100, "titanium_ingot");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_TITANIUM_BLOCK);
        stairs(ModBlocks.TITANIUM_STAIRS, ModBlocks.TITANIUM_BLOCK, exporter);
        slab(ModBlocks.TITANIUM_SLAB, ModBlocks.TITANIUM_BLOCK, exporter);
        pressurePlate(ModBlocks.TITANIUM_PRESSURE_PLATE, ModItems.TITANIUM_INGOT, exporter);
        sword(ModItems.TITANIUM_SWORD, ModItems.TITANIUM_INGOT, exporter);
        pickaxe(ModItems.TITANIUM_PICKAXE, ModItems.TITANIUM_INGOT, exporter);
        axe(ModItems.TITANIUM_AXE, ModItems.TITANIUM_INGOT, exporter);
        shovel(ModItems.TITANIUM_SHOVEL, ModItems.TITANIUM_INGOT, exporter);
        hoe(ModItems.TITANIUM_HOE, ModItems.TITANIUM_INGOT, exporter);
        helmet(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_INGOT, exporter);
        chestplate(ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_INGOT, exporter);
        leggings(ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_INGOT, exporter);
        boots(ModItems.TITANIUM_BOOTS, ModItems.TITANIUM_INGOT, exporter);
        // Purple Sapphire
        offerSmelting(exporter, PURPLE_SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.PURPLE_SAPPHIRE, 0.7f, 200, "purple_sapphire");
        offerBlasting(exporter, PURPLE_SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.PURPLE_SAPPHIRE, 0.7f, 100, "purple_sapphire");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPLE_SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.PURPLE_SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PURPLE_SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
        stairs(ModBlocks.PURPLE_SAPPHIRE_STAIRS, ModBlocks.PURPLE_SAPPHIRE_BLOCK, exporter);
        slab(ModBlocks.PURPLE_SAPPHIRE_SLAB, ModBlocks.PURPLE_SAPPHIRE_BLOCK, exporter);
        pressurePlate(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE, ModItems.PURPLE_SAPPHIRE, exporter);
        sword(ModItems.PURPLE_SAPPHIRE_SWORD, ModItems.PURPLE_SAPPHIRE, exporter);
        pickaxe(ModItems.PURPLE_SAPPHIRE_PICKAXE, ModItems.PURPLE_SAPPHIRE, exporter);
        axe(ModItems.PURPLE_SAPPHIRE_AXE, ModItems.PURPLE_SAPPHIRE, exporter);
        shovel(ModItems.PURPLE_SAPPHIRE_SHOVEL, ModItems.PURPLE_SAPPHIRE, exporter);
        hoe(ModItems.PURPLE_SAPPHIRE_HOE, ModItems.PURPLE_SAPPHIRE, exporter);
        helmet(ModItems.PURPLE_SAPPHIRE_HELMET, ModItems.PURPLE_SAPPHIRE, exporter);
        chestplate(ModItems.PURPLE_SAPPHIRE_CHESTPLATE, ModItems.PURPLE_SAPPHIRE, exporter);
        leggings(ModItems.PURPLE_SAPPHIRE_LEGGINGS, ModItems.PURPLE_SAPPHIRE, exporter);
        boots(ModItems.PURPLE_SAPPHIRE_BOOTS, ModItems.PURPLE_SAPPHIRE, exporter);
        // Tin
        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin_ingot");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 100, "tin_ingot");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TIN_BLOCK);
        stairs(ModBlocks.TIN_STAIRS, ModBlocks.TIN_BLOCK, exporter);
        slab(ModBlocks.TIN_SLAB, ModBlocks.TIN_BLOCK, exporter);
        pressurePlate(ModBlocks.TIN_PRESSURE_PLATE, ModItems.TIN_INGOT, exporter);
        sword(ModItems.TIN_SWORD, ModItems.TIN_INGOT, exporter);
        pickaxe(ModItems.TIN_PICKAXE, ModItems.TIN_INGOT, exporter);
        axe(ModItems.TIN_AXE, ModItems.TIN_INGOT, exporter);
        shovel(ModItems.TIN_SHOVEL, ModItems.TIN_INGOT, exporter);
        hoe(ModItems.TIN_HOE, ModItems.TIN_INGOT, exporter);
        helmet(ModItems.TIN_HELMET, ModItems.TIN_INGOT, exporter);
        chestplate(ModItems.TIN_CHESTPLATE, ModItems.TIN_INGOT, exporter);
        leggings(ModItems.TIN_LEGGINGS, ModItems.TIN_INGOT, exporter);
        boots(ModItems.TIN_BOOTS, ModItems.TIN_INGOT, exporter);
        // RAINBOW
        offerSmelting(exporter, RAINBOW_SMELTABLES, RecipeCategory.MISC, ModItems.RAINBOW_GEM, 0.7f, 200, "rainbow_gem");
        offerBlasting(exporter, RAINBOW_SMELTABLES, RecipeCategory.MISC, ModItems.RAINBOW_GEM, 0.7f, 100, "rainbow_gem");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAINBOW_GEM, RecipeCategory.DECORATIONS, ModBlocks.RAINBOW_BLOCK);
        stairs(ModBlocks.RAINBOW_STAIRS, ModBlocks.RAINBOW_BLOCK, exporter);
        slab(ModBlocks.RAINBOW_SLAB, ModBlocks.RAINBOW_BLOCK, exporter);
        pressurePlate(ModBlocks.RAINBOW_PRESSURE_PLATE, ModItems.RAINBOW_GEM, exporter);
        sword(ModItems.RAINBOW_SWORD, ModItems.RAINBOW_GEM, exporter);
        pickaxe(ModItems.RAINBOW_PICKAXE, ModItems.RAINBOW_GEM, exporter);
        axe(ModItems.RAINBOW_AXE, ModItems.RAINBOW_GEM, exporter);
        shovel(ModItems.RAINBOW_SHOVEL, ModItems.RAINBOW_GEM, exporter);
        hoe(ModItems.RAINBOW_HOE, ModItems.RAINBOW_GEM, exporter);
        helmet(ModItems.RAINBOW_HELMET, ModItems.RAINBOW_GEM, exporter);
        chestplate(ModItems.RAINBOW_CHESTPLATE, ModItems.RAINBOW_GEM, exporter);
        leggings(ModItems.RAINBOW_LEGGINGS, ModItems.RAINBOW_GEM, exporter);
        boots(ModItems.RAINBOW_BOOTS, ModItems.RAINBOW_GEM, exporter);
    }

    public static String getRecipeName(ItemConvertible item) {
        return Registries.ITEM.getId(item.asItem()).toString();
    }

    public static void sword(Item sword, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, sword, 1)
                .pattern(" # ").pattern(" # ").pattern(" S ")
                .input('#', ingredient).input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(sword)));
    }

    public static void pickaxe(Item pickaxe, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe, 1)
                .pattern("###").pattern(" S ").pattern(" S ")
                .input('#', ingredient).input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(pickaxe)));
    }

    public static void axe(Item axe, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe, 1)
                .pattern("###").pattern("#S ").pattern(" S ")
                .input('#', ingredient).input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(axe)));
    }

    public static void shovel(Item shovel, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel, 1)
                .pattern(" # ").pattern(" S ").pattern(" S ")
                .input('#', ingredient).input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(shovel)));
    }

    public static void hoe(Item hoe, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe, 1)
                .pattern("## ").pattern(" S ").pattern(" S ")
                .input('#', ingredient).input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(hoe)));
    }

    public static void helmet(Item helmet, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, helmet, 1)
                .pattern("###").pattern("# #")
                .input('#', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(helmet)));
    }

    public static void chestplate(Item chestplate, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, chestplate, 1)
                .pattern("# #").pattern("###").pattern("###")
                .input('#', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(chestplate)));
    }

    public static void leggings(Item leggings, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, leggings, 1)
                .pattern("###").pattern("# #").pattern("# #")
                .input('#', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(leggings)));
    }

    public static void boots(Item boots, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, boots, 1)
                .pattern("# #").pattern("# #")
                .input('#', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter, new Identifier(getRecipeName(boots)));
    }

    public static void stairs(Block stairs, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        createStairsRecipe(stairs, Ingredient.ofItems(ingredient)).criterion(hasItem(ingredient), conditionsFromItem(ingredient)).offerTo(exporter, new Identifier(getRecipeName(stairs)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stairs, ingredient, 1);
    }

    public static void slab(Block slab, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, slab, Ingredient.ofItems(ingredient)).criterion(hasItem(ingredient), conditionsFromItem(ingredient)).offerTo(exporter, new Identifier(getRecipeName(slab)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, ingredient, 1);
    }

    public static void pressurePlate(Block pressurePlate, ItemConvertible ingredient, Consumer<RecipeJsonProvider> exporter) {
        createPressurePlateRecipe(RecipeCategory.REDSTONE, pressurePlate, Ingredient.ofItems(ingredient)).criterion(hasItem(ingredient), conditionsFromItem(ingredient)).offerTo(exporter, new Identifier(getRecipeName(pressurePlate)));
    }
}
