package com.github.advancedwipe.advancedtools.enums;

import java.util.function.Supplier;

import com.github.advancedwipe.advancedtools.item.ATItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum AdvancedItemTier implements IItemTier {
	
	// https://minecraft.gamepedia.com/Tiers
	// int (mining level), int Durability , float minig speed multiplier, float damage bonus, int enchantability, Supplier<Ingredient> repairMaterial
	
	// For comparison (w=wood,s=stone,i=iron,d=diamond,n=netherite,g=gold)
	// Mining-level: w:0, s:1, i:2, d:3, n:4, g:0
	// Durability: w:59, s:131, i:250, d:1561, n:2031, g:32
	// Mining-speed: w:2, s:4, i:6, d:8, n:9, g:12
	// Damage: w:0, s:1, i:2, d:3, n:4, g:0
	// Enchantibility: w:15, s:5, i:14, d:10, n:15, g:22 //Stronger material lower
	
	EXAMPLE(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), ANGEL(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), CACTUS(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), CANDY(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), CORAL(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), CRIMSON(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), CURSED(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), ELVEN(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), EMERALD(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), ENDER(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), ENERGY(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), FIRE(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), GLASS(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), GREENWOOD(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), HALO(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), HONEY(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), KYANITE(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), NETHERITE(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), NOVA(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), PHANTOM(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), PUFFER(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), SUCBA(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), SHROOM(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), SNOW(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	}), VOID(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ATItems.SILVER_INGOT.get());
	});
		
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

		
	private AdvancedItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}
		
		
	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return null;
	}
}
