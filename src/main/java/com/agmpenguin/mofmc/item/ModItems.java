package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries
            .ITEMS, mofmc.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));

    public static final RegistryObject<Item> PYRITE_INGOT = ITEMS.register("pyrite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
