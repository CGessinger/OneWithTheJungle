package com.gessinger.onewiththejungle.common.items.armor.cow;

import com.gessinger.onewiththejungle.common.items.armor.FullSetHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class CowArmorTick extends CowArmorItem
{
	private EffectInstance Resistance = new EffectInstance(Effects.RESISTANCE, 0, 0, false, false);

	public CowArmorTick (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		world.getProfiler().startSection("cowArmorTick");
		if (!FullSetHelper.hasFullArmor("cow", player))
			return;

		giveEffect(player);
		world.getProfiler().endSection();
	}

	private void giveEffect(final PlayerEntity player)
	{
		EffectInstance playerEff = player.getActivePotionEffect(Effects.RESISTANCE);
		assert playerEff != null;
		if(playerEff == Resistance && playerEff.getDuration() <= 1)
				Resistance = new EffectInstance(Effects.RESISTANCE, 0, 0, false, false);

		player.addPotionEffect(Resistance);
	}
}
