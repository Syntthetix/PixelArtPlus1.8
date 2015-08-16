package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class black extends Block {

	public black(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("black");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
