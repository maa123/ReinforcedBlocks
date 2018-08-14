package net.maa123.ReinforcedBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EDoorItem extends ItemDoor {

    protected int Rcolor = 4342338;

    public EDoorItem() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabBlock);
        setUnlocalizedName("EDoorItem");
        setTextureName("door_iron");//アイコンは今度かく
        setMaxStackSize(64);
    }

    @Override
    public boolean onItemUse(ItemStack itemst, EntityPlayer ePlayer, World worldln, int x, int y, int z, int side, float p, float q, float r) {
        if (side != 1) {
            return false;
        }
        y = y + 1;
        if (ePlayer.canPlayerEdit(x, y, z, side, itemst) && ePlayer.canPlayerEdit(x, y + 1, z, side, itemst)) {
            if (!ReinforcedBlocks.blockEDoor.canPlaceBlockAt(worldln, x, y, z)) {
                return false;
            }
            placeDoorBlock(worldln, x, y, z, (int) (((ePlayer.rotationYaw + 180) / 90) - 0.5) % 4, ReinforcedBlocks.blockEDoor);// 何故かこうすると動く
            itemst.stackSize = itemst.stackSize - 1;
            return true;
        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int meta) {
        return Rcolor;
    }
}