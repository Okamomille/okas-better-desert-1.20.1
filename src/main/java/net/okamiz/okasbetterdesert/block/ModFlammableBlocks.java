package net.okamiz.okasbetterdesert.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.okamiz.okasbetterdesert.OkasBetterDesert;

public class ModFlammableBlocks {

    public static void registerModFlammableBlocks(){

        OkasBetterDesert.LOGGER.info("Registering Flammables Blocks for " + OkasBetterDesert.MOD_ID);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_PLANKS,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_DOOR,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_TRAPDOOR,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_SLAB,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_STAIRS,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_PRESSURE_PLATE,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_BUTTON,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_FENCE,30,75);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CACTUS_FENCE_GATE,30,75);

    }
}
