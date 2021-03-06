package com.deedllit.yggdrasil.common.fluid;

import com.deedllit.yggdrasil.Yggdrasil;
import com.deedllit.yggdrasil.util.interfaces.IYggdrasilReactiveFluid;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.LavaFluid;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidAttributes;

public class AcidicLiquid extends LavaFluid implements IYggdrasilReactiveFluid {

    public static final ResourceLocation STILL_TEXTURE = new ResourceLocation(Yggdrasil.MOD_ID, "blocks/acidic_still");
    public static final ResourceLocation FLOW_TEXTURE = new ResourceLocation(Yggdrasil.MOD_ID, "blocks/acidic_flowing");
    
    @Override
    public Fluid getFlowingFluid() {
        //return FluidInit.TOBEDONE;
    	return null ; 
    }

    @Override
    public Fluid getStillFluid() {
    	//return FluidInit.TOBEDONE;
    	return null ; 
    }

    @Override
    public Item getFilledBucket() {
    	//return FluidInit.TOBEDONE;
    	return null ; 
    }
    
	@Override
	public boolean reactWithLiquid(World world, BlockPos pos, BlockState state) {
		return false;
	}

    @Override
    protected FluidAttributes createAttributes() {
        return FluidAttributes.builder(STILL_TEXTURE, FLOW_TEXTURE)
                .density(3000)
                .viscosity(3000)
                .luminosity(15)
                .temperature(1000)
                .sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA)
                .build(this);
    }
    
    public static class Source extends AcidicLiquid {
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
	
    public static class Flowing extends AcidicLiquid {
        public Flowing() {
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> container) {
            super.fillStateContainer(container);
            container.add(LEVEL_1_8);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL_1_8);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }


	@Override
	public boolean isSource(FluidState state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLevel(FluidState p_207192_1_) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
