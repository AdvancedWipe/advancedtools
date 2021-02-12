package com.github.advancedwipe.advancedtools.item;

import java.util.List;

import com.github.advancedwipe.advancedtools.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class ElvenSwordATItem extends SwordItem{

	public ElvenSwordATItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
		super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		
		ItemStack stack = playerIn.getHeldItem(handIn);
		
		worldIn.playSound(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_ENDER_EYE_DEATH, SoundCategory.AMBIENT, 1.0F, 1.0F, false);
		playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 40, 5, false, false));
		
		for (int i = 0; i < 6; i++) {
			worldIn.addParticle(ParticleTypes.PORTAL, playerIn.getPosX() +  0.5D, playerIn.getPosY() +  0.5D, playerIn.getPosZ() +  0.5D, -0.5D, -0.5D, -0.5D);
		}
		stack.damageItem(5, playerIn, (entity) -> {
			entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		});
		playerIn.getCooldownTracker().setCooldown(stack.getItem(), 90);
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("\\u00A77" + "This is some test info that is shown to you, you might want to undo"));
			tooltip.add(new StringTextComponent("\\u00A77" + "that, so stop pressing " + "\u00A7e" + "SHIFT"));
		} else {
			tooltip.add(new StringTextComponent("\\u00A77f" + "Hold " + "\u00A7e" + "SHIFT" + "\\u00A77" + " for more information!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
