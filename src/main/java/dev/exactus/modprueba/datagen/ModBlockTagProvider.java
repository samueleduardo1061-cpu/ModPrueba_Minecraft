package dev.exactus.modprueba.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import dev.exactus.modprueba.blocks.ModBlocks; // Tu clase de bloques
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    // El constructor en 1.20.1 requiere el dataOutput y el registriesFuture
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.URANIUM_BLOCK.getLeft());


        TagKey<Block> NEEDS_NETHERITE_TOOL = TagKey.of(
                RegistryKeys.BLOCK,
                new Identifier("fabric", "needs_tool_level_4")
        );

        getOrCreateTagBuilder(NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.URANIUM_BLOCK.getLeft());

        /*getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.URANIUM_BLOCK.getLeft());*/
    }
}
