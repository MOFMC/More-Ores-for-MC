package com.agmpenguin.mofmc.world;

import com.agmpenguin.mofmc.mofmc;
import com.agmpenguin.mofmc.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = mofmc.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }

    /*

    static int messageAlreadyReceived = 2;

    @SubscribeEvent
    public static void onEntityJoinWorld(@NotNull EntityJoinWorldEvent event) {
        if(event.getEntity() != null && event.getEntity() instanceof PlayerEntity) {
            if (messageAlreadyReceived == 0) {
                messageAlreadyReceived = 1;
                Entity player = event.getEntity();
                String msg1 = "TESTING 1... 2... 3...";
                player.sendMessage(new StringTextComponent(msg1), player.getUniqueID());
//                 player.sendMessage(new TextComponent(msg1).append(new TextComponent(msg2).withStyle(Style.EMPTY.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL,
//                 "https://github.com/MOFMC/MOFMC/issues")).withColor(TextColor.parseColor("#0000EE")).withUnderlined(true).withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
//                 new TextComponent("https://github.com/MOFMC/MOFMC/issues"))))).append(new TextComponent(msg3)), player.getUUID());
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerLogOut(@NotNull PlayerEvent.PlayerLoggedOutEvent event) {
        if(event.getEntity() != null && event.getEntity() instanceof PlayerEntity) {
            messageAlreadyReceived = 0;
        }
    }

    @SubscribeEvent
    public static void onPlayerLogIn(@NotNull PlayerEvent.PlayerLoggedInEvent event) {
        if(event.getEntity() != null && event.getEntity() instanceof PlayerEntity && messageAlreadyReceived != 1) {
            messageAlreadyReceived = 0;
        }
    }
*/
}




/*
import com.agmpenguin.mofmc.mofmc;
import com.agmpenguin.mofmc.world.gen.ModOreGeneration;
import net.minecraft.network.chat.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull; */