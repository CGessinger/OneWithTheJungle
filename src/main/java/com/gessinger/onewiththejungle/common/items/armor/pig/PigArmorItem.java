package com.gessinger.onewiththejungle.common.items.armor.pig;

import com.gessinger.onewiththejungle.client.renderer.entity.model.PigArmorModel;
import com.gessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PigArmorItem extends CustomArmorItem
{
	PigArmorModel PigArmorLeggings;
	PigArmorModel PigArmor;

	public PigArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		PigArmorLeggings = new PigArmorModel(0.5F);
		PigArmor = new PigArmorModel(1.0F);
	}

	@Override
	public <A extends BipedModel<?>> A getCustomModel(EquipmentSlotType armorSlot)
	{
		if (armorSlot == EquipmentSlotType.LEGS)
			return (A) PigArmorLeggings;

		return (A) PigArmor;
	}

	@Override
	public EffectInstance getEffectInstance()
	{
		return new EffectInstance(Effects.SATURATION, 0, 1, false, false);
	}

	@Override
	public Class getItemClass()
	{
		return this.getClass();
	}
}
