package com.agmpenguin.mofmc.util;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.tags.ITagManager;

public class mofmcTags {

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
//        public static final TagKey<Item> MATERIAL_1 = createTag("one");
        private static TagKey<Item> createTag(String location) {
            return ItemTags.create(new ResourceLocation(mofmc.MOD_ID, location));
        }

        private static TagKey<Item> createForgeTag(String location) {
            return ItemTags.create(new ResourceLocation("forge", location));
        }
    }
}
