package net.okamiz.okasbetterdesert;

import net.fabricmc.api.ClientModInitializer;
import net.okamiz.okasbetterdesert.datagen.RenderCutout;

public class OkasBetterDesertClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderCutout.registerBlockRenders();
    }
}
