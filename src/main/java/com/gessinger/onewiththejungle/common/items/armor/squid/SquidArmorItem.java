package com.gessinger.onewiththejungle.common.items.armor.squid;

import com.gessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SquidArmorItem extends CustomArmorItem
{
	public SquidArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
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
		return new EffectInstance(Effects.CONDUIT_POWER, 0, 0, false, false);
	}

	@Override
	public Class<?> getItemClass()
	{
		return this.getClass();
	}
}
