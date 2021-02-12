package com.github.advancedwipe.advancedtools.enums;

import java.util.function.Supplier;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.item.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum AdvancedArmorMaterial implements IArmorMaterial {
	
	TEST(AdvancedToolsMod.MODID + ":test", 5, new int[] { 7, 9, 11, 7 }, 420, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, null),
	ENDER(AdvancedToolsMod.MODID + ":ender", 5, new int[] { 7, 9, 11, 7 }, 420, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, null);
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final float knockbackresistance;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;

	private AdvancedArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
			int enchantabilityIn, float knockbackresistanceIn, SoundEvent soundEventIn, float toughnessIn,
			Supplier<Ingredient> repairMaterialIn) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
		this.enchantability = enchantabilityIn;
		this.knockbackresistance = knockbackresistanceIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackresistance;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

}
