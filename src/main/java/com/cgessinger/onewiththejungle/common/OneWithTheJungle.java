package com.cgessinger.onewiththejungle.common;

import com.cgessinger.onewiththejungle.client.Proxy.ClientProxy;
import com.cgessinger.onewiththejungle.common.server.ServerProxy;
import com.cgessinger.onewiththejungle.common.util.OwtjItemRegistry;
import com.cgessinger.onewiththejungle.proxy.IProxy;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("owtj")
public class OneWithTheJungle
{
    public static final String MOD_ID = "owtj";

    public static final IProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public OneWithTheJungle() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(),
                forgeEventBus = MinecraftForge.EVENT_BUS;

        PROXY.setup(modEventBus, forgeEventBus);

        // Register the setup method for modloading
        modEventBus.addListener(this::setup);
        // Register the doClientStuff method for modloading
        modEventBus.addListener(this::doClientStuff);
        // Register Armor Items
        OwtjItemRegistry.ITEMS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }

    public static final ItemGroup TAB = new ItemGroup("owtjTab")
    {
        @Override
        public ItemStack createIcon ()
        {
            return new ItemStack(OwtjItemRegistry.COW_CHESTPLATE.get());
        }
    };
}
