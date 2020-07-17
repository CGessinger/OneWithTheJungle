package com.gessinger.onewiththejungle.common.items.armor.pig;

import com.gessinger.onewiththejungle.common.effects.PotionEffects;
import com.gessinger.onewiththejungle.common.items.armor.FullSetHelper;
import com.gessinger.onewiththejungle.common.items.armor.sheep.SheepArmorItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PigArmorTick extends SheepArmorItem
{
	public PigArmorTick (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		if (!FullSetHelper.hasFullArmor("pig", player))
			return;

		player.addPotionEffect(PotionEffects.Saturation.get());
	}
}
