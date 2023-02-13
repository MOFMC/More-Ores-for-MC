package com.agmpenguin.mofmc.block;

import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.item.ModTab;
import com.agmpenguin.mofmc.mofmc;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mofmc.MOD_ID);

    // RUBY
     public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock
            (BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModTab.MOFMC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new
            DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f)
            .requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModTab.MOFMC_TAB);

    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock("nether_ruby_ore", () -> new
            DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f)
            .requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModTab.MOFMC_TAB);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModTab
            .MOFMC_TAB);

     // PYRITE ORE
    public static final RegistryObject<Block> PYRITE_ORE = registerBlock("pyrite_ore", () -> new
             DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f)
             .requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModTab.MOFMC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PYRITE_ORE = registerBlock("deepslate_pyrite_ore", () -> new
            DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f)
            .requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModTab.MOFMC_TAB);

    public static final RegistryObject<Block> NETHER_PYRITE_ORE = registerBlock("nether_pyrite_ore", () -> new
            DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f)
            .requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModTab.MOFMC_TAB);

    public static final RegistryObject<Block> PYRITE_BLOCK = registerBlock("pyrite_block", () -> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModTab
            .MOFMC_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(
            String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
         registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item
                .Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
