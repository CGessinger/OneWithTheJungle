package com.gessinger.onewiththejungle.common.items.armor.sheep;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class SheepArmorItem extends ArmorItem
{
	public SheepArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		return null;
		//return OneWithTheJungle.PROXY instanceof ClientProxy ? ((ClientProxy) OneWithTheJungle.PROXY).get...ArmorModel(armorSlot) : null;
	}
}
