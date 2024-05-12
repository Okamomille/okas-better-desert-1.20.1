package net.okamiz.okasbetterdesert.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.okamiz.okasbetterdesert.util.ModTags;
import net.okamiz.okasbetterdesert.world.ModPlacedFeatures;

public class ModFlowerGeneration {
    public static void generateFlowers(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SMALL_CACTUS_PLACED_KEY);
    }

}
