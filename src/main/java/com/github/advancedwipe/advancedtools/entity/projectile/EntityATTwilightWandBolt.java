package com.github.advancedwipe.advancedtools.entity.projectile;

import com.github.advancedwipe.advancedtools.entity.ATEntities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(value = Dist.CLIENT, _interface = IRendersAsItem.class)
public class EntityATTwilightWandBolt extends EntityATThrowable implements IRendersAsItem {
	
	// Following Code was copied from the TwilightForestMod for understanding the implementation of entities in Minecraft.

	public EntityATTwilightWandBolt(EntityType<? extends EntityATTwilightWandBolt> type, World world) {
		super(type, world);
	}
	
	public EntityATTwilightWandBolt(World world, LivingEntity thrower) {
		super(ATEntities.wand_bolt, world, thrower);
		func_234612_a_(thrower, thrower.rotationPitch, thrower.rotationYaw, 0, 1.5F, 1.0F);
	}
	
	@Override
	public void tick() {
		super.tick();
		makeTrail();
	}

	private void makeTrail() {
		for (int i = 0; i < 5; i++) {
			double dx = getPosX() + 0.5 * (rand.nextDouble() - rand.nextDouble());
			double dy = getPosY() + 0.5 * (rand.nextDouble() - rand.nextDouble());
			double dz = getPosZ() + 0.5 * (rand.nextDouble() - rand.nextDouble());

			double s1 = ((rand.nextFloat() * 0.5F) + 0.5F) * 0.17F;  // color
			double s2 = ((rand.nextFloat() * 0.5F) + 0.5F) * 0.80F;  // color
			double s3 = ((rand.nextFloat() * 0.5F) + 0.5F) * 0.69F;  // color

			world.addParticle(ParticleTypes.ENTITY_EFFECT, dx, dy, dz, s1, s2, s3);
		}
	}
	
	@Override
	protected float getGravityVelocity() {
		return 0.003F;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void handleStatusUpdate(byte id) {
		if (id == 3) {
			IParticleData particle = new ItemParticleData(ParticleTypes.ITEM, new ItemStack(Items.ENDER_PEARL));
			for (int i = 0; i < 8; i++) {
				this.world.addParticle(particle, false, this.getPosX(), this.getPosY(), this.getPosZ(), rand.nextGaussian() * 0.05D, rand.nextDouble() * 0.2D, rand.nextGaussian() * 0.05D);
			}
		} else {
			super.handleStatusUpdate(id);
		}
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (!this.world.isRemote) {
			if (result instanceof EntityRayTraceResult) {
				if (((EntityRayTraceResult)result).getEntity() instanceof LivingEntity) {
					((EntityRayTraceResult)result).getEntity().attackEntityFrom(DamageSource.causeIndirectMagicDamage(this, this.func_234616_v_()), 6);
				}
			}

			this.world.setEntityState(this, (byte) 3);
			this.remove();
		}
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		super.attackEntityFrom(source, amount);

		if (!this.world.isRemote && source.getTrueSource() != null) {
			Vector3d vec3d = source.getTrueSource().getLookVec();
			// reflect faster and more accurately
			this.shoot(vec3d.x, vec3d.y, vec3d.z, 1.5F, 0.1F);

			if (source.getImmediateSource() instanceof LivingEntity) {
				this.setShooter(source.getImmediateSource());
			}
			return true;
		}

		return false;
	}

	@Override
	public ItemStack getItem() {
		// TODO Auto-generated method stub
		return null;
	}
}