package com.gessinger.onewiththejungle.common.items.armor.pig;

import com.gessinger.onewiththejungle.common.items.armor.FullSetHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class PigArmorTick extends PigArmorItem
{
	private EffectInstance Saturation = new EffectInstance(Effects.SATURATION, 0, 1, false, false);

	public PigArmorTick (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		if (!FullSetHelper.hasFullArmor("pig", player))
			return;

		giveEffect(player);
	}

	private void giveEffect(final PlayerEntity player)
	{
		EffectInstance playerEff = player.getActivePotionEffect(Effects.RESISTANCE);
		assert playerEff != null;
		if(playerEff == Saturation && playerEff.getDuration() <= 1)
			Saturation = new EffectInstance(Effects.RESISTANCE, 0, 1, false, false);

		player.addPotionEffect(Saturation);
	}
}
