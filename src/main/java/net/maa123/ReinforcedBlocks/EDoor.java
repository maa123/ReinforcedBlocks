package net.maa123.ReinforcedBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EDoor extends BlockDoor {

    protected int Rcolor = 4342338;

    public EDoor() {
        super(Material.rock);
        setBlockName("blockEDoor");
        setBlockTextureName("door_iron");
        disableStats();
        setHardness(8.0F);
        setHarvestLevel("pickaxe", 2);
        setResistance(Float.POSITIVE_INFINITY);
        setStepSound(Block.soundTypePiston);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderColor(int meta) {
        return Rcolor;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public int getBlockColor() {
        return Rcolor;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int colorMultiplier(IBlockAccess worldIn, int x, int y, int z) {
        return Rcolor;
    }
    @Override
    public Item getItemDropped(int meta, Random random, int fortune){
        return (meta & 8) != 0 ? null : ReinforcedBlocks.itemEDoor;
    }
    @Override
    public Item getItem(World worldIn, int x, int y, int z){
        return ReinforcedBlocks.itemEDoor;
    }
}