package net.okamiz.okasbetterdesert;

import net.fabricmc.api.ModInitializer;

import net.okamiz.okasbetterdesert.block.ModBlocks;
import net.okamiz.okasbetterdesert.item.ModItemGroups;
import net.okamiz.okasbetterdesert.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OkasBetterDesert implements ModInitializer {
	public static final String MOD_ID = "okasbetterdesert";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}