package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, mofmc.MOD_ID);

    public static final RegistryObject<Item> RUBY = createModItem("ruby");
    public static final RegistryObject<Item> RAW_RUBY = createModItem("raw_ruby");
    public static final RegistryObject<Item> PYRITE_INGOT = createModItem("pyrite_ingot");
    public static final RegistryObject<Item> RAW_PYRITE = createModItem("raw_pyrite");
    public static final RegistryObject<Item> TITANIUM_ROD = createModItem("titanium_rod");
    public static final RegistryObject<Item> TITANIUM_DUST = createModItem("titanium_dust");

    public static final RegistryObject<Item> RUBY_SWORD = createModSwordItem("ruby_sword", ModTiers.RUBY, 2, 3f);
    public static final RegistryObject<Item> PYRITE_SWORD = createModSwordItem("pyrite_sword", ModTiers.PYRITE, 2, 3f);
    public static final RegistryObject<Item> TITANIUM_SWORD = createModSwordItem("titanium_sword", ModTiers.TITANIUM, 2, 3f);

    public static final RegistryObject<Item> RUBY_PICKAXE = createModPickaxeItem("ruby_pickaxe", ModTiers.RUBY, 1, 1f);
    public static final RegistryObject<Item> PYRITE_PICKAXE = createModPickaxeItem("pyrite_pickaxe", ModTiers.PYRITE, 1, 1f);
    public static final RegistryObject<Item> TITANIUM_PICKAXE = createModPickaxeItem("titanium_pickaxe", ModTiers.TITANIUM, 1, 1f);

    public static final RegistryObject<Item> RUBY_SHOVEL = createModShovelItem("ruby_shovel", ModTiers.RUBY, 0, 1f);
    public static final RegistryObject<Item> PYRITE_SHOVEL = createModShovelItem("pyrite_shovel", ModTiers.PYRITE, 0, 1f);
    public static final RegistryObject<Item> TITANIUM_SHOVEL = createModShovelItem("titanium_shovel", ModTiers.TITANIUM, 0, 1f);

    public static final RegistryObject<Item> RUBY_AXE = createModAxeItem("ruby_axe", ModTiers.RUBY, 4, 0f);
    public static final RegistryObject<Item> PYRITE_AXE = createModAxeItem("pyrite_axe", ModTiers.PYRITE, 4, 0f);
    public static final RegistryObject<Item> TITANIUM_AXE = createModAxeItem("titanium_axe", ModTiers.TITANIUM, 4, 0f);

    public static final RegistryObject<Item> RUBY_HOE = createModHoeItem("ruby_hoe", ModTiers.RUBY, 0, 0f);
    public static final RegistryObject<Item> PYRITE_HOE = createModHoeItem("pyrite_hoe", ModTiers.PYRITE, 0, 0f);
    public static final RegistryObject<Item> TITANIUM_HOE = createModHoeItem("titanium_hoe", ModTiers.TITANIUM, 0, 0f);

    public static final RegistryObject<Item> RUBY_HELMET = createModArmor("ruby_helmet", "RUBY", EquipmentSlot.HEAD);
    public static final RegistryObject<Item> RUBY_CHESTPLATE = createModArmor("ruby_chestplate", "RUBY", EquipmentSlot.CHEST);
    public static final RegistryObject<Item> RUBY_LEGGINGS = createModArmor("ruby_leggings", "RUBY", EquipmentSlot.LEGS);
    public static final RegistryObject<Item> RUBY_BOOTS  = createModArmor("ruby_boots", "RUBY", EquipmentSlot.FEET);

    public static final RegistryObject<Item> PYRITE_HELMET = createModArmor("pyrite_helmet", "PYRITE", EquipmentSlot.HEAD);
    public static final RegistryObject<Item> PYRITE_CHESTPLATE = createModArmor("pyrite_chestplate", "PYRITE", EquipmentSlot.CHEST);
    public static final RegistryObject<Item> PYRITE_LEGGINGS = createModArmor("pyrite_leggings", "PYRITE", EquipmentSlot.LEGS);
    public static final RegistryObject<Item> PYRITE_BOOTS  = createModArmor("pyrite_boots", "PYRITE", EquipmentSlot.FEET);

    public static final RegistryObject<Item> TITANIUM_HELMET = createModArmor("titanium_helmet", "TITANIUM", EquipmentSlot.HEAD);
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = createModArmor("titanium_chestplate", "TITANIUM", EquipmentSlot.CHEST);
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = createModArmor("titanium_leggings", "TITANIUM", EquipmentSlot.LEGS);
    public static final RegistryObject<Item> TITANIUM_BOOTS  = createModArmor("titanium_boots", "TITANIUM", EquipmentSlot.FEET);

    private static RegistryObject<Item> createModItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(ModTab.MOFMC_TAB)));
    }

    private static RegistryObject<Item> createModSwordItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new SwordItem(tier, attack, speed, new Item.Properties().tab(ModTab.MOFMC_TAB)));
    }

    private static RegistryObject<Item> createModPickaxeItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new PickaxeItem(tier, attack, speed, new Item.Properties().tab(ModTab.MOFMC_TAB)));
    }

    private static RegistryObject<Item> createModShovelItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new ShovelItem(tier, attack, speed, new Item.Properties().tab(ModTab.MOFMC_TAB)));
    }

    private static RegistryObject<Item> createModAxeItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new AxeItem(tier, attack, speed, new Item.Properties().tab(ModTab.MOFMC_TAB)));
    }

    private static RegistryObject<Item> createModHoeItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new HoeItem(tier, attack, speed, new Item.Properties().tab(ModTab.MOFMC_TAB)));
    }

    private static RegistryObject<Item> createModArmor(String name, String modArmorMaterial, EquipmentSlot slot) {
        if (modArmorMaterial.equals("RUBY")) {
            return ITEMS.register(name, () -> new ArmorItem(ModArmorMaterialRuby.RUBY, slot, new Item.Properties().tab(ModTab.MOFMC_TAB)));
        } else if (modArmorMaterial.equals("PYRITE")) {
            return ITEMS.register(name, () -> new ArmorItem(ModArmorMaterialPyrite.PYRITE, slot, new Item.Properties().tab(ModTab.MOFMC_TAB)));
        } else if (modArmorMaterial.equals("TITANIUM")) {
            return ITEMS.register(name, () -> new ArmorItem(ModArmorMaterialTitanium.TITANIUM, slot, new Item.Properties().tab(ModTab.MOFMC_TAB)));
        } else {
            return null;
        }
    }
    public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}