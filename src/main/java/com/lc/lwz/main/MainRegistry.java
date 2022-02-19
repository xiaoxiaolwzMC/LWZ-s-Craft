package com.lc.lwz.main;

import com.lc.lwz.items.FirstItem;
import com.lc.lwz.lib.RefStrings;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = RefStrings.MODID)

public class MainRegistry {

    public static Item firstItem = new FirstItem("first_item", RefStrings.MODID);

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                firstItem
        );
    }
}
