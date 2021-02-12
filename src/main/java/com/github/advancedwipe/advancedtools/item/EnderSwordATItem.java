package com.github.advancedwipe.advancedtools.item;

import java.util.List;

import org.spongepowered.asm.launch.platform.IMixinPlatformAgent.AcceptResult;

import com.github.advancedwipe.advancedtools.util.helpers.KeyboardHelper;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class EnderSwordATItem extends SwordItem {
	
	public EnderSwordATItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
		super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
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
	
	// Code from
	// https://github.com/TeamChocoQuest/ChocolateQuestRepoured/blob/master/src/main/java/team/cqr/cqrepoured/objects/items/swords/ItemDaggerNinja.java
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity player, Hand handIn) {
		
		ItemStack stack = player.getHeldItem(handIn);
		
		if (player.isSneaking()) {
			
			for (int i = 0; i < 6; i++) {
				worldIn.addParticle(ParticleTypes.PORTAL, player.getPosX() +  0.5D, player.getPosY() +  0.5D, player.getPosZ() +  0.5D, -0.5D, -0.5D, -0.5D);
			}
			
			double x = -Math.sin(Math.toRadians(player.rotationYaw));
			double z = Math.cos(Math.toRadians(player.rotationYaw));
			double y = -Math.sin(Math.toRadians(player.rotationPitch));
			
			x *= (1.0D - Math.abs(y));
			z *= (1.0D - Math.abs(y));
			int dist = 16;
			
			BlockPos pos = new BlockPos(player.getPosX() + x * dist, player.getPosY() + y * dist + 1, player.getPosZ() + z * dist);

			// Das nimmt genau die gleiche Methode her. Gibt jedoch auch worldIn.getBlockState(pos).allowsMovement(worldIn, pos, PathType.LAND /*Path type (wo du bist)*/); Musst schauen was am besten ist
			// && pos.getY() > 0
			if (worldIn.getBlockState(pos).allowsMovement(worldIn, pos, PathType.LAND)) {
				
				player.getCooldownTracker().setCooldown(stack.getItem(), 30);
				player.setPosition(player.getPosX() + x * dist, player.getPosY() + y * dist + 1, player.getPosZ() + z * dist);
				//playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 40, 5, false, false));
				worldIn.playSound(player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.AMBIENT, 1.0F, 1.0F, false);
				
				for (int i = 0; i < 6; i++) {
					worldIn.addParticle(ParticleTypes.PORTAL, player.getPosX() +  0.5D, player.getPosY() +  0.5D, player.getPosZ() +  0.5D, -0.5D, -0.5D, -0.5D);
				}
			} else {
				
				return new ActionResult<>(ActionResultType.FAIL, stack);
			}
			
			stack.damageItem(5 /*Ist der Damage amount*/, player, (entity) -> {
				// Muss so nicht verwendet werden, kann aber irgendwas machen, wenn das item zerstört wird
				entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
			});
			
			for (int i = 0; i < 6; i++) {
				worldIn.addParticle(ParticleTypes.PORTAL, player.getPosX() +  0.5D, player.getPosY() +  0.5D, player.getPosZ() +  0.5D, -0.5D, -0.5D, -0.5D);
			}
			
		} else {
			super.onItemRightClick(worldIn, player, handIn);
		}
		
		return new ActionResult<>(ActionResultType.SUCCESS, stack);
		
	}
}
