package com.gessinger.onewiththejungle.proxy;

import net.minecraftforge.eventbus.api.IEventBus;

public interface IProxy
{
	void setup(IEventBus modEventBus, IEventBus forgeEventBus);
}
