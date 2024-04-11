package com.kum.item;

import com.kum.KumMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems{
    public static final Item Kum_Food = registerItem("kum_food", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(KumMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        KumMod.LOGGER.info("Registering Mod items for " + KumMod.MOD_ID);
    }
}
