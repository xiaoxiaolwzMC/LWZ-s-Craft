package com.lc.lwz.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name, String modid) {
        this.setRegistryName(modid + ":" + name);
        this.setUnlocalizedName(modid + "." + name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
