package com.agmpenguin.mofmc.datagen;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.RUBY_ORES)
                .add(ModBlocks.RUBY_ORE.asItem())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.asItem())
                .add(ModBlocks.NETHER_RUBY_ORE.asItem())
                .add(ModBlocks.END_RUBY_ORE.asItem())
                .add(ModBlocks.RUBY_BLOCK.asItem())
                .add(ModBlocks.RAW_RUBY_BLOCK.asItem())
                .add(ModItems.RAW_RUBY);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET).add(ModItems.RUBY_CHESTPLATE).add(ModItems.RUBY_LEGGINGS).add(ModItems.RUBY_BOOTS)
                .add(ModItems.PYRITE_HELMET).add(ModItems.PYRITE_CHESTPLATE).add(ModItems.PYRITE_LEGGINGS).add(ModItems.PYRITE_BOOTS)
                .add(ModItems.TITANIUM_HELMET).add(ModItems.TITANIUM_CHESTPLATE).add(ModItems.TITANIUM_LEGGINGS).add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.PURPLE_SAPPHIRE_HELMET).add(ModItems.PURPLE_SAPPHIRE_CHESTPLATE).add(ModItems.PURPLE_SAPPHIRE_LEGGINGS).add(ModItems.PURPLE_SAPPHIRE_BOOTS)
                .add(ModItems.TIN_HELMET).add(ModItems.TIN_CHESTPLATE).add(ModItems.TIN_LEGGINGS).add(ModItems.TIN_BOOTS)
                .add(ModItems.RAINBOW_HELMET).add(ModItems.RAINBOW_CHESTPLATE).add(ModItems.RAINBOW_LEGGINGS).add(ModItems.RAINBOW_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY).add(ModItems.PYRITE_INGOT).add(ModItems.TITANIUM_INGOT).add(ModItems.PURPLE_SAPPHIRE).add(ModItems.TIN_INGOT);

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.RUBY).add(ModItems.TITANIUM_INGOT).add(ModItems.PURPLE_SAPPHIRE).add(ModItems.RAINBOW_GEM);

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.RUBY_STAIRS.asItem())
                .add(ModBlocks.PYRITE_STAIRS.asItem())
                .add(ModBlocks.TITANIUM_STAIRS.asItem())
                .add(ModBlocks.PURPLE_SAPPHIRE_STAIRS.asItem())
                .add(ModBlocks.TIN_STAIRS.asItem())
                .add(ModBlocks.RAINBOW_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.RUBY_SLAB.asItem())
                .add(ModBlocks.PYRITE_SLAB.asItem())
                .add(ModBlocks.TITANIUM_SLAB.asItem())
                .add(ModBlocks.PURPLE_SAPPHIRE_SLAB.asItem())
                .add(ModBlocks.TIN_SLAB.asItem())
                .add(ModBlocks.RAINBOW_SLAB.asItem());

        getOrCreateTagBuilder(ModTags.Items.PRESSURE_PLATES)
                .add(ModBlocks.RUBY_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PYRITE_PRESSURE_PLATE.asItem())
                .add(ModBlocks.TITANIUM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE.asItem())
                .add(ModBlocks.TIN_PRESSURE_PLATE.asItem())
                .add(ModBlocks.RAINBOW_PRESSURE_PLATE.asItem())
                .add(Blocks.STONE_PRESSURE_PLATE.asItem())
                .add(Blocks.OAK_PRESSURE_PLATE.asItem())
                .add(Blocks.SPRUCE_PRESSURE_PLATE.asItem())
                .add(Blocks.BIRCH_PRESSURE_PLATE.asItem())
                .add(Blocks.JUNGLE_PRESSURE_PLATE.asItem())
                .add(Blocks.ACACIA_PRESSURE_PLATE.asItem())
                .add(Blocks.CHERRY_PRESSURE_PLATE.asItem())
                .add(Blocks.DARK_OAK_PRESSURE_PLATE.asItem())
                .add(Blocks.MANGROVE_PRESSURE_PLATE.asItem())
                .add(Blocks.BAMBOO_PRESSURE_PLATE.asItem())
                .add(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE.asItem())
                .add(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE.asItem())
                .add(Blocks.CRIMSON_PRESSURE_PLATE.asItem())
                .add(Blocks.WARPED_PRESSURE_PLATE.asItem())
                .add(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.asItem());
    }
    //     public static final TagKey<Item> BEACON_PAYMENT_ITEMS = ItemTags.of("beacon_payment_items");
}
