package com.github.advancedwipe.advancedtools.block;

import java.util.function.Supplier;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.item.itemgroup.ItemGroups;
import com.github.advancedwipe.advancedtools.setup.Registration;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ATBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedToolsMod.MODID);
	
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> KYANITE_ORE = BLOCKS.register("kyanite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> ANATAS_ORE = BLOCKS.register("anatas_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
	public static final RegistryObject<Block> BROOKIT_ORE = BLOCKS.register("brookit_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
		
	// Stone Blocks
	public static final RegistryObject<Block> CUSTOM_STONE_PLATE = register("custom_stone_plate", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
		
	public static void register() {
		
	}
		
	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
		return Registration.BLOCKS.register(name, block);
	}
		
	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
	    RegistryObject<T> ret = registerNoItem(name, block);
	    Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroups.BLOCKS_GROUP)));
	    
	    return ret;
	}
}
