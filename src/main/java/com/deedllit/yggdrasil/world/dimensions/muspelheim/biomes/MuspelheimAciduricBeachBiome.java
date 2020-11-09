package com.deedllit.yggdrasil.world.dimensions.muspelheim.biomes;

import com.deedllit.yggdrasil.Yggdrasil;
import com.deedllit.yggdrasil.world.dimensions.muspelheim.config.MuspelheimDefaultBiomeFeatures;
import com.deedllit.yggdrasil.world.gen.YggdrasilSurfaceBuilderConfigLists;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.registries.ForgeRegistries;

public class MuspelheimAciduricBeachBiome extends Biome {
	
	public MuspelheimAciduricBeachBiome() {
		super(new Biome.Builder()		
				.precipitation(RainType.NONE)
				.waterColor(0x906B9F)
				.waterFogColor(0x6E5651)
				.surfaceBuilder(SurfaceBuilder.DEFAULT, YggdrasilSurfaceBuilderConfigLists.MUSPELHEIM_GRASS_SULFUR_MAGMA)
				.category(Category.BEACH)
				.depth(0.2f)
				.scale(0.5f)
				.temperature(2.0f)
				.downfall(0.0f)
				.parent(null));
		
		
		MuspelheimDefaultBiomeFeatures.addCarver(this);
		MuspelheimDefaultBiomeFeatures.addLakes(this);
		MuspelheimDefaultBiomeFeatures.addSprings(this);
		MuspelheimDefaultBiomeFeatures.addStoneVariants(this);
		MuspelheimDefaultBiomeFeatures.addOres(this);
		MuspelheimDefaultBiomeFeatures.addSedimentDisks(this);
		MuspelheimDefaultBiomeFeatures.addStructures(this);
		MuspelheimDefaultBiomeFeatures.addSickTrees(this); 
		MuspelheimDefaultBiomeFeatures.addDeadBushes(this) ; 

	}

	@Override
	public Biome getRiver() {
		return ForgeRegistries.BIOMES.getValue(new ResourceLocation(Yggdrasil.MOD_ID + ":muspelheim_river")) ; 
	}
}