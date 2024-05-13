package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.okamiz.okasbetterdesert.block.ModBlocks;
import net.okamiz.okasbetterdesert.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCULPTED_TERRACOTTA);

        BlockStateModelGenerator.BlockTexturePool polishedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_TERRACOTTA);
        polishedTerracottaPool.stairs(ModBlocks.POLISHED_TERRACOTTA_STAIRS);
        polishedTerracottaPool.slab(ModBlocks.POLISHED_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool terracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_BRICKS);
        terracottaBricksPool.stairs(ModBlocks.TERRACOTTA_BRICKS_STAIRS);
        terracottaBricksPool.slab(ModBlocks.TERRACOTTA_BRICKS_SLAB);

        BlockStateModelGenerator.BlockTexturePool tiledTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TILED_TERRACOTTA);
        tiledTerracottaPool.stairs(ModBlocks.TILED_TERRACOTTA_STAIRS);
        tiledTerracottaPool.slab(ModBlocks.TILED_TERRACOTTA_SLAB);





        BlockStateModelGenerator.BlockTexturePool sandstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_BRICKS);
        sandstoneBricksPool.stairs(ModBlocks.SANDSTONE_BRICKS_STAIRS);
        sandstoneBricksPool.slab(ModBlocks.SANDSTONE_BRICKS_SLAB);


        BlockStateModelGenerator.BlockTexturePool sandstoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_TILES);
        sandstoneTilesPool.stairs(ModBlocks.SANDSTONE_TILES_STAIRS);
        sandstoneTilesPool.slab(ModBlocks.SANDSTONE_TILES_SLAB);


        BlockStateModelGenerator.BlockTexturePool bitSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIT_SANDSTONE);
        bitSandstonePool.stairs(ModBlocks.BIT_SANDSTONE_STAIRS);
        bitSandstonePool.slab(ModBlocks.BIT_SANDSTONE_SLAB);


        BlockStateModelGenerator.BlockTexturePool tiledSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TILED_SANDSTONE);
        tiledSandstonePool.stairs(ModBlocks.TILED_SANDSTONE_STAIRS);
        tiledSandstonePool.slab(ModBlocks.TILED_SANDSTONE_SLAB);


        BlockStateModelGenerator.BlockTexturePool polishedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SANDSTONE);
        polishedSandstonePool.stairs(ModBlocks.POLISHED_SANDSTONE_STAIRS);
        polishedSandstonePool.slab(ModBlocks.POLISHED_SANDSTONE_SLAB);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_RED_SANDSTONE);

        BlockStateModelGenerator.BlockTexturePool redSandstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_SANDSTONE_BRICKS);
        redSandstoneBricksPool.stairs(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS);
        redSandstoneBricksPool.slab(ModBlocks.RED_SANDSTONE_BRICKS_SLAB);

        BlockStateModelGenerator.BlockTexturePool bitRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIT_RED_SANDSTONE);
        bitRedSandstonePool.stairs(ModBlocks.BIT_RED_SANDSTONE_STAIRS);
        bitRedSandstonePool.slab(ModBlocks.BIT_RED_SANDSTONE_SLAB);

        BlockStateModelGenerator.BlockTexturePool tiledRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TILED_RED_SANDSTONE);
        tiledRedSandstonePool.stairs(ModBlocks.TILED_RED_SANDSTONE_STAIRS);
        tiledRedSandstonePool.slab(ModBlocks.TILED_RED_SANDSTONE_SLAB);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_ROYAL_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_ROYAL_WOOL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_TILED_WOOL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_TILED_WOOL);


        BlockStateModelGenerator.BlockTexturePool fadedCactusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CACTUS_PLANKS);
        fadedCactusPool.stairs(ModBlocks.CACTUS_STAIRS);
        fadedCactusPool.slab(ModBlocks.CACTUS_SLAB);
        blockStateModelGenerator.registerDoor(ModBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CACTUS_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.TINY_CACTUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        
        
        
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DRIED_CACTUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CACTUS_SOUP, Models.GENERATED);
    }
}
