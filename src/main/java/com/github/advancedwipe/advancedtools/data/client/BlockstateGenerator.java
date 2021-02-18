package com.github.advancedwipe.advancedtools.data.client;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.block.ATBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockstateGenerator extends BlockStateProvider {

	public BlockstateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, AdvancedToolsMod.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(ATBlocks.silver_ore.get());
		//simpleBlock(ATBlocks.silver_ore.get());
		simpleBlock(ATBlocks.ruby_ore.get());
		simpleBlock(ATBlocks.kyanite_ore.get());
		//simpleBlock(ATBlocks.silver_ore.get());
		
	}

}
