package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class green extends Block {

	public green(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("green");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
