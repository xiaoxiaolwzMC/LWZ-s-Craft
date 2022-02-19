package com.lc.lwz.main;

import com.lc.lwz.lib.RefStrings;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, useMetadata = true)

public enum Main {
    INSTANCE;

    @Mod.InstanceFactory
    public static Main getInstance() {
        return INSTANCE;
    }

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
        System.out.println("This is the " + RefStrings.NAME + " Mod!");
    }
}
