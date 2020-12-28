package com.cgessinger.onewiththejungle.common.items.armor.squid;

import com.cgessinger.onewiththejungle.client.renderer.entity.model.SquidArmorModel;
import com.cgessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SquidArmorItem extends CustomArmorItem
{
	SquidArmorModel SquidArmorLeggings;
	SquidArmorModel SquidArmorModel;

	public SquidArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		SquidArmorLeggings = new SquidArmorModel(0.5F);
		SquidArmorModel = new SquidArmorModel(1.0F);
	}

	@Override
	public <A extends BipedModel<?>> A getCustomModel(EquipmentSlotType armorSlot)
	{
		if (armorSlot == EquipmentSlotType.LEGS)
			return (A) SquidArmorLeggings;

		return (A) SquidArmorModel;
	}

	@Override
	public EffectInstance getEffectInstance()
	{
		return new EffectInstance(Effects.CONDUIT_POWER, 0, 0, false, false);
	}

	@Override
	public Class<?> getItemClass()
	{
		return this.getClass();
	}
}
