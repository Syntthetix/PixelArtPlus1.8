package com.syntthetix.main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.syntthetix.block.PixelBlocks;
import com.syntthetix.item.PixelItems;

public class BlockTab extends CreativeTabs{

	public BlockTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return PixelItems.icon;
	}
}
