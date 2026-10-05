package dev.exactus.modprueba.blocks;

import dev.exactus.modprueba.ModPrueba;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Pair<Block, Item> URANIUM_BLOCK = registerBlock("uranium_block",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).requiresTool(),
                    UniformIntProvider.create(3, 7))
    );


    private static Pair<Block, Item> registerBlock(String name, Block block){
        return new Pair<>(
                Registry.register(Registries.BLOCK, new Identifier(ModPrueba.MOD_ID, name), block),
                Registry.register(Registries.ITEM, new Identifier(ModPrueba.MOD_ID, name), new BlockItem(block, new Item.Settings()))
        );
    }

    public static void registerModBlocks() {
        Registry.register(Registries.BLOCK, new Identifier("modprueba", "uranium_block"), URANIUM_BLOCK.getLeft());
    }


    public static void registerBlocks()
    {
        ModPrueba.LOGGER.info("Registrando bloques...");
    }


}
