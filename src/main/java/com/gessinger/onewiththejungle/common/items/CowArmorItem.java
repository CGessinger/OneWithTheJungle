package com.gessinger.onewiththejungle.common.items;

import com.gessinger.onewiththejungle.client.Proxy.ClientProxy;
import com.gessinger.onewiththejungle.common.OneWithTheJungle;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class CowArmorItem extends ArmorItem
{
	public CowArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	/*
	Add something like:
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		return OneWithTheJungle.PROXY instanceof ClientProxy ? ((ClientProxy) OneWithTheJungle.PROXY).get...ArmorModel(armorSlot) : null;
	}
	 */
}
