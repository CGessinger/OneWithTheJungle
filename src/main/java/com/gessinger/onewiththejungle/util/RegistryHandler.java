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

public class RegistryHandler
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OneWithTheJungle.MOD_ID);
	private static final Item.Properties PROP_TAB = new Item.Properties().group(OneWithTheJungle.TAB);

	public static void init ()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	// Armor Item
	public static final RegistryObject<ArmorItem> COW_HELMET = ITEMS.register("cow_helmet", () ->
			new CustomArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.HEAD, PROP_TAB, "cow", PotionEffects.Resistance));

	public static final RegistryObject<ArmorItem> COW_CHESTPLATE = ITEMS.register("cow_chestplate", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.CHEST, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_LEGGINGS = ITEMS.register("cow_leggings", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.LEGS, PROP_TAB));

	public static final RegistryObject<ArmorItem> COW_BOOTS = ITEMS.register("cow_boots", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.FEET, PROP_TAB));
}
