//
// Add all items to this class to give them their properties and their item group
//
//

package com.github.advancedwipe.advancedtools.item;

import com.github.advancedwipe.advancedtools.enums.AdvancedArmorMaterial;
import com.github.advancedwipe.advancedtools.enums.AdvancedItemTier;
import com.github.advancedwipe.advancedtools.item.itemgroup.ItemGroups;
import com.github.advancedwipe.advancedtools.setup.Registration;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;

public class ATItems {
	
	// IDEAS
	
//		public static final RegistryObject<BowItem> SNOW_BOW = Registration.ITEMS.register("snow_bow",
//				() -> new AngelItem(new Item.Properties().group(AdvancedItemGroups.GROUP)));
//	 	1.17 gives player hit by arrow freez effect
	
	// ITEMS
	public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> SILVER_COIN = Registration.ITEMS.register("silver_coin", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> RUBY = Registration.ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> IMMORTALITY_STICK = Registration.ITEMS.register("immortality_stick", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> HEAVEN_INGOT = Registration.ITEMS.register("heaven_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> CACTUS_SHEET = Registration.ITEMS.register("cactus_sheet", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> SUGAR_PLATE = Registration.ITEMS.register("sugar_plate", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> FIERY_INGOT = Registration.ITEMS.register("fiery_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> CORAL_PLATE = Registration.ITEMS.register("coral_plate", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	
	public static final RegistryObject<Item> ALUMINIUM_INGOT = Registration.ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	// Needs a Ore type
	public static final RegistryObject<Item> SILICIUM_CRYTAL = Registration.ITEMS.register("silicium_crystal", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	// Needs a Ore type
	public static final RegistryObject<Item> KYANITE_CRYSTAL = Registration.ITEMS.register("kyanite", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> ANATAS_CRYSTAL = Registration.ITEMS.register("anatas", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	public static final RegistryObject<Item> BROOKIT_CRYSTAL = Registration.ITEMS.register("brookit", () -> new Item(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	
	
	public static final RegistryObject<Item> ADVANCED_ITEM = Registration.ITEMS.register("advanced_item", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroups.ITEMS_GROUP)));
	
// TOOLS
	// ANGEL
	public static final RegistryObject<SwordItem> ANGEL_SWORD = Registration.ITEMS.register("angel_sword",
			() -> new SwordItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<PickaxeItem> ANGEL_PICKAXE = Registration.ITEMS.register("angel_pickaxe",
			() -> new PickaxeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ShovelItem> ANGEL_SHOVEL = Registration.ITEMS.register("angel_shovel",
			() -> new ShovelItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> ANGEL_AXE = Registration.ITEMS.register("angel_axe",
			() -> new AxeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> ANGEL_BATTLEAXE = Registration.ITEMS.register("angel_battleaxe",
			() -> new AxeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<HoeItem> ANGEL_HOE = Registration.ITEMS.register("angel_hoe",
			() -> new HoeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	// FIREY
	public static final RegistryObject<SwordItem> FIRE_SWORD = Registration.ITEMS.register("fire_sword",
			() -> new SwordItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<PickaxeItem> FIRE_PICKAXE = Registration.ITEMS.register("fire_pickaxe",
			() -> new FirePickATItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ShovelItem> FIRE_SHOVEL = Registration.ITEMS.register("fire_shovel",
			() -> new ShovelItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> FIRE_AXE = Registration.ITEMS.register("fire_axe",
			() -> new AxeItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> FIRE_BATTLEAXE = Registration.ITEMS.register("fire_battleaxe",
			() -> new AxeItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<HoeItem> FIRE_HOE = Registration.ITEMS.register("fire_hoe",
			() -> new HoeItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	// ENDER
	public static final RegistryObject<SwordItem> ENDER_SWORD = Registration.ITEMS.register("ender_sword",
			() -> new EnderSwordATItem(AdvancedItemTier.ENDER, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	public static final RegistryObject<SwordItem> ELVEN_SWORD = Registration.ITEMS.register("elven_sword",
			() -> new ElvenSwordATItem(AdvancedItemTier.ENDER, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	public static final RegistryObject<SwordItem> HONEY_SWORD = Registration.ITEMS.register("honey_sword",
			() -> new HoneySwordATItem(AdvancedItemTier.HONEY, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	public static final RegistryObject<SwordItem> ELDER_SWORD = Registration.ITEMS.register("elder_sword",
			() -> new SwordItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	
	
// ARMOR
	// TEST
	public static final RegistryObject<ArmorItem> TEST_HELMET = Registration.ITEMS.register("test_helmet",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ArmorItem> TEST_CHEST = Registration.ITEMS.register("test_chest",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ArmorItem> TEST_LEGGINGS = Registration.ITEMS.register("test_leggings",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ArmorItem> TEST_BOOTS = Registration.ITEMS.register("test_boots",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));

	public static void register() {
		
	}

}
