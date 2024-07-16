package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.MOFMC;
import com.agmpenguin.mofmc.item.custom.NoticeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Ruby
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 6, -3.0f, new FabricItemSettings())); // attackDamage: 6.0f
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, new FabricItemSettings())); // attackDamage: 1.5f
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    // Pyrite
    public static final Item PYRITE_INGOT =  registerItem("pyrite_ingot");
    public static final Item RAW_PYRITE =  registerItem("raw_pyrite");
    public static final Item PYRITE_SWORD = registerSwordItem("pyrite_sword", "PYRITE", 3, -2.4f);
    public static final Item PYRITE_PICKAXE = registerPickaxeItem("pyrite_pickaxe", "PYRITE", 1, -2.8f);
    public static final Item PYRITE_AXE = registerAxeItem("pyrite_axe", "PYRITE", 3f, -3.0f);
    public static final Item PYRITE_SHOVEL = registerShovelItem("pyrite_shovel", "PYRITE", 1.5f, -3.0f);
    public static final Item PYRITE_HOE = registerHoeItem("pyrite_hoe", "PYRITE", 0, 0f);
    public static final Item PYRITE_HELMET = registerArmorItem("pyrite_helmet", "PYRITE");
    public static final Item PYRITE_CHESTPLATE = registerArmorItem("pyrite_chestplate", "PYRITE");
    public static final Item PYRITE_LEGGINGS = registerArmorItem("pyrite_leggings", "PYRITE");
    public static final Item PYRITE_BOOTS = registerArmorItem("pyrite_boots", "PYRITE");
    // Titanium
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot");
    public static final Item RAW_TITANIUM = registerItem("raw_titanium");
    public static final Item TITANIUM_SWORD = registerSwordItem("titanium_sword", 3, -2.4f);
    public static final Item TITANIUM_PICKAXE = registerPickaxeItem("titanium_pickaxe", 1, -2.8f);
    public static final Item TITANIUM_AXE = registerAxeItem("titanium_axe", 4f, -3.0f);
    public static final Item TITANIUM_SHOVEL = registerShovelItem("titanium_shovel", 1.5f, -3.0f);
    public static final Item TITANIUM_HOE = registerHoeItem("titanium_hoe", 0, 0f);
    public static final Item TITANIUM_HELMET = registerArmorItem("titanium_helmet");
    public static final Item TITANIUM_CHESTPLATE = registerArmorItem("titanium_chestplate");
    public static final Item TITANIUM_LEGGINGS = registerArmorItem("titanium_leggings");
    public static final Item TITANIUM_BOOTS = registerArmorItem("titanium_boots");
    // Purple Sapphire
    public static final Item PURPLE_SAPPHIRE = registerItem("purple_sapphire");
    public static final Item RAW_PURPLE_SAPPHIRE = registerItem("raw_purple_sapphire");
    public static final Item PURPLE_SAPPHIRE_SWORD = registerSwordItem("purple_sapphire_sword", 3, -2.4f);
    public static final Item PURPLE_SAPPHIRE_PICKAXE = registerPickaxeItem("purple_sapphire_pickaxe", 1, -2.8f);
    public static final Item PURPLE_SAPPHIRE_AXE = registerAxeItem("purple_sapphire_axe", 5f, -3.0f);
    public static final Item PURPLE_SAPPHIRE_SHOVEL = registerShovelItem("purple_sapphire_shovel", 1.5f, -3.0f);
    public static final Item PURPLE_SAPPHIRE_HOE = registerHoeItem("purple_sapphire_hoe", 0, 0f);
    public static final Item PURPLE_SAPPHIRE_HELMET = registerArmorItem("purple_sapphire_helmet");
    public static final Item PURPLE_SAPPHIRE_CHESTPLATE = registerArmorItem("purple_sapphire_chestplate");
    public static final Item PURPLE_SAPPHIRE_LEGGINGS = registerArmorItem("purple_sapphire_leggings");
    public static final Item PURPLE_SAPPHIRE_BOOTS = registerArmorItem("purple_sapphire_boots");
    // Tin
    public static final Item TIN_INGOT = registerItem("tin_ingot");
    public static final Item RAW_TIN = registerItem("raw_tin");
    public static final Item TIN_SWORD = registerSwordItem("tin_sword", 3, -2.4f);
    public static final Item TIN_PICKAXE = registerPickaxeItem("tin_pickaxe", 1, -2.8f);
    public static final Item TIN_AXE = registerAxeItem("tin_axe", 3f, -3.0f);
    public static final Item TIN_SHOVEL = registerShovelItem("tin_shovel", 1.5f, -3.0f);
    public static final Item TIN_HOE = registerHoeItem("tin_hoe", 0, 0f);
    public static final Item TIN_HELMET = registerArmorItem("tin_helmet");
    public static final Item TIN_CHESTPLATE = registerArmorItem("tin_chestplate");
    public static final Item TIN_LEGGINGS = registerArmorItem("tin_leggings");
    public static final Item TIN_BOOTS = registerArmorItem("tin_boots");
    // Rainbow
    public static final Item RAINBOW_GEM = registerItem("rainbow_gem");
    public static final Item RAINBOW_SWORD = registerSwordItem("rainbow_sword", 3, -2.4f);
    public static final Item RAINBOW_PICKAXE = registerPickaxeItem("rainbow_pickaxe", 1, -2.8f);
    public static final Item RAINBOW_AXE = registerAxeItem("rainbow_axe", 5.5f, -3.0f);
    public static final Item RAINBOW_SHOVEL = registerShovelItem("rainbow_shovel", 1.5f, -3.0f);
    public static final Item RAINBOW_HOE = registerHoeItem("rainbow_hoe", 28, 10f);
    public static final Item RAINBOW_HELMET = registerArmorItem("rainbow_helmet");
    public static final Item RAINBOW_CHESTPLATE = registerArmorItem("rainbow_chestplate");
    public static final Item RAINBOW_LEGGINGS = registerArmorItem("rainbow_leggings");
    public static final Item RAINBOW_BOOTS = registerArmorItem("rainbow_boots");

    public static final Item NOTICE_ITEM = registerItem("notice_item", new NoticeItem(new FabricItemSettings()));


    private static void addItemsToTab(FabricItemGroupEntries entries) {
        // entries.add(RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), item);
    }

    private static Item registerItem(String name) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new Item(new FabricItemSettings()));
    }

    private static Item registerSwordItem(String name, int attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new SwordItem(ModToolMaterial.valueOf(name.substring(0, name.lastIndexOf("_")).toUpperCase()), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerPickaxeItem(String name, int attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new PickaxeItem(ModToolMaterial.valueOf(name.substring(0, name.lastIndexOf("_")).toUpperCase()), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerAxeItem(String name, float attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new AxeItem(ModToolMaterial.valueOf(name.substring(0, name.lastIndexOf("_")).toUpperCase()), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerShovelItem(String name, float attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new ShovelItem(ModToolMaterial.valueOf(name.substring(0, name.lastIndexOf("_")).toUpperCase()), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerHoeItem(String name, int attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new HoeItem(ModToolMaterial.valueOf(name.substring(0, name.lastIndexOf("_")).toUpperCase()), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerSwordItem(String name, String toolMaterial, int attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new SwordItem(ModToolMaterial.valueOf(toolMaterial), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerPickaxeItem(String name, String toolMaterial, int attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new PickaxeItem(ModToolMaterial.valueOf(toolMaterial), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerAxeItem(String name, String toolMaterial, float attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new AxeItem(ModToolMaterial.valueOf(toolMaterial), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerShovelItem(String name, String toolMaterial, float attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new ShovelItem(ModToolMaterial.valueOf(toolMaterial), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerHoeItem(String name, String toolMaterial, int attackDamage, float attackSpeed) {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new HoeItem(ModToolMaterial.valueOf(toolMaterial), attackDamage, attackSpeed, new FabricItemSettings()));
    }

    private static Item registerArmorItem(String name)  {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new ArmorItem(ModArmorMaterials.valueOf(name.substring(0, name.lastIndexOf("_")).toUpperCase()), ArmorItem.Type.valueOf(name.substring(name.lastIndexOf("_") + 1).toUpperCase()), new FabricItemSettings()));
    }

    private static Item registerArmorItem(String name, String armorMaterial)  {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new ArmorItem(ModArmorMaterials.valueOf(armorMaterial), ArmorItem.Type.valueOf(name.substring(name.lastIndexOf("_") + 1).toUpperCase()), new FabricItemSettings()));
    }

    private static Item registerArmorItem(String name, String armorMaterial, String type)  {
        return Registry.register(Registries.ITEM, new Identifier(MOFMC.MOD_ID, name), new ArmorItem(ModArmorMaterials.valueOf(armorMaterial), ArmorItem.Type.valueOf(type), new FabricItemSettings()));
    }

    public static void registerModItems() {
        // ItemGroupEvents.modifyEntriesEvent(ModTabs.MOFMC_TAB).register(ModItems::addItemsToTab);
    }
}
