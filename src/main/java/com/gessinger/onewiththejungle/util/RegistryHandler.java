package com.gessinger.onewiththejungle.util;

import com.gessinger.onewiththejungle.OneWithTheJungle;
import com.gessinger.onewiththejungle.items.ItemBase;
import com.gessinger.onewiththejungle.items.armor.OwtjArmorTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OneWithTheJungle.MOD_ID);

	public static void init ()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	// Armor Item
	public static final RegistryObject<ArmorItem> COW_HELMET = ITEMS.register("cow_helmet", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(OneWithTheJungle.TAB)));

	public static final RegistryObject<ArmorItem> COW_CHESTPLATE = ITEMS.register("cow_chestplate", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(OneWithTheJungle.TAB)));

	public static final RegistryObject<ArmorItem> COW_LEGGINGS = ITEMS.register("cow_leggins", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(OneWithTheJungle.TAB)));

	public static final RegistryObject<ArmorItem> COW_BOOTS = ITEMS.register("cow_boots", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(OneWithTheJungle.TAB)));
}
