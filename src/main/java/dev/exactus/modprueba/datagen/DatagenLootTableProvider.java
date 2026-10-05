package dev.exactus.modprueba.datagen;

import dev.exactus.modprueba.blocks.ModBlocks;
import dev.exactus.modprueba.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DatagenLootTableProvider extends FabricBlockLootTableProvider {
    public DatagenLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.URANIUM_BLOCK.getLeft(), drops(ModItems.Uranium));
    }
}
