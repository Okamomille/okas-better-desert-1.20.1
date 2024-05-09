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
                    .icon(() -> new ItemStack(Items.GLOWSTONE_DUST)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.CHISELED_SANDSTONE);
                        entries.add(ModBlocks.SANDSTONE_BRICKS);
                        entries.add(ModBlocks.SANDSTONE_TILES);
                        entries.add(ModBlocks.POLISHED_SANDSTONE);
                        entries.add(ModBlocks.TILED_SANDSTONE);
                        entries.add(ModBlocks.BIT_SANDSTONE);
                        entries.add(ModBlocks.SANDSTONE_PILLAR);
                        entries.add(ModBlocks.BIT_SANDSTONE_PILLAR);

                        entries.add(ModBlocks.CHISELED_RED_SANDSTONE);
                        entries.add(ModBlocks.RED_SANDSTONE_BRICKS);
                        entries.add(ModBlocks.TILED_RED_SANDSTONE);
                        entries.add(ModBlocks.BIT_RED_SANDSTONE);
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
