//
// Add all items to this class to give them their properties and their item group
//
//

package com.github.advancedwipe.advancedtools.item;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.block.ATBlocks;
import com.github.advancedwipe.advancedtools.enums.AdvancedArmorMaterial;
import com.github.advancedwipe.advancedtools.enums.AdvancedItemTier;
import com.github.advancedwipe.advancedtools.item.itemgroup.ItemGroups;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ATItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedToolsMod.MODID);
	
	// IDEAS
	
//		public static final RegistryObject<BowItem> SNOW_BOW = Registration.ITEMS.register("snow_bow",
//				() -> new AngelItem(new Item.Properties().group(AdvancedItemGroups.GROUP)));
//	 	1.17 gives player hit by arrow freez effect
	
	// ITEMS
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> IMMORTALITY_STICK = ITEMS.register("immortality_stick", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> HEAVEN_INGOT = ITEMS.register("heaven_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> CACTUS_SHEET = ITEMS.register("cactus_sheet", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> SUGAR_PLATE = ITEMS.register("sugar_plate", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> FIERY_INGOT = ITEMS.register("fiery_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> CORAL_PLATE = ITEMS.register("coral_plate", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	
	public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	// Needs a Ore type
	public static final RegistryObject<Item> SILICIUM_CRYTAL = ITEMS.register("silicium_crystal", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	// Needs a Ore type
	public static final RegistryObject<Item> KYANITE_CRYSTAL = ITEMS.register("kyanite", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> ANATAS_CRYSTAL = ITEMS.register("anatas", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	public static final RegistryObject<Item> BROOKIT_CRYSTAL = ITEMS.register("brookit", () -> new Item(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	
	
	public static final RegistryObject<Item> ADVANCED_ITEM = ITEMS.register("advanced_item", 
			() -> new SpecialItem(new Item.Properties().group(ItemGroups.ITEM_GROUP)));
	
// TOOLS
	// ANGEL
	public static final RegistryObject<SwordItem> ANGEL_SWORD = ITEMS.register("angel_sword",
			() -> new SwordItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<PickaxeItem> ANGEL_PICKAXE = ITEMS.register("angel_pickaxe",
			() -> new PickaxeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ShovelItem> ANGEL_SHOVEL = ITEMS.register("angel_shovel",
			() -> new ShovelItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> ANGEL_AXE = ITEMS.register("angel_axe",
			() -> new AxeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> ANGEL_BATTLEAXE = ITEMS.register("angel_battleaxe",
			() -> new AxeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<HoeItem> ANGEL_HOE = ITEMS.register("angel_hoe",
			() -> new HoeItem(AdvancedItemTier.ANGEL, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	// FIREY
	public static final RegistryObject<SwordItem> FIRE_SWORD = ITEMS.register("fire_sword",
			() -> new SwordItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<PickaxeItem> FIRE_PICKAXE = ITEMS.register("fire_pickaxe",
			() -> new FirePickATItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ShovelItem> FIRE_SHOVEL = ITEMS.register("fire_shovel",
			() -> new ShovelItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> FIRE_AXE = ITEMS.register("fire_axe",
			() -> new AxeItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<AxeItem> FIRE_BATTLEAXE = ITEMS.register("fire_battleaxe",
			() -> new AxeItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<HoeItem> FIRE_HOE = ITEMS.register("fire_hoe",
			() -> new HoeItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	
	
	public static final RegistryObject<SwordItem> ENDER_SWORD = ITEMS.register("ender_sword",
			() -> new EnderSwordATItem(AdvancedItemTier.ENDER, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	public static final RegistryObject<SwordItem> ELVEN_SWORD = ITEMS.register("elven_sword",
			() -> new ElvenSwordATItem(AdvancedItemTier.ENDER, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	public static final RegistryObject<SwordItem> HONEY_SWORD = ITEMS.register("honey_sword",
			() -> new HoneySwordATItem(AdvancedItemTier.HONEY, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	public static final RegistryObject<SwordItem> ELDER_SWORD = ITEMS.register("elder_sword",
			() -> new SwordItem(AdvancedItemTier.FIRE, 7, 5.0f, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	// Armor Items
	public static final RegistryObject<ArmorItem> TEST_HELMET = ITEMS.register("test_helmet",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ArmorItem> TEST_CHEST = ITEMS.register("test_chest",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ArmorItem> TEST_LEGGINGS = ITEMS.register("test_leggings",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	public static final RegistryObject<ArmorItem> TEST_BOOTS = ITEMS.register("test_boots",
			() -> new ArmorItem(AdvancedArmorMaterial.TEST,EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.EQUIP_GROUP)));
	
	// Block Items
	public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(ATBlocks.SILVER_ORE.get(), new Item.Properties().group(ItemGroups.BLOCK_GROUP)));

	public static void register() {
		
	}

}
