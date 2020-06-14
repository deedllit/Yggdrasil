package com.davidmontandon.yggdrasil.world.feature.tree;

import java.util.Random;

import com.davidmontandon.yggdrasil.init.BlockInit;
import com.google.common.collect.ImmutableList;

import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraftforge.common.IPlantable;

public class IronWoodTree extends Tree {

	public IronWoodTree() {
		super() ;
	}
	
	public static final TreeFeatureConfig IRON_WOOD_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.IRON_WOOD_LOG.get().getDefaultState()), 
			new SimpleBlockStateProvider(BlockInit.IRON_WOOD_LEAVES.get().getDefaultState()), 
			new BlobFoliagePlacer(2, 0)))
				.baseHeight(4)
				.heightRandA(2)
				.foliageHeight(3)
				.ignoreVines()
				.setSapling((IPlantable) BlockInit.IRON_WOOD_SAPLING.get())
				.build();

	
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(IRON_WOOD_TREE_CONFIG) ; 
	}
	
	
	
}