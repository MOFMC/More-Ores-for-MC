package com.agmpenguin.mofmc.world.gen;

import com.agmpenguin.mofmc.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_SMALL_RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_LARGE_RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_BURIED_RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_PYRITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_TITANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_PURPLE_SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_RAINBOW_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_PYRITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_TITANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_PURPLE_SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_RAINBOW_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_PYRITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_TITANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_PURPLE_SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_RAINBOW_ORE_PLACED_KEY);
    }
}
