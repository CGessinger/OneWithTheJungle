package com.gessinger.onewiththejungle.items.armor;

import com.gessinger.onewiththejungle.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public enum OwtjArmorTier implements IArmorMaterial
{
	COW_MATERIAL("cow_material", 55, 1, 15, 0, () -> {
		return Ingredient.fromItems(RegistryHandler.COW_CHESTPLATE.get());
	});

	private final int durability;
	private final int damageReduction;
	private final int enchantability;
	private final String name;
	private final float thoughness;
	private final Supplier<Ingredient> repairMaterial;

	OwtjArmorTier(String name, int durability, int damageReduction, int enchantability, float thoughness, Supplier<Ingredient> repairMaterial) {
		this.durability = durability;
		this.damageReduction = damageReduction;
		this.enchantability = enchantability;
		this.name = name;
		this.thoughness = thoughness;
		this. repairMaterial = repairMaterial;
	}

	@Override
	public int getDurability (EquipmentSlotType slotIn)
	{
		return durability;
	}

	@Override
	public int getDamageReductionAmount (EquipmentSlotType slotIn)
	{
		return damageReduction;
	}

	@Override
	public int getEnchantability ()
	{
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent ()
	{
		return null;
	}

	@Override
	public Ingredient getRepairMaterial ()
	{
		return repairMaterial.get();
	}

	@Override
	public String getName ()
	{
		return name;
	}

	@Override
	public float getToughness ()
	{
		return thoughness;
	}
}
