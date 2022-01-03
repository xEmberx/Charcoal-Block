package net.heckinember.charcoal_block.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.heckinember.charcoal_block.CharcoalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CharcoalBlock.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CharcoalBlock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + CharcoalBlock.MOD_ID);
    }
}
