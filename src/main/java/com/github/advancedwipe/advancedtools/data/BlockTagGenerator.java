package com.github.advancedwipe.advancedtools.data;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.block.ATBlocks;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGenerator extends BlockTagsProvider {
	
	public static final ITag.INamedTag<Block> SILVER_ORE_TAG = BlockTags.makeWrapperTag(AdvancedToolsMod.prefix("silver_ore").toString());

	public BlockTagGenerator(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
		super(generatorIn, AdvancedToolsMod.MODID, existingFileHelper);
	}
	
	protected void registerTags() {
		getOrCreateBuilder(SILVER_ORE_TAG).add(ATBlocks.SILVER_ORE.get());
		//getOrCreateBuilder(AIBlockTags.Blocks.ORES_ALUMINIUM).add(AIBlocks.ALUMINIUM_ORE.get());
		//getOrCreateBuilder(Tags.Blocks.ORES).addTags(AIBlockTags.Blocks.ORES_SILVER);
	}

}
