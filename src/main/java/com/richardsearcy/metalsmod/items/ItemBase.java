package com.richardsearcy.metalsmod.items;

import com.richardsearcy.metalsmod.Main;
import com.richardsearcy.metalsmod.init.ModItems;
import com.richardsearcy.metalsmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
