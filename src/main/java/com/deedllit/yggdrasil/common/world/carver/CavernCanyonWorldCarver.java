package com.deedllit.yggdrasil.common.world.carver;

import java.util.BitSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.carver.CanyonWorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;

/*
 * Strongly inspired by https://github.com/kegare/Cavern-Miner
 */

public class CavernCanyonWorldCarver extends CanyonWorldCarver
{
	public CavernCanyonWorldCarver(Codec<ProbabilityConfig> config) {
		super(config);
	}

	private final float[] parabolic = new float[1024];

	/*
	public CavernCanyonWorldCarver(Function<Dynamic<?>, ? extends ProbabilityConfig> config)
	{
		super(config);
	}
	*/

	public boolean func_225555_a_(IChunk chunk, Function<BlockPos, Biome> biomes, Random rand, int seaLevel, int chunkX, int chunkZ, int globalX, int globalZ, BitSet carvingMask, ProbabilityConfig config)
	{
		int i = (func_222704_c() * 2 - 1) * 16;
		double blockX = chunkX * 16 + rand.nextInt(16);
		double blockY = rand.nextInt(rand.nextInt(rand.nextInt(80) + 8) + 70);
		double blockZ = chunkZ * 16 + rand.nextInt(16);
		float leftRightRadian = rand.nextFloat() * ((float)Math.PI * 2.0F);
		float upDownRadian = (rand.nextFloat() - 0.5F) * 2.0F / 8.0F;
		float scale = (rand.nextFloat() * 2.0F + rand.nextFloat()) * 2.0F;
		int targetY = i - rand.nextInt(i / 4);

		genCanyon(chunk, biomes, rand.nextLong(), seaLevel, globalX, globalZ, blockX, blockY, blockZ, scale, leftRightRadian, upDownRadian, 0, targetY, 9.0D, carvingMask);

		return true;
	}

	protected void genCanyon(IChunk chunk, Function<BlockPos, Biome> biomes, long seed, int seaLevel, int globalX, int globalZ, double blockX, double blockY, double blockZ, float scale, float leftRightRadian, float upDownRadian, int startY, int targetY, double scaleHeight, BitSet carvingMask)
	{
		Random random = new Random(seed);
		float f = 1.0F;

		for (int i = 0; i < 256; ++i)
		{
			if (i == 0 || random.nextInt(3) == 0)
			{
				f = 1.0F + random.nextFloat() * random.nextFloat();
			}

			parabolic[i] = f * f;
		}

		float leftRightChange = 0.0F;
		float upDownChange = 0.0F;

		for (int currentY = startY; currentY < targetY; ++currentY)
		{
			double roomWidth = 1.5D + MathHelper.sin(currentY * (float)Math.PI / targetY) * scale;
			double roomHeight = roomWidth * scaleHeight;
			roomWidth = roomWidth * (random.nextFloat() * 0.25D + 0.75D);
			roomHeight = roomHeight * (random.nextFloat() * 0.25D + 0.75D);
			float moveHorizontal = MathHelper.cos(upDownRadian);
			float moveVertical = MathHelper.sin(upDownRadian);
			blockX += MathHelper.cos(leftRightRadian) * moveHorizontal;
			blockY += moveVertical;
			blockZ += MathHelper.sin(leftRightRadian) * moveHorizontal;
			upDownRadian = upDownRadian * 0.7F;
			upDownRadian = upDownRadian + upDownChange * 0.05F;
			leftRightRadian += leftRightChange * 0.05F;
			upDownChange = upDownChange * 0.8F;
			leftRightChange = leftRightChange * 0.5F;
			upDownChange = upDownChange + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
			leftRightChange = leftRightChange + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;

			if (random.nextInt(4) != 0)
			{
				if (!func_222702_a(globalX, globalZ, blockX, blockZ, currentY, targetY, scale))
				{
					return;
				}

				func_227208_a_(chunk, biomes, seed, seaLevel, globalX, globalZ, blockX, blockY, blockZ, roomWidth, roomHeight, carvingMask);
			}
		}
	}

	protected boolean func_225556_a_(IChunk chunk, Function<BlockPos, Biome> biomes, BitSet carvingMask, Random rand, BlockPos.Mutable posHere, BlockPos.Mutable posAbove, BlockPos.Mutable posBelow, int seaLevel, int chunkX, int chunkZ, int globalX, int globalZ, int x, int y, int z, AtomicBoolean foundSurface)
	{
		int i = x | z << 4 | y << 8;

		if (carvingMask.get(i))
		{
			return false;
		}
		else
		{
			carvingMask.set(i);
			posHere.setPos(globalX, y, globalZ);

			BlockState stateHere = chunk.getBlockState(posHere);
			BlockState stateAbove = chunk.getBlockState(posAbove.setPos(posHere).move(Direction.UP));

			if (!canCarveBlock(stateHere, stateAbove))
			{
				return false;
			}
			else
			{
				if (y < 11)
				{
					chunk.setBlockState(posHere, LAVA.getBlockState(), false);
				}
				else
				{
					chunk.setBlockState(posHere, CAVE_AIR, false);
				}

				return true;
			}
		}
	}
}