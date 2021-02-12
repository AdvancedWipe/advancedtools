package com.github.advancedwipe.advancedtools.item.itemgroup;

import java.util.function.Supplier;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;

public class AdvancedToolsGroup extends ItemGroup {

private final Supplier<IItemProvider> supplier;
	
	public AdvancedToolsGroup(String label, Supplier<IItemProvider> supplier) {
		super(AdvancedToolsMod.MODID + "." + label);
		this.supplier = supplier;
	}
	
	@Override
	public ItemStack createIcon() {
		return new ItemStack(supplier.get());
	}
}
