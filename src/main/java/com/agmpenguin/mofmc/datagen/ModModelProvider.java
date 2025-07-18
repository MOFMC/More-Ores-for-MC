package com.agmpenguin.mofmc.datagen;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_RUBY_ORE);
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        rubyPool.stairs(ModBlocks.RUBY_STAIRS);
        rubyPool.slab(ModBlocks.RUBY_SLAB);
        rubyPool.pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PYRITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PYRITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_PYRITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_PYRITE_ORE);
        BlockStateModelGenerator.BlockTexturePool pyritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PYRITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PYRITE_BLOCK);
        pyritePool.stairs(ModBlocks.PYRITE_STAIRS);
        pyritePool.slab(ModBlocks.PYRITE_SLAB);
        pyritePool.pressurePlate(ModBlocks.PYRITE_PRESSURE_PLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_TITANIUM_ORE);
        BlockStateModelGenerator.BlockTexturePool titaniumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITANIUM_BLOCK);
        titaniumPool.stairs(ModBlocks.TITANIUM_STAIRS);
        titaniumPool.slab(ModBlocks.TITANIUM_SLAB);
        titaniumPool.pressurePlate(ModBlocks.TITANIUM_PRESSURE_PLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_PURPLE_SAPPHIRE_ORE);
        BlockStateModelGenerator.BlockTexturePool purpleSapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
        purpleSapphirePool.stairs(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
        purpleSapphirePool.slab(ModBlocks.PURPLE_SAPPHIRE_SLAB);
        purpleSapphirePool.pressurePlate(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_TIN_ORE);
        BlockStateModelGenerator.BlockTexturePool tinPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        tinPool.stairs(ModBlocks.TIN_STAIRS);
        tinPool.slab(ModBlocks.TIN_SLAB);
        tinPool.pressurePlate(ModBlocks.TIN_PRESSURE_PLATE);
        tinPool.button(ModBlocks.TIN_BUTTON);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAINBOW_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RAINBOW_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RAINBOW_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_RAINBOW_ORE);
        BlockStateModelGenerator.BlockTexturePool rainbowPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINBOW_BLOCK);
        rainbowPool.stairs(ModBlocks.RAINBOW_STAIRS);
        rainbowPool.slab(ModBlocks.RAINBOW_SLAB);
        rainbowPool.pressurePlate(ModBlocks.RAINBOW_PRESSURE_PLATE);

        // blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_STONECUTTER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PYRITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PYRITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PYRITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PYRITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PYRITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PYRITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PYRITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PURPLE_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PURPLE_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_SAPPHIRE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TIN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RAINBOW_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAINBOW_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAINBOW_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAINBOW_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAINBOW_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAINBOW_HOE, Models.HANDHELD);

        // itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        // itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        // itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        // itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));
        // itemModelGenerator.register(ModItems.RUBY, Models.GENERATED_TWO_LAYERS);

        // itemModelGenerator.suffixTrim(new Identifier(MOFMC.MOD_ID, "ruby"), "ruby_material");
        // itemModelGenerator.register(ModItems.NOTICE_ITEM, Models.GENERATED);
    }
}
