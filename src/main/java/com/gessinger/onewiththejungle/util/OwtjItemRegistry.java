package com.gessinger.onewiththejungle.util;

import com.gessinger.onewiththejungle.OneWithTheJungle;
import com.gessinger.onewiththejungle.effects.PotionEffects;
import com.gessinger.onewiththejungle.items.armor.CustomArmorItem;
import com.gessinger.onewiththejungle.items.armor.OwtjArmorTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OwtjItemRegistry
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OneWithTheJungle.MOD_ID);
	private static final Item.Properties PROP_TAB = new Item.Properties().group(OneWithTheJungle.TAB);

	// Armor Item
	/* Cow Armor */
	public static final RegistryObject<ArmorItem> COW_HELMET = ITEMS.register("cow_helmet", () ->
			new CustomArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB, "cow", PotionEffects.Resistance));

	public static final RegistryObject<ArmorItem> COW_CHESTPLATE = ITEMS.register("cow_chestplate", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_LEGGINGS = ITEMS.register("cow_leggings", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_BOOTS = ITEMS.register("cow_boots", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));

	/* Fish Armor */
	public static final RegistryObject<ArmorItem> FISH_HELMET = ITEMS.register("fish_helmet", () ->
			new CustomArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB, "fish", PotionEffects.Water_Breathing));

	public static final RegistryObject<ArmorItem> FISH_CHESTPLATE = ITEMS.register("fish_chestplate", () ->
			new ArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> FISH_LEGGINGS = ITEMS.register("fish_leggings", () ->
			new ArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> FISH_BOOTS = ITEMS.register("fish_boots", () ->
			new ArmorItem(OwtjArmorTier.FISH_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));

	/* Sheep Armor */
	public static final RegistryObject<ArmorItem> SHEEP_HELMET = ITEMS.register("sheep_helmet", () ->
			new CustomArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB, "sheep", PotionEffects.Regeneration));

	public static final RegistryObject<ArmorItem> SHEEP_CHESTPLATE = ITEMS.register("sheep_chestplate", () ->
			new ArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> SHEEP_LEGGINGS = ITEMS.register("sheep_leggings", () ->
			new ArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> SHEEP_BOOTS = ITEMS.register("sheep_boots", () ->
			new ArmorItem(OwtjArmorTier.SHEEP_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));
}
