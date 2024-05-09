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
                .add(ModBlocks.SANDSTONE_TILES)
                .add(ModBlocks.POLISHED_SANDSTONE)
                .add(ModBlocks.TILED_SANDSTONE)
                .add(ModBlocks.BIT_SANDSTONE)
                .add(ModBlocks.SANDSTONE_PILLAR)
                .add(ModBlocks.BIT_SANDSTONE_PILLAR)

                .add(ModBlocks.CHISELED_RED_SANDSTONE)
                .add(ModBlocks.RED_SANDSTONE_BRICKS)
                .add(ModBlocks.TILED_RED_SANDSTONE)
                .add(ModBlocks.BIT_RED_SANDSTONE)
                .add(ModBlocks.BIT_RED_SANDSTONE_PILLAR)


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





    }
}
