package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class darkGray extends Block {

	public darkGray(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("darkGray");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
