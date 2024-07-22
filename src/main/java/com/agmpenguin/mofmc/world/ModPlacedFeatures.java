package com.agmpenguin.mofmc.world;

import com.agmpenguin.mofmc.MOFMC;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    private static RegistryEntryLookup<ConfiguredFeature<?, ?>> cFREL;
    public static final RegistryKey<PlacedFeature> OVERWORLD_SMALL_RUBY_ORE_PLACED_KEY = registerKey("overworld_small_ruby_ore_placed_key");
    public static final RegistryKey<PlacedFeature> OVERWORLD_LARGE_RUBY_ORE_PLACED_KEY = registerKey("overworld_large_ruby_ore_placed_key");
    public static final RegistryKey<PlacedFeature> OVERWORLD_BURIED_RUBY_ORE_PLACED_KEY = registerKey("overworld_buried_ruby_ore_placed_key");
    public static final RegistryKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed_key");
    public static final RegistryKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed_key");

    public static final RegistryKey<PlacedFeature> OVERWORLD_PYRITE_ORE_PLACED_KEY = registerKey("overworld_pyrite_ore_placed_key");
    public static final RegistryKey<PlacedFeature> NETHER_PYRITE_ORE_PLACED_KEY = registerKey("nether_pyrite_ore_placed_key");
    public static final RegistryKey<PlacedFeature> END_PYRITE_ORE_PLACED_KEY = registerKey("end_pyrite_ore_placed_key");

    public static final RegistryKey<PlacedFeature> OVERWORLD_TITANIUM_ORE_PLACED_KEY = registerKey("overworld_titanium_ore_placed_key");
    public static final RegistryKey<PlacedFeature> NETHER_TITANIUM_ORE_PLACED_KEY = registerKey("nether_titanium_ore_placed_key");
    public static final RegistryKey<PlacedFeature> END_TITANIUM_ORE_PLACED_KEY = registerKey("end_titanium_ore_placed_key");

    public static final RegistryKey<PlacedFeature> OVERWORLD_PURPLE_SAPPHIRE_ORE_PLACED_KEY = registerKey("overworld_purple_sapphire_ore_placed_key");
    public static final RegistryKey<PlacedFeature> NETHER_PURPLE_SAPPHIRE_ORE_PLACED_KEY = registerKey("nether_purple_sapphire_ore_placed_key");
    public static final RegistryKey<PlacedFeature> END_PURPLE_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_purple_sapphire_ore_placed_key");

    public static final RegistryKey<PlacedFeature> OVERWORLD_TIN_ORE_PLACED_KEY = registerKey("overworld_tin_ore_placed_key");
    public static final RegistryKey<PlacedFeature> NETHER_TIN_ORE_PLACED_KEY = registerKey("nether_tin_ore_placed_key");
    public static final RegistryKey<PlacedFeature> END_TIN_ORE_PLACED_KEY = registerKey("end_tin_ore_placed_key");

    public static final RegistryKey<PlacedFeature> OVERWORLD_RAINBOW_ORE_PLACED_KEY = registerKey("overworld_rainbow_ore_placed_key");
    public static final RegistryKey<PlacedFeature> NETHER_RAINBOW_ORE_PLACED_KEY = registerKey("nether_rainbow_ore_placed_key");
    public static final RegistryKey<PlacedFeature> END_RAINBOW_ORE_PLACED_KEY = registerKey("end_rainbow_ore_placed_key");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        cFREL = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);                                            // configuredFeatureRegistryEntryLookup

        /*
        register(context, OVERWORLD_RUBY_ORE_PLACED_KEY, cFREL.getOrThrow(
                ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY), ModOrePlacement.modifiersWithCount(
                        4, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(16)) // Veins Per Chunk
        ));
         */

        // register(context, OVERWORLD_RUBY_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_RUBY_ORE_SMALL_KEY, 4, -64, 16);
        register(context, OVERWORLD_SMALL_RUBY_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_RUBY_ORE_SMALL_KEY, 5, YOffset.aboveBottom(-80), YOffset.aboveBottom(80));
        register(context, OVERWORLD_LARGE_RUBY_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_RUBY_ORE_LARGE_KEY, "rarity", 7, YOffset.aboveBottom(-80), YOffset.aboveBottom(80));
        register(context, OVERWORLD_BURIED_RUBY_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_RUBY_ORE_BURIED_KEY, 3, YOffset.aboveBottom(-80), YOffset.aboveBottom(80));
        /*
        PlacedFeatures.register(featureRegisterable, ORE_DIAMOND, registryEntry20, OrePlacedFeatures.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        PlacedFeatures.register(featureRegisterable, ORE_DIAMOND_LARGE, registryEntry21, OrePlacedFeatures.modifiersWithRarity(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        PlacedFeatures.register(featureRegisterable, ORE_DIAMOND_BURIED, registryEntry22, OrePlacedFeatures.modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
         */



        registerOther(context, NETHER_RUBY_ORE_PLACED_KEY, ModConfiguredFeatures.NETHER_RUBY_ORE_KEY, 5, 10);
        registerOther(context, END_RUBY_ORE_PLACED_KEY, ModConfiguredFeatures.END_RUBY_ORE_KEY, 3, 0);

        register(context, OVERWORLD_PYRITE_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_PYRITE_ORE_KEY, 18, -64, 78);
        registerOther(context, NETHER_PYRITE_ORE_PLACED_KEY, ModConfiguredFeatures.NETHER_PYRITE_ORE_KEY, 13, 10);
        registerOther(context, END_PYRITE_ORE_PLACED_KEY, ModConfiguredFeatures.END_PYRITE_ORE_KEY, 6, 0);

        register(context, OVERWORLD_TITANIUM_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY, 8, -64, 50);
        registerOther(context, NETHER_TITANIUM_ORE_PLACED_KEY, ModConfiguredFeatures.NETHER_TITANIUM_ORE_KEY, 8, 10);
        registerOther(context, END_TITANIUM_ORE_PLACED_KEY, ModConfiguredFeatures.END_TITANIUM_ORE_KEY, 4, 0);

        register(context, OVERWORLD_PURPLE_SAPPHIRE_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_PURPLE_SAPPHIRE_ORE_KEY, 6, -64, 41);
        registerOther(context, NETHER_PURPLE_SAPPHIRE_ORE_PLACED_KEY, ModConfiguredFeatures.NETHER_PURPLE_SAPPHIRE_ORE_KEY, 6, 10);
        registerOther(context, END_PURPLE_SAPPHIRE_ORE_PLACED_KEY, ModConfiguredFeatures.END_PURPLE_SAPPHIRE_ORE_KEY, 4, 0);

        register(context, OVERWORLD_TIN_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY, 20, -64, 320, "uniform");
        registerOther(context, NETHER_TIN_ORE_PLACED_KEY, ModConfiguredFeatures.NETHER_TIN_ORE_KEY, 16, 10);
        registerOther(context, END_TIN_ORE_PLACED_KEY, ModConfiguredFeatures.END_TIN_ORE_KEY, 8, 0);

        register(context, OVERWORLD_RAINBOW_ORE_PLACED_KEY, ModConfiguredFeatures.OVERWORLD_RAINBOW_ORE_KEY, 6, -64, 25);
        registerOther(context, NETHER_RAINBOW_ORE_PLACED_KEY, ModConfiguredFeatures.NETHER_RAINBOW_ORE_KEY, 5, 10);
        registerOther(context, END_RAINBOW_ORE_PLACED_KEY, ModConfiguredFeatures.END_RAINBOW_ORE_KEY, 4, 0);
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOFMC.MOD_ID, name));
    }

    private static void registerOther(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                      RegistryKey<ConfiguredFeature<?, ?>> configKey, int count, int offset) {
        registerOther(context, key, configKey, count, offset, offset);
    }

    private static void registerOther(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                      RegistryKey<ConfiguredFeature<?, ?>> configKey, int count, int bottom, int top) {

        context.register(key, new PlacedFeature(cFREL.getOrThrow(configKey),
                List.copyOf(ModOrePlacement.modifiersWithCount(count, HeightRangePlacementModifier
                        .uniform(YOffset.aboveBottom(bottom), YOffset.belowTop(top))))));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryKey<ConfiguredFeature<?, ?>> configKey, int count, int bottom, int top, String... shape) {

        List<PlacementModifier> modifiers = ModOrePlacement.modifiersWithCount(count, (shape.equals("uniform")) ?
                HeightRangePlacementModifier.uniform(YOffset.fixed(bottom), YOffset.fixed(top)) :
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(bottom), YOffset.fixed(top)));
        context.register(key, new PlacedFeature(cFREL.getOrThrow(configKey), List.copyOf(modifiers)));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryKey<ConfiguredFeature<?, ?>> configKey, int count, YOffset min, YOffset max, String... shape) {

        List<PlacementModifier> modifiers = ModOrePlacement.modifiersWithCount(count, (shape.equals("uniform")) ?
                HeightRangePlacementModifier.uniform(min, max) :
                HeightRangePlacementModifier.trapezoid(min, max));
        context.register(key, new PlacedFeature(cFREL.getOrThrow(configKey), List.copyOf(modifiers)));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryKey<ConfiguredFeature<?, ?>> configKey, String modifierType, int value, YOffset min, YOffset max, String... shape) {

        List<PlacementModifier> modifiers = (modifierType.equals("count")) ?
                (ModOrePlacement.modifiersWithCount(value, (shape.equals("uniform")) ?
                        HeightRangePlacementModifier.uniform(min, max) :
                        HeightRangePlacementModifier.trapezoid(min, max))) :
                (ModOrePlacement.modifiersWithRarity(value, (shape.equals("uniform")) ?
                        HeightRangePlacementModifier.uniform(min, max) :
                        HeightRangePlacementModifier.trapezoid(min, max)));
        context.register(key, new PlacedFeature(cFREL.getOrThrow(configKey), List.copyOf(modifiers)));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }
}
