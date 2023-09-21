package net.migstmc.aoreventure.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.migstmc.aoreventure.AOreVenture;
import net.migstmc.aoreventure.block.custom.TheTrollBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3.3f), UniformIntProvider.create(20, 50)));

    public static final Block TROLL_BLOCK = registerBlock("the_troll_block", new TheTrollBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    private static Block registerBlock(String name,Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AOreVenture.MOD_ID, name),block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AOreVenture.MOD_ID, name),new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        AOreVenture.LOGGER.info("Registering mod blocks for" + AOreVenture.MOD_ID);
    }
}
