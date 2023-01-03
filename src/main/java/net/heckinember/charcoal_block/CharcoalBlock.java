package net.heckinember.charcoal_block;


import net.fabricmc.api.ModInitializer;
import net.heckinember.charcoal_block.block.ModBlocks;
import net.heckinember.charcoal_block.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CharcoalBlock implements ModInitializer {

	public static final String MOD_ID = "charcoal_block";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
