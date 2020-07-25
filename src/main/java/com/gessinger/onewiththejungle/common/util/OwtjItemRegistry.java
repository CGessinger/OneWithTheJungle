package com.gessinger.onewiththejungle.common.util;

import com.gessinger.onewiththejungle.common.OneWithTheJungle;
import com.gessinger.onewiththejungle.common.items.armor.*;
import com.gessinger.onewiththejungle.common.items.armor.chicken.ChickenArmorItem;
import com.gessinger.onewiththejungle.common.items.armor.cow.CowArmorItem;
import com.gessinger.onewiththejungle.common.items.armor.fish.FishArmorItem;
import com.gessinger.onewiththejungle.common.items.armor.pig.PigArmorItem;
import com.gessinger.onewiththejungle.common.items.armor.sheep.SheepArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OwtjItemRegistry
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OneWithTheJungle.MOD_ID);
	private static final Item.Properties PROP_TAB = new Item.Properties().group(OneWithTheJungle.TAB);

	// Armor Item
	/* Cow Armor */
	public static final RegistryObject<ArmorItem> COW_HELMET = ITEMS.register("cow_helmet", () ->
			new CowArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_CHESTPLATE = ITEMS.register("cow_chestplate", () ->
			new CowArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_LEGGINGS = ITEMS.register("cow_leggings", () ->
			new CowArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_BOOTS = ITEMS.register("cow_boots", () ->
			new CowArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));

	/* Fish Armor */
	public static final RegistryObject<ArmorItem> FISH_HELMET = ITEMS.register("fish_helmet", () ->
			new FishArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB));

	public static final RegistryObject<ArmorItem> FISH_CHESTPLATE = ITEMS.register("fish_chestplate", () ->
			new FishArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> FISH_LEGGINGS = ITEMS.register("fish_leggings", () ->
			new FishArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> FISH_BOOTS = ITEMS.register("fish_boots", () ->
			new FishArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));

	/* Sheep Armor */
	public static final RegistryObject<ArmorItem> SHEEP_HELMET = ITEMS.register("sheep_helmet", () ->
			new SheepArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB));

	public static final RegistryObject<ArmorItem> SHEEP_CHESTPLATE = ITEMS.register("sheep_chestplate", () ->
			new SheepArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> SHEEP_LEGGINGS = ITEMS.register("sheep_leggings", () ->
			new SheepArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> SHEEP_BOOTS = ITEMS.register("sheep_boots", () ->
			new SheepArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));

	/* Pig Armor */
	public static final RegistryObject<ArmorItem> PIG_HELMET = ITEMS.register("pig_helmet", () ->
			new PigArmorItem(OwtjArmorTier.PIG_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB));

	public static final RegistryObject<ArmorItem> PIG_CHESTPLATE = ITEMS.register("pig_chestplate", () ->
			new PigArmorItem(OwtjArmorTier.PIG_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> PIG_LEGGINGS = ITEMS.register("pig_leggings", () ->
			new PigArmorItem(OwtjArmorTier.PIG_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> PIG_BOOTS = ITEMS.register("pig_boots", () ->
			new PigArmorItem(OwtjArmorTier.PIG_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));

	/* Chicken Armor */
	public static final RegistryObject<ArmorItem> CHICKEN_HELMET = ITEMS.register("chicken_helmet", () ->
			new ChickenArmorItem(OwtjArmorTier.CHICKEN_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB));

	public static final RegistryObject<ArmorItem> CHICKEN_CHESTPLATE = ITEMS.register("chicken_chestplate", () ->
			new ChickenArmorItem(OwtjArmorTier.CHICKEN_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> CHICKEN_LEGGINGS = ITEMS.register("chicken_leggings", () ->
			new ChickenArmorItem(OwtjArmorTier.CHICKEN_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> CHICKEN_BOOTS = ITEMS.register("chicken_boots", () ->
			new ChickenArmorItem(OwtjArmorTier.CHICKEN_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));
}
