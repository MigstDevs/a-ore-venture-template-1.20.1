package net.migstmc.aoreventure;

import net.fabricmc.api.ModInitializer;

import net.migstmc.aoreventure.item.ModItemGroups;
import net.migstmc.aoreventure.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AOreVenture implements ModInitializer {
	public static final String MOD_ID = "aoreventure";
	public static final Logger LOGGER = LoggerFactory.getLogger("aoreventure");

	@Override
	public void onInitialize() {
		LOGGER.info("Calm down, it happens <3");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}