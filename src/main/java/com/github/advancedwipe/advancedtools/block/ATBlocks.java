package com.github.advancedwipe.advancedtools.block;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ATBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedToolsMod.MODID);
	
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(3, 10).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	public static final RegistryObject<Block> aluminium_ore = BLOCKS.register("aluminium_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> KYANITE_ORE = BLOCKS.register("kyanite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANATAS_ORE = BLOCKS.register("anatas_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BROOKIT_ORE = BLOCKS.register("brookit_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
		
	// Stone Blocks
	public static final RegistryObject<Block> CUSTOM_STONE_PLATE = BLOCKS.register("custom_stone_plate", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
		
//	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
//		return BLOCKS.register(name, block);
//	}
//		
//	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
//	    RegistryObject<T> ret = registerNoItem(name, block);
//	    ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroups.BLOCKS_GROUP)));
//	    
//	    return ret;
//	}

	public static void register() {
		// TODO Auto-generated method stub
		
	}
}
