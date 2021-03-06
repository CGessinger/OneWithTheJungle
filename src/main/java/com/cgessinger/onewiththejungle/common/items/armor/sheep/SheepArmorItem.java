package com.cgessinger.onewiththejungle.common.items.armor.sheep;

import com.cgessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SheepArmorItem extends CustomArmorItem
{
	public SheepArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public <A extends BipedModel<?>> A getCustomModel(EquipmentSlotType armorSlot)
	{
		return null;
	}

	@Override
	public EffectInstance getEffectInstance()
	{
		return new EffectInstance(Effects.REGENERATION, 0, 0, false, false, false);
	}

	@Override
	public Class getItemClass()
	{
		return this.getClass();
	}
}
