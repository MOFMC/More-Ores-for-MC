package com.agmpenguin.mofmc.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {

        public static final TagKey<Item> RUBY_ORES = createForgeTag("ores/ruby");
        public static final TagKey<Item> PYRITE_ORES = createForgeTag("ores/pyrite");
        public static final TagKey<Item> TITANIUM_ORES = createForgeTag("ores/titanium");
        public static final TagKey<Item> PURPLE_SAPPHIRE_ORES = createForgeTag("ores/purple_sapphire");




        public static final TagKey<Item> OVERWORLD_ORE_REPLACEABLES = createForgeTag("blocks/overworld_ore_replaceables");

        private static TagKey<Item> createForgeTag(String location) {
            return ItemTags.create(new ResourceLocation("forge", location));
        }
    }
}

/*
        My Guide to Everything
    1. Ctrl + U = WHAT
    2. Ctrl + Space = Suggestions
    3. Ctrl + H = Hierarchy
    4. Ctrl + Click = Go to Declaration/Find Instances
    5. Middle Click = Go to Declaration/Find Instances
    6. Ctrl + D = Duplicate
    7. Shift + Shift = History
    8. Ctrl + Shift + U = Toggle Case of Selection


    Thing that runs MC:
                       Absolute Path: C:\Users\manle\.gradle\caches\forge_gradle\minecraft_user_repo\net\minecraftforge\forge\1.20.1-47.1.0_mapped_parchment_2023.06.26-1.20.1\forge-1.20.1-47.1.0_mapped_parchment_2023.06.26-1.20.1-sources.jar!\mcp\client\Start.java
                       Grade: net.minecraftforge:forge:1.20.1-47.1.0_mapped_parchment_2023.06.26-1.20.1
                             - mcp/client/Start

    Thing with Args:
                       Absolute Path: C:\Users\manle\.gradle\caches\forge_gradle\minecraft_user_repo\net\minecraftforge\forge\1.20.1-47.1.0_mapped_parchment_2023.06.26-1.20.1\forge-1.20.1-47.1.0_mapped_parchment_2023.06.26-1.20.1-sources.jar!\net\minecraft\client\main\Main.java
                       Grade: net.minecraftforge:forge:1.20.1-47.1.0_mapped_parchment_2023.06.26-1.20.1
                             - net/minecraft/client/main/Main

    Maybe I should check crash for skin args
 */
