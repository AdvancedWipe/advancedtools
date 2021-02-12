package com.github.advancedwipe.advancedtools.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public abstract class ATEntityThrowable extends ThrowableEntity {

	public ATEntityThrowable(EntityType<? extends ATEntityThrowable> type, World worldIn) {
		super(type, worldIn);
	}
	
	public ATEntityThrowable(EntityType<? extends ATEntityThrowable> type, double x, double y, double z, World worldIn) {
		super(type, x, y, z, worldIn);
	}

	public ATEntityThrowable(EntityType<? extends ATEntityThrowable> type, LivingEntity throwerIn, World worldIn) {
		super(type, throwerIn, worldIn);
	}

	@Override
	protected void registerData() {
		
	}
	
	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}
