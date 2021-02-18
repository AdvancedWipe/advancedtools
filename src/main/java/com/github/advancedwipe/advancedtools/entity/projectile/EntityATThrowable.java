package com.github.advancedwipe.advancedtools.entity.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class EntityATThrowable extends ThrowableEntity {
	
	// Following Code was copied from the TwilightForestMod for understanding the implementation of entities in Minecraft.

	public EntityATThrowable(EntityType<? extends EntityATThrowable> type, World worldIn) {
		super(type, worldIn);
	}

	public EntityATThrowable(EntityType<? extends EntityATThrowable> type, World worldIn, double x, double y, double z) {
		super(type, x, y, z, worldIn);
	}
	
	public EntityATThrowable(EntityType<? extends EntityATThrowable> type, World worldIn, LivingEntity throwerIn) {
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
