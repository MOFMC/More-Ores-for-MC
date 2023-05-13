package com.agmpenguin.mofmc;

import com.agmpenguin.mofmc.block.ModBlocks;
import com.agmpenguin.mofmc.item.ModItems;
import com.agmpenguin.mofmc.util.ModItemProperties;
import com.agmpenguin.mofmc.world.feature.ModConfiguredFeatures;
import com.agmpenguin.mofmc.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Mod(mofmc.MOD_ID)
public class mofmc {

    public static final String MOD_ID = "mofmc";
    public static final String MOD_VERSION = "1.3.9";
    public static final String MC_VERSIONS = "1.19, 1.19.1, 1.19.2";
    private static final Logger LOGGER = LogUtils.getLogger();
    public mofmc() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // ModEvents;
            ModItemProperties.addCustomItemProperties();
        }
    }
}

/*
To simulate 1.16.5's spawn rates, do the following:
In ModConfiguredFeatures, replace p_161014_ with maxVeinSize
In ModPlacedFeatures, replace p_195344 with veinsPerChunk
In ModPlacedFeatures, replace first p_158923_ with minHeight
In ModPlacedFeatures, replace second p_158923_ with maxHeight
In ModPlacedFeatures, replace p_158931_ with the height above the bottom of the world (for Nether)
In ModPlacedFeatures, replace p_158936_ with the height below the top of the world (for Nether)

Use Iron Armor as template

alt+f7
shift shift

************************************************************************************************************************

Planned Features:
- Slabs
- Stairs
 */
//       "translation": [ 1.13, 3.2, 1.13],
// _blocking"