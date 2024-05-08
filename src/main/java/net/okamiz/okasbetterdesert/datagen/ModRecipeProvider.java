package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.okamiz.okasbetterdesert.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_SANDSTONE, 3)
                .pattern(" S ")
                .pattern("S S")
                .pattern(" S ")
                .input('S', Blocks.SANDSTONE)
                .criterion(hasItem(Blocks.SANDSTONE),conditionsFromItem(ModBlocks.CHISELED_SANDSTONE))
                .offerTo(exporter, new Identifier("chiseled_sandstone_recipe"));


    }
}
