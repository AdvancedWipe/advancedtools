package com.github.advancedwipe.advancedtools.setup;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.block.ATBlocks;
import com.github.advancedwipe.advancedtools.item.ATItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedToolsMod.MODID);
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedToolsMod.MODID);
	
	public static void register() {
		
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
		
		ATBlocks.register();
		ATItems.register();
		
	}
}
