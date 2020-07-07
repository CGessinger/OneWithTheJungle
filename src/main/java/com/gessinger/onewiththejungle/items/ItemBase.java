package com.gessinger.onewiththejungle.items;

import com.gessinger.onewiththejungle.OneWithTheJungle;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(OneWithTheJungle.TAB));
    }
}
