package com.agmpenguin.mofmc.block;

import com.agmpenguin.mofmc.item.ModItemGroup;
import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.mofmc;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister
            .create(ForgeRegistries.BLOCKS, mofmc.MOD_ID);


    // Ruby

    public static final RegistryObject<Block> RUBY_ORE = registerBlock(
            "ruby_ore", () -> new Block(AbstractBlock.Properties.create(
                    Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock(
            "nether_ruby_ore", () -> new Block(AbstractBlock.Properties.create(
                    Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock(
            "ruby_block", () -> new Block(AbstractBlock.Properties.create(
                    Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5.0F, 6.0F)));


    // Pyrite

    public static final RegistryObject<Block> PYRITE_ORE = registerBlock(
            "pyrite_ore", () -> new Block(AbstractBlock.Properties.create(
                    Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    public static final RegistryObject<Block> PYRITE_block = registerBlock(
            "pyrite_block", () -> new Block(AbstractBlock.Properties.create(
                    Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5.0F, 6.0F)));


    private static <T extends Block>RegistryObject<T> registerBlock(
            String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(
            String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item
                .Properties().group(ModItemGroup.MOFMC_GROUP)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
