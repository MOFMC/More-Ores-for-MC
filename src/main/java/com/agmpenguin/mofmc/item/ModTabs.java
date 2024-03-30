package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.agmpenguin.mofmc.block.ModBlocks.*;

public class ModTabs extends ModItems {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, mofmc.MOD_ID);

    public static RegistryObject<CreativeModeTab> MOFMC_TAB = MOD_TABS.register("mofmc_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(RUBY.get()))
                    .title(Component.translatable("creativetab.mofmc_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(RUBY.get());
                        pOutput.accept(RAW_RUBY.get());
                        pOutput.accept(RUBY_SWORD.get());
                        pOutput.accept(RUBY_PICKAXE.get());
                        pOutput.accept(RUBY_AXE.get());
                        pOutput.accept(RUBY_SHOVEL.get());
                        pOutput.accept(RUBY_HOE.get());
                        pOutput.accept(RUBY_HELMET.get());
                        pOutput.accept(RUBY_CHESTPLATE.get());
                        pOutput.accept(RUBY_LEGGINGS.get());
                        pOutput.accept(RUBY_BOOTS.get());
                        pOutput.accept(RUBY_ORE.get());
                        pOutput.accept(DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(NETHER_RUBY_ORE.get());
                        pOutput.accept(END_RUBY_ORE.get());
                        pOutput.accept(RUBY_BLOCK.get());
                        pOutput.accept(RAW_RUBY_BLOCK.get());
                        pOutput.accept(RUBY_STAIRS.get());
                        pOutput.accept(RUBY_SLAB.get());
                        pOutput.accept(RUBY_PRESSURE_PLATE.get());

                        pOutput.accept(PYRITE_INGOT.get());
                        pOutput.accept(RAW_PYRITE.get());
                        pOutput.accept(PYRITE_SWORD.get());
                        pOutput.accept(PYRITE_PICKAXE.get());
                        pOutput.accept(PYRITE_AXE.get());
                        pOutput.accept(PYRITE_SHOVEL.get());
                        pOutput.accept(PYRITE_HOE.get());
                        pOutput.accept(PYRITE_ORE.get());
                        pOutput.accept(PYRITE_HELMET.get());
                        pOutput.accept(PYRITE_CHESTPLATE.get());
                        pOutput.accept(PYRITE_LEGGINGS.get());
                        pOutput.accept(PYRITE_BOOTS.get());
                        pOutput.accept(DEEPSLATE_PYRITE_ORE.get());
                        pOutput.accept(NETHER_PYRITE_ORE.get());
                        pOutput.accept(END_PYRITE_ORE.get());
                        pOutput.accept(PYRITE_BLOCK.get());
                        pOutput.accept(RAW_PYRITE_BLOCK.get());
                        pOutput.accept(PYRITE_STAIRS.get());
                        pOutput.accept(PYRITE_SLAB.get());
                        pOutput.accept(PYRITE_PRESSURE_PLATE.get());

                        pOutput.accept(RUBY_V_1.get());

                        pOutput.accept(TITANIUM_ROD.get());
                        pOutput.accept(TITANIUM_DUST.get());
                        pOutput.accept(TITANIUM_SWORD.get());
                        pOutput.accept(TITANIUM_PICKAXE.get());
                        pOutput.accept(TITANIUM_AXE.get());
                        pOutput.accept(TITANIUM_SHOVEL.get());
                        pOutput.accept(TITANIUM_HOE.get());
                        pOutput.accept(TITANIUM_HELMET.get());
                        pOutput.accept(TITANIUM_CHESTPLATE.get());
                        pOutput.accept(TITANIUM_LEGGINGS.get());
                        pOutput.accept(TITANIUM_BOOTS.get());
                        pOutput.accept(TITANIUM_ORE.get());
                        pOutput.accept(DEEPSLATE_TITANIUM_ORE.get());
                        pOutput.accept(NETHER_TITANIUM_ORE.get());
                        pOutput.accept(END_TITANIUM_ORE.get());
                        pOutput.accept(TITANIUM_BLOCK.get());
                        pOutput.accept(TITANIUM_STAIRS.get());
                        pOutput.accept(TITANIUM_SLAB.get());
                        pOutput.accept(TITANIUM_PRESSURE_PLATE.get());

                        pOutput.accept(PURPLE_SAPPHIRE.get());
                        pOutput.accept(RAW_PURPLE_SAPPHIRE.get());
                        pOutput.accept(PURPLE_SAPPHIRE_SWORD.get());
                        pOutput.accept(PURPLE_SAPPHIRE_PICKAXE.get());
                        pOutput.accept(PURPLE_SAPPHIRE_AXE.get());
                        pOutput.accept(PURPLE_SAPPHIRE_SHOVEL.get());
                        pOutput.accept(PURPLE_SAPPHIRE_HOE.get());
                        pOutput.accept(PURPLE_SAPPHIRE_HELMET.get());
                        pOutput.accept(PURPLE_SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(PURPLE_SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(PURPLE_SAPPHIRE_BOOTS.get());
                        pOutput.accept(PURPLE_SAPPHIRE_ORE.get());
                        pOutput.accept(DEEPSLATE_PURPLE_SAPPHIRE_ORE.get());
                        pOutput.accept(NETHER_PURPLE_SAPPHIRE_ORE.get());
                        pOutput.accept(END_PURPLE_SAPPHIRE_ORE.get());
                        pOutput.accept(PURPLE_SAPPHIRE_BLOCK.get());
                        pOutput.accept(RAW_PURPLE_SAPPHIRE_BLOCK.get());
                        pOutput.accept(PURPLE_SAPPHIRE_STAIRS.get());
                        pOutput.accept(PURPLE_SAPPHIRE_SLAB.get());
                        pOutput.accept(PURPLE_SAPPHIRE_PRESSURE_PLATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        MOD_TABS.register(eventBus);
    }
}
