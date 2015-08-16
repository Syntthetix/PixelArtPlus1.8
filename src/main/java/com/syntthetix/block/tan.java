package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class tan extends Block{

	public tan(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("tan");
		this.setCreativeTab(MainRegistry.tabBlock);
	}
}