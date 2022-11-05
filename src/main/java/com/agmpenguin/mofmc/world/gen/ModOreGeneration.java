package com.agmpenguin.mofmc.world.gen;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.Dimension;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Arrays;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        spawnOreInAllBiomes(OreType.RUBY, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.NETHER_RUBY, event, Dimension.THE_NETHER.toString());
        spawnOreInAllBiomes(OreType.PYRITE, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.NETHER_PYRITE, event, Dimension.THE_NETHER.toString());
    }

    private static OreFeatureConfig getOverworldfeatureConfig(OreType ore) {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ore.getBlock().get()
                .getDefaultState(), ore.getMaxVeinSize());
    }

    private static OreFeatureConfig getNetherfeatureConfig( OreType ore) {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ore.getBlock().get()
                .getDefaultState(), ore.getMaxVeinSize());
    }
    private static ConfiguredFeature<?, ?> makeOreFeature(OreType ore, String dimensionToSpawnIn) {
        OreFeatureConfig oreFeatureConfig = null;

        if(dimensionToSpawnIn.equals(Dimension.OVERWORLD.toString())) {
            oreFeatureConfig = getOverworldfeatureConfig(ore);
        } else if(dimensionToSpawnIn.equals(Dimension.THE_NETHER.toString())) {
            oreFeatureConfig = getNetherfeatureConfig(ore);
        }

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(new
                TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

        return registerOreFeature(ore, oreFeatureConfig, configuredPlacement);
    }

    private static void spawnOreInOverworldGivenBiomes(OreType ore, final BiomeLoadingEvent event, Biome...
            biomesToSpawnIn) {
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(new
                TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

        ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

        if(Arrays.stream(biomesToSpawnIn).anyMatch(b -> b.getRegistryName().equals(event.getName()))) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }

    private static void spawnOreInOverworldInAllBiomes(OreType ore, final BiomeLoadingEvent event) {
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(new
                TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

        ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
    }

    private static void spawnOreInSpecificBiome(RegistryKey<Biome> biomeToSpawnIn, OreType currentOreType, final
                                                BiomeLoadingEvent event, String dimension) {
        if(event.getName().toString().contains(biomeToSpawnIn.getLocation().toString())) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType
            , dimension));
        }
    }

    private static void spawnOreInAllBiomes(OreType currentOreType, final BiomeLoadingEvent event, String dimension) {
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType,
                dimension));
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig,
                                                              ConfiguredPlacement configuredPlacement) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(), Feature.
                ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement).square().count(ore.
                        getVeinsPerChunk()));
    }
}
