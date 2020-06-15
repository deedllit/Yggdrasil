package com.davidmontandon.yggdrasil.world.dimensions.muspelheim.biomes;

import com.davidmontandon.yggdrasil.world.dimensions.muspelheim.config.MuspelheimDefaultBiomeFeatures;
import com.davidmontandon.yggdrasil.world.gen.YggdrasilSurfaceBuilderConfigLists;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class MuspelheimAshPlainsBiome extends Biome {

	public MuspelheimAshPlainsBiome(Builder biomeBuilder) {
		super(new Biome.Builder()		
				.precipitation(RainType.NONE)
				.waterColor(0x906B9F)
				.waterFogColor(0x6E5651)
				.surfaceBuilder(SurfaceBuilder.DEFAULT, YggdrasilSurfaceBuilderConfigLists.MUSPELHEIM_ASH_COLDROCK_SAND)
				.category(Category.PLAINS)
				.depth(0.2f)
				.scale(0.5f)
				.temperature(2.0f)
				.downfall(0.0f)
				.parent(null));
				
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