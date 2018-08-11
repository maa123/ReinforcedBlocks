package net.maa123.ReinforcedBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EStone extends Block {

    protected int Rcolor = 13421772;

    public EStone() {
        super(Material.rock);
        setBlockName("blockEStone");
        setBlockTextureName("stone");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(8.0F);
        setHarvestLevel("pickaxe", 2);
        setResistance(Float.POSITIVE_INFINITY);
        setStepSound(Block.soundTypePiston);
        setLightLevel(0.0F);
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