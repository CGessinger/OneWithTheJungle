package com.cgessinger.onewiththejungle.client.Proxy;

import com.cgessinger.onewiththejungle.client.renderer.entity.model.CowArmorModel;
import com.cgessinger.onewiththejungle.proxy.IProxy;
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
}
