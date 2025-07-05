package com.agmpenguin.mofmc.block;

import com.agmpenguin.mofmc.MOFMC;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Ruby
    public static final Block RUBY_ORE = registerOre("ruby_ore");
    public static final Block DEEPSLATE_RUBY_ORE = registerOre("deepslate_ruby_ore", 4.5f);
    public static final Block NETHER_RUBY_ORE = registerOre("nether_ruby_ore");
    public static final Block END_RUBY_ORE = registerOre("end_ruby_ore", 4.5f);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block");
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block");
    public static final Block RUBY_STAIRS = registerStairsBlock("ruby_stairs", RUBY_BLOCK);
    public static final Block RUBY_SLAB = registerSlabBlock("ruby_slab");
    public static final Block RUBY_PRESSURE_PLATE = registerPressurePlateBlock("ruby_pressure_plate");
    // PyriteD
    public static final Block PYRITE_ORE = registerOre("pyrite_ore");
    public static final Block DEEPSLATE_PYRITE_ORE = registerOre("deepslate_pyrite_ore", 4.5f);
    public static final Block NETHER_PYRITE_ORE = registerOre("nether_pyrite_ore");
    public static final Block END_PYRITE_ORE = registerOre("end_pyrite_ore", 4.5f);
    public static final Block PYRITE_BLOCK = registerBlock("pyrite_block");
    public static final Block RAW_PYRITE_BLOCK = registerBlock("raw_pyrite_block");
    public static final Block PYRITE_STAIRS = registerStairsBlock("pyrite_stairs", PYRITE_BLOCK);
    public static final Block PYRITE_SLAB = registerSlabBlock("pyrite_slab");
    public static final Block PYRITE_PRESSURE_PLATE = registerPressurePlateBlock("pyrite_pressure_plate");
    // Titanium
    public static final Block TITANIUM_ORE = registerOre("titanium_ore");
    public static final Block DEEPSLATE_TITANIUM_ORE = registerOre("deepslate_titanium_ore", 4.5f);
    public static final Block NETHER_TITANIUM_ORE = registerOre("nether_titanium_ore");
    public static final Block END_TITANIUM_ORE = registerOre("end_titanium_ore", 4.5f);
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block");
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block");
    public static final Block TITANIUM_STAIRS = registerStairsBlock("titanium_stairs", TITANIUM_BLOCK);
    public static final Block TITANIUM_SLAB = registerSlabBlock("titanium_slab");
    public static final Block TITANIUM_PRESSURE_PLATE = registerPressurePlateBlock("titanium_pressure_plate");
    // Purple Sapphire
    public static final Block PURPLE_SAPPHIRE_ORE = registerOre("purple_sapphire_ore");
    public static final Block DEEPSLATE_PURPLE_SAPPHIRE_ORE = registerOre("deepslate_purple_sapphire_ore", 4.5f);
    public static final Block NETHER_PURPLE_SAPPHIRE_ORE = registerOre("nether_purple_sapphire_ore");
    public static final Block END_PURPLE_SAPPHIRE_ORE = registerOre("end_purple_sapphire_ore", 4.5f);
    public static final Block PURPLE_SAPPHIRE_BLOCK = registerBlock("purple_sapphire_block");
    public static final Block RAW_PURPLE_SAPPHIRE_BLOCK = registerBlock("raw_purple_sapphire_block");
    public static final Block PURPLE_SAPPHIRE_STAIRS = registerStairsBlock("purple_sapphire_stairs", PURPLE_SAPPHIRE_BLOCK);
    public static final Block PURPLE_SAPPHIRE_SLAB = registerSlabBlock("purple_sapphire_slab");
    public static final Block PURPLE_SAPPHIRE_PRESSURE_PLATE = registerPressurePlateBlock("purple_sapphire_pressure_plate");
    // Tin
    public static final Block TIN_ORE = registerOre("tin_ore");
    public static final Block DEEPSLATE_TIN_ORE = registerOre("deepslate_tin_ore", 4.5f);
    public static final Block NETHER_TIN_ORE = registerOre("nether_tin_ore");
    public static final Block END_TIN_ORE = registerOre("end_tin_ore", 4.5f);
    public static final Block TIN_BLOCK = registerBlock("tin_block");
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block");
    public static final Block TIN_STAIRS = registerStairsBlock("tin_stairs", TIN_BLOCK);
    public static final Block TIN_SLAB = registerSlabBlock("tin_slab");
    public static final Block TIN_PRESSURE_PLATE = registerPressurePlateBlock("tin_pressure_plate");
    // Rainbow
    public static final Block RAINBOW_ORE = registerOre("rainbow_ore");
    public static final Block DEEPSLATE_RAINBOW_ORE = registerOre("deepslate_rainbow_ore");
    public static final Block NETHER_RAINBOW_ORE = registerOre("nether_rainbow_ore");
    public static final Block END_RAINBOW_ORE = registerOre("end_rainbow_ore");
    public static final Block RAINBOW_BLOCK = registerBlock("rainbow_block");
    public static final Block RAINBOW_STAIRS = registerStairsBlock("rainbow_stairs", RAINBOW_BLOCK);
    public static final Block RAINBOW_SLAB = registerSlabBlock("rainbow_slab");
    public static final Block RAINBOW_PRESSURE_PLATE = registerPressurePlateBlock("rainbow_pressure_plate");

    private static Block register(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static Block registerOre(String name) {
        Block block = new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.0f, 3.0f));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static Block registerOre(String name, float hardness) {
        Block block = new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(hardness, 3.0f));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static Block registerBlock(String name) {
        Block block = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(6.0f));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static StairsBlock registerStairsBlock(String name, Block baseBlock) {
        StairsBlock block = new StairsBlock(baseBlock.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(6.0f));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static SlabBlock registerSlabBlock(String name) {
        SlabBlock block = new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(6.0f));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static PressurePlateBlock registerPressurePlateBlock(String name) {
        PressurePlateBlock block = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON);
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOFMC.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}
