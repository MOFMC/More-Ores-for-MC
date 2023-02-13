package com.agmpenguin.mofmc.world.feature;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, mofmc.MOD_ID);


    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(),
                    commonOrePlacement(7,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_RUBY_ORE_PLACED = PLACED_FEATURES.register("nether_ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_RUBY_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                    VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> PYRITE_ORE_PLACED = PLACED_FEATURES.register("pyrite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PYRITE_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                    VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_PYRITE_ORE_PLACED = PLACED_FEATURES.register("nether_pyrite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_PYRITE_ORE.getHolder().get(),
                    commonOrePlacement(7,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                    VerticalAnchor.aboveBottom(80)))));


    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

    /*
    C:\Users\manle\.gradle\caches\forge_gradle\minecraft_user_repo\net\minecraftforge\forge\1.19.2-43.2.0_
    mapped_official_1.19.2\forge-1.19.2-43.2.0_mapped_official_1.19.2-sources.jar!\net\minecraft\data\worldgen\placement
    \OrePlacements.java

    Ctrl+Alt+F7
    */
}
