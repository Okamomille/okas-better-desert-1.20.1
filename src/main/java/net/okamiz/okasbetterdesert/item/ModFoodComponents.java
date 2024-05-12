package net.okamiz.okasbetterdesert.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents extends FoodComponents {

    public static final FoodComponent DRIED_CACTUS = new FoodComponent.Builder().hunger(1).saturationModifier(2f).snack().build();
    public static final FoodComponent CACTUS_SOUP = new FoodComponent.Builder().hunger(5).saturationModifier(3f).build();

}
