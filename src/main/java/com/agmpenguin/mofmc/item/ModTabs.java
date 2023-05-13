package com.agmpenguin.mofmc.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab MOFMC_TAB = new CreativeModeTab("mofmctab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public static final CreativeModeTab MOFMC_ADDITIONAL_TAB = new CreativeModeTab("mofmcadditionalcontenttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_RUBY.get());
        }
    };
}
