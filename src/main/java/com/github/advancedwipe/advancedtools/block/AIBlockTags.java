package com.github.advancedwipe.advancedtools.block;
//package com.github.advancedwipe.advanceditemsmod.block;
//
//import com.github.advancedwipe.advanceditemsmod.AdvancedItemsMod;
//
//import net.minecraft.block.Block;
//import net.minecraft.item.Item;
//import net.minecraft.tags.BlockTags;
//import net.minecraft.tags.ITag;
//import net.minecraft.tags.ItemTags;
//import net.minecraft.util.ResourceLocation;
//
//public class AIBlockTags {
//
//public static final class Blocks {
//		
//		// Copy&Paste below tag to generate a new block in the class Blocks in CustomBlocksTags
//		// public static final ITag.INamedTag<Block>  = forge("");
//		
//		
//		public static final ITag.INamedTag<Block> ORES_SILVER = forge("ores/silver");
//		public static final ITag.INamedTag<Block> ORES_ALUMINIUM = forge("ores/aluminium");
//		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");
//		
//		
//		// Some kind of stone blocks
//		public static final ITag.INamedTag<Block> CUSTOM_STONE_PLATE = forge("custom_stone_plate/stone");
//		//not completly finished
//		public static final ITag.INamedTag<Block> DIRTY_STONE_BRICK = forge("dirty_stone_brick/stone");
//		public static final ITag.INamedTag<Block> DRYSTACK_WALL_DARK = forge("drystack_wall_dark/stone");
//		public static final ITag.INamedTag<Block> MOSSY_DRYSTACK_WALL_DARK = forge("mossy_drystack_wall_dark");
//		public static final ITag.INamedTag<Block> MOSSY_STONES = forge("mossy_stones");
//		
//		
//		// Organic Blocks
//		
//		private static ITag.INamedTag<Block> forge(String path) {
//			return BlockTags.makeWrapperTag(new ResourceLocation(AdvancedItemsMod.MODID, path).toString());
//		}
//		
//		private static ITag.INamedTag<Block> mod(String path) {
//			return BlockTags.makeWrapperTag(new ResourceLocation(AdvancedItemsMod.MODID, path).toString());
//		}
//		
//	}
//	
//	public static final class Items {
//		
//		// Copy&Paste below tag to generate a new block item in the class Items in CustomBlocksTags
//		// public static final ITag.INamedTag<Item>  = forge("");
//		
//		// Test items
//		public static final ITag.INamedTag<Item> ORES_SILVER = forge("ores/silver");
//		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");
//		
//		public static final ITag.INamedTag<Item> INGOTS_SILVER = forge("ingots/silver");
//		
//		// Stone block items
//		public static final ITag.INamedTag<Item> CUSTOM_STONE_PLATE = forge("custom_stone_plate/stone");
//		
//		
//		private static ITag.INamedTag<Item> forge(String path) {
//			return ItemTags.makeWrapperTag(new ResourceLocation(AdvancedItemsMod.MODID, path).toString());
//		}
//		
//		private static ITag.INamedTag<Item> mod(String path) {
//			return ItemTags.makeWrapperTag(new ResourceLocation(AdvancedItemsMod.MODID, path).toString());
//		}
//	}
//}
