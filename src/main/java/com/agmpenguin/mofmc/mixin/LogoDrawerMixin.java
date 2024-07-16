package com.agmpenguin.mofmc.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.LogoDrawer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import static net.minecraft.client.gui.LogoDrawer.*;

@Mixin(LogoDrawer.class)
public class LogoDrawerMixin {
    /*
    @Overwrite
    public void draw(DrawContext context, int screenWidth, float alpha, int y) {
        context.setShaderColor(1.0f, 1.0f, 1.0f, alpha);
        int i = screenWidth / 2 - 128;
        context.drawTexture(MINCERAFT_TEXTURE, i, y, 0.0f, 0.0f, 256, 44, 256, 64);
        int j = screenWidth / 2 - 64;
        int k = y + 44 - 7;
        context.drawTexture(EDITION_TEXTURE, j, k, 0.0f, 0.0f, 128, 14, 128, 16);
        context.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }
    */
}
