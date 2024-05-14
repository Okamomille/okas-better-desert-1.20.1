package net.okamiz.okasbetterdesert.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.okamiz.okasbetterdesert.OkasBetterDesert;
import net.okamiz.okasbetterdesert.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OkasBetterDesert.MOD_ID, "modgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modgroup"))
                    .icon(() -> new ItemStack(ModBlocks.SCULPTED_TERRACOTTA)).entries((displayContext, entries) -> {

                        entries.add(ModItems.DRIED_CACTUS);
                        entries.add(ModItems.CACTUS_SOUP);

                        entries.add(ModBlocks.TINY_CACTUS);
                        entries.add(ModBlocks.SMALL_CACTUS);

                        entries.add(ModBlocks.JAR);


                        entries.add(ModBlocks.SCULPTED_TERRACOTTA);
                        entries.add(ModBlocks.POLISHED_TERRACOTTA);
                        entries.add(ModBlocks.POLISHED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.POLISHED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.TILED_TERRACOTTA);
                        entries.add(ModBlocks.TILED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.TILED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.TERRACOTTA_BRICKS_STAIRS);
                        entries.add(ModBlocks.TERRACOTTA_BRICKS_SLAB);

                        entries.add(ModBlocks.CHISELED_SANDSTONE);
                        entries.add(ModBlocks.SANDSTONE_BRICKS);
                        entries.add(ModBlocks.SANDSTONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.SANDSTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.SANDSTONE_TILES);
                        entries.add(ModBlocks.SANDSTONE_TILES_STAIRS);
                        entries.add(ModBlocks.SANDSTONE_TILES_SLAB);
                        entries.add(ModBlocks.POLISHED_SANDSTONE);
                        entries.add(ModBlocks.POLISHED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.TILED_SANDSTONE);
                        entries.add(ModBlocks.TILED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.TILED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.BIT_SANDSTONE);
                        entries.add(ModBlocks.BIT_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.BIT_SANDSTONE_SLAB);
                        entries.add(ModBlocks.SANDSTONE_PILLAR);
                        entries.add(ModBlocks.BIT_SANDSTONE_PILLAR);

                        entries.add(ModBlocks.CHISELED_RED_SANDSTONE);
                        entries.add(ModBlocks.RED_SANDSTONE_BRICKS);
                        entries.add(ModBlocks.RED_SANDSTONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.RED_SANDSTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.TILED_RED_SANDSTONE);
                        entries.add(ModBlocks.TILED_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.TILED_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.BIT_RED_SANDSTONE);
                        entries.add(ModBlocks.BIT_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.BIT_RED_SANDSTONE_SLAB);
                        entries.add(ModBlocks.BIT_RED_SANDSTONE_PILLAR);


                        entries.add(ModBlocks.WHITE_ROYAL_WOOL);
                        entries.add(ModBlocks.LIGHT_GRAY_ROYAL_WOOL);
                        entries.add(ModBlocks.GRAY_ROYAL_WOOL);
                        entries.add(ModBlocks.BLACK_ROYAL_WOOL);
                        entries.add(ModBlocks.BROWN_ROYAL_WOOL);
                        entries.add(ModBlocks.RED_ROYAL_WOOL);
                        entries.add(ModBlocks.ORANGE_ROYAL_WOOL);
                        entries.add(ModBlocks.YELLOW_ROYAL_WOOL);
                        entries.add(ModBlocks.LIME_ROYAL_WOOL);
                        entries.add(ModBlocks.GREEN_ROYAL_WOOL);
                        entries.add(ModBlocks.CYAN_ROYAL_WOOL);
                        entries.add(ModBlocks.LIGHT_BLUE_ROYAL_WOOL);
                        entries.add(ModBlocks.BLUE_ROYAL_WOOL);
                        entries.add(ModBlocks.PURPLE_ROYAL_WOOL);
                        entries.add(ModBlocks.MAGENTA_ROYAL_WOOL);
                        entries.add(ModBlocks.PINK_ROYAL_WOOL);

                        entries.add(ModBlocks.WHITE_TILED_WOOL);
                        entries.add(ModBlocks.LIGHT_GRAY_TILED_WOOL);
                        entries.add(ModBlocks.GRAY_TILED_WOOL);
                        entries.add(ModBlocks.BLACK_TILED_WOOL);
                        entries.add(ModBlocks.BROWN_TILED_WOOL);
                        entries.add(ModBlocks.RED_TILED_WOOL);
                        entries.add(ModBlocks.ORANGE_TILED_WOOL);
                        entries.add(ModBlocks.YELLOW_TILED_WOOL);
                        entries.add(ModBlocks.LIME_TILED_WOOL);
                        entries.add(ModBlocks.GREEN_TILED_WOOL);
                        entries.add(ModBlocks.CYAN_TILED_WOOL);
                        entries.add(ModBlocks.LIGHT_BLUE_TILED_WOOL);
                        entries.add(ModBlocks.BLUE_TILED_WOOL);
                        entries.add(ModBlocks.PURPLE_TILED_WOOL);
                        entries.add(ModBlocks.MAGENTA_TILED_WOOL);
                        entries.add(ModBlocks.PINK_TILED_WOOL);

                        entries.add(ModBlocks.CACTUS_PLANKS);
                        entries.add(ModBlocks.CACTUS_STAIRS);
                        entries.add(ModBlocks.CACTUS_SLAB);
                        entries.add(ModBlocks.CACTUS_DOOR);
                        entries.add(ModBlocks.CACTUS_TRAPDOOR);


                    }).build());

    public static void registerItemGroups(){
        OkasBetterDesert.LOGGER.info("Registering Item Groups for " + OkasBetterDesert.MOD_ID);
    }

}
