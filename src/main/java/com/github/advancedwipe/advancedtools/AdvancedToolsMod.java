package com.github.advancedwipe.advancedtools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.advancedwipe.advancedtools.block.ATBlocks;
import com.github.advancedwipe.advancedtools.item.ATItems;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = AdvancedToolsMod.MODID)
public class AdvancedToolsMod {
	
	public static final String MODID = "advancedtools";
	
	private static final String MODEL_DIR = "textures/model/";
	private static final String GUI_DIR = "textures/gui/";
	private static final String ENVIRO_DIR = "textures/environment/";
	
private static final Logger LOGGER = LogManager.getLogger();
	
	public AdvancedToolsMod() {
		//Registration.register();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		ATBlocks.BLOCKS.register(bus);
		ATItems.ITEMS.register(bus);
		
		// Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}

	public static ResourceLocation prefix(String name) {
		return new ResourceLocation(MODID, name);
	}
	
	public static ResourceLocation getModelTexture(String name) {
		return new ResourceLocation(MODID, MODEL_DIR + name);
	}

	public static ResourceLocation getGuiTexture(String name) {
		return new ResourceLocation(MODID, GUI_DIR + name);
	}

	public static ResourceLocation getEnvTexture(String name) {
		return new ResourceLocation(MODID, ENVIRO_DIR + name);
	}
}
