package com.agmpenguin.mofmc.util;

import com.agmpenguin.mofmc.MOFMC;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORE_REPLACEABLES = createTag("ore_replaceables");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MOFMC.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RUBY_ORES = createTag("ruby_ores");

        public static final TagKey<Item> PRESSURE_PLATES = createTag("pressure_plates");

        public static final TagKey<Item> ALL = createTag("all");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MOFMC.MOD_ID, name));
        }
    }
}
