package net.okamiz.okasbetterdesert.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.okamiz.okasbetterdesert.OkasBetterDesert;

public class ModTags {
    public static class Blocks
    {





        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OkasBetterDesert.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> SANDSTONES =
                createTag("sandstones");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(OkasBetterDesert.MOD_ID, name));
        }
    }

    public class Biomes{



        private static TagKey<Biome> createTag(String name){
            return TagKey.of(RegistryKeys.BIOME, new Identifier(OkasBetterDesert.MOD_ID, name));
        }
    }

}
