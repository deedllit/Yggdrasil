package com.deedllit.yggdrasil.init.Material;

import java.util.function.Supplier;

import com.deedllit.yggdrasil.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ToolMaterial implements IItemTier {
	
	//Tier, Durability, efficiency, attack, enchant, supplier
	KEWHEATRIUM(4, 500, 15.0f, 7.0f, 250, () -> {
		return Ingredient.fromItems(ItemInit.KEWHEATRIUM_INGOT.get()) ; 
	}),
	TRAITHIL(4, 500, 15.0f, 7.0f, 250, () -> {
		return Ingredient.fromItems(ItemInit.TRAITHIL_INGOT.get()) ; 
	}),
	RUBRILTH(4, 500, 15.0f, 7.0f, 250, () -> {
		return Ingredient.fromItems(ItemInit.RUBRILTH_INGOT.get()) ; 
	}),
	VANAFREINTINE(4, 500, 15.0f, 7.0f, 250, () -> {
		return Ingredient.fromItems(ItemInit.VANAFREINTINE_INGOT.get()) ; 
	}) ;
	
	private final int harvestLevel; 
	private final int maxUses; 
	private final float efficiency ; 
	private final float attackDamage ;
	private final int enchantability ; 
	private final LazyValue<Ingredient> repairMaterial ;
	
	private ToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel ; 
		this.maxUses = maxUses ;
		this.efficiency = efficiency ;
		this.attackDamage = attackDamage ; 
		this.enchantability = enchantability ; 
		this.repairMaterial = new LazyValue<>(repairMaterial) ; 
		
	}
	
	@Override
	public int getMaxUses() {
		return maxUses; 
	}
	@Override
	public float getEfficiency() {
		return this.efficiency ; 
	}
	@Override
	public float getAttackDamage() {
		return this.attackDamage  ; 
	}
	@Override
	public int getHarvestLevel() {
		return this.harvestLevel ;
	}
	@Override
	public int getEnchantability() {
		return this.enchantability;  
	}
	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue() ; 
	} 
	

}