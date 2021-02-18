package com.github.advancedwipe.advancedtools.data.client;

import org.apache.commons.io.filefilter.PrefixFileFilter;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.block.ATBlocks;
import com.github.advancedwipe.advancedtools.item.ATItems;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {

	public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, AdvancedToolsMod.MODID, existingFileHelper);
	}
	
	//@Override
	protected void registerModels() {
		//withExistingParent("silver_block", modLoc("block/silver_block"));
		withExistingParent("silver_ore", modLoc("block/silver_ore"));
		toBlock(ATBlocks.aluminium_ore.get());
		toBlock(ATBlocks.ruby_ore.get());
		//generated(ATBlocks.ruby_ore.getId().getPath(), AdvancedToolsMod.prefix("block/ruby_ore"));
		generated(ATItems.SILVER_INGOT.getId().getPath(), AdvancedToolsMod.prefix("item/silver_ingot"));
		
//		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
//		
//		builder(itemGenerated, "silver_ingot");
		
	}
	
	private ItemModelBuilder generated(String name, ResourceLocation... layers) {
		ItemModelBuilder builder = withExistingParent(name, "item/generated");
		for (int i = 0; i < layers.length; i++) {
			builder = builder.texture("layer" + i, layers[i]);
		}
		return builder;
		
	}

	private void toBlock(Block block) {
		toBlockModel(block, block.getRegistryName().getPath());
	}

	private void toBlockModel(Block block, String model) {
		toBlockModel(block, AdvancedToolsMod.prefix("block/" + model));
	}
	
	private void toBlockModel(Block block, ResourceLocation model) {
		withExistingParent(block.getRegistryName().getPath(), model);
	}

//	private ItemModelBuilder builder(ModelFile itemGenerated, String string) {
//		return getBuilder("silver_ingot").parent(itemGenerated).texture("layer0", "item/" + "silver_ingot");
//		
//	}
	
	@Override
	public String getName() {
		return "AdvancedTools item and itemblock models";
	}

}
