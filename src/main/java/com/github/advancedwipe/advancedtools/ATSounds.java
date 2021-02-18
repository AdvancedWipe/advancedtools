package com.github.advancedwipe.advancedtools;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = AdvancedToolsMod.MODID)
public final class ATSounds {
	
	// Following Code was copied from the TwilightForestMod for understanding the implementation of entities in Minecraft.
	
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AdvancedToolsMod.MODID);

	public static final SoundEvent DEER_DEATH = createEvent("entity.deer.death");
	public static final SoundEvent DEER_HURT = createEvent("entity.deer.hurt");
	public static final SoundEvent DEER_IDLE = createEvent("entity.deer.idle");
	
	private static SoundEvent createEvent(String sound) {
		ResourceLocation name = AdvancedToolsMod.prefix(sound);
		return new SoundEvent(name).setRegistryName(name);
	}
	
	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(
				DEER_DEATH, DEER_HURT, DEER_IDLE
				);
		//registerParrotSounds();
	}

//	private static void registerParrotSounds() {
//		// TODO Auto-generated method stub
//		
//	}
	
	private ATSounds() {}

}
