package com.github.advancedwipe.advancedtools.data;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.item.ATItems;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagGenerator extends ItemTagsProvider {
	
	public static final ITag.INamedTag<Item> SILVER_ORE_TAG = ItemTags.makeWrapperTag(AdvancedToolsMod.prefix("silver_ore").toString());

	public ItemTagGenerator(DataGenerator dataGenerator, BlockTagsProvider blockprovider, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockprovider, AdvancedToolsMod.MODID, existingFileHelper);
	}
	
	@Override
	protected void registerTags() {
		// Copies the blocktag from the BlockTagGenerator to the itemtag. Makes the items the same as the blocks
		// Doesn't work with an manually added tag
		this.copy(BlockTagGenerator.SILVER_ORE_TAG, SILVER_ORE_TAG);
		this.copy(Tags.Blocks.ORES, Tags.Items.ORES);
		
		getOrCreateBuilder(SILVER_ORE_TAG).add(ATItems.SILVER_ORE.get());
	}
	
}
