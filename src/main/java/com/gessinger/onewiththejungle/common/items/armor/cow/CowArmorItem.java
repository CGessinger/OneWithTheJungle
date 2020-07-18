package com.gessinger.onewiththejungle.common.items.armor.cow;

import com.gessinger.onewiththejungle.client.renderer.entity.model.CowArmorModel;
import com.gessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CowArmorItem extends CustomArmorItem
{
	CowArmorModel CowArmorLeggings;
	CowArmorModel CowArmorModel;

	public CowArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		CowArmorLeggings = new CowArmorModel(0.5f);
		CowArmorModel =  new CowArmorModel(1.0f);
	}

	@Override
	public <A extends BipedModel<?>> A getCustomModel(EquipmentSlotType armorSlot)
	{
		if (armorSlot == EquipmentSlotType.LEGS)
			return (A) CowArmorLeggings;

		return (A) CowArmorModel;
	}

	@Override
	public EffectInstance getEffectInstance()
	{
		return new EffectInstance(Effects.RESISTANCE, 0, 0, false, false);
	}

	@Override
	public Class<?> getItemClass()
	{
		return this.getClass();
	}
}
