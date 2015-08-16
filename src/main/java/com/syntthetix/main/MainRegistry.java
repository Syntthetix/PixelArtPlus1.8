package com.syntthetix.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.syntthetix.block.PixelBlocks;
import com.syntthetix.item.PixelItems;
import com.syntthetix.lib.RefStrings;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENT_PROXY_CLASS, serverSide = RefStrings.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final BlockTab tabBlock = new BlockTab("tabBlock");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PixelBlocks.mainRegistry();
		PixelItems.mainRegistry();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}