package com.davidmontandon.yggdrasil.world.muspelheim.biomes;

import com.davidmontandon.yggdrasil.world.muspelheim.config.MuspelheimDefaultBiomeFeatures;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;

public class MuspelheimPlainsBiome extends Biome {

	public MuspelheimPlainsBiome(Builder biomeBuilder) {
		super(biomeBuilder);
		
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 20, 2, 10)) ; 
		
		MuspelheimDefaultBiomeFeatures.addCarver(this);
		MuspelheimDefaultBiomeFeatures.addLakes(this);
		MuspelheimDefaultBiomeFeatures.addSprings(this);
		MuspelheimDefaultBiomeFeatures.addOres(this);
		MuspelheimDefaultBiomeFeatures.addSedimentDisks(this);
		MuspelheimDefaultBiomeFeatures.addStructures(this);
		MuspelheimDefaultBiomeFeatures.addSickTrees(this); 
		MuspelheimDefaultBiomeFeatures.addDeadBushes(this) ; 

	}
	
}
