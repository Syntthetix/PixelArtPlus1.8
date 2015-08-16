package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class darkgray extends Block {

	public darkgray(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("darkgray");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
