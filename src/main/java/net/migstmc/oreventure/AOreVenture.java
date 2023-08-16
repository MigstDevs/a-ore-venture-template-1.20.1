package net.migstmc.oreventure;

import net.fabricmc.api.ModInitializer;

import net.migstmc.oreventure.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AOreVenture implements ModInitializer {
	public static final String MOD_ID = "aoreventure";
	public static final Logger LOGGER = LoggerFactory.getLogger("a-ore-venture");

	@Override
	public void onInitialize() {
		LOGGER.info("Calm down, it happens <3");
		ModItems.registerModItems();
	}
}