package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.okamiz.okasbetterdesert.block.ModBlocks;
import net.okamiz.okasbetterdesert.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(ModTags.Items.SANDSTONES)
                .add(ModBlocks.CHISELED_SANDSTONE.asItem())
                .add(ModBlocks.SANDSTONE_BRICKS.asItem())
                .add(ModBlocks.SANDSTONE_TILES.asItem())
                .add(ModBlocks.POLISHED_SANDSTONE.asItem())
                .add(ModBlocks.TILED_SANDSTONE.asItem())
                .add(ModBlocks.BIT_SANDSTONE.asItem())
                .add(ModBlocks.SANDSTONE_PILLAR.asItem())
                .add(ModBlocks.BIT_SANDSTONE_PILLAR.asItem())

                .add(Blocks.SANDSTONE.asItem())
                .add(Blocks.CUT_SANDSTONE.asItem())
                .add(Blocks.SMOOTH_SANDSTONE.asItem())
                .add(Blocks.CHISELED_SANDSTONE.asItem())
        ;
        getOrCreateTagBuilder(ModTags.Items.RED_SANDSTONES)
                .add(ModBlocks.CHISELED_RED_SANDSTONE.asItem())
                .add(ModBlocks.RED_SANDSTONE_BRICKS.asItem())
                .add(ModBlocks.TILED_RED_SANDSTONE.asItem())
                .add(ModBlocks.BIT_RED_SANDSTONE.asItem())
                .add(ModBlocks.BIT_RED_SANDSTONE_PILLAR.asItem())

                .add(Blocks.RED_SANDSTONE.asItem())
                .add(Blocks.CUT_RED_SANDSTONE.asItem())
                .add(Blocks.SMOOTH_RED_SANDSTONE.asItem())
                .add(Blocks.CHISELED_RED_SANDSTONE.asItem())
        ;


        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(ModBlocks.WHITE_ROYAL_WOOL.asItem())
                .add(ModBlocks.BLACK_ROYAL_WOOL.asItem())
                .add(ModBlocks.RED_ROYAL_WOOL.asItem())
                .add(ModBlocks.BLUE_ROYAL_WOOL.asItem())
                .add(ModBlocks.CYAN_ROYAL_WOOL.asItem())
                .add(ModBlocks.GRAY_ROYAL_WOOL.asItem())
                .add(ModBlocks.GREEN_ROYAL_WOOL.asItem())
                .add(ModBlocks.LIGHT_BLUE_ROYAL_WOOL.asItem())
                .add(ModBlocks.LIME_ROYAL_WOOL.asItem())
                .add(ModBlocks.LIGHT_GRAY_ROYAL_WOOL.asItem())
                .add(ModBlocks.MAGENTA_ROYAL_WOOL.asItem())
                .add(ModBlocks.PINK_ROYAL_WOOL.asItem())
                .add(ModBlocks.ORANGE_ROYAL_WOOL.asItem())
                .add(ModBlocks.PURPLE_ROYAL_WOOL.asItem())
                .add(ModBlocks.BROWN_ROYAL_WOOL.asItem())
                .add(ModBlocks.YELLOW_ROYAL_WOOL.asItem())

                .add(ModBlocks.WHITE_TILED_WOOL.asItem())
                .add(ModBlocks.BLACK_TILED_WOOL.asItem())
                .add(ModBlocks.RED_TILED_WOOL.asItem())
                .add(ModBlocks.BLUE_TILED_WOOL.asItem())
                .add(ModBlocks.CYAN_TILED_WOOL.asItem())
                .add(ModBlocks.GRAY_TILED_WOOL.asItem())
                .add(ModBlocks.GREEN_TILED_WOOL.asItem())
                .add(ModBlocks.LIGHT_BLUE_TILED_WOOL.asItem())
                .add(ModBlocks.LIME_TILED_WOOL.asItem())
                .add(ModBlocks.LIGHT_GRAY_TILED_WOOL.asItem())
                .add(ModBlocks.MAGENTA_TILED_WOOL.asItem())
                .add(ModBlocks.PINK_TILED_WOOL.asItem())
                .add(ModBlocks.ORANGE_TILED_WOOL.asItem())
                .add(ModBlocks.PURPLE_TILED_WOOL.asItem())
                .add(ModBlocks.BROWN_TILED_WOOL.asItem())
                .add(ModBlocks.YELLOW_TILED_WOOL.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CACTUS_PLANKS.asItem())
        ;




    }
}
