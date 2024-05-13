package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.okamiz.okasbetterdesert.block.ModBlocks;
import net.okamiz.okasbetterdesert.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {




        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_SANDSTONE)
                .add(ModBlocks.SANDSTONE_BRICKS)
                .add(ModBlocks.SANDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.SANDSTONE_BRICKS_SLAB)
                .add(ModBlocks.SANDSTONE_TILES)
                .add(ModBlocks.SANDSTONE_TILES_STAIRS)
                .add(ModBlocks.SANDSTONE_TILES_SLAB)
                .add(ModBlocks.POLISHED_SANDSTONE)
                .add(ModBlocks.POLISHED_SANDSTONE_STAIRS)
                .add(ModBlocks.POLISHED_SANDSTONE_SLAB)
                .add(ModBlocks.TILED_SANDSTONE)
                .add(ModBlocks.TILED_SANDSTONE_STAIRS)
                .add(ModBlocks.TILED_SANDSTONE_SLAB)
                .add(ModBlocks.BIT_SANDSTONE)
                .add(ModBlocks.BIT_SANDSTONE_STAIRS)
                .add(ModBlocks.BIT_SANDSTONE_SLAB)
                .add(ModBlocks.SANDSTONE_PILLAR)
                .add(ModBlocks.BIT_SANDSTONE_PILLAR)

                .add(ModBlocks.CHISELED_RED_SANDSTONE)
                .add(ModBlocks.RED_SANDSTONE_BRICKS)
                .add(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.RED_SANDSTONE_BRICKS_SLAB)
                .add(ModBlocks.TILED_RED_SANDSTONE)
                .add(ModBlocks.TILED_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.TILED_RED_SANDSTONE_SLAB)
                .add(ModBlocks.BIT_RED_SANDSTONE)
                .add(ModBlocks.BIT_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.BIT_RED_SANDSTONE_SLAB)
                .add(ModBlocks.BIT_RED_SANDSTONE_PILLAR)

                .add(ModBlocks.TERRACOTTA_BRICKS)
                .add(ModBlocks.TERRACOTTA_BRICKS_STAIRS)
                .add(ModBlocks.TERRACOTTA_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_TERRACOTTA)
                .add(ModBlocks.POLISHED_TERRACOTTA_STAIRS)
                .add(ModBlocks.POLISHED_TERRACOTTA_SLAB)
                .add(ModBlocks.TILED_TERRACOTTA)
                .add(ModBlocks.TILED_TERRACOTTA_STAIRS)
                .add(ModBlocks.TILED_TERRACOTTA_SLAB)
                .add(ModBlocks.SCULPTED_TERRACOTTA)


        ;

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.WHITE_ROYAL_WOOL)
                .add(ModBlocks.BLACK_ROYAL_WOOL)
                .add(ModBlocks.RED_ROYAL_WOOL)
                .add(ModBlocks.BLUE_ROYAL_WOOL)
                .add(ModBlocks.CYAN_ROYAL_WOOL)
                .add(ModBlocks.GRAY_ROYAL_WOOL)
                .add(ModBlocks.GREEN_ROYAL_WOOL)
                .add(ModBlocks.LIGHT_BLUE_ROYAL_WOOL)
                .add(ModBlocks.LIME_ROYAL_WOOL)
                .add(ModBlocks.LIGHT_GRAY_ROYAL_WOOL)
                .add(ModBlocks.MAGENTA_ROYAL_WOOL)
                .add(ModBlocks.PINK_ROYAL_WOOL)
                .add(ModBlocks.ORANGE_ROYAL_WOOL)
                .add(ModBlocks.PURPLE_ROYAL_WOOL)
                .add(ModBlocks.BROWN_ROYAL_WOOL)
                .add(ModBlocks.YELLOW_ROYAL_WOOL)

                .add(ModBlocks.WHITE_TILED_WOOL)
                .add(ModBlocks.BLACK_TILED_WOOL)
                .add(ModBlocks.RED_TILED_WOOL)
                .add(ModBlocks.BLUE_TILED_WOOL)
                .add(ModBlocks.CYAN_TILED_WOOL)
                .add(ModBlocks.GRAY_TILED_WOOL)
                .add(ModBlocks.GREEN_TILED_WOOL)
                .add(ModBlocks.LIGHT_BLUE_TILED_WOOL)
                .add(ModBlocks.LIME_TILED_WOOL)
                .add(ModBlocks.LIGHT_GRAY_TILED_WOOL)
                .add(ModBlocks.MAGENTA_TILED_WOOL)
                .add(ModBlocks.PINK_TILED_WOOL)
                .add(ModBlocks.ORANGE_TILED_WOOL)
                .add(ModBlocks.PURPLE_TILED_WOOL)
                .add(ModBlocks.BROWN_TILED_WOOL)
                .add(ModBlocks.YELLOW_TILED_WOOL)
        ;


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CACTUS_PLANKS)
                .add(ModBlocks.CACTUS_STAIRS)
                .add(ModBlocks.CACTUS_SLAB)
                .add(ModBlocks.CACTUS_TRAPDOOR)
                .add(ModBlocks.CACTUS_DOOR)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;


        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.CACTUS_DOOR)
        ;
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CACTUS_TRAPDOOR)
        ;
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.CACTUS_SLAB)
        ;
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.CACTUS_STAIRS)
        ;



        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.BIT_SANDSTONE_STAIRS)
                .add(ModBlocks.SANDSTONE_TILES_STAIRS)
                .add(ModBlocks.SANDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_SANDSTONE_STAIRS)
                .add(ModBlocks.TILED_SANDSTONE_STAIRS)

                .add(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.BIT_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.TILED_RED_SANDSTONE_STAIRS)
                .add(ModBlocks.TERRACOTTA_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_TERRACOTTA_STAIRS)
                .add(ModBlocks.TILED_TERRACOTTA_STAIRS)
        ;
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.BIT_SANDSTONE_SLAB)
                .add(ModBlocks.SANDSTONE_TILES_SLAB)
                .add(ModBlocks.SANDSTONE_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_SANDSTONE_SLAB)
                .add(ModBlocks.TILED_SANDSTONE_SLAB)

                .add(ModBlocks.RED_SANDSTONE_BRICKS_SLAB)
                .add(ModBlocks.BIT_RED_SANDSTONE_SLAB)
                .add(ModBlocks.TILED_RED_SANDSTONE_SLAB)
                .add(ModBlocks.TERRACOTTA_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_TERRACOTTA_SLAB)
                .add(ModBlocks.TILED_TERRACOTTA_SLAB)
        ;


        getOrCreateTagBuilder(BlockTags.TERRACOTTA)
                .add(ModBlocks.TERRACOTTA_BRICKS)
                .add(ModBlocks.POLISHED_TERRACOTTA)
                .add(ModBlocks.TILED_TERRACOTTA)
                .add(ModBlocks.SCULPTED_TERRACOTTA)

        ;

    }
}
