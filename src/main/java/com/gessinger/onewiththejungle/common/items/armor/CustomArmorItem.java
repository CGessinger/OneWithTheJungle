package com.gessinger.onewiththejungle.common.items.armor;

import com.gessinger.onewiththejungle.client.Proxy.ClientProxy;
import com.gessinger.onewiththejungle.common.OneWithTheJungle;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public abstract class CustomArmorItem extends ArmorItem
{
	private EffectInstance armorEffect;
	private Effect armorEffectType;
	private boolean isTickSlot;
	public CustomArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		this.armorEffect = getEffectInstance();
		this.armorEffectType = armorEffect.getPotion();
		this.isTickSlot = slot == EquipmentSlotType.FEET;
	}

	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		boolean isProxy = OneWithTheJungle.PROXY instanceof ClientProxy;
		if (!isProxy)
			return _default;
		return getCustomModel(armorSlot);
	}

	abstract public <A extends BipedModel<?>> A getCustomModel(EquipmentSlotType armorSlot);

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		world.getProfiler().startSection(getItemClass().toString());
		if (!isTickSlot || !hasFullArmor(getItemClass(), player))
		{
			world.getProfiler().endSection();
			return;
		}

		giveEffect(player);
		world.getProfiler().endSection();
	}

	abstract public EffectInstance getEffectInstance();

	abstract public Class getItemClass();

	private void giveEffect(final PlayerEntity player)
	{
		EffectInstance playerEff = player.getActivePotionEffect(this.armorEffectType);
		if (playerEff == null)
			player.addPotionEffect(this.armorEffect);
		else if (playerEff.getAmplifier() > 1 && playerEff.getDuration() <= 1)
		{
			System.out.println("Create new effect instance");
			this.armorEffect = getEffectInstance();
			player.addPotionEffect(this.armorEffect);
		}
	}

	private static boolean hasFullArmor (final Class ArmorType, final PlayerEntity player)
	{
		for(ItemStack armor : player.getArmorInventoryList()){
			if (armor.getItem().getClass() != ArmorType){
				return false;
			}
		}
		return true;
	}
}
