package net.heckinember.charcoal_block.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.heckinember.charcoal_block.CharcoalBlock;
import net.heckinember.charcoal_block.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for " + CharcoalBlock.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //16000 / 20 = 800 Seconds
        registry.add(ModBlocks.CHARCOAL_BLOCK, 16000);
    }
}
