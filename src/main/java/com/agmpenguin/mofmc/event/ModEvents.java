package com.agmpenguin.mofmc.event;

/*
import com.agmpenguin.mofmc.mofmc;
import com.mojang.bridge.game.GameVersion;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@Cancelable
public class ModEvents {
    static String latestVersionText;
    @Mod.EventBusSubscriber(modid = mofmc.MOD_ID)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void onPlayerJoinWorld(EntityJoinLevelEvent event) throws IOException {
            if(!event.getLevel().isClientSide()) {
                if(event.getEntity() instanceof ServerPlayer player) {
                    testMethodNow(player, Boolean.FALSE);
                    if(!latestVersionText.substring(0, latestVersionText.indexOf(" ")).equals(mofmc.MOD_VERSION)) {
                        testMethodNow(player, Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static void testMethodNow(ServerPlayer player, Boolean sendMessage) throws IOException {
        String latestVersionURLString = "https://raw.githubusercontent.com/MOFMC/More-Ores-For-MC_versions/main/versions.txt";
        URL latestVersionURL = new URL(latestVersionURLString);
        HttpURLConnection latestVersionHttp = (HttpURLConnection) latestVersionURL.openConnection();
        Map<String, List<String>> latestVersion = latestVersionHttp.getHeaderFields();
        for (String header : latestVersion.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                latestVersionURLString = latestVersion.get("Location").get(0);
                latestVersionURL = new URL(latestVersionURLString);
                latestVersionHttp = (HttpURLConnection) latestVersionURL.openConnection();
                latestVersion = latestVersionHttp.getHeaderFields();
            }
        }
        InputStream latestVersionStream = latestVersionHttp.getInputStream();
        latestVersionText = mofmcGetLatestVersionString(latestVersionStream);
        String lVT1 = latestVersionText.substring(0, latestVersionText.indexOf(" - "));
        String LVT1_1 = String.valueOf(latestVersionText.indexOf("- "));
        String lVT2 = latestVersionText.substring(latestVersionText.indexOf("- "), LVT1_1.indexOf("- ") + 1);
        if(sendMessage) {
            player.sendSystemMessage(Component.literal("New Version of MOFMC Available for MC " + Minecraft.getInstance().getGame().getVersion().getId() + ": Version " + lVT1 + " " + lVT2));
            System.out.println("UNLADEN SWALLOW: " + latestVersionText.indexOf("1.19.2")); // provides beginning of string location
        }
    }

    private static String mofmcGetLatestVersionString(InputStream latestVersionStream) throws IOException {
        if (latestVersionStream != null) {
            Writer latestVersionWriter = new StringWriter();
            char[] latestVersionChar = new char[2048];
            try (latestVersionStream) {
                Reader latestVersionReader = new BufferedReader(new InputStreamReader(latestVersionStream, StandardCharsets.UTF_8));
                int counter;
                while ((counter = latestVersionReader.read(latestVersionChar)) != -1) {
                    latestVersionWriter.write(latestVersionChar, 0, counter);
                }
            }
            return latestVersionWriter.toStrin
            
 */