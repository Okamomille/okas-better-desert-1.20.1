package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)

        ;


    }
}
