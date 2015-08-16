package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class purple extends Block {

	public purple(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("purple");
		this.setCreativeTab(MainRegistry.tabBlock);
	}
}