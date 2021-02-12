package com.github.advancedwipe.advancedtools.item.itemgroup;

import com.github.advancedwipe.advancedtools.block.ATBlocks;

import net.minecraft.block.Blocks;

public class ItemGroups {

	public static final AdvancedToolsGroup BLOCKS_GROUP = new AdvancedToolsGroup("blocks_group", () -> Blocks.GOLD_ORE);
	public static final AdvancedToolsGroup ITEMS_GROUP = new AdvancedToolsGroup("items_group", () -> Blocks.BARREL);
	public static final AdvancedToolsGroup EQUIP_GROUP = new AdvancedToolsGroup("tools_group", () -> Blocks.LIGHT_GRAY_WOOL);
	public static final AdvancedToolsGroup ARMOR_GROUP = new AdvancedToolsGroup("armor_group", () -> Blocks.BEACON);
}
