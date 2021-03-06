package com.deedllit.yggdrasil.init;

import com.deedllit.yggdrasil.Yggdrasil;
import com.deedllit.yggdrasil.common.block.YggdrasilFlowerBlock;
import com.deedllit.yggdrasil.common.block.YggdrasilWaterBottomCropsBlock;
import com.deedllit.yggdrasil.common.block.midgard.*;
import com.deedllit.yggdrasil.common.block.muspelheim.*;
import com.deedllit.yggdrasil.init.objects.blocks.*;
import com.deedllit.yggdrasil.objects.blocks.PedestalItemBlock;
import com.deedllit.yggdrasil.objects.blocks.crops.RiceBottomCropBlock;
import com.deedllit.yggdrasil.objects.blocks.crops.RiceTopCropBlock;
import com.deedllit.yggdrasil.objects.blocks.muspelheim.*;
import com.deedllit.yggdrasil.objects.bushes.muspelheim.* ; 
//import com.deedllit.yggdrasil.world.feature.tree.*;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LilyPadBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,  Yggdrasil.MOD_ID) ; 	
	/* GLOBAL
	 * 
	 */
	public static final RegistryObject<Block> VANAFREINTINE_BLOCK = BLOCKS.register("vanafreintine_block",
			() -> new Block(Block.Properties.from(Blocks.GOLD_BLOCK)));
	
	public static final RegistryObject<Block> SULFUR_BLOCK = BLOCKS.register("sulfur",
			() -> new Block(Block.Properties.from(Blocks.GRAVEL)));

	public static final RegistryObject<Block> YGGDRASIL_WOOD = BLOCKS.register("yggdrasil_wood",
			() -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> YGGDRASIL_PLANKS = BLOCKS.register("yggdrasil_planks",
			() -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> RUNE_ORE = BLOCKS.register("rune_ore",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> VANAFREINTINE_ORE = BLOCKS.register("vanafreintine_ore",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F).sound(SoundType.STONE)));
			
	public static final RegistryObject<Block> KIMBERLITE = BLOCKS.register("kimberlite",
			() -> new Block(Block.Properties.from(Blocks.OBSIDIAN)));

	public static final RegistryObject<Block> KIMBERLITE_ORE = BLOCKS.register("kewheatrium_ore",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F).sound(SoundType.STONE)));

	
	/*
	 * SPEICAL BLOCK
	 */
	
	
	public static final RegistryObject<Block> SPECAL_BLOCK = BLOCKS.register("portal_shirne_block",
			() -> new PortalShirneBlock(Block.Properties.create(Material.IRON)
					.hardnessAndResistance(2.0f, 10.0f)
					.harvestLevel(2)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					//.lightValue(4)
					.slipperiness(1.2f)
					.speedFactor(0.7f)
					.noDrops()));
	
	public static final RegistryObject<Block> PEDESTAL_ITEM = BLOCKS.register("pedestal_item",
			() -> new PedestalItemBlock(Block.Properties.from(Blocks.ANVIL)));

	
	/*
	 * 	YGGDRASIL TREE
	 */
	
	public static final RegistryObject<Block> YGGDRASIL_TREE_LOG = BLOCKS.register("yggdrasil_tree_log",
			() ->  new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD)
					.hardnessAndResistance(2.0F)
					.sound(SoundType.WOOD)));

	
	public static final RegistryObject<Block> YGGDRASIL_TREE_LEAVES = BLOCKS.register("yggdrasil_tree_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));


	public static final RegistryObject<Block> IRON_WOOD_LOG = BLOCKS.register("iron_wood_log",
			() ->  new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD)
					.hardnessAndResistance(2.0F)
					.sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> IRON_WOOD_LEAVES = BLOCKS.register("iron_wood_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

	/*
	public static final RegistryObject<Block> IRON_WOOD_SAPLING = BLOCKS.register("iron_wood_sapling",
			() -> new IronWoodSaplingBlock(() -> new IronWoodTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
*/
	
	
	/*
	 * MIDGARD
	 */
	
	
	
	public static final RegistryObject<Block> PISTIA_WATER_LETTUCE = BLOCKS.register("pistia_water_lettuce",
			() -> new WaterLettucePadBlock(AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().zeroHardnessAndResistance().sound(SoundType.field_235600_d_).notSolid()));
	
	public static final RegistryObject<Block> MIDGARD_RICE_TOP_CROP = BLOCKS.register("rice_top_crop",
			() -> new RiceTopCropBlock(Block.Properties.from(Blocks.WHEAT), new Block[] {Blocks.SAND} ));
		
	//MIDGARD_RICE_TOP_CROP.get()
	public static final RegistryObject<Block> MIDGARD_RICE_BOTTOM_CROP = BLOCKS.register("rice_bottom_crop",
			() -> new RiceBottomCropBlock(Block.Properties.from(Blocks.KELP), 
					1, 1, 2, 2,
					new Block[] {Blocks.SAND, Blocks.DIRT, Blocks.CLAY, Blocks.GRAVEL})
			);

	public static final RegistryObject<Block> MIDGARD_MANGROVE_LOG = BLOCKS.register("midgard_mangrove_log",
			() ->  new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD)
					.hardnessAndResistance(2.0F)
					.sound(SoundType.WOOD)));

	public static final RegistryObject<Block> MIDGARD_MANGROVE_PLANKS = BLOCKS.register("midgard_mangrove_planks",
			() -> new Block(Block.Properties.from(Blocks.DARK_OAK_PLANKS)));
	
	public static final RegistryObject<Block> MIDGARD_MANGROVE_LEAVES = BLOCKS.register("midgard_mangrove_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> MIDGARD_PINK_POMELIA_BUSH = BLOCKS.register("midgard_pink_pomelia_bush", 
			() -> new TallFlowerBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));

	public static final RegistryObject<Block> MIDGARD_ORANGE_POMELIA_BUSH = BLOCKS.register("midgard_orange_pomelia_bush", 
			() -> new TallFlowerBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));

	public static final RegistryObject<Block> MIDGARD_WHITE_POMELIA_BUSH = BLOCKS.register("midgard_white_pomelia_bush", 
			() -> new TallFlowerBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));

	public static final RegistryObject<Block> IXIA_VIRIDIFLORA_TEAL_BUSH = BLOCKS.register("ixia_viridiflora_teal_bush", 
			() -> new TallFlowerBlock(AbstractBlock.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> GUZMANIA_RED = BLOCKS.register("guzmania_red",
			() -> new YggdrasilFlowerBlock(PlantType.DESERT, Blocks.SAND, Effects.REGENERATION, 1, Block.Properties.from(Blocks.ALLIUM))) ;

	public static final RegistryObject<Block> GUZMANIA_PINK = BLOCKS.register("guzmania_pink",
			() -> new YggdrasilFlowerBlock(PlantType.DESERT, Blocks.SAND, Effects.REGENERATION, 1, Block.Properties.from(Blocks.ALLIUM))) ;

	public static final RegistryObject<Block> FISH_HOOK = BLOCKS.register("fish_hook",
			() -> new YggdrasilFlowerBlock(PlantType.DESERT, Blocks.SAND, Effects.REGENERATION, 1, Block.Properties.from(Blocks.ALLIUM))) ;

	public static final RegistryObject<Block> DESERT_GRASS = BLOCKS.register("desert_grass",
			() -> new DesertGrass(PlantType.DESERT, new Block[] {Blocks.SAND, Blocks.RED_SAND} , Block.Properties.from(Blocks.GRASS))) ;
	
	
	
	/*
	 *  MUSPELHEIM
	 */		
	
	public static final RegistryObject<Block> MUSPELHEIM_FIRE_POPPY = BLOCKS.register("muspelheim_fire_poppy",
			() -> new FlowerBlock(Effects.FIRE_RESISTANCE, 20, Block.Properties.from(Blocks.ALLIUM))) ;

	/*
	public static final RegistryObject<Block> MUSPELHEIM_FARMLAND_BLOCK = BLOCKS.register("muspelheim_farmland",
			() -> new MuspelheimFarmlandBlock(Block.Properties.from(Blocks.FARMLAND))) ;
	*/
	
	public static final RegistryObject<Block> MUSPELHEIM_HOT_ROCK = BLOCKS.register("muspelheim_hot_rock",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> MUSPELHEIM_COLD_ROCK = BLOCKS.register("muspelheim_cold_rock",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> MUSPELHEIM_STONE = BLOCKS.register("muspelheim_stone",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> MUSPELHEIM_ASH = BLOCKS.register("muspelheim_ash",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> MUSPELHEIM_GRASS = BLOCKS.register("muspelheim_grass",
			() -> new MuspelheimGrass(Block.Properties.from(Blocks.GRASS_BLOCK)));
			
	public static final RegistryObject<Block> MUSPELHEIM_EPLUPHIFER_LOG = BLOCKS.register("muspelheim_epluphifer_log",
			() ->  new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD)
					.hardnessAndResistance(2.0F)
					.sound(SoundType.WOOD)));

	public static final RegistryObject<Block> MUSPELHEIM_EPLUPHIFER_SICK_LOG = BLOCKS.register("muspelheim_epluphifer_sick_log",
			() ->  new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD)
					.hardnessAndResistance(2.0F)
					.sound(SoundType.WOOD)));

	public static final RegistryObject<Block> MUSPELHEIM_EPLUPHIFER_PLANKS = BLOCKS.register("muspelheim_epluphifer_planks",
			() -> new Block(Block.Properties.from(Blocks.DARK_OAK_PLANKS)));
	
	/*
	public static final RegistryObject<Block> MUSPELHEIM_EPLUPHIFER_SAPLING = BLOCKS.register("muspelheim_epluphifer_sapling",
			() -> new YggdrasilSaplingBlock(() -> new EpluphiferTree(), Block.Properties.from(Blocks.OAK_SAPLING)));	
		*/
	public static final RegistryObject<Block> MUSPELHEIM_EPLUPHIFER_LEAVES = BLOCKS.register("muspelheim_epluphifer_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> MUSPELHEIM_IKADAMIA_CROP = BLOCKS.register("muspelheim_ikadamia",
			() -> new  MuspelheimIkadamiaCropBlock(Block.Properties.from(Blocks.WHEAT)));
	
	public static final RegistryObject<Block> MUSPELHEIM_ASH_CARAMBOLA_BUSH = BLOCKS.register("muspelheim_ash_carambola_bush",
			() -> new MuspelheimAshCarambola(Block.Properties.from(Blocks.SWEET_BERRY_BUSH))) ; 
	
	public static final RegistryObject<Block> MUSPELHEIM_DRAGON_GRASS = BLOCKS.register("muspelheim_dragon_grass",
			() -> new MuspelheimDragonGrassBlock(Block.Properties.from(Blocks.TALL_GRASS))) ; 
		
	public static final RegistryObject<Block> MUSPELHEIM_SLIM_GRASS = BLOCKS.register("muspelheim_slim_grass",
			() -> new MuspelheimSlimGrass(Block.Properties.from(Blocks.TALL_GRASS))) ; 

	/*
	 * SVARTALVHEIM
	 */
	
	public static final RegistryObject<Block> SVARTALVHEIM_STONE = BLOCKS.register("svartalvheim_stone",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F).sound(SoundType.STONE)));


}


