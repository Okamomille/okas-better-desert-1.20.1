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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
