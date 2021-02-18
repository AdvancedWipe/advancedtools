package com.github.advancedwipe.advancedtools.entity.passiv;

import com.github.advancedwipe.advancedtools.ATSounds;
import com.github.advancedwipe.advancedtools.entity.ATEntities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class EntityATDeer extends AnimalEntity {
	
	// Following Code was copied from the TwilightForestMod for understanding the implementation of entities in Minecraft.

	public EntityATDeer(EntityType<? extends EntityATDeer> type, World worldIn) {
		super(type, worldIn);
	}

	@Override
	protected void registerGoals() {
		goalSelector.addGoal(0, new SwimGoal(this));
		goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
		goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
		goalSelector.addGoal(3, new TemptGoal(this, 1.25D, Ingredient.fromItems(Items.WHEAT), false));
		goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));
		goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 16.0F, 1.5D, 1.8D));
		goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		goalSelector.addGoal(7, new LookRandomlyGoal(this));
	}

	public static AttributeModifierMap.MutableAttribute registerAttributes() {
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 10.0)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2);
	}

	@Override
	public float getEyeHeight(Pose pose) {
		return this.getHeight() * 0.7F;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return ATSounds.DEER_IDLE;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ATSounds.DEER_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return ATSounds.DEER_DEATH;
	}

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
    }

	@Override
	public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity mate) {
		return ATEntities.deer.create(world);
	}
	
	@Override
	protected float getStandingEyeHeight(Pose pos, EntitySize size) {
		return this.isChild() ? size.height * 0.95F : 1.65F;
	}

}
