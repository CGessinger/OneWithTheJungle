package com.gessinger.onewiththejungle.common.items.armor;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class FullSetHelper
{
	public static boolean hasFullArmor (String ArmorType, final PlayerEntity player)
	{
		for(ItemStack armor : player.getArmorInventoryList()){
			if (!armor.toString().contains(ArmorType)){
				return false;
			}
		}
		return true;
	}
}
