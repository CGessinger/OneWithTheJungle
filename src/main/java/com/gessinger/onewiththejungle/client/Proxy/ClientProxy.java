package com.gessinger.onewiththejungle.client.Proxy;

import com.gessinger.onewiththejungle.client.renderer.entity.model.CowArmorModel;
import com.gessinger.onewiththejungle.proxy.IProxy;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientProxy implements IProxy
{
	 private final CowArmorModel CowArmorModel = new CowArmorModel(1.0f);
	 private final CowArmorModel CowArmorLeggings = new CowArmorModel(0.5f);

	@Override
	public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {
		modEventBus.addListener(this::clientSetup);
	}

	private void clientSetup(final FMLClientSetupEvent event) {}

	@SuppressWarnings("unchecked")
	public <A extends BipedModel<?>> A getCowArmorModel(EquipmentSlotType armorSlot) {
		return (A) (armorSlot == EquipmentSlotType.LEGS ? CowArmorLeggings : CowArmorModel);
	}
}
