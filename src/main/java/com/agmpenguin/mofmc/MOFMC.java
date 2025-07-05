package com.agmpenguin.mofmc;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.item.ModTabs;
import com.agmpenguin.mofmc.recipe.ModRecipes;
import com.agmpenguin.mofmc.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;


import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.world.gen.feature.OrePlacedFeatures.ORE_DIAMOND;

public class MOFMC implements ModInitializer {
	public static final String MOD_ID = "mofmc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModTabs.registerModTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();
		LOGGER.info("\nHello There!\nWhat are you doing here?\n...\nOh yeah - this is the log.\nDoes this show up on crash logs?");
	}
}