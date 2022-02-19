package com.lc.lwz.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class FirstItem extends Item {
    public FirstItem(String name, String modid) {
        this.setRegistryName(modid + ":" + name);
        this.setUnlocalizedName(modid + "." + name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
