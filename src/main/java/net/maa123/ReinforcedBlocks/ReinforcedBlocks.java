package net.maa123.ReinforcedBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "ReinforcedBlocks", name = "ReinforcedBlocks MOD", version = "1.0.0")
public class ReinforcedBlocks {

	public static Block blockEGlowstone;

	public static Block blockEStone;

	public static Block blockEGlass;

	public static Block blockEDoor;

	public static Block blockELightGlass;

	public static Block blockEShield;

	@EventHandler
	public void perInit(FMLPreInitializationEvent event) {

		blockEGlowstone = new EGlowstone();

		blockEGlass = new EGlass();

		blockEStone = new EStone();

		GameRegistry.registerBlock(blockEGlowstone, "blockEGlowstone");

		GameRegistry.registerBlock(blockEGlass, "blockEGlass");

		GameRegistry.registerBlock(blockEStone, "blockEStone");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(blockEGlowstone),
		"OIO",
		"GSG",
		"OIO",
		'G', Items.gold_ingot,
		'I',Items.iron_ingot,
		'O', Blocks.obsidian,
		'S', Blocks.glowstone);
		GameRegistry.addRecipe(new ItemStack(blockEStone, 3),
		"OIO",
		"SSS",
		"OIO",
		'I',Items.iron_ingot,
		'O', Blocks.obsidian,
		'S', Blocks.stone);
		GameRegistry.addRecipe(new ItemStack(blockEGlass, 3),
		"OIO",
		"GGG",
		"OIO",
		'I',Items.iron_ingot,
		'O', Blocks.obsidian,
		'G', Blocks.glass);
	}

}