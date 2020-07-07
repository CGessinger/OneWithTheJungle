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
	public static final RegistryObject<ArmorItem> COW_CHESTPLATE = ITEMS.register("cow_chestplate", () ->
			new ArmorItem(OwtjArmorTier.COW_MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
}
