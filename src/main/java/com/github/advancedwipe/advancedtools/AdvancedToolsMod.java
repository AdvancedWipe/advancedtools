package com.github.advancedwipe.advancedtools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.advancedwipe.advancedtools.setup.Registration;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(value = AdvancedToolsMod.MODID)
public class AdvancedToolsMod {
	
	public static final String MODID = "advancedtools";
	
	private static final String MODEL_DIR = "textures/model/";
	private static final String GUI_DIR = "textures/gui/";
	private static final String ENVIRO_DIR = "textures/environment/";
	
private static final Logger LOGGER = LogManager.getLogger();
	
	public AdvancedToolsMod() {
		Registration.register();
		
		// Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
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
