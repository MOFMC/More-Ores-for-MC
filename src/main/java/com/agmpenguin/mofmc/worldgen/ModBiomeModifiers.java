package com.agmpenguin.mofmc.worldgen;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    // RUBY
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_RUBY_ORE = registerKey("add_overworld_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = registerKey("add_nether_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE = registerKey("add_end_ruby_ore");
    // PYRITE
    public static final ResourceKey<BiomeModifier>
            ADD_OVERWORLD_PYRITE_ORE = registerKey("add_overworld_pyrite_ore"),
            ADD_NETHER_PYRITE_ORE = registerKey("add_nether_pyrite_ore"),
            ADD_END_PYRITE_ORE = registerKey("add_end_pyrite_ore");
    // TITANIUM
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TITANIUM_ORE = registerKey("add_overworld_titanium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_TITANIUM_ORE = registerKey("add_nether_titanium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_TITANIUM_ORE = registerKey("add_end_titanium_ore");
    // PURPLE SAPPHIRE
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_PURPLE_SAPPHIRE_ORE = registerKey("add_overworld_purple_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PURPLE_SAPPHIRE_ORE = registerKey("add_nether_purple_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PURPLE_SAPPHIRE_ORE = registerKey("add_end_purple_sapphire_ore");


    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(mofmc.MOD_ID, name));
    }
}
