package com.agmpenguin.mofmc.datagen;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.ORE_REPLACEABLES)
                .add(Blocks.STONE).add(Blocks.ANDESITE).add(Blocks.GRANITE).add(Blocks.GRAVEL).add(Blocks.SAND)
                .add(Blocks.SANDSTONE).add(Blocks.DEEPSLATE).add(Blocks.DRIPSTONE_BLOCK).add(Blocks.POINTED_DRIPSTONE)
                .add(Blocks.DIRT).add(Blocks.GRASS_BLOCK).add(Blocks.DIORITE).add(Blocks.MAGMA_BLOCK).add(Blocks.WATER)
                .add(Blocks.LAVA).add(Blocks.TUFF).add(Blocks.SCULK).add(Blocks.CRIMSON_NYLIUM).add(Blocks.WARPED_NYLIUM)
                .add(Blocks.NETHERRACK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.RUBY_PRESSURE_PLATE)
                .add(ModBlocks.PYRITE_ORE)
                .add(ModBlocks.DEEPSLATE_PYRITE_ORE)
                .add(ModBlocks.NETHER_PYRITE_ORE)
                .add(ModBlocks.END_PYRITE_ORE)
                .add(ModBlocks.PYRITE_BLOCK)
                .add(ModBlocks.RAW_PYRITE_BLOCK)
                .add(ModBlocks.PYRITE_STAIRS)
                .add(ModBlocks.PYRITE_SLAB)
                .add(ModBlocks.PYRITE_PRESSURE_PLATE)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.NETHER_TITANIUM_ORE)
                .add(ModBlocks.END_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_STAIRS)
                .add(ModBlocks.TITANIUM_SLAB)
                .add(ModBlocks.TITANIUM_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.END_PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.PURPLE_SAPPHIRE_BLOCK)
                .add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK)
                .add(ModBlocks.PURPLE_SAPPHIRE_STAIRS)
                .add(ModBlocks.PURPLE_SAPPHIRE_SLAB)
                .add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.NETHER_TIN_ORE)
                .add(ModBlocks.END_TIN_ORE)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_STAIRS)
                .add(ModBlocks.TIN_SLAB)
                .add(ModBlocks.TIN_PRESSURE_PLATE)
                .add(ModBlocks.TIN_BUTTON)
                .add(ModBlocks.RAINBOW_ORE)
                .add(ModBlocks.DEEPSLATE_RAINBOW_ORE)
                .add(ModBlocks.NETHER_RAINBOW_ORE)
                .add(ModBlocks.END_RAINBOW_ORE)
                .add(ModBlocks.RAINBOW_BLOCK)
                .add(ModBlocks.RAINBOW_STAIRS)
                .add(ModBlocks.RAINBOW_SLAB)
                .add(ModBlocks.RAINBOW_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.RUBY_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PYRITE_ORE)
                .add(ModBlocks.DEEPSLATE_PYRITE_ORE)
                .add(ModBlocks.NETHER_PYRITE_ORE)
                .add(ModBlocks.END_PYRITE_ORE)
                .add(ModBlocks.PYRITE_BLOCK)
                .add(ModBlocks.RAW_PYRITE_BLOCK)
                .add(ModBlocks.PYRITE_STAIRS)
                .add(ModBlocks.PYRITE_SLAB)
                .add(ModBlocks.PYRITE_PRESSURE_PLATE)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.NETHER_TITANIUM_ORE)
                .add(ModBlocks.END_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_STAIRS)
                .add(ModBlocks.TITANIUM_SLAB)
                .add(ModBlocks.TITANIUM_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.END_PURPLE_SAPPHIRE_ORE)
                .add(ModBlocks.PURPLE_SAPPHIRE_BLOCK)
                .add(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK)
                .add(ModBlocks.PURPLE_SAPPHIRE_STAIRS)
                .add(ModBlocks.PURPLE_SAPPHIRE_SLAB)
                .add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE)
                .add(ModBlocks.RAINBOW_ORE)
                .add(ModBlocks.DEEPSLATE_RAINBOW_ORE)
                .add(ModBlocks.NETHER_RAINBOW_ORE)
                .add(ModBlocks.END_RAINBOW_ORE)
                .add(ModBlocks.RAINBOW_BLOCK)
                .add(ModBlocks.RAINBOW_STAIRS)
                .add(ModBlocks.RAINBOW_SLAB)
                .add(ModBlocks.RAINBOW_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.NETHER_TIN_ORE)
                .add(ModBlocks.END_TIN_ORE)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_STAIRS)
                .add(ModBlocks.TIN_SLAB)
                .add(ModBlocks.TIN_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.PURPLE_SAPPHIRE_BLOCK)
                .add(ModBlocks.RAINBOW_BLOCK);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.PYRITE_STAIRS)
                .add(ModBlocks.TITANIUM_STAIRS)
                .add(ModBlocks.PURPLE_SAPPHIRE_STAIRS)
                .add(ModBlocks.TIN_STAIRS)
                .add(ModBlocks.RAINBOW_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.PYRITE_SLAB)
                .add(ModBlocks.TITANIUM_SLAB)
                .add(ModBlocks.PURPLE_SAPPHIRE_SLAB)
                .add(ModBlocks.TIN_SLAB)
                .add(ModBlocks.RAINBOW_SLAB);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.RUBY_PRESSURE_PLATE)
                .add(ModBlocks.PYRITE_PRESSURE_PLATE)
                .add(ModBlocks.TITANIUM_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE)
                .add(ModBlocks.TIN_PRESSURE_PLATE)
                .add(ModBlocks.RAINBOW_PRESSURE_PLATE);
    }
}
