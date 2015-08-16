package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class red extends Block {

	public red(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("red");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
