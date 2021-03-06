package com.deedllit.yggdrasil.world.dimensions.midgard.biomes;

import com.deedllit.yggdrasil.init.SurfaceBuilderInit;
import com.deedllit.yggdrasil.world.dimensions.midgard.config.MidgardDefaultBiomeFeatures;
import com.google.common.collect.ImmutableList;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MidgardChaparralDesertBiome extends Biome  {
	
	public MidgardChaparralDesertBiome() {
	      super((new Biome.Builder()).surfaceBuilder(
	    		  new ConfiguredSurfaceBuilder(SurfaceBuilderInit.CHAPARRAL, SurfaceBuilder.SAND_SAND_GRAVEL_CONFIG))
	    		  .precipitation(Biome.RainType.NONE)
	    		  .category(Biome.Category.DESERT)
	    		  .depth(0.25F)
	    		  .scale(0.025F)
	    		  .temperature(2.0F)
	    		  .downfall(0.1F)
	    		  .func_235097_a_((new BiomeAmbience.Builder())
	    				  .func_235246_b_(4159204)
	    				  .func_235248_c_(329011)
	    				  .func_235239_a_(12638463)
	    				  .func_235243_a_(MoodSoundAmbience.field_235027_b_)
	    				  .func_235238_a_())
	    		  .parent((String)null)
	    		  .func_235098_a_(ImmutableList.of(new Biome.Attributes(0.505F, -0.505F, 0.0F, 0.0F, 1.05F))));
	      
	      
	      DefaultBiomeFeatures.addCarvers(this);
	      DefaultBiomeFeatures.addDesertLakes(this);	      
	      MidgardDefaultBiomeFeatures.addDesertFlowers(this);
	      MidgardDefaultBiomeFeatures.addCactus(this);
	 
	      //10066176
	      
	}
	
	@OnlyIn(Dist.CLIENT)
	public int getGrassColor(double posX, double posZ) {
		double d0 = INFO_NOISE.noiseAt(posX * 0.0225D, posZ * 0.0225D, false);
	    return d0 < -0.1D ? 11842580 : 12171550;
	}

}
