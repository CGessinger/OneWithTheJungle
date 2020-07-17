package com.gessinger.onewiththejungle.common.items.armor.fish;

import com.gessinger.onewiththejungle.common.items.armor.FullSetHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class FishArmorTick extends FishArmorItem
{
	private EffectInstance Water_Breathing = new EffectInstance(Effects.WATER_BREATHING, 0, 0, false, false, false);

	public FishArmorTick (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		if (!FullSetHelper.hasFullArmor("fish", player))
			return;

		giveEffect(player);
	}

	private void giveEffect(final PlayerEntity player)
	{
		EffectInstance playerEff = player.getActivePotionEffect(Effects.RESISTANCE);
		assert playerEff != null;
		if(playerEff == Water_Breathing && playerEff.getDuration() <= 1)
			Water_Breathing = new EffectInstance(Effects.RESISTANCE, 0, 0, false, false);

		player.addPotionEffect(Water_Breathing);
	}
}
