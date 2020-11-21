package com.gessinger.onewiththejungle.common.items.armor.parrot;

import com.gessinger.onewiththejungle.common.items.armor.CustomArmorItem;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ParrotArmorItem extends CustomArmorItem
{
	public ParrotArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public void onArmorTick (ItemStack stack, World world, PlayerEntity player)
	{
		world.getProfiler().startSection(this.getClass().toString());
		if (this.slot == EquipmentSlotType.FEET)
		{
			if(super.hasFullArmor(this.getClass(), player))
			{
				giveEffect(player);
				player.abilities.allowFlying = true;
				player.sendPlayerAbilities();
			} else
			{
				player.abilities.allowFlying = false;
				player.sendPlayerAbilities();
			}
		}

		world.getProfiler().endSection();
	}

	@Override
	public <A extends BipedModel<?>> A getCustomModel (EquipmentSlotType armorSlot)
	{
		return null;
	}

	@Override
	public EffectInstance getEffectInstance ()
	{
		return new EffectInstance(Effects.MINING_FATIGUE, 0, 4, false, false);
	}

	@Override
	public Class<?> getItemClass ()
	{
		return this.getClass();
	}
}
