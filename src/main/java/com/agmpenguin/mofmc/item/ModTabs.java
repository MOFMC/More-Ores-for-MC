package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.MOFMC;
import com.agmpenguin.mofmc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModTabs {
    public static final ItemGroup MOFMC_TAB = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOFMC.MOD_ID, "mofmc"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("tab.mofmc"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);


                        entries.add(ModItems.PYRITE_INGOT);
                        entries.add(ModItems.RAW_PYRITE);
                        entries.add(ModItems.PYRITE_SWORD);
                        entries.add(ModItems.PYRITE_PICKAXE);
                        entries.add(ModItems.PYRITE_AXE);
                        entries.add(ModItems.PYRITE_SHOVEL);
                        entries.add(ModItems.PYRITE_HOE);
                        entries.add(ModItems.PYRITE_HELMET);
                        entries.add(ModItems.PYRITE_CHESTPLATE);
                        entries.add(ModItems.PYRITE_LEGGINGS);
                        entries.add(ModItems.PYRITE_BOOTS);

                        entries.add(ModBlocks.PYRITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PYRITE_ORE);
                        entries.add(ModBlocks.NETHER_PYRITE_ORE);
                        entries.add(ModBlocks.END_PYRITE_ORE);
                        entries.add(ModBlocks.PYRITE_BLOCK);
                        entries.add(ModBlocks.RAW_PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_STAIRS);
                        entries.add(ModBlocks.PYRITE_SLAB);
                        entries.add(ModBlocks.PYRITE_PRESSURE_PLATE);

                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
                        entries.add(ModBlocks.END_TITANIUM_ORE);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_STAIRS);
                        entries.add(ModBlocks.TITANIUM_SLAB);
                        entries.add(ModBlocks.TITANIUM_PRESSURE_PLATE);

                        entries.add(ModItems.PURPLE_SAPPHIRE);
                        entries.add(ModItems.RAW_PURPLE_SAPPHIRE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SWORD);
                        entries.add(ModItems.PURPLE_SAPPHIRE_PICKAXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_AXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SHOVEL);
                        entries.add(ModItems.PURPLE_SAPPHIRE_HOE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_HELMET);
                        entries.add(ModItems.PURPLE_SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.PURPLE_SAPPHIRE_BOOTS);

                        entries.add(ModBlocks.PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_SLAB);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);

                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_HOE);
                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);

                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.NETHER_TIN_ORE);
                        entries.add(ModBlocks.END_TIN_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_STAIRS);
                        entries.add(ModBlocks.TIN_SLAB);
                        entries.add(ModBlocks.TIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.TIN_BUTTON);

                        entries.add(ModItems.RAINBOW_GEM);
                        entries.add(ModItems.RAINBOW_SWORD);
                        entries.add(ModItems.RAINBOW_PICKAXE);
                        entries.add(ModItems.RAINBOW_AXE);
                        entries.add(ModItems.RAINBOW_SHOVEL);
                        entries.add(ModItems.RAINBOW_HOE);
                        entries.add(ModItems.RAINBOW_HELMET);
                        entries.add(ModItems.RAINBOW_CHESTPLATE);
                        entries.add(ModItems.RAINBOW_LEGGINGS);
                        entries.add(ModItems.RAINBOW_BOOTS);

                        entries.add(ModBlocks.RAINBOW_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RAINBOW_ORE);
                        entries.add(ModBlocks.NETHER_RAINBOW_ORE);
                        entries.add(ModBlocks.END_RAINBOW_ORE);
                        entries.add(ModBlocks.RAINBOW_BLOCK);
                        entries.add(ModBlocks.RAINBOW_STAIRS);
                        entries.add(ModBlocks.RAINBOW_SLAB);
                        entries.add(ModBlocks.RAINBOW_PRESSURE_PLATE);
                    }).build());

    public static final ItemGroup MOFMC_TAB_2 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOFMC.MOD_ID, "mofmc2"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("tab.mofmc2"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);

                        entries.add(ModBlocks.PYRITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PYRITE_ORE);
                        entries.add(ModBlocks.NETHER_PYRITE_ORE);
                        entries.add(ModBlocks.END_PYRITE_ORE);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
                        entries.add(ModBlocks.END_TITANIUM_ORE);

                        entries.add(ModBlocks.PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_PURPLE_SAPPHIRE_ORE);

                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.NETHER_TIN_ORE);
                        entries.add(ModBlocks.END_TIN_ORE);

                        entries.add(ModBlocks.RAINBOW_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RAINBOW_ORE);
                        entries.add(ModBlocks.NETHER_RAINBOW_ORE);
                        entries.add(ModBlocks.END_RAINBOW_ORE);

                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_STAIRS);
                        entries.add(ModBlocks.PYRITE_SLAB);
                        entries.add(ModBlocks.PYRITE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_STAIRS);
                        entries.add(ModBlocks.TITANIUM_SLAB);
                        entries.add(ModBlocks.TITANIUM_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_SLAB);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.TIN_STAIRS);
                        entries.add(ModBlocks.TIN_SLAB);
                        entries.add(ModBlocks.TIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.TIN_BUTTON);

                        entries.add(ModBlocks.RAINBOW_BLOCK);
                        entries.add(ModBlocks.RAINBOW_STAIRS);
                        entries.add(ModBlocks.RAINBOW_SLAB);
                        entries.add(ModBlocks.RAINBOW_PRESSURE_PLATE);

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.PYRITE_INGOT);
                        entries.add(ModItems.RAW_PYRITE);

                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);

                        entries.add(ModItems.PURPLE_SAPPHIRE);
                        entries.add(ModItems.RAW_PURPLE_SAPPHIRE);

                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_TIN);

                        entries.add(ModItems.RAINBOW_GEM);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.PYRITE_PICKAXE);
                        entries.add(ModItems.PYRITE_AXE);
                        entries.add(ModItems.PYRITE_SHOVEL);
                        entries.add(ModItems.PYRITE_HOE);

                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModItems.PURPLE_SAPPHIRE_PICKAXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_AXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SHOVEL);
                        entries.add(ModItems.PURPLE_SAPPHIRE_HOE);

                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_HOE);

                        entries.add(ModItems.RAINBOW_PICKAXE);
                        entries.add(ModItems.RAINBOW_AXE);
                        entries.add(ModItems.RAINBOW_SHOVEL);
                        entries.add(ModItems.RAINBOW_HOE);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.PYRITE_SWORD);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SWORD);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.RAINBOW_SWORD);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.PYRITE_HELMET);
                        entries.add(ModItems.PYRITE_CHESTPLATE);
                        entries.add(ModItems.PYRITE_LEGGINGS);
                        entries.add(ModItems.PYRITE_BOOTS);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.PURPLE_SAPPHIRE_HELMET);
                        entries.add(ModItems.PURPLE_SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.PURPLE_SAPPHIRE_BOOTS);

                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);

                        entries.add(ModItems.RAINBOW_HELMET);
                        entries.add(ModItems.RAINBOW_CHESTPLATE);
                        entries.add(ModItems.RAINBOW_LEGGINGS);
                        entries.add(ModItems.RAINBOW_BOOTS);
                    }).build());

    public static final ItemGroup MOFMC_TAB_3 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOFMC.MOD_ID, "mofmc3"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("tab.mofmc3"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);

                        entries.add(ModBlocks.PYRITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PYRITE_ORE);
                        entries.add(ModBlocks.NETHER_PYRITE_ORE);
                        entries.add(ModBlocks.END_PYRITE_ORE);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
                        entries.add(ModBlocks.END_TITANIUM_ORE);

                        entries.add(ModBlocks.PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_PURPLE_SAPPHIRE_ORE);

                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.NETHER_TIN_ORE);
                        entries.add(ModBlocks.END_TIN_ORE);

                        entries.add(ModBlocks.RAINBOW_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RAINBOW_ORE);
                        entries.add(ModBlocks.NETHER_RAINBOW_ORE);
                        entries.add(ModBlocks.END_RAINBOW_ORE);

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.PYRITE_INGOT);
                        entries.add(ModItems.RAW_PYRITE);

                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);

                        entries.add(ModItems.PURPLE_SAPPHIRE);
                        entries.add(ModItems.RAW_PURPLE_SAPPHIRE);

                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_TIN);

                        entries.add(ModItems.RAINBOW_GEM);

                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_STAIRS);
                        entries.add(ModBlocks.PYRITE_SLAB);
                        entries.add(ModBlocks.PYRITE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_STAIRS);
                        entries.add(ModBlocks.TITANIUM_SLAB);
                        entries.add(ModBlocks.TITANIUM_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_SLAB);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.TIN_STAIRS);
                        entries.add(ModBlocks.TIN_SLAB);
                        entries.add(ModBlocks.TIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.TIN_BUTTON);

                        entries.add(ModBlocks.RAINBOW_BLOCK);
                        entries.add(ModBlocks.RAINBOW_STAIRS);
                        entries.add(ModBlocks.RAINBOW_SLAB);
                        entries.add(ModBlocks.RAINBOW_PRESSURE_PLATE);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.PYRITE_PICKAXE);
                        entries.add(ModItems.PYRITE_AXE);
                        entries.add(ModItems.PYRITE_SHOVEL);
                        entries.add(ModItems.PYRITE_HOE);

                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModItems.PURPLE_SAPPHIRE_PICKAXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_AXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SHOVEL);
                        entries.add(ModItems.PURPLE_SAPPHIRE_HOE);

                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_HOE);

                        entries.add(ModItems.RAINBOW_PICKAXE);
                        entries.add(ModItems.RAINBOW_AXE);
                        entries.add(ModItems.RAINBOW_SHOVEL);
                        entries.add(ModItems.RAINBOW_HOE);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.PYRITE_SWORD);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SWORD);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.RAINBOW_SWORD);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.PYRITE_HELMET);
                        entries.add(ModItems.PYRITE_CHESTPLATE);
                        entries.add(ModItems.PYRITE_LEGGINGS);
                        entries.add(ModItems.PYRITE_BOOTS);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.PURPLE_SAPPHIRE_HELMET);
                        entries.add(ModItems.PURPLE_SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.PURPLE_SAPPHIRE_BOOTS);

                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);

                        entries.add(ModItems.RAINBOW_HELMET);
                        entries.add(ModItems.RAINBOW_CHESTPLATE);
                        entries.add(ModItems.RAINBOW_LEGGINGS);
                        entries.add(ModItems.RAINBOW_BOOTS);
                    }).build());

    public static final ItemGroup MOFMC_TAB_4 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOFMC.MOD_ID, "mofmc4"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("tab.mofmc4"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);

                        entries.add(ModBlocks.PYRITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PYRITE_ORE);
                        entries.add(ModBlocks.NETHER_PYRITE_ORE);
                        entries.add(ModBlocks.END_PYRITE_ORE);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
                        entries.add(ModBlocks.END_TITANIUM_ORE);

                        entries.add(ModBlocks.PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_PURPLE_SAPPHIRE_ORE);

                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.NETHER_TIN_ORE);
                        entries.add(ModBlocks.END_TIN_ORE);

                        entries.add(ModBlocks.RAINBOW_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RAINBOW_ORE);
                        entries.add(ModBlocks.NETHER_RAINBOW_ORE);
                        entries.add(ModBlocks.END_RAINBOW_ORE);

                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_STAIRS);
                        entries.add(ModBlocks.PYRITE_SLAB);
                        entries.add(ModBlocks.PYRITE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_STAIRS);
                        entries.add(ModBlocks.TITANIUM_SLAB);
                        entries.add(ModBlocks.TITANIUM_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_SLAB);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.TIN_STAIRS);
                        entries.add(ModBlocks.TIN_SLAB);
                        entries.add(ModBlocks.TIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.TIN_BUTTON);

                        entries.add(ModBlocks.RAINBOW_BLOCK);
                        entries.add(ModBlocks.RAINBOW_STAIRS);
                        entries.add(ModBlocks.RAINBOW_SLAB);
                        entries.add(ModBlocks.RAINBOW_PRESSURE_PLATE);

                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);

                        entries.add(ModItems.RAW_PYRITE);
                        entries.add(ModItems.PYRITE_INGOT);

                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

                        entries.add(ModItems.RAW_PURPLE_SAPPHIRE);
                        entries.add(ModItems.PURPLE_SAPPHIRE);

                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);

                        entries.add(ModItems.RAINBOW_GEM);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.PYRITE_PICKAXE);
                        entries.add(ModItems.PYRITE_AXE);
                        entries.add(ModItems.PYRITE_SHOVEL);
                        entries.add(ModItems.PYRITE_HOE);

                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModItems.PURPLE_SAPPHIRE_PICKAXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_AXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SHOVEL);
                        entries.add(ModItems.PURPLE_SAPPHIRE_HOE);

                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_HOE);

                        entries.add(ModItems.RAINBOW_PICKAXE);
                        entries.add(ModItems.RAINBOW_AXE);
                        entries.add(ModItems.RAINBOW_SHOVEL);
                        entries.add(ModItems.RAINBOW_HOE);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.PYRITE_SWORD);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SWORD);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.RAINBOW_SWORD);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.PYRITE_HELMET);
                        entries.add(ModItems.PYRITE_CHESTPLATE);
                        entries.add(ModItems.PYRITE_LEGGINGS);
                        entries.add(ModItems.PYRITE_BOOTS);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.PURPLE_SAPPHIRE_HELMET);
                        entries.add(ModItems.PURPLE_SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.PURPLE_SAPPHIRE_BOOTS);

                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);

                        entries.add(ModItems.RAINBOW_HELMET);
                        entries.add(ModItems.RAINBOW_CHESTPLATE);
                        entries.add(ModItems.RAINBOW_LEGGINGS);
                        entries.add(ModItems.RAINBOW_BOOTS);
                    }).build());

    public static final ItemGroup MOFMC_TAB_5 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MOFMC.MOD_ID, "mofmc5"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("tab.mofmc5"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);

                        entries.add(ModBlocks.PYRITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PYRITE_ORE);
                        entries.add(ModBlocks.NETHER_PYRITE_ORE);
                        entries.add(ModBlocks.END_PYRITE_ORE);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
                        entries.add(ModBlocks.END_TITANIUM_ORE);

                        entries.add(ModBlocks.PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_PURPLE_SAPPHIRE_ORE);

                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.NETHER_TIN_ORE);
                        entries.add(ModBlocks.END_TIN_ORE);

                        entries.add(ModBlocks.RAINBOW_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RAINBOW_ORE);
                        entries.add(ModBlocks.NETHER_RAINBOW_ORE);
                        entries.add(ModBlocks.END_RAINBOW_ORE);

                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);

                        entries.add(ModItems.RAW_PYRITE);
                        entries.add(ModItems.PYRITE_INGOT);

                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

                        entries.add(ModItems.RAW_PURPLE_SAPPHIRE);
                        entries.add(ModItems.PURPLE_SAPPHIRE);

                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);

                        entries.add(ModItems.RAINBOW_GEM);

                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_BLOCK);
                        entries.add(ModBlocks.PYRITE_STAIRS);
                        entries.add(ModBlocks.PYRITE_SLAB);
                        entries.add(ModBlocks.PYRITE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_STAIRS);
                        entries.add(ModBlocks.TITANIUM_SLAB);
                        entries.add(ModBlocks.TITANIUM_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_SLAB);
                        entries.add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);

                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.TIN_STAIRS);
                        entries.add(ModBlocks.TIN_SLAB);
                        entries.add(ModBlocks.TIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.TIN_BUTTON);

                        entries.add(ModBlocks.RAINBOW_BLOCK);
                        entries.add(ModBlocks.RAINBOW_STAIRS);
                        entries.add(ModBlocks.RAINBOW_SLAB);
                        entries.add(ModBlocks.RAINBOW_PRESSURE_PLATE);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.PYRITE_PICKAXE);
                        entries.add(ModItems.PYRITE_AXE);
                        entries.add(ModItems.PYRITE_SHOVEL);
                        entries.add(ModItems.PYRITE_HOE);

                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModItems.PURPLE_SAPPHIRE_PICKAXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_AXE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SHOVEL);
                        entries.add(ModItems.PURPLE_SAPPHIRE_HOE);

                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_HOE);

                        entries.add(ModItems.RAINBOW_PICKAXE);
                        entries.add(ModItems.RAINBOW_AXE);
                        entries.add(ModItems.RAINBOW_SHOVEL);
                        entries.add(ModItems.RAINBOW_HOE);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.PYRITE_SWORD);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.PURPLE_SAPPHIRE_SWORD);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.RAINBOW_SWORD);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.PYRITE_HELMET);
                        entries.add(ModItems.PYRITE_CHESTPLATE);
                        entries.add(ModItems.PYRITE_LEGGINGS);
                        entries.add(ModItems.PYRITE_BOOTS);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.PURPLE_SAPPHIRE_HELMET);
                        entries.add(ModItems.PURPLE_SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.PURPLE_SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.PURPLE_SAPPHIRE_BOOTS);

                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);

                        entries.add(ModItems.RAINBOW_HELMET);
                        entries.add(ModItems.RAINBOW_CHESTPLATE);
                        entries.add(ModItems.RAINBOW_LEGGINGS);
                        entries.add(ModItems.RAINBOW_BOOTS);
                    }).build());

    public static void registerModTabs() {

    }
}
