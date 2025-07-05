package com.agmpenguin.mofmc.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class NoticeItem extends Item {
    public NoticeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (this.isFood()) {
            ItemStack itemStack = user.getStackInHand(hand);
            if (user.canConsume(this.getFoodComponent().isAlwaysEdible())) {
                user.setCurrentHand(hand);
                return TypedActionResult.consume(itemStack);
            }
            return TypedActionResult.fail(itemStack);
        }
        if(world.isClient) {
            String toDo = "Increase spawning of Tin. Decrease spawning of Purple Sapphire. Maybe decrease spawning of Titanium. Maybe add in more tabs. Diamond Stone Cutter. Think about tin button. Everything with titanium (rod -> ingot). Titanium & Sapphire Sword Textures Are Crap, They Aren't Consistent With The Game";
            user.sendMessage(Text.literal(toDo));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}
