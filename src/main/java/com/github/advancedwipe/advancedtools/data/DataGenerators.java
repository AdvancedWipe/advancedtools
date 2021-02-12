package com.github.advancedwipe.advancedtools.data;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.data.client.BlockstateGenerator;
import com.github.advancedwipe.advancedtools.data.client.ItemModelGenerator;

import net.minecraft.data.BlockTagsProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = AdvancedToolsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent evt) {
		// Got the idea to do it like this from twilightforest mod
        BlockTagsProvider blocktags = new BlockTagGenerator(evt.getGenerator(), evt.getExistingFileHelper());
        evt.getGenerator().addProvider(blocktags);
        evt.getGenerator().addProvider(new ItemTagGenerator(evt.getGenerator(), blocktags, evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new BlockstateGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ItemModelGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
	}
	
}
