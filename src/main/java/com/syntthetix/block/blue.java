package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blue extends Block {

	public blue(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("blue");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
