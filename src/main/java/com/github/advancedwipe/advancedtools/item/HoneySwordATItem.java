package com.github.advancedwipe.advancedtools.item;

import com.github.advancedwipe.advancedtools.entity.projectile.EntityATHoneyBall;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class HoneySwordATItem extends SwordItem {

	public HoneySwordATItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
		super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		ItemStack stack = player.getHeldItem(hand);

		if (stack.getDamage() == stack.getMaxDamage() - 1) {
			return ActionResult.resultFail(player.getHeldItem(hand));
		} else {
			player.playSound(SoundEvents.ENTITY_GHAST_SHOOT, 1.0F, (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F + 1.0F);
			player.getCooldownTracker().setCooldown(stack.getItem(), 90);

			if (!world.isRemote) {
				world.addEntity(new EntityATHoneyBall(world, player));
				stack.damageItem(1, player, (user) -> user.sendBreakAnimation(hand));
			}

			return ActionResult.resultSuccess(player.getHeldItem(hand));
		}
	}
	
}
