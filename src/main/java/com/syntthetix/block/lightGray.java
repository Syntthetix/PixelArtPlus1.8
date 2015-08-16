package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class lightgray extends Block {

	public lightgray(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("lightgray");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
