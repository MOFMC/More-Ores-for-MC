package com.agmpenguin.mofmc.world.gen;

import com.agmpenguin.mofmc.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    RUBY(Lazy.of(ModBlocks.RUBY_ORE), 5, 1, 15, 1),
    NETHER_RUBY(Lazy.of(ModBlocks.NETHER_RUBY_ORE), 5, 1, 128, 5),
    PYRITE(Lazy.of(ModBlocks.PYRITE_ORE), 9, 1, 56, 5),
    NETHER_PYRITE(Lazy.of(ModBlocks.NETHER_PYRITE_ORE), 5, 1, 128, 5);

//    NETHER_GOLD_ORE
//    public static final ConfiguredFeature<?, ?> ORE_GOLD_NETHER = register("ore_gold_nether", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig
//    .FillerBlockType.NETHERRACK, Features.States.NETHER_GOLD_ORE, 10)).withPlacement(Features.Placements.NETHER_SPRING_ORE_PLACEMENT).square().count(10));
//
//    public static final ConfiguredFeature<?, ?> ORE_GOLD = register("ore_gold", Feature.ORE.withConfiguration(
//    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Features.States.GOLD_ORE, 9)).range(32).square().count(2));
//
//    Normal 32
//    Nether 128

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getVeinsPerChunk() { return veinsPerChunk; }
    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
