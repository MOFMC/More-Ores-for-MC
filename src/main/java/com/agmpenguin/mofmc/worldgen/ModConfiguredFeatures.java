package com.agmpenguin.mofmc.worldgen;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    // RUBY
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");
    // PYRITE
    public static final ResourceKey<ConfiguredFeature<?, ?>>
            OVERWORLD_PYRITE_ORE_KEY = registerKey("overworld_pyrite_ore"),
            NETHER_PYRITE_ORE_KEY = registerKey("nether_pyrite_ore"),
            END_PYRITE_ORE_KEY = registerKey("end_pyrite_ore");
    // TITANIUM
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("overworld_titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TITANIUM_ORE_KEY = registerKey("nether_titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TITANIUM_ORE_KEY = registerKey("end_titanium_ore");
    // PURPLE SAPPHIRE
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PURPLE_SAPPHIRE_ORE_KEY = registerKey("overworld_purple_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PURPLE_SAPPHIRE_ORE_KEY = registerKey("nether_purple_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PURPLE_SAPPHIRE_ORE_KEY = registerKey("end_purple_sapphire_ore");
    // TIN
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("overworld_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TIN_ORE_KEY = registerKey("end_tin_ore");
    // RAINBOW
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RAINBOW_ORE_KEY = registerKey("overworld_rainbow_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RAINBOW_ORE_KEY = registerKey("nether_rainbow_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RAINBOW_ORE_KEY = registerKey("end_rainbow_ore");


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(mofmc.MOD_ID, name));
    }
}
