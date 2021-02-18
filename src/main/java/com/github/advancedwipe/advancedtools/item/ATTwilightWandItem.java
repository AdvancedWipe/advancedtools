package com.github.advancedwipe.advancedtools.item;

import com.github.advancedwipe.advancedtools.entity.projectile.EntityATTwilightWandBolt;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ATTwilightWandItem extends Item {

	protected ATTwilightWandItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		ItemStack stack = player.getHeldItem(hand);

		if (stack.getDamage() == stack.getMaxDamage() - 1) {
			return ActionResult.resultFail(player.getHeldItem(hand));
		} else {
			player.playSound(SoundEvents.ENTITY_GHAST_SHOOT, 1.0F, (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F + 1.0F);

			if (!world.isRemote) {
				world.addEntity(new EntityATTwilightWandBolt(world, player));
				stack.damageItem(1, player, (user) -> user.sendBreakAnimation(hand));
			}

			return ActionResult.resultSuccess(player.getHeldItem(hand));
		}
	}
	

	@Override
	public float getXpRepairRatio(ItemStack stack) {
		return 1f;
	}

}
