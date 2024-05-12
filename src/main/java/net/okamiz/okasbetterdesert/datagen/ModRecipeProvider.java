package net.okamiz.okasbetterdesert.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.okamiz.okasbetterdesert.block.ModBlocks;
import net.okamiz.okasbetterdesert.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


    private static final List<ItemConvertible> CACTUS_SMELTABLE = List.of(ModBlocks.SMALL_CACTUS,ModBlocks.TINY_CACTUS);



    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, CACTUS_SMELTABLE, RecipeCategory.MISC, ModItems.DRIED_CACTUS,
                0.7f,100,"dried_cactus");



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHISELED_SANDSTONE, 3)
                .pattern(" S ")
                .pattern("S S")
                .pattern(" S ")
                .input('S', Blocks.SANDSTONE)
                .criterion(hasItem(Blocks.SANDSTONE),conditionsFromItem(ModBlocks.CHISELED_SANDSTONE))
                .offerTo(exporter, new Identifier("chiseled_sandstone_recipe"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WHITE_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.WHITE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.WHITE_WOOL),conditionsFromItem(ModBlocks.WHITE_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("white_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLACK_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.BLACK_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.BLACK_WOOL),conditionsFromItem(ModBlocks.BLACK_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("black_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUE_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.BLUE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.BLUE_WOOL),conditionsFromItem(ModBlocks.BLUE_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("blue_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BROWN_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.BROWN_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.BROWN_WOOL),conditionsFromItem(ModBlocks.BROWN_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("brown_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CYAN_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.CYAN_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.CYAN_WOOL),conditionsFromItem(ModBlocks.CYAN_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("cyan_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GRAY_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.GRAY_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(ModBlocks.GRAY_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("gray_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GREEN_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.GREEN_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.GREEN_WOOL),conditionsFromItem(ModBlocks.GREEN_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("green_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.LIGHT_BLUE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL),conditionsFromItem(ModBlocks.LIGHT_BLUE_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("light_blue_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.LIGHT_GRAY_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL),conditionsFromItem(ModBlocks.LIGHT_GRAY_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("light_gray_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIME_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.LIME_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.LIME_WOOL),conditionsFromItem(ModBlocks.LIME_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("lime_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGENTA_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.MAGENTA_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.MAGENTA_WOOL),conditionsFromItem(ModBlocks.MAGENTA_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("magenta_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORANGE_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.ORANGE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.ORANGE_WOOL),conditionsFromItem(ModBlocks.ORANGE_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("orange_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.PINK_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.PINK_WOOL),conditionsFromItem(ModBlocks.PINK_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("pink_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PURPLE_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.PURPLE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.PURPLE_WOOL),conditionsFromItem(ModBlocks.PURPLE_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("purple_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.RED_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.RED_WOOL),conditionsFromItem(ModBlocks.RED_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("red_royal_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.YELLOW_ROYAL_WOOL, 8)
                .pattern("XXX")
                .pattern("XSX")
                .pattern("XXX")
                .input('X', Blocks.YELLOW_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.YELLOW_WOOL),conditionsFromItem(ModBlocks.YELLOW_ROYAL_WOOL))
                .offerTo(exporter, new Identifier("yellow_royal_wool_recipe"));






        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WHITE_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.WHITE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.WHITE_WOOL),conditionsFromItem(ModBlocks.WHITE_TILED_WOOL))
                .offerTo(exporter, new Identifier("white_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLACK_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.BLACK_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.BLACK_WOOL),conditionsFromItem(ModBlocks.BLACK_TILED_WOOL))
                .offerTo(exporter, new Identifier("black_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUE_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.BLUE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.BLUE_WOOL),conditionsFromItem(ModBlocks.BLUE_TILED_WOOL))
                .offerTo(exporter, new Identifier("blue_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BROWN_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.BROWN_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.BROWN_WOOL),conditionsFromItem(ModBlocks.BROWN_TILED_WOOL))
                .offerTo(exporter, new Identifier("brown_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CYAN_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.CYAN_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.CYAN_WOOL),conditionsFromItem(ModBlocks.CYAN_TILED_WOOL))
                .offerTo(exporter, new Identifier("cyan_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GRAY_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.GRAY_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(ModBlocks.GRAY_TILED_WOOL))
                .offerTo(exporter, new Identifier("gray_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GREEN_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.GREEN_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.GREEN_WOOL),conditionsFromItem(ModBlocks.GREEN_TILED_WOOL))
                .offerTo(exporter, new Identifier("green_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.LIGHT_BLUE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL),conditionsFromItem(ModBlocks.LIGHT_BLUE_TILED_WOOL))
                .offerTo(exporter, new Identifier("light_blue_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.LIGHT_GRAY_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL),conditionsFromItem(ModBlocks.LIGHT_GRAY_TILED_WOOL))
                .offerTo(exporter, new Identifier("light_gray_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIME_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.LIME_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.LIME_WOOL),conditionsFromItem(ModBlocks.LIME_TILED_WOOL))
                .offerTo(exporter, new Identifier("lime_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGENTA_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.MAGENTA_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.MAGENTA_WOOL),conditionsFromItem(ModBlocks.MAGENTA_TILED_WOOL))
                .offerTo(exporter, new Identifier("magenta_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORANGE_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.ORANGE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.ORANGE_WOOL),conditionsFromItem(ModBlocks.ORANGE_TILED_WOOL))
                .offerTo(exporter, new Identifier("orange_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.PINK_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.PINK_WOOL),conditionsFromItem(ModBlocks.PINK_TILED_WOOL))
                .offerTo(exporter, new Identifier("pink_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PURPLE_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.PURPLE_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.PURPLE_WOOL),conditionsFromItem(ModBlocks.PURPLE_TILED_WOOL))
                .offerTo(exporter, new Identifier("purple_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.RED_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.RED_WOOL),conditionsFromItem(ModBlocks.RED_TILED_WOOL))
                .offerTo(exporter, new Identifier("red_tiled_wool_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.YELLOW_TILED_WOOL, 4)
                .pattern(" X ")
                .pattern("XSX")
                .pattern(" X ")
                .input('X', Blocks.YELLOW_WOOL)
                .input('S', Items.STRING)
                .criterion(hasItem(Blocks.YELLOW_WOOL),conditionsFromItem(ModBlocks.YELLOW_TILED_WOOL))
                .offerTo(exporter, new Identifier("yellow_tiled_wool_recipe"));






        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.CACTUS_PLANKS, 2)
                .pattern("OO")
                .pattern("OO")
                .input('O', Blocks.CACTUS)
                .criterion(hasItem(Blocks.CACTUS),conditionsFromItem(Blocks.CACTUS))
                .offerTo(exporter, new Identifier("cactus_planks_recipe"));

        createStairsRecipe(ModBlocks.CACTUS_STAIRS, Ingredient.ofItems(ModBlocks.CACTUS_PLANKS))
                .criterion(hasItem(ModBlocks.CACTUS_PLANKS),conditionsFromItem(ModBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CACTUS_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CACTUS_SLAB, Ingredient.ofItems(ModBlocks.CACTUS_PLANKS))
                .criterion(hasItem(ModBlocks.CACTUS_PLANKS),conditionsFromItem(ModBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CACTUS_SLAB)));

        createDoorRecipe(ModBlocks.CACTUS_DOOR, Ingredient.ofItems(ModBlocks.CACTUS_PLANKS))
                .criterion(hasItem(ModBlocks.CACTUS_PLANKS),conditionsFromItem(ModBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CACTUS_DOOR)));

        createTrapdoorRecipe(ModBlocks.CACTUS_TRAPDOOR, Ingredient.ofItems(ModBlocks.CACTUS_PLANKS))
                .criterion(hasItem(ModBlocks.CACTUS_PLANKS),conditionsFromItem(ModBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CACTUS_TRAPDOOR)));






        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CACTUS_SOUP, 1)
                .pattern("XXX")
                .pattern(" S ")
                .input('X', ModItems.DRIED_CACTUS)
                .input('S', Items.BOWL)
                .criterion(hasItem(ModItems.DRIED_CACTUS),conditionsFromItem(ModItems.DRIED_CACTUS))
                .offerTo(exporter, new Identifier("cactus_soup_recipe"));
        
        
    }
}
