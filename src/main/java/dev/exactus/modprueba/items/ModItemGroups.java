package dev.exactus.modprueba.items;

import dev.exactus.modprueba.ModPrueba;
import dev.exactus.modprueba.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static final ItemGroup URANIUM_ITEM_GROUP = registerItemGroup("uranium_group",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.modprueba.uranium_group"))
                    .icon(()-> new ItemStack(ModItems.Uranium))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Uranium);
                        //bloque del ore de endite
                        entries.add(ModBlocks.URANIUM_BLOCK.getLeft());
                    })
                    .build()
    );

    private static ItemGroup registerItemGroup(String itemGroupId, ItemGroup itemGroup){
        return Registry.register(Registries.ITEM_GROUP, new Identifier(ModPrueba.MOD_ID, itemGroupId),itemGroup);

    }

    public static void registerItemGroups(){
        ModPrueba.LOGGER.info("Registrando grupos de items...");
    }
}
