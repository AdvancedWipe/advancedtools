package com.github.advancedwipe.advancedtools.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;


// Just for testing

//public class TutorialEntity extends CreatureEntity {
//
//	@SuppressWarnings("unchecked")
//	public TutorialEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
//		super((EntityType<? extends CreatureEntity>) WWEntities.tutorial_entity, worldIn);
//	}
//	
//	@Override
//	protected void registerGoals() {
//		this.goalSelector.addGoal(0, new SwimGoal(this));
//		this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
//		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
//	}
//
//	public static AttributeModifierMap.MutableAttribute registerAttributes() {
//		return MobEntity.func_233666_p_()
//				.createMutableAttribute(Attributes.MAX_HEALTH, 10.0)
//				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2);
//	}
//}
