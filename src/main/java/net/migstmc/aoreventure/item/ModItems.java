package net.migstmc.aoreventure.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.migstmc.aoreventure.AOreVenture;
import net.migstmc.aoreventure.item.custom.NewOresDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = (registerItem("ruby", new Item(new FabricItemSettings())));
    public static final Item RAW_RUBY = (registerItem("raw_ruby", new Item(new FabricItemSettings())));
    public static final Item NEW_ORES_DETECTOR = (registerItem("new_ores_detector", new NewOresDetectorItem(new FabricItemSettings().maxDamage(210))));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AOreVenture.MOD_ID, name), item);
    }

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }
    public static void registerModItems() {
        AOreVenture.LOGGER.info("Register Mod Items for" + AOreVenture.MOD_ID);
    }
}
