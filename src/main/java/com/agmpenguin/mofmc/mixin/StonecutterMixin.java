package com.agmpenguin.mofmc.mixin;

import com.agmpenguin.mofmc.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.StonecutterScreenHandler;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(StonecutterScreenHandler.class)
public class StonecutterMixin {
    /*
    @Overwrite
    public boolean canUse(PlayerEntity player) {
        return true;
    }
     */
}
