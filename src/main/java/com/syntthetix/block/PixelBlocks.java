package com.syntthetix.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.syntthetix.lib.RefStrings;

public class PixelBlocks {

	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	public static Block tan;
	public static Block red;
	public static Block orange;
	public static Block brown;
	public static Block purple;
	public static Block blue;
	public static Block pink;
	public static Block lightGray;
	public static Block darkGray;
	public static Block green;
	public static Block black;
	public static Block white;
	
	public static void initializeBlock() {
		tan = new tan(Material.cloth);
		red = new red(Material.cloth);
		orange = new orange(Material.cloth);
		brown = new brown(Material.cloth);
		purple = new purple(Material.cloth);
		blue = new blue(Material.cloth);
		pink = new pink(Material.cloth);
		lightGray = new lightGray(Material.cloth);
		darkGray = new darkGray(Material.cloth);
		green = new green(Material.cloth);
		black = new black(Material.cloth);
		white = new white(Material.cloth);
	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(tan, tan.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red, red.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(orange, orange.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(brown, brown.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(purple, purple.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blue, blue.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(pink, pink.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lightGray, lightGray.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkGray, darkGray.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(green, green.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(black, black.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(white, white.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(tan);
		registerRender(red);
		registerRender(orange);
		registerRender(brown);
		registerRender(purple);
		registerRender(blue);
		registerRender(pink);
		registerRender(lightGray);
		registerRender(darkGray);
		registerRender(green);
		registerRender(black);
		registerRender(white);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
}