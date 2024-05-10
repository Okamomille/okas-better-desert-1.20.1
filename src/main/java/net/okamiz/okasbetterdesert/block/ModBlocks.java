package net.okamiz.okasbetterdesert.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.okamiz.okasbetterdesert.OkasBetterDesert;
import net.okamiz.okasbetterdesert.block.custom.ModTrapdoorBlock;
import net.okamiz.okasbetterdesert.block.custom.SmallCactusBlock;

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
    public static final Block BLACK_ROYAL_WOOL = registerBlock("black_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block BLUE_ROYAL_WOOL = registerBlock("blue_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block BROWN_ROYAL_WOOL = registerBlock("brown_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block CYAN_ROYAL_WOOL = registerBlock("cyan_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block GRAY_ROYAL_WOOL = registerBlock("gray_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block GREEN_ROYAL_WOOL = registerBlock("green_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block LIGHT_BLUE_ROYAL_WOOL = registerBlock("light_blue_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block LIGHT_GRAY_ROYAL_WOOL = registerBlock("light_gray_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block LIME_ROYAL_WOOL = registerBlock("lime_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block MAGENTA_ROYAL_WOOL = registerBlock("magenta_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block ORANGE_ROYAL_WOOL = registerBlock("orange_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block PINK_ROYAL_WOOL = registerBlock("pink_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block PURPLE_ROYAL_WOOL = registerBlock("purple_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block RED_ROYAL_WOOL = registerBlock("red_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block WHITE_ROYAL_WOOL = registerBlock("white_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block YELLOW_ROYAL_WOOL = registerBlock("yellow_royal_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));






    // --------------

    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block CACTUS_STAIRS = registerBlock("cactus_stairs",
            new StairsBlock(ModBlocks.CACTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CACTUS_PLANKS)));
    public static final Block CACTUS_SLAB = registerBlock("cactus_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CACTUS_PLANKS)));

    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR),BlockSetType.BAMBOO));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_TRAPDOOR),BlockSetType.BAMBOO));


    public static final Block TINY_CACTUS = registerBlock("tiny_cactus",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.FERN).nonOpaque().noCollision()));

    public static final Block SMALL_CACTUS = registerBlock("small_cactus",
            new SmallCactusBlock(FabricBlockSettings.copyOf(Blocks.CACTUS).nonOpaque().noCollision()));


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
