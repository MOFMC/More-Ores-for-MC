package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, mofmc.MOD_ID);

    public static final RegistryObject<Item> RUBY = createModItem("ruby");
    public static final RegistryObject<Item> RAW_RUBY = createModItem("raw_ruby");
    public static final RegistryObject<Item> RUBY_SWORD = createModSwordItem("ruby_sword", ModTiers.RUBY, 3, -2.4f);
    public static final RegistryObject<Item> RUBY_PICKAXE = createModPickaxeItem("ruby_pickaxe", ModTiers.RUBY, 1, -2.8f);
    public static final RegistryObject<Item> RUBY_AXE = createModAxeItem("ruby_axe", ModTiers.RUBY, 6.0f, -3.0f);
    public static final RegistryObject<Item> RUBY_SHOVEL = createModShovelItem("ruby_shovel", ModTiers.RUBY, 1.5f, -3.0f);
    public static final RegistryObject<Item> RUBY_HOE = createModHoeItem("ruby_hoe", ModTiers.RUBY, 0, 0f);
    public static final RegistryObject<Item> RUBY_HELMET = createModArmorItem("ruby_helmet", ModArmorMaterials.RUBY, ArmorItem.Type.HELMET);
    public static final RegistryObject<Item> RUBY_CHESTPLATE = createModArmorItem("ruby_chestplate", ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE);
    public static final RegistryObject<Item> RUBY_LEGGINGS = createModArmorItem("ruby_leggings", ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS);
    public static final RegistryObject<Item> RUBY_BOOTS = createModArmorItem("ruby_boots", ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS);

    public static final RegistryObject<Item>
            PYRITE_INGOT = createModItem("pyrite_ingot"),
            RAW_PYRITE = createModItem("raw_pyrite"),
            PYRITE_SWORD = createModSwordItem("pyrite_sword", ModTiers.PYRITE, 3, -2.4f),
            PYRITE_PICKAXE = createModPickaxeItem("pyrite_pickaxe", ModTiers.PYRITE, 1, -2.8f),
            PYRITE_AXE = createModAxeItem("pyrite_axe", ModTiers.PYRITE, 3f, -3.0f),
            PYRITE_SHOVEL = createModShovelItem("pyrite_shovel", ModTiers.PYRITE, 1.5f, -3.0f),
            PYRITE_HOE = createModHoeItem("pyrite_hoe", ModTiers.PYRITE, 0, 0f),
            PYRITE_HELMET = createModArmorItem("pyrite_helmet", ModArmorMaterials.PYRITE, ArmorItem.Type.HELMET),
            PYRITE_CHESTPLATE = createModArmorItem("pyrite_chestplate", ModArmorMaterials.PYRITE, ArmorItem.Type.CHESTPLATE),
            PYRITE_LEGGINGS = createModArmorItem("pyrite_leggings", ModArmorMaterials.PYRITE, ArmorItem.Type.LEGGINGS),
            PYRITE_BOOTS = createModArmorItem("pyrite_boots", ModArmorMaterials.PYRITE, ArmorItem.Type.BOOTS);

    public static final RegistryObject<Item> TITANIUM_ROD = createModItem("titanium_rod");
    public static final RegistryObject<Item> TITANIUM_DUST = createModItem("titanium_dust");
    public static final RegistryObject<Item> TITANIUM_SWORD = createModSwordItem("titanium_sword", ModTiers.TITANIUM, 3, -2.4f);
    public static final RegistryObject<Item> TITANIUM_PICKAXE = createModPickaxeItem("titanium_pickaxe", ModTiers.TITANIUM, 1, -2.8f);
    public static final RegistryObject<Item> TITANIUM_AXE = createModAxeItem("titanium_axe", ModTiers.TITANIUM, 4f, -3.0f);
    public static final RegistryObject<Item> TITANIUM_SHOVEL = createModShovelItem("titanium_shovel", ModTiers.TITANIUM, 1.5f, -3.0f);
    public static final RegistryObject<Item> TITANIUM_HOE = createModHoeItem("titanium_hoe", ModTiers.TITANIUM, 0, 0f);
    public static final RegistryObject<Item> TITANIUM_HELMET = createModArmorItem("titanium_helmet", ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET);
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = createModArmorItem("titanium_chestplate", ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE);
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = createModArmorItem("titanium_leggings", ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS);
    public static final RegistryObject<Item> TITANIUM_BOOTS = createModArmorItem("titanium_boots", ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS);

    public static final RegistryObject<Item> PURPLE_SAPPHIRE = createModItem("purple_sapphire");
    public static final RegistryObject<Item> RAW_PURPLE_SAPPHIRE = createModItem("raw_purple_sapphire");
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_SWORD = createModSwordItem("purple_sapphire_sword", ModTiers.PURPLE_SAPPHIRE, 3, -2.4f);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_PICKAXE = createModPickaxeItem("purple_sapphire_pickaxe", ModTiers.PURPLE_SAPPHIRE, 1, -2.8f);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_AXE = createModAxeItem("purple_sapphire_axe", ModTiers.PURPLE_SAPPHIRE, 5f, -3.0f);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_SHOVEL = createModShovelItem("purple_sapphire_shovel", ModTiers.PURPLE_SAPPHIRE, 1.5f, -3.0f);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_HOE = createModHoeItem("purple_sapphire_hoe", ModTiers.PURPLE_SAPPHIRE, 0, 0f);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_HELMET = createModArmorItem("purple_sapphire_helmet", ModArmorMaterials.PURPLE_SAPPHIRE, ArmorItem.Type.HELMET);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_CHESTPLATE = createModArmorItem("purple_sapphire_chestplate", ModArmorMaterials.PURPLE_SAPPHIRE, ArmorItem.Type.CHESTPLATE);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_LEGGINGS = createModArmorItem("purple_sapphire_leggings", ModArmorMaterials.PURPLE_SAPPHIRE, ArmorItem.Type.LEGGINGS);
    public static final RegistryObject<Item> PURPLE_SAPPHIRE_BOOTS = createModArmorItem("purple_sapphire_boots", ModArmorMaterials.PURPLE_SAPPHIRE, ArmorItem.Type.BOOTS);

    public static final RegistryObject<Item> TIN_INGOT = createModItem("tin_ingot");
    public static final RegistryObject<Item> RAW_TIN = createModItem("raw_tin");
    public static final RegistryObject<Item> TIN_SWORD = createModSwordItem("tin_sword", ModTiers.TIN, 3, -2.4f);
    public static final RegistryObject<Item> TIN_PICKAXE = createModPickaxeItem("tin_pickaxe", ModTiers.TIN, 1, -2.8f);
    public static final RegistryObject<Item> TIN_AXE = createModAxeItem("tin_axe", ModTiers.TIN, 3f, -3.0f);
    public static final RegistryObject<Item> TIN_SHOVEL = createModShovelItem("tin_shovel", ModTiers.TIN, 1.5f, -3.0f);
    public static final RegistryObject<Item> TIN_HOE = createModHoeItem("tin_hoe", ModTiers.TIN, 0, 0f);
    public static final RegistryObject<Item> TIN_HELMET = createModArmorItem("tin_helmet", ModArmorMaterials.TIN, ArmorItem.Type.HELMET);
    public static final RegistryObject<Item> TIN_CHESTPLATE = createModArmorItem("tin_chestplate", ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE);
    public static final RegistryObject<Item> TIN_LEGGINGS = createModArmorItem("tin_leggings", ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS);
    public static final RegistryObject<Item> TIN_BOOTS = createModArmorItem("tin_boots", ModArmorMaterials.TIN, ArmorItem.Type.BOOTS);

    public static final RegistryObject<Item> RAINBOW_GEM = createModItem("rainbow_gem");
    public static final RegistryObject<Item> RAINBOW_SWORD = createModSwordItem("rainbow_sword", ModTiers.RAINBOW, 3, -2.4f);
    public static final RegistryObject<Item> RAINBOW_PICKAXE = createModPickaxeItem("rainbow_pickaxe", ModTiers.RAINBOW, 1, -2.8f);
    public static final RegistryObject<Item> RAINBOW_AXE = createModAxeItem("rainbow_axe", ModTiers.RAINBOW, 5.5f, -3.0f);
    public static final RegistryObject<Item> RAINBOW_SHOVEL = createModShovelItem("rainbow_shovel", ModTiers.RAINBOW, 1.5f, -3.0f);
    public static final RegistryObject<Item> RAINBOW_HOE = createModHoeItem("rainbow_hoe", ModTiers.RAINBOW, 28, 10f);
    public static final RegistryObject<Item> RAINBOW_HELMET = createModArmorItem("rainbow_helmet", ModArmorMaterials.RAINBOW, ArmorItem.Type.HELMET);
    public static final RegistryObject<Item> RAINBOW_CHESTPLATE = createModArmorItem("rainbow_chestplate", ModArmorMaterials.RAINBOW, ArmorItem.Type.CHESTPLATE);
    public static final RegistryObject<Item> RAINBOW_LEGGINGS = createModArmorItem("rainbow_leggings", ModArmorMaterials.RAINBOW, ArmorItem.Type.LEGGINGS);
    public static final RegistryObject<Item> RAINBOW_BOOTS = createModArmorItem("rainbow_boots", ModArmorMaterials.RAINBOW, ArmorItem.Type.BOOTS);




    private static RegistryObject<Item> createModSwordItem(String name, ForgeTier tier, int attack, float speed) {      // Attack Damage Bonus, ? Speed Bonus ?
        return ITEMS.register(name, () -> new SwordItem(tier, attack, speed, new Item.Properties()));
    }

    private static RegistryObject<Item> createModPickaxeItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new PickaxeItem(tier, attack, speed, new Item.Properties()));
    }

    private static RegistryObject<Item> createModShovelItem(String name, ForgeTier tier, float attack, float speed) {
        return ITEMS.register(name, () -> new ShovelItem(tier, attack, speed, new Item.Properties()));
    }

    private static RegistryObject<Item> createModAxeItem(String name, ForgeTier tier, float attack, float speed) {
        return ITEMS.register(name, () -> new AxeItem(tier, attack, speed, new Item.Properties()));
    }

    private static RegistryObject<Item> createModHoeItem(String name, ForgeTier tier, int attack, float speed) {
        return ITEMS.register(name, () -> new HoeItem(tier, attack, speed, new Item.Properties()));
    }

    private static RegistryObject<Item> createModArmorItem(String name, ModArmorMaterials material, ArmorItem.Type type) {
        return ITEMS.register(name, () -> new ArmorItem(material, type, new Item.Properties()));
        // return ITEMS.register(name, () -> new ArmorItem(material, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    }
    
    private static RegistryObject<Item> createModItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
