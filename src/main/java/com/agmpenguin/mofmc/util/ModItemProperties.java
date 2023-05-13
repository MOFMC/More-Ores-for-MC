package com.agmpenguin.mofmc.util;

import com.agmpenguin.mofmc.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties extends ItemProperties {
    public static void addCustomItemProperties() {
        makeLightSword(ModItems.BLUE_LIGHT_SWORD.get());
        makeLightSword(ModItems.DOUBLE_BLADED_BLUE_LIGHT_SWORD.get());
    }

    private static void makeLightSword(Item item) {
        register(item, new ResourceLocation("blocking"), (p_174590_, p_174591_, p_174592_, p_174593_) -> {
            return p_174592_ != null && p_174592_.isUsingItem() && p_174592_.getUseItem() == p_174590_ ? 1.0F : 0.0F;
        });
    }
}