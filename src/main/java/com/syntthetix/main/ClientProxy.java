package com.syntthetix.main;

import com.syntthetix.block.PixelBlocks;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		PixelBlocks.registerRenders();
	}
}