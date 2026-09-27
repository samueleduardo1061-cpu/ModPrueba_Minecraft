package dev.exactus.modprueba.items;


import dev.exactus.modprueba.ModPrueba;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item Uranium = registerItem("uranium", new Item(new Item.Settings()));


    private static Item registerItem(String itemId, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ModPrueba.MOD_ID, itemId),item);
    }

    public static void registerItems(){
        ModPrueba.LOGGER.info("Registrando items...");
    }
}
