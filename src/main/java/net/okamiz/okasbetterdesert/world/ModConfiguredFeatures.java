package net.okamiz.okasbetterdesert.world;


import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.okamiz.okasbetterdesert.OkasBetterDesert;
import net.okamiz.okasbetterdesert.block.ModBlocks;

public class ModConfiguredFeatures {

    
    public static final RegistryKey<ConfiguredFeature<?,?>> SMALL_CACTUS_KEY = registryKey("small_cactus_key");

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){

        register(context, SMALL_CACTUS_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(5,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SMALL_CACTUS)))));

    }


    public static RegistryKey<ConfiguredFeature<?,?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OkasBetterDesert.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
