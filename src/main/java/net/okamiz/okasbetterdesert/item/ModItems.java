package net.okamiz.okasbetterdesert.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.StewItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okamiz.okasbetterdesert.OkasBetterDesert;

public class ModItems {


    public static final Item DRIED_CACTUS = registerItem("dried_cactus",
            new Item(new FabricItemSettings().food(ModFoodComponents.DRIED_CACTUS)));

    public static final Item CACTUS_SOUP = registerItem("cactus_soup",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.CACTUS_SOUP)));








    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){

    }



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(OkasBetterDesert.MOD_ID, name), item);
    }

    public static void registerModItems(){
        OkasBetterDesert.LOGGER.info("Registering Mod Items for " + OkasBetterDesert.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
