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

        addDrop(ModBlocks.SCULPTED_TERRACOTTA);

        addDrop(ModBlocks.TERRACOTTA_BRICKS);
        addDrop(ModBlocks.TERRACOTTA_BRICKS_SLAB, slabDrops(ModBlocks.TERRACOTTA_BRICKS_SLAB));
        addDrop(ModBlocks.TERRACOTTA_BRICKS_STAIRS);

        addDrop(ModBlocks.TILED_TERRACOTTA);
        addDrop(ModBlocks.TILED_TERRACOTTA_SLAB, slabDrops(ModBlocks.TILED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.TILED_TERRACOTTA_STAIRS);

        addDrop(ModBlocks.POLISHED_TERRACOTTA);
        addDrop(ModBlocks.POLISHED_TERRACOTTA_SLAB, slabDrops(ModBlocks.POLISHED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.POLISHED_TERRACOTTA_STAIRS);




        addDrop(ModBlocks.CHISELED_SANDSTONE);
        addDrop(ModBlocks.SANDSTONE_TILES);
        addDrop(ModBlocks.SANDSTONE_TILES_SLAB, slabDrops(ModBlocks.SANDSTONE_TILES_SLAB));
        addDrop(ModBlocks.SANDSTONE_TILES_STAIRS);

        addDrop(ModBlocks.SANDSTONE_BRICKS);
        addDrop(ModBlocks.SANDSTONE_BRICKS_SLAB, slabDrops(ModBlocks.SANDSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.SANDSTONE_BRICKS_STAIRS);

        addDrop(ModBlocks.POLISHED_SANDSTONE);
        addDrop(ModBlocks.POLISHED_SANDSTONE_SLAB, slabDrops(ModBlocks.POLISHED_SANDSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_SANDSTONE_STAIRS);

        addDrop(ModBlocks.BIT_SANDSTONE);
        addDrop(ModBlocks.BIT_SANDSTONE_SLAB, slabDrops(ModBlocks.BIT_SANDSTONE_SLAB));
        addDrop(ModBlocks.BIT_SANDSTONE_STAIRS);

        addDrop(ModBlocks.TILED_SANDSTONE);
        addDrop(ModBlocks.TILED_SANDSTONE_SLAB, slabDrops(ModBlocks.TILED_SANDSTONE_SLAB));
        addDrop(ModBlocks.TILED_SANDSTONE_STAIRS);

        addDrop(ModBlocks.SANDSTONE_PILLAR);
        addDrop(ModBlocks.BIT_SANDSTONE_PILLAR);

        addDrop(ModBlocks.CHISELED_RED_SANDSTONE);

        addDrop(ModBlocks.RED_SANDSTONE_BRICKS);
        addDrop(ModBlocks.RED_SANDSTONE_BRICKS_SLAB, slabDrops(ModBlocks.RED_SANDSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS);

        addDrop(ModBlocks.BIT_RED_SANDSTONE);
        addDrop(ModBlocks.BIT_RED_SANDSTONE_SLAB, slabDrops(ModBlocks.BIT_RED_SANDSTONE_SLAB));
        addDrop(ModBlocks.BIT_RED_SANDSTONE_STAIRS);

        addDrop(ModBlocks.TILED_RED_SANDSTONE);
        addDrop(ModBlocks.TILED_RED_SANDSTONE_SLAB, slabDrops(ModBlocks.TILED_RED_SANDSTONE_SLAB));
        addDrop(ModBlocks.TILED_RED_SANDSTONE_STAIRS);

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

        addDrop(ModBlocks.BLUE_TILED_WOOL);
        addDrop(ModBlocks.WHITE_TILED_WOOL);
        addDrop(ModBlocks.BLACK_TILED_WOOL);
        addDrop(ModBlocks.GRAY_TILED_WOOL);
        addDrop(ModBlocks.LIGHT_BLUE_TILED_WOOL);
        addDrop(ModBlocks.GREEN_TILED_WOOL);
        addDrop(ModBlocks.LIGHT_GRAY_TILED_WOOL);
        addDrop(ModBlocks.MAGENTA_TILED_WOOL);
        addDrop(ModBlocks.ORANGE_TILED_WOOL);
        addDrop(ModBlocks.LIME_TILED_WOOL);
        addDrop(ModBlocks.CYAN_TILED_WOOL);
        addDrop(ModBlocks.PURPLE_TILED_WOOL);
        addDrop(ModBlocks.RED_TILED_WOOL);
        addDrop(ModBlocks.PINK_TILED_WOOL);
        addDrop(ModBlocks.BROWN_TILED_WOOL);
        addDrop(ModBlocks.YELLOW_TILED_WOOL);

        addDrop(ModBlocks.CACTUS_PLANKS);
        addDrop(ModBlocks.CACTUS_STAIRS);
        addDrop(ModBlocks.CACTUS_DOOR, doorDrops(ModBlocks.CACTUS_DOOR));
        addDrop(ModBlocks.CACTUS_SLAB, slabDrops(ModBlocks.CACTUS_SLAB));
        addDrop(ModBlocks.CACTUS_TRAPDOOR);

        addDrop(ModBlocks.TINY_CACTUS);
        addDrop(ModBlocks.SMALL_CACTUS);

        addDrop(ModBlocks.JAR);
    }
}
