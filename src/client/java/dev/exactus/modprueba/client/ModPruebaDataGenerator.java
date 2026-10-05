package dev.exactus.modprueba.client;

import dev.exactus.modprueba.datagen.DatagenLootTableProvider;
import dev.exactus.modprueba.datagen.DatagenModelProvider;
import dev.exactus.modprueba.datagen.ModBlockTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModPruebaDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();


		pack.addProvider(DatagenLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
