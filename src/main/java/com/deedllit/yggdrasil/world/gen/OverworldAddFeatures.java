package com.deedllit.yggdrasil.world.gen;

import com.deedllit.yggdrasil.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OverworldAddFeatures {

	/*
	public static void generateOre() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			
			if(biome == Biomes.PLAINS) {
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure( new CountRangeConfig(20, 5, 5, 25)) ; 
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
						Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
								BlockInit.RUNE_ORE.get().getDefaultState(), 10)).withPlacement(customConfig));
			}
			
		}
	}
	*/
}
