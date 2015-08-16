package com.syntthetix.block;

import com.syntthetix.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class pink extends Block {

	public pink(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("pink");
		this.setCreativeTab(MainRegistry.tabBlock);
	}

}
