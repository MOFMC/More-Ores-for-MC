package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries
            .ITEMS, mofmc.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));


    public static final RegistryObject<Item> PYRITE_INGOT = ITEMS.register("pyrite_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));


    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 3, -2.4f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 1.5F, -3.0f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.8f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 5.0F, -3.0f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -3, 0f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));


    public static final RegistryObject<Item> PYRITE_SWORD = ITEMS.register("pyrite_sword",
            () -> new SwordItem(ModItemTier.PYRITE_INGOT, 3, -2.4f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_SHOVEL = ITEMS.register("pyrite_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 0.5F, -3.0f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_PICKAXE = ITEMS.register("pyrite_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_AXE = ITEMS.register("pyrite_axe",
            () -> new AxeItem(ModItemTier.RUBY, 5.0F, -3.1f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_HOE = ITEMS.register("pyrite_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -3, -1.0f,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));


    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));


    public static final RegistryObject<Item> PYRITE_BOOTS = ITEMS.register("pyrite_boots",
            () -> new ArmorItem(ModArmorMaterial.PYRITE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_LEGGINGS = ITEMS.register("pyrite_leggings",
            () -> new ArmorItem(ModArmorMaterial.PYRITE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_CHESTPLATE = ITEMS.register("pyrite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.PYRITE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));

    public static final RegistryObject<Item> PYRITE_HELMET = ITEMS.register("pyrite_helmet",
            () -> new ArmorItem(ModArmorMaterial.PYRITE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.MOFMC_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
