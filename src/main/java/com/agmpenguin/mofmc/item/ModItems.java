package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static class Items {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries
                .ITEMS, mofmc.MOD_ID);

        public static final RegistryObject<Item> RUBY = createModItem("ruby");

        public static final RegistryObject<Item> RAW_RUBY = createModItem("raw_ruby");

        public static final RegistryObject<Item> PYRITE_INGOT = createModItem("pyrite_ingot");

        public static final RegistryObject<Item> RAW_PYRITE = createModItem("raw_pyrite");

        private static RegistryObject<Item> createModItem(String name) {
            return ITEMS.register(name, () -> new Item(new Item.Properties().tab(ModTab.MOFMC_TAB)));
        }

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }
}
