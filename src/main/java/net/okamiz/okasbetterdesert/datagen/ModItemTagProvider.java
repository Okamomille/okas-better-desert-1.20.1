package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
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


    }
}
