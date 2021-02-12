package com.github.advancedwipe.advancedtools.data;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagGenerator extends ItemTagsProvider {
	
	public static final ITag.INamedTag<Item> SILVER_ORE_TAG = ItemTags.makeWrapperTag(AdvancedToolsMod.prefix("silver_ore").toString());

	public ItemTagGenerator(DataGenerator dataGenerator, BlockTagsProvider blockprovider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockprovider, AdvancedToolsMod.MODID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		this.copy(BlockTagGenerator.SILVER_ORE_TAG, SILVER_ORE_TAG);
	}
	
}
