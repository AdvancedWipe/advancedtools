package com.github.advancedwipe.advancedtools.data.client;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {

	public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, AdvancedToolsMod.MODID, existingFileHelper);
	}
	
	@Override
	protected void registerModels() {
		withExistingParent("silver_block", modLoc("block/silver_block"));
		withExistingParent("silver_ore", modLoc("block/silver_ore"));
		
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		
		builder(itemGenerated, "silver_ingot");
		
	}

	private ItemModelBuilder builder(ModelFile itemGenerated, String string) {
		return getBuilder("silver_ingot").parent(itemGenerated).texture("layer0", "item/" + "silver_ingot");
		
	}

}
