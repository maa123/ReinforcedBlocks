package net.maa123.ReinforcedBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EGlass extends Block {
	protected int Rcolor = 13421772;

	public EGlass() {
		super(Material.glass);
		setBlockName("blockEGlass");
		setBlockTextureName("glass");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(7.0F);
		setHarvestLevel("pickaxe", 1);
		setResistance(Float.POSITIVE_INFINITY);
		setStepSound(Block.soundTypeStone);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public int getRenderBlockPass() {
		return 0;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderColor(int meta) {
		return Rcolor;
	}

	@SideOnly(Side.CLIENT)
	public int getBlockColor() {
		return Rcolor;
	}

	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess worldIn, int x, int y, int z) {
		return Rcolor;
	}
}