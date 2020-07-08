package com.gessinger.onewiththejungle.items.armor;

import com.gessinger.onewiththejungle.effects.PotionEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CustomArmorItem extends ArmorItem
{
	private final String ArmorType;
	private final PotionEffects effect;
	public CustomArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder, String ArmorType, PotionEffects effect)
	{
		super(materialIn, slot, builder);
		this.ArmorType = ArmorType;
		this.effect = effect;
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		if (!hasFullArmor(ArmorType, player))
			return;

		player.addPotionEffect(effect.get());
	}

	private boolean hasFullArmor (String ArmorType, final PlayerEntity player)
	{
		for(ItemStack armor : player.getArmorInventoryList()){
			if (!armor.toString().contains(ArmorType)){
				return false;
			}
		}
		return true;
	}
}
