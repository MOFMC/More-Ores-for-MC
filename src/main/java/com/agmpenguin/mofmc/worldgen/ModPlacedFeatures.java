package com.agmpenguin.mofmc.worldgen;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    // RUBY
    public static final ResourceKey<PlacedFeature> OVERWORLD_RUBY_ORE_PLACED_KEY = registerKey("overworld_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed");
    // PYRITE
    public static final ResourceKey<PlacedFeature>
            OVERWORLD_PYRITE_ORE_PLACED = registerKey("overworld_pyrite_ore_placed"),
            NETHER_PYRITE_ORE_PLACED = registerKey("nether_pyrite_ore_placed"),
            END_PYRITE_ORE_PLACED = registerKey("end_pyrite_ore_placed");
    // TITANIUM
    public static final ResourceKey<PlacedFeature> OVERWORLD_TITANIUM_ORE_PLACED_KEY = registerKey("overworld_titanium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TITANIUM_ORE_PLACED_KEY = registerKey("nether_titanium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_TITANIUM_ORE_PLACED_KEY = registerKey("end_titanium_ore_placed");
    // PURPLE SAPPHIRE
    public static final ResourceKey<PlacedFeature> OVERWORLD_PURPLE_SAPPHIRE_ORE_PLACED_KEY = registerKey("overworld_purple_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PURPLE_SAPPHIRE_ORE_PLACED_KEY = registerKey("nether_purple_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> END_PURPLE_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_purple_sapphire_ore_placed");
    // TIN
    public static final ResourceKey<PlacedFeature> OVERWORLD_TIN_ORE_PLACED_KEY = registerKey("overworld_tin_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TIN_ORE_PLACED_KEY = registerKey("nether_tin_ore_placed");
    public static final ResourceKey<PlacedFeature> END_TIN_ORE_PLACED_KEY = registerKey("end_tin_ore_placed");


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(mofmc.MOD_ID, name));
    }
}
