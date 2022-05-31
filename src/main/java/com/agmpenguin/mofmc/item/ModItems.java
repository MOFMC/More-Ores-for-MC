package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, mofmc.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> FOOLS_GOLD_INGOT = ITEMS.register("fools_gold_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RAW_FOOLS_GOLD = ITEMS.register("raw_fools_gold",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModTiers.RUBY, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModTiers.RUBY, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModTiers.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));

    public static final RegistryObject<Item> FOOLS_GOLD_SWORD = ITEMS.register("fools_gold_sword",
            () -> new SwordItem(ModTiers.FOOLS_GOLD_INGOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> FOOLS_GOLD_PICKAXE = ITEMS.register("fools_gold_pickaxe",
            () -> new PickaxeItem(ModTiers.FOOLS_GOLD_INGOT, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> FOOLS_GOLD_SHOVEL = ITEMS.register("fools_gold_shovel",
            () -> new ShovelItem(ModTiers.FOOLS_GOLD_INGOT, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> FOOLS_GOLD_AXE = ITEMS.register("fools_gold_axe",
            () -> new AxeItem(ModTiers.FOOLS_GOLD_INGOT, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> FOOLS_GOLD_HOE = ITEMS.register("fools_gold_hoe",
            () -> new HoeItem(ModTiers.FOOLS_GOLD_INGOT, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MOFMC_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
