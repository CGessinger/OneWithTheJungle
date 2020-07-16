package com.gessinger.onewiththejungle.client.Proxy;

import com.gessinger.onewiththejungle.proxy.IProxy;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientProxy implements IProxy
{
	/*
	Insert something like:
	 private final [model name] ...ArmorModel = new [model name](1.0f);
	 private final [model name] ...ArmorLeggings = new [model name](0.5f);
	*/

	@Override
	public void setup(IEventBus modEventBus, IEventBus forgeEventBus) {
		modEventBus.addListener(this::clientSetup);
	}

	private void clientSetup(final FMLClientSetupEvent event) {}

	/*
	Insert Something like:
	@SuppressWarnings("unchecked")
	public <A extends BipedModel<?>> A get...ArmorModel(EquipmentSlotType armorSlot) {
		return (A) (armorSlot == EquipmentSlotType.LEGS ? ...ArmorLeggings : ...ArmorModel);
	}
	 */
}
