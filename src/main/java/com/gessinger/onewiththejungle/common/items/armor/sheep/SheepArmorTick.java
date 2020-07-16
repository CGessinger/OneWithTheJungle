package com.gessinger.onewiththejungle.common.items.armor.sheep;

import com.gessinger.onewiththejungle.common.effects.PotionEffects;
import com.gessinger.onewiththejungle.common.items.armor.FullSetHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SheepArmorTick extends SheepArmorItem
{
	public SheepArmorTick (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		if (!FullSetHelper.hasFullArmor("sheep", player))
			return;

		player.addPotionEffect(PotionEffects.Regeneration.get());
	}
}
