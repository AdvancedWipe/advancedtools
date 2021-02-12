package com.github.advancedwipe.advancedtools.item;

import java.util.List;

import com.github.advancedwipe.advancedtools.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SpecialItem extends Item {

	public SpecialItem(Properties properties) {
		super(properties);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		// makes the item glow
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("\u00A7f" + "This is some test info that is shown to you, you might want to undo"));
			tooltip.add(new StringTextComponent("\u00A7f" + "that, so stop pressing " + "\u00A7e" + "SHIFT"));
		} else {
			tooltip.add(new StringTextComponent("\u00A7f" + "Hold " + "\u00A7e" + "SHIFT" + "\u00A7f" + " for more information!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		playerIn.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 500, 255));
		worldIn.setRainStrength(1.0f);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
//	@Override
//	public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
//		entity.getEntityWorld().setBlockState(entity.getPosition().down(), AIBlocks.SILVER_ORE.);
//		return super.onEntityItemUpdate(stack, entity);
//	}
	
	

}
