package dev.exactus.modprueba;

import dev.exactus.modprueba.items.ModItemGroups;
import dev.exactus.modprueba.items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;


import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModPrueba implements ModInitializer {
	public static final String MOD_ID = "modprueba";


	public static final Logger LOGGER = LoggerFactory.getLogger("ModItems");

	public static MinecraftServer SERVER = null;

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModItemGroups.registerItemGroups();

		ServerLifecycleEvents.SERVER_STARTING.register(server -> SERVER = server);
		ServerLifecycleEvents.SERVER_STOPPING.register(server -> SERVER = null);

		LOGGER.info("Hello Fabric world!");
	}


}
