package com.gessinger.onewiththejungle.common.items.armor.rabbit;

import com.gessinger.onewiththejungle.client.renderer.entity.model.RabbitArmorModel;
import com.gessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RabbitArmorItem extends CustomArmorItem
{
	RabbitArmorModel RabbitArmorLeggings;
	RabbitArmorModel RabbitArmorModel;

	public RabbitArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		RabbitArmorLeggings = new RabbitArmorModel(0.5f);
		RabbitArmorModel =  new RabbitArmorModel(1.0f);
	}

	@Override
	public <A extends BipedModel<?>> A getCustomModel(EquipmentSlotType armorSlot)
	{
		if (armorSlot == EquipmentSlotType.LEGS)
			return (A) RabbitArmorLeggings;

		return (A) RabbitArmorModel;
	}

	@Override
	public EffectInstance getEffectInstance()
	{
		return new EffectInstance(Effects.JUMP_BOOST, 0, 1, false, false);
	}

	@Override
	public Class getItemClass()
	{
		return this.getClass();
	}
}
