package com.davidmontandon.yggdrasil.init;

import com.davidmontandon.yggdrasil.Yggdrasil;
import com.davidmontandon.yggdrasil.container.ItemPedestalContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class YggdrasilContainerTypes {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(
			ForgeRegistries.CONTAINERS, Yggdrasil.MOD_ID);
	
	public static final RegistryObject<ContainerType<ItemPedestalContainer>> ITEM_PEDESTAL = CONTAINER_TYPES
			.register("item_pedestal", () -> IForgeContainerType.create(ItemPedestalContainer::new));
	
}