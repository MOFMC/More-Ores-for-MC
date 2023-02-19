package com.agmpenguin.mofmc.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static final CreativeModeTab MOFMC_TAB = new CreativeModeTab("mofmctab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Items.RUBY.get());
        }
    };
}
