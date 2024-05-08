package net.okamiz.okasbetterdesert.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.okamiz.okasbetterdesert.OkasBetterDesert;

public class ModBlocks {


    public static final Block CHISELED_SANDSTONE = registerBlock("chiseled_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block BIT_SANDSTONE = registerBlock("bit_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block POLISHED_SANDSTONE = registerBlock("polished_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_TILES = registerBlock("sandstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block TILED_SANDSTONE = registerBlock("tiled_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block BIT_SANDSTONE_PILLAR = registerBlock("bit_sandstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block CHISELED_RED_SANDSTONE = registerBlock("chiseled_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));
    public static final Block BIT_RED_SANDSTONE = registerBlock("bit_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));
    public static final Block TILED_RED_SANDSTONE = registerBlock("tiled_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));

    public static final Block BIT_RED_SANDSTONE_PILLAR = registerBlock("bit_red_sandstone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));

    // --------------






    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(OkasBetterDesert.MOD_ID, name), block);
    }



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(OkasBetterDesert.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(OkasBetterDesert.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        OkasBetterDesert.LOGGER.info("Registering Blocks for " + OkasBetterDesert.MOD_ID);
    }
}
