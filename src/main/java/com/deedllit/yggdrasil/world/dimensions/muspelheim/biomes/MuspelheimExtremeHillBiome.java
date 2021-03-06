package com.deedllit.yggdrasil.world.dimensions.muspelheim.biomes;

import com.deedllit.yggdrasil.world.dimensions.muspelheim.config.MuspelheimDefaultBiomeFeatures;
import com.deedllit.yggdrasil.world.gen.YggdrasilSurfaceBuilderConfigLists;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MuspelheimExtremeHillBiome extends Biome {

	public MuspelheimExtremeHillBiome() {
		
	    super((new Biome.Builder())
	    		  .surfaceBuilder(SurfaceBuilder.MOUNTAIN, YggdrasilSurfaceBuilderConfigLists.MUSPELHEIM_HOTROCK_COLDROCK_SAND)
	    		  .precipitation(Biome.RainType.NONE)
	    		  .category(Biome.Category.EXTREME_HILLS)
	    		  .depth(1.86F)
	    		  .scale(1.2F)
	    		  .temperature(2.0F)
	    		  .downfall(0.1F)
	    		  .func_235097_a_(
	    				  (new BiomeAmbience.Builder())
	    				  	.func_235246_b_(4159204)
	    				  	.func_235248_c_(329011)
	    				  	.func_235239_a_(12638463)
	    				  	.func_235243_a_(MoodSoundAmbience.field_235027_b_)
	    				  	.func_235238_a_())
	    		  .parent((String)null)) ;

	      MuspelheimDefaultBiomeFeatures.addCarvers(this) ; 
	      MuspelheimDefaultBiomeFeatures.addLakes(this) ; 
	      MuspelheimDefaultBiomeFeatures.addOres(this);
	      MuspelheimDefaultBiomeFeatures.addVanillaOres(this) ; 
	      MuspelheimDefaultBiomeFeatures.addPlants(this) ; 
	      MuspelheimDefaultBiomeFeatures.addTrees(this) ; 
	      MuspelheimDefaultBiomeFeatures.addSprings(this) ; 
	}
	
	@OnlyIn(Dist.CLIENT)
	public int getSkyColor() {
		return MuspelheimDefaultBiomeFeatures.SKY_COLOR;
	}
	
}
