package com.kum.item;

import com.kum.KumMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final String GROUPS_TAB_NAME = "KumMod";

    public static final ItemGroup KUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KumMod.MOD_ID, "kum"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUPS_TAB_NAME))
                    .icon(() -> new ItemStack(ModItems.Kum_Food))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Kum_Food);
                    }).build());

    // Register Mod Item Groups

    public static final void registerModItemGroups() {
        KumMod.LOGGER.info("Registering Mod Item Group for " + KumMod.MOD_ID);
    }
}
