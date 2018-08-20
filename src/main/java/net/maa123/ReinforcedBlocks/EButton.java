package net.maa123.ReinforcedBlocks;

import net.minecraft.block.BlockButton;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EButton extends BlockButton {

    protected int Rcolor = 13421772;

    public EButton() {
        super(false);
        setBlockName("blockEButton");
        setBlockTextureName("stone");
        setCreativeTab(CreativeTabs.tabRedstone);
        setHardness(5.0F);
        setResistance(Float.POSITIVE_INFINITY);
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

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return Blocks.stone.getBlockTextureFromSide(1);
    }
}