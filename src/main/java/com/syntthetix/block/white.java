package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class white extends Block {

	public white(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("white");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
