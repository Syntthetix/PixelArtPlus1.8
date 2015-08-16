package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class lightGray extends Block {

	public lightGray(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("lightGray");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
