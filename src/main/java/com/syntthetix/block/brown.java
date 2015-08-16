package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class brown extends Block {

	public brown(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("brown");	
		this.setCreativeTab(MainRegistry.tabBlock);
	}
}