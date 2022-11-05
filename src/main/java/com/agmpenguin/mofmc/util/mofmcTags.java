package com.agmpenguin.mofmc.util;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class mofmcTags {
    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> RUBY_ORES = createTag("ruby_ores");
        public static final Tags.IOptionalNamedTag<Block> PYRITE_ORES = createTag("pyrite_ores");

        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(mofmc.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> RUBY_ORE = createForgeTag("ores/ruby");
        public static final Tags.IOptionalNamedTag<Item> PYRITE_ORE = createForgeTag("ores/pyrite");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(mofmc.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

    }
}
