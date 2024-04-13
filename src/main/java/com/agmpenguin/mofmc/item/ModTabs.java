package com.agmpenguin.mofmc.item;

import com.agmpenguin.mofmc.mofmc;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.agmpenguin.mofmc.block.ModBlocks.*;

public class ModTabs extends ModItems {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, mofmc.MOD_ID);

    public static final String[] names = {"ruby", "pyrite", "titanium", "purple_sapphire", "tin", "rainbow"};

    public static RegistryObject<CreativeModeTab> MOFMC_TAB = MOD_TABS.register("mofmc_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(RUBY.get()))
                    .title(Component.translatable("creativetab.mofmc_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        for(String name : names) {
                            for(RegistryObject<Item> itemVar : ITEMS.getEntries()) {
                                if(itemVar.get().toString().contains(name)) {
                                    pOutput.accept(itemVar.get());
                                } else {
                                    continue;
                                }
                            }
                            for(RegistryObject<Block> blockVar : BLOCKS.getEntries()) {
                                if(blockVar.get().toString().contains(name)) {
                                    pOutput.accept(blockVar.get());
                                } else {
                                    continue;
                                }
                            }
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        MOD_TABS.register(eventBus);
    }
}
