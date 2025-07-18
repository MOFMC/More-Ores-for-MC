package com.agmpenguin.mofmc.datagen;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Ruby
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_STAIRS);
        addDrop(ModBlocks.RUBY_PRESSURE_PLATE);
        addDrop(ModBlocks.RUBY_SLAB, slabDrops(ModBlocks.RUBY_SLAB));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, oreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.END_RUBY_ORE, oreDrops(ModBlocks.END_RUBY_ORE, ModItems.RAW_RUBY));
        // Pyrite
        addDrop(ModBlocks.PYRITE_BLOCK);
        addDrop(ModBlocks.RAW_PYRITE_BLOCK);
        addDrop(ModBlocks.PYRITE_STAIRS);
        addDrop(ModBlocks.PYRITE_PRESSURE_PLATE);
        addDrop(ModBlocks.PYRITE_SLAB, slabDrops(ModBlocks.PYRITE_SLAB));
        addDrop(ModBlocks.PYRITE_ORE, oreDrops(ModBlocks.PYRITE_ORE, ModItems.RAW_PYRITE));
        addDrop(ModBlocks.DEEPSLATE_PYRITE_ORE, oreDrops(ModBlocks.DEEPSLATE_PYRITE_ORE, ModItems.RAW_PYRITE));
        addDrop(ModBlocks.NETHER_PYRITE_ORE, oreDrops(ModBlocks.NETHER_PYRITE_ORE, ModItems.RAW_PYRITE));
        addDrop(ModBlocks.END_PYRITE_ORE, oreDrops(ModBlocks.END_PYRITE_ORE, ModItems.RAW_PYRITE));
        // Titanium
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_STAIRS);
        addDrop(ModBlocks.TITANIUM_PRESSURE_PLATE);
        addDrop(ModBlocks.TITANIUM_SLAB, slabDrops(ModBlocks.TITANIUM_SLAB));
        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.NETHER_TITANIUM_ORE, oreDrops(ModBlocks.NETHER_TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.END_TITANIUM_ORE, oreDrops(ModBlocks.END_TITANIUM_ORE, ModItems.RAW_TITANIUM));
        // Purple Sapphire
        addDrop(ModBlocks.PURPLE_SAPPHIRE_BLOCK);
        addDrop(ModBlocks.RAW_PURPLE_SAPPHIRE_BLOCK);
        addDrop(ModBlocks.PURPLE_SAPPHIRE_STAIRS);
        addDrop(ModBlocks.PURPLE_SAPPHIRE_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_SAPPHIRE_SLAB, slabDrops(ModBlocks.PURPLE_SAPPHIRE_SLAB));
        addDrop(ModBlocks.PURPLE_SAPPHIRE_ORE, oreDrops(ModBlocks.PURPLE_SAPPHIRE_ORE, ModItems.RAW_PURPLE_SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE, ModItems.RAW_PURPLE_SAPPHIRE));
        addDrop(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE, oreDrops(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE, ModItems.RAW_PURPLE_SAPPHIRE));
        addDrop(ModBlocks.END_PURPLE_SAPPHIRE_ORE, oreDrops(ModBlocks.END_PURPLE_SAPPHIRE_ORE, ModItems.RAW_PURPLE_SAPPHIRE));
        // Tin
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.TIN_STAIRS);
        addDrop(ModBlocks.TIN_PRESSURE_PLATE);
        addDrop(ModBlocks.TIN_BUTTON);
        addDrop(ModBlocks.TIN_SLAB, slabDrops(ModBlocks.TIN_SLAB));
        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE, oreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.NETHER_TIN_ORE, oreDrops(ModBlocks.NETHER_TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.END_TIN_ORE, oreDrops(ModBlocks.END_TIN_ORE, ModItems.RAW_TIN));
        // RAINBOW
        addDrop(ModBlocks.RAINBOW_BLOCK);
        addDrop(ModBlocks.RAINBOW_STAIRS);
        addDrop(ModBlocks.RAINBOW_PRESSURE_PLATE);
        addDrop(ModBlocks.RAINBOW_SLAB, slabDrops(ModBlocks.RAINBOW_SLAB));
        addDrop(ModBlocks.RAINBOW_ORE, oreDrops(ModBlocks.RAINBOW_ORE, ModItems.RAINBOW_GEM));
        addDrop(ModBlocks.DEEPSLATE_RAINBOW_ORE, oreDrops(ModBlocks.DEEPSLATE_RAINBOW_ORE, ModItems.RAINBOW_GEM));
        addDrop(ModBlocks.NETHER_RAINBOW_ORE, oreDrops(ModBlocks.NETHER_RAINBOW_ORE, ModItems.RAINBOW_GEM));
        addDrop(ModBlocks.END_RAINBOW_ORE, oreDrops(ModBlocks.END_RAINBOW_ORE, ModItems.RAINBOW_GEM));

        // addDrop(ModBlocks.DIAMOND_STONECUTTER);
    }
    /*
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float min, float max) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(min, max))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
     */
}
