package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.okamiz.okasbetterdesert.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIT_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TILED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_SANDSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_RED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIT_RED_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TILED_RED_SANDSTONE);


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

        BlockStateModelGenerator.BlockTexturePool fadedCactusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CACTUS_PLANKS);
        fadedCactusPool.stairs(ModBlocks.CACTUS_STAIRS);
        fadedCactusPool.slab(ModBlocks.CACTUS_SLAB);
        blockStateModelGenerator.registerDoor(ModBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.CACTUS_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(ModBlocks.TINY_CACTUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        
        
        
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
