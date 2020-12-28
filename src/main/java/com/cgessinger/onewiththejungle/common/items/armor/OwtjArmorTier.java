package com.cgessinger.onewiththejungle.common.items.armor;

import com.cgessinger.onewiththejungle.common.OneWithTheJungle;
import com.cgessinger.onewiththejungle.common.util.OwtjItemRegistry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public enum OwtjArmorTier implements IArmorMaterial
{
	COW_MATERIAL("cow_material", 70, new int[] {1, 3, 4, 2}, 15, 1, 0.3F, () -> {
		return Ingredient.fromItems(OwtjItemRegistry.COW_CHESTPLATE.get());
	}),

	SHEEP_MATERIAL("sheep_material", 70, new int[] {1, 3, 4, 2}, 15, 0, 0.1F, () -> {
		return Ingredient.fromItems(OwtjItemRegistry.SHEEP_CHESTPLATE.get());
	}),

	FISH_MATERIAL("fish_material", 80, new int[] {1, 2, 3, 1}, 20, 1,0F, () -> {
		return Ingredient.fromItems(OwtjItemRegistry.FISH_CHESTPLATE.get());
	}),

	CHICKEN_MATERIAL("fish_material", 50, new int[] {1, 2, 3, 1}, 30, 0, 0F, () -> {
		return Ingredient.fromItems(OwtjItemRegistry.CHICKEN_CHESTPLATE.get());
	}),

	PIG_MATERIAL("pig_material", 60, new int[] {1, 2, 3, 1}, 10, 1, 0.4F, () -> {
		return Ingredient.fromItems(OwtjItemRegistry.PIG_CHESTPLATE.get());
	}),

	SQUID_MATERIAL("squid_material", 50, new int[] {1, 2, 3, 1}, 22, 0, 0F, () -> {
	return Ingredient.fromItems(OwtjItemRegistry.SQUID_CHESTPLATE.get());
	}),

	RABBIT_MATERIAL("rabbit_material", 80, new int[] {1, 2, 3, 1}, 10, 1, 0F, () -> {
		return Ingredient.fromItems(OwtjItemRegistry.RABBIT_CHESTPLATE.get());
	}),

	PARROT_MATERIAL("rabbit_material", 80, new int[] {1, 2, 3, 1}, 10, 1, 0F, () -> {
	return Ingredient.fromItems(OwtjItemRegistry.PARROT_CHESTPLATE.get());
});

	private final int durability;
	private final int[] damageReduction;
	private final int enchantability;
	private final String name;
	private final float thoughness;
	private final Supplier<Ingredient> repairMaterial;
	private final float knockbackResitance;

	OwtjArmorTier(String name, int durability, int[] damageReduction, int enchantability, float thoughness, float knockbackResitance, Supplier<Ingredient> repairMaterial) {
		this.durability = durability;
		this.damageReduction = damageReduction;
		this.enchantability = enchantability;
		this.name = OneWithTheJungle.MOD_ID + ":" + name;
		this.thoughness = thoughness;
		this.repairMaterial = repairMaterial;
		this.knockbackResitance = knockbackResitance;
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

	@Override
	public float getKnockbackResistance ()
	{
		return this.knockbackResitance;
	}
}
