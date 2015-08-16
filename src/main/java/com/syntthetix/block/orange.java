package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class orange extends Block {

	public orange(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("orange");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
