package com.agmpenguin.mofmc.world;

import com.agmpenguin.mofmc.MOFMC;
import com.agmpenguin.mofmc.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_SMALL_KEY = registerKey("overworld_ruby_ore_small");
    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_LARGE_KEY = registerKey("overworld_ruby_ore_large_key");
    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_BURIED_KEY = registerKey("overworld_ruby_ore_buried_key");
    public static RegistryKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static RegistryKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>>
            OVERWORLD_PYRITE_ORE_KEY = registerKey("overworld_pyrite_ore"),
    NETHER_PYRITE_ORE_KEY = registerKey("nether_pyrite_ore"),
    END_PYRITE_ORE_KEY = registerKey("end_pyrite_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("overworld_titanium_ore_key");
    public static RegistryKey<ConfiguredFeature<?, ?>> NETHER_TITANIUM_ORE_KEY = registerKey("nether_titanium_ore");
    public static RegistryKey<ConfiguredFeature<?, ?>> END_TITANIUM_ORE_KEY = registerKey("end_titanium_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_PURPLE_SAPPHIRE_ORE_KEY = registerKey("overworld_purple_sapphire_ore_key");
    public static RegistryKey<ConfiguredFeature<?, ?>> NETHER_PURPLE_SAPPHIRE_ORE_KEY = registerKey("nether_purple_sapphire_ore");
    public static RegistryKey<ConfiguredFeature<?, ?>> END_PURPLE_SAPPHIRE_ORE_KEY = registerKey("end_purple_sapphire_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("overworld_tin_ore_key");
    public static RegistryKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
    public static RegistryKey<ConfiguredFeature<?, ?>> END_TIN_ORE_KEY = registerKey("end_tin_ore");

    public static RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_RAINBOW_ORE_KEY = registerKey("overworld_rainbow_ore_key");
    public static RegistryKey<ConfiguredFeature<?, ?>> NETHER_RAINBOW_ORE_KEY = registerKey("nether_rainbow_ore");
    public static RegistryKey<ConfiguredFeature<?, ?>> END_RAINBOW_ORE_KEY = registerKey("end_rainbow_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRubyOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endRubyOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target>
                overworldPyriteOres = targetList(stoneReplaceables, ModBlocks.PYRITE_ORE, deepslateReplaceables, ModBlocks.DEEPSLATE_PYRITE_ORE),
                netherPyriteOres = targetList(netherReplaceables, ModBlocks.NETHER_PYRITE_ORE),
                endPyriteOres = targetList(endReplaceables, ModBlocks.END_PYRITE_ORE);

        List<OreFeatureConfig.Target>
                overworldTitaniumOres = targetList(stoneReplaceables, ModBlocks.TITANIUM_ORE, deepslateReplaceables, ModBlocks.DEEPSLATE_TITANIUM_ORE),
                netherTitaniumOres = targetList(netherReplaceables, ModBlocks.NETHER_TITANIUM_ORE),
                endTitaniumOres = targetList(endReplaceables, ModBlocks.END_TITANIUM_ORE);

        List<OreFeatureConfig.Target>
                overworldPurpleSapphireOres = targetList(stoneReplaceables, ModBlocks.PURPLE_SAPPHIRE_ORE, deepslateReplaceables, ModBlocks.DEEPSLATE_PURPLE_SAPPHIRE_ORE),
                netherPurpleSapphireOres = targetList(netherReplaceables, ModBlocks.NETHER_PURPLE_SAPPHIRE_ORE),
                endPurpleSapphireOres = targetList(endReplaceables, ModBlocks.END_PURPLE_SAPPHIRE_ORE);

        List<OreFeatureConfig.Target>
                overworldTinOres = targetList(stoneReplaceables, ModBlocks.TIN_ORE, deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE),
                netherTinOres = targetList(netherReplaceables, ModBlocks.NETHER_TIN_ORE),
                endTinOres = targetList(endReplaceables, ModBlocks.END_TIN_ORE);

        List<OreFeatureConfig.Target>
                overworldRainbowOres = targetList(stoneReplaceables, ModBlocks.RAINBOW_ORE, deepslateReplaceables, ModBlocks.DEEPSLATE_RAINBOW_ORE),
                netherRainbowOres = targetList(netherReplaceables, ModBlocks.NETHER_RAINBOW_ORE),
                endRainbowOres = targetList(endReplaceables, ModBlocks.END_RAINBOW_ORE);


        // register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 6, 0.2f));  // Vein Size
        register(context, OVERWORLD_RUBY_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 4, 0.6f));  // Vein Size
        register(context, OVERWORLD_RUBY_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 10, 0.8f));
        register(context, OVERWORLD_RUBY_ORE_BURIED_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 6, 1.0f));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRubyOres, 6, 0.5f));
        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(endRubyOres, 4, 0.4f));

        register(context, OVERWORLD_PYRITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPyriteOres, 8, 0f));
        register(context, NETHER_PYRITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherPyriteOres, 8, 0f));
        register(context, END_PYRITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endPyriteOres, 6, 0f));

        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 7, 0f));
        register(context, NETHER_TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTitaniumOres, 7, 0f));
        register(context, END_TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTitaniumOres, 8, 0f));

        register(context, OVERWORLD_PURPLE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPurpleSapphireOres, 6, 0.2f));
        register(context, NETHER_PURPLE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherPurpleSapphireOres, 6, 0.2f));
        register(context, END_PURPLE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endPurpleSapphireOres, 5, 0.1f));

        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 9, 0f));
        register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTinOres, 7, 0f));
        register(context, END_TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTinOres, 5, 0f));

        register(context, OVERWORLD_RAINBOW_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRainbowOres, 7, 0.3f));
        register(context, NETHER_RAINBOW_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRainbowOres, 7, 0.4f));
        register(context, END_RAINBOW_ORE_KEY, Feature.ORE, new OreFeatureConfig(endRainbowOres, 5, 0.2f));
    }


    private static List<OreFeatureConfig.Target> targetList(RuleTest replaceables, Block block, RuleTest deepslateReplaceables, Block deepslateBlock) {
        return List.of(OreFeatureConfig.createTarget(replaceables, block.getDefaultState()), OreFeatureConfig.createTarget(deepslateReplaceables, deepslateBlock.getDefaultState()));
    }

    private static List<OreFeatureConfig.Target> targetList(RuleTest replaceables, Block block) {
        return List.of(OreFeatureConfig.createTarget(replaceables, block.getDefaultState()));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MOFMC.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
