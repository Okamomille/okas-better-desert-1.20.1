package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.okamiz.okasbetterdesert.OkasBetterDesert;
import net.okamiz.okasbetterdesert.block.ModBlocks;

public class RenderCutout {

    public static void registerBlockRenders(){
        OkasBetterDesert.LOGGER.info("Registering BlockRenderer for " + OkasBetterDesert.MOD_ID);




        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TINY_CACTUS, RenderLayer.getCutout());
    }
}
