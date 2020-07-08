package com.gessinger.onewiththejungle.items.armor;

import com.gessinger.onewiththejungle.OneWithTheJungle;
import com.gessinger.onewiththejungle.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public enum OwtjArmorTier implements IArmorMaterial
{
	COW_MATERIAL("cow_material", 70, new int[] {1, 3, 4, 2}, 15, 1, () -> {
		return Ingredient.fromItems(RegistryHandler.COW_CHESTPLATE.get());
	}),

	FISH_MATERIAL("fish_material", 40, new int[] {1, 2, 3, 1}, 20, 1, () -> {
		return Ingredient.fromItems(RegistryHandler.FISH_CHESTPLATE.get());
	});

	private final int durability;
	private final int[] damageReduction;
	private final int enchantability;
	private final String name;
	private final float thoughness;
	private final Supplier<Ingredient> repairMaterial;

	OwtjArmorTier(String name, int durability, int[] damageReduction, int enchantability, float thoughness, Supplier<Ingredient> repairMaterial) {
		this.durability = durability;
		this.damageReduction = damageReduction;
		this.enchantability = enchantability;
		this.name = OneWithTheJungle.MOD_ID + ":" + name;
		this.thoughness = thoughness;
		this. repairMaterial = repairMaterial;
	}

	@Override
	public int getDurability (EquipmentSlotType slotIn)
	{
		return this.durability;
	}

	@Override
	public int getDamageReductionAmount (EquipmentSlotType slotIn)
	{
		return this.damageReduction[slotIn.getIndex()];
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
		return this.repairMaterial.get();
	}

	@Override
	public String getName ()
	{
		return this.name;
	}

	@Override
	public float getToughness ()
	{
		return this.thoughness;
	}
}
