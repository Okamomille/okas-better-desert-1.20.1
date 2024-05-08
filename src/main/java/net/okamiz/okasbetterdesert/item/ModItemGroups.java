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

                    }).build());

    public static void registerItemGroups(){
        OkasBetterDesert.LOGGER.info("Registering Item Groups for " + OkasBetterDesert.MOD_ID);
    }

}
