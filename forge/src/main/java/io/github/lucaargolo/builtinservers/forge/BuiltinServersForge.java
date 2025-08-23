package io.github.lucaargolo.builtinservers.forge;

import io.github.lucaargolo.builtinservers.BuiltinServers;
import net.minecraft.client.MinecraftClient;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(BuiltinServers.MODID)
@Mod.EventBusSubscriber(modid = BuiltinServers.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BuiltinServersForge {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        BuiltinServers.initializeClient(FMLPaths.CONFIGDIR.get(), null);
        BuiltinServers.onClientStarted(MinecraftClient.getInstance());
    }
}
