package com.agmpenguin.mofmc.util;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> RUBY_ORES = createTag("ruby_ores");

        private static TagKey<Block> createTag(String location) {
            return BlockTags.create(new ResourceLocation(mofmc.MOD_ID, location));
        }

        private static TagKey<Block> createForgeTag(String location) {
            return BlockTags.create(new ResourceLocation("forge", location));
        }
    }

    public static class Items {

        public static final TagKey<Item> RUBY_ORES = createForgeTag("ores/ruby");
        public static final TagKey<Item> PYRITE_ORES = createForgeTag("ores/pyrite");
        public static final TagKey<Item> TITANIUM_ORE = createForgeTag("ores/titanium");
        public static final TagKey<Item> PURPLE_SAPPHIRE_ORE = createForgeTag("ores/purple_sapphire");
        public static final TagKey<Item> TIN_ORE = createForgeTag("ores/tin");
        public static final TagKey<Item> BLUE_LIGHT_CRYSTAL_ORE = createForgeTag("ores/blue_light_crystal");
        // public static final TagKey<Item> GREEN_LIGHT_CRYSTAL_ORE = createForgeTag("ores/green_light_crystal");
        // public static final TagKey<Item> PURPLE_LIGHT_CRYSTAL_ORE = createForgeTag("ores/purple_light_crystal");
        public static final TagKey<Item> LIGHT_SWORDS = createTag("mofmc/light_swords");
        public static final TagKey<Item> ALL = createForgeTag("mofmc/all");

        private static TagKey<Item> createTag(String location) {
            return ItemTags.create(new ResourceLocation(mofmc.MOD_ID, location));
        }

        private static TagKey<Item> createForgeTag(String location) {
            return ItemTags.create(new ResourceLocation("forge", location));
        }
    }
}
