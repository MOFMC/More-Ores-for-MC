package com.agmpenguin.mofmc.world.feature;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, mofmc.MOD_ID);

    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = createOverworldOre("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, 4, -64, 16);
    public static final RegistryObject<PlacedFeature> NETHER_RUBY_ORE_PLACED = createNetherOre("nether_ruby_ore_placed",
            ModConfiguredFeatures.NETHER_RUBY_ORE, 3, 10, 10);

    // might want to change 57 to 32.
    public static final RegistryObject<PlacedFeature> PYRITE_ORE_PLACED = createOverworldOre("pyrite_ore_placed",
            ModConfiguredFeatures.PYRITE_ORE, 7, -64, 57);
    public static final RegistryObject<PlacedFeature> NETHER_PYRITE_ORE_PLACED = createNetherOre("nether_pyrite_ore_placed",
            ModConfiguredFeatures.NETHER_PYRITE_ORE, 5, 10, 10);

    public static final RegistryObject<PlacedFeature> TITANIUM_ORE_PLACED = createOverworldOre("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE, 5, -64, 32);
    public static final RegistryObject<PlacedFeature> NETHER_TITANIUM_ORE_PLACED = createNetherOre("nether_titanium_ore_placed",
            ModConfiguredFeatures.NETHER_TITANIUM_ORE, 4, 10, 10);
    public static final RegistryObject<PlacedFeature> PURPLE_SAPPHIRE_ORE = createOverworldOre("purple_sapphire_ore_placed",
            ModConfiguredFeatures.PURPLE_SAPPHIRE_ORE, 5, -64, 25);
    public static final RegistryObject<PlacedFeature> NETHER_PURPLE_SAPPHIRE_ORE = createNetherOre("nether_purple_sapphire_ore_placed",
            ModConfiguredFeatures.NETHER_PURPLE_SAPPHIRE_ORE, 4, 10, 10);
    // Change
    public static final RegistryObject<PlacedFeature> TIN_ORE_PLACED = createOverworldOre("tin_ore_placed",
            ModConfiguredFeatures.TIN_ORE, 7, -64, 57);
    public static final RegistryObject<PlacedFeature> NETHER_TIN_ORE_PLACED = createNetherOre("nether_tin_ore_placed",
            ModConfiguredFeatures.NETHER_TIN_ORE, 6, 10, 10);

    public static final RegistryObject<PlacedFeature> BLUE_LIGHT_CRYSTAL_ORE_PLACED = createOverworldOre("blue_light_crystal_ore_placed",
            ModConfiguredFeatures.BLUE_LIGHT_CRYSTAL_ORE, 2, 0, 57);

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }
    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }
    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    private static RegistryObject<PlacedFeature> createOverworldOre(String name, RegistryObject<ConfiguredFeature<?, ?>> modOre, int veinsPerChunk, int minHeight, int maxHeight) {
        return PLACED_FEATURES.register(name, () -> new PlacedFeature(modOre.getHolder().get(),
                commonOrePlacement(veinsPerChunk,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(minHeight),
                                VerticalAnchor.absolute(maxHeight)))));
    }
    private static RegistryObject<PlacedFeature> createNetherOre(String name, RegistryObject<ConfiguredFeature<?, ?>> modOre, int veinsPerChunk, int heightAboveBottom, int heightBelowTop) {
        return PLACED_FEATURES.register(name, () -> new PlacedFeature(modOre.getHolder().get(),
                commonOrePlacement(veinsPerChunk,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(heightAboveBottom),
                                VerticalAnchor.belowTop(heightBelowTop)))));
    }
    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

    /*
    veinsPerChunk for RUBY_ORE_PLACED should be between 1 and 7. The 1 is from 1.16.5 version, meaning that it does
    not factor for modern world limits. The 7 is from diamond's veinsPerChunk rate.

    1.19.2-43.2.0_mapped_official_1.19.2\forge-1.19.2-43.2.0_mapped_official_1.19.2-sources.jar!\net\minecraft\data\
    worldgen\placement\OrePlacements.java
    */
}
