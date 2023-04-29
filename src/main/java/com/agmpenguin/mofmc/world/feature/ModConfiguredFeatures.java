package com.agmpenguin.mofmc.world.feature;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.mofmc;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, mofmc.MOD_ID);

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = createOverworldOreList(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RUBY_ORES = createNetherOreList(ModBlocks.NETHER_RUBY_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PYRITE_ORES = createOverworldOreList(ModBlocks.PYRITE_ORE, ModBlocks.DEEPSLATE_PYRITE_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_PYRITE_ORES = createNetherOreList(ModBlocks.NETHER_PYRITE_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TITANIUM_ORES = createOverworldOreList(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_TITANIUM_ORES = createNetherOreList(ModBlocks.NETHER_TITANIUM_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PURPLE_SAPPHIRE_ORES = createOverworldOreList(ModBlocks.PURPLE_SAPPHIRE_ORE, ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE);
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_PURPLE_SAPPHIRE_ORES = createNetherOreList(ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE);

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = createOre("ruby_ore", OVERWORLD_RUBY_ORES, 5);
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE = createOre("nether_ruby_ore", NETHER_RUBY_ORES, 5);
    public static final RegistryObject<ConfiguredFeature<?, ?>> PYRITE_ORE = createOre("pyrite_ore", OVERWORLD_PYRITE_ORES, 9);
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_PYRITE_ORE = createOre("nether_pyrite_ore", NETHER_PYRITE_ORES, 7);
    public static final RegistryObject<ConfiguredFeature<?, ?>> TITANIUM_ORE = createOre("titanium_ore", OVERWORLD_TITANIUM_ORES, 6);
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_TITANIUM_ORE = createOre("nether_titanium_ore", NETHER_TITANIUM_ORES, 5);
    public static final RegistryObject<ConfiguredFeature<?, ?>> PURPLE_SAPPHIRE_ORE = createOre("purple_sapphire_ore", OVERWORLD_PURPLE_SAPPHIRE_ORES, 5);
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_PURPLE_SAPPHIRE_ORE = createOre("nether_purple_sapphire_ore", NETHER_PURPLE_SAPPHIRE_ORES, 6);

    private static RegistryObject<ConfiguredFeature<?, ?>> createOre(String name, Supplier<List<OreConfiguration.TargetBlockState>> oreList, int maxVeinSize) {
        return CONFIGURED_FEATURES.register(
                name, () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreList.get(), maxVeinSize)));
    }

    private static Supplier<List<OreConfiguration.TargetBlockState>> createOverworldOreList(RegistryObject<Block> block1, RegistryObject<Block> block2) {
        return Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, block1.get().defaultBlockState()),
                OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, block2.get().defaultBlockState())));
    }

    private static Supplier<List<OreConfiguration.TargetBlockState>> createNetherOreList(RegistryObject<Block> block1) {
        return Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, block1.get().defaultBlockState())));
    }

}
