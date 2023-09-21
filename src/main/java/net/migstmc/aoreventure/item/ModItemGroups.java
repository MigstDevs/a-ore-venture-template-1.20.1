package net.migstmc.aoreventure.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.migstmc.aoreventure.AOreVenture;
import net.migstmc.aoreventure.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NEW_ORES_GROUPS = Registry.register(Registries.ITEM_GROUP, new Identifier(AOreVenture.MOD_ID, "newores"), FabricItemGroup.builder().displayName(Text.translatable("ItemGroup.new_ores")).icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {entries.add(ModItems.RUBY);entries.add(ModItems.RAW_RUBY);}).build());
    public static void registerItemGroups() {
        AOreVenture.LOGGER.info("Registering Item Group for" + AOreVenture.MOD_ID);
    }
    public static final ItemGroup NEW_BLOCKS_GROUPS = Registry.register(Registries.ITEM_GROUP, new Identifier(AOreVenture.MOD_ID, "newblocks"), FabricItemGroup.builder().displayName(Text.translatable("ItemGroup.new_blocks")).icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)).entries((displayContext, entries) -> {entries.add(ModBlocks.RUBY_BLOCK);entries.add(ModBlocks.RAW_RUBY_BLOCK);entries.add(ModBlocks.RUBY_ORE);}).build());
    public static final ItemGroup OTHER_STUFF = Registry.register(Registries.ITEM_GROUP, new Identifier(AOreVenture.MOD_ID, "other_stuff"), FabricItemGroup.builder().displayName(Text.translatable("ItemGroup.other_stuff")).icon(() -> new ItemStack(ModItems.NEW_ORES_DETECTOR)).entries((displayContext, entries) -> {entries.add(ModItems.NEW_ORES_DETECTOR);entries.add(ModBlocks.TROLL_BLOCK);}).build());
}
