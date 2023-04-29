package com.agmpenguin.mofmc.block;

import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.item.ModTab;
import com.agmpenguin.mofmc.mofmc;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mofmc.MOD_ID);
    // RUBY ORE
    public static final RegistryObject<Block> RUBY_ORE = registerOre("ruby_ore", 6f, 3,7);
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerOre("deepslate_ruby_ore", 6f,3, 7);
    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerOre("nether_ruby_ore", 6f,3, 7);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", 6f);
    public static final RegistryObject<Block> RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", 6f);
     // PYRITE ORE
    public static final RegistryObject<Block> PYRITE_ORE = registerOre("pyrite_ore", 6f, 3,7);
    public static final RegistryObject<Block> DEEPSLATE_PYRITE_ORE = registerOre("deepslate_pyrite_ore", 6f,3, 7);
    public static final RegistryObject<Block> NETHER_PYRITE_ORE = registerOre("nether_pyrite_ore", 6f,3, 7);
    public static final RegistryObject<Block> PYRITE_BLOCK = registerBlock("pyrite_block", 6f);
    public static final RegistryObject<Block> RAW_PYRITE_BLOCK = registerBlock("raw_pyrite_block", 6f);
    // TITANIUM ORE
    public static final RegistryObject<Block> TITANIUM_ORE = registerOre("titanium_ore", 6f, 3, 7);
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerOre("deepslate_titanium_ore", 6f, 3, 7);
    public static final RegistryObject<Block> NETHER_TITANIUM_ORE = registerOre("nether_titanium_ore", 6f, 3, 7);
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block", 6f);
    // PURPLE SAPPHIRE ORE
    public static final RegistryObject<Block> PURPLE_SAPPHIRE_ORE = registerOre("purple_sapphire_ore", 6f, 3, 7);
    public static final RegistryObject<Block> DEEPSLATE_PURPLE_SAPPHIRE_ORE = registerOre("deepslate_purple_sapphire_ore", 6f, 3, 7);
    public static final RegistryObject<Block> NETHER_PURPLE_SAPPHIRE_ORE = registerOre("nether_purple_sapphire_ore", 6f, 3, 7);
    public static final RegistryObject<Block> PURPLE_SAPPHIRE_BLOCK = registerBlock("purple_sapphire_block", 6f);
    public static final RegistryObject<Block> RAW_PURPLE_SAPPHIRE_BLOCK = registerBlock("raw_purple_sapphire_block", 6f);
    // TIN ORE
    /*
    public static final RegistryObject<Block> TIN_ORE = registerOre("tin_ore", 6f, 3, 7);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerOre("deepslate_tin_ore", 6f, 3, 7);
    public static final RegistryObject<Block> NETHER_TIN_ORE = registerOre("nether_tin_ore", 6f, 3, 7);
    public static final RegistryObject<Block> TIN_BLOCK = registerOre("tin_block", 6f, 3, 7);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerOre("raw_tin_block", 6f, 3, 7);
     */
    private static RegistryObject<Block> registerBlock(String name, float strength) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties
                .of(Material.STONE)
                .strength(strength)
                .requiresCorrectToolForDrops()));

        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryObject<Block> registerOre(String name, float strength, int minExp, int maxExp) {
        RegistryObject<Block> toReturn = BLOCKS.register(name, () -> new DropExperienceBlock(BlockBehaviour.Properties
                .of(Material.STONE)
                .strength(strength)
                .requiresCorrectToolForDrops(),
                UniformInt.of(minExp, maxExp)));

        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item
                .Properties().tab(ModTab.MOFMC_TAB)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
