package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.okamiz.okasbetterdesert.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CHISELED_SANDSTONE);
        addDrop(ModBlocks.SANDSTONE_TILES);
        addDrop(ModBlocks.SANDSTONE_BRICKS);
        addDrop(ModBlocks.POLISHED_SANDSTONE);
        addDrop(ModBlocks.BIT_SANDSTONE);
        addDrop(ModBlocks.TILED_SANDSTONE);
        addDrop(ModBlocks.SANDSTONE_PILLAR);
        addDrop(ModBlocks.BIT_SANDSTONE_PILLAR);
    }
}
