package com.github.advancedwipe.advancedtools.item;

import java.util.List;

import com.github.advancedwipe.advancedtools.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class FirePickATItem extends PickaxeItem {

	public FirePickATItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		boolean result = super.hitEntity(stack, target, attacker);
		
		if (result && !target.isImmuneToFire()) {
			if (!target.world.isRemote) {
				target.setFire(15);
			} else {
				target.world.addParticle(ParticleTypes.FLAME, target.getPosX(), target.getPosY() + target.getHeight() * 0.5, target.getPosZ(),
						target.getWidth() * 0.5, target.getHeight() * 0.5, target.getWidth() * 0.5);
			}
		}

		return result;
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
	

}
