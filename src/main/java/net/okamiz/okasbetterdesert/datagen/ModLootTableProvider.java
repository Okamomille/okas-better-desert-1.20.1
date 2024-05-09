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

        addDrop(ModBlocks.CHISELED_RED_SANDSTONE);
        addDrop(ModBlocks.RED_SANDSTONE_BRICKS);
        addDrop(ModBlocks.BIT_RED_SANDSTONE);
        addDrop(ModBlocks.TILED_RED_SANDSTONE);
        addDrop(ModBlocks.BIT_RED_SANDSTONE_PILLAR);

        addDrop(ModBlocks.BLUE_ROYAL_WOOL);
        addDrop(ModBlocks.WHITE_ROYAL_WOOL);
        addDrop(ModBlocks.BLACK_ROYAL_WOOL);
        addDrop(ModBlocks.GRAY_ROYAL_WOOL);
        addDrop(ModBlocks.LIGHT_BLUE_ROYAL_WOOL);
        addDrop(ModBlocks.GREEN_ROYAL_WOOL);
        addDrop(ModBlocks.LIGHT_GRAY_ROYAL_WOOL);
        addDrop(ModBlocks.MAGENTA_ROYAL_WOOL);
        addDrop(ModBlocks.ORANGE_ROYAL_WOOL);
        addDrop(ModBlocks.LIME_ROYAL_WOOL);
        addDrop(ModBlocks.CYAN_ROYAL_WOOL);
        addDrop(ModBlocks.PURPLE_ROYAL_WOOL);
        addDrop(ModBlocks.RED_ROYAL_WOOL);
        addDrop(ModBlocks.PINK_ROYAL_WOOL);
        addDrop(ModBlocks.BROWN_ROYAL_WOOL);
        addDrop(ModBlocks.YELLOW_ROYAL_WOOL);



        addDrop(ModBlocks.CACTUS_PLANKS);
        addDrop(ModBlocks.CACTUS_STAIRS);
        addDrop(ModBlocks.CACTUS_DOOR, doorDrops(ModBlocks.CACTUS_DOOR));
        addDrop(ModBlocks.CACTUS_SLAB, slabDrops(ModBlocks.CACTUS_SLAB));
        addDrop(ModBlocks.CACTUS_TRAPDOOR);
    }
}
