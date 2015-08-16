package com.syntthetix.item;

import com.syntthetix.lib.RefStrings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PixelItems {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item icon;
	
	public static void initializeItem() {
		icon = new Item().setUnlocalizedName("icon");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(icon, icon.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(icon);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
	
}
