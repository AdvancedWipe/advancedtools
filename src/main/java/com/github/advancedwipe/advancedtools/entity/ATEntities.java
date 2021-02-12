package com.github.advancedwipe.advancedtools.entity;

import java.util.ArrayList;
import java.util.List;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.entity.projectile.EntityATHoneyBall;
import com.github.advancedwipe.advancedtools.util.ATEntityNames;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AdvancedToolsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ATEntities {
	
	private static final List<EntityType<?>> ALL = new ArrayList<>();
	
	public static final EntityType<EntityATHoneyBall> honey_bolt = build(ATEntityNames.HONEY_BOLT, makeCastedBuilder(EntityATHoneyBall.class, 
			EntityATHoneyBall::new, EntityClassification.MISC).size(0.25F, 0.25F).setTrackingRange(150).setUpdateInterval(5));
	
	private static <E extends Entity> EntityType.Builder<E> makeCastedBuilder(@SuppressWarnings("unused") Class<E> cast, EntityType.IFactory<E> factory, EntityClassification classification) {
		return makeBuilder(factory, classification);
	}
	
	private static <E extends Entity> EntityType.Builder<E> makeBuilder(EntityType.IFactory<E> factory, EntityClassification classification) {
		return EntityType.Builder.create(factory, classification).
				size(0.6F, 1.8F).
				setTrackingRange(80).
				setUpdateInterval(3).	
				setShouldReceiveVelocityUpdates(true);
	}
	
	@SuppressWarnings("unchecked")
	private static <E extends Entity> EntityType<E> build(ResourceLocation id, EntityType.Builder<E> builder) {
		EntityType<E> ret = (EntityType<E>) builder.build(id.toString()).setRegistryName(id);
		ALL.add(ret);
		return ret;
	}
	
	@OnlyIn(Dist.CLIENT)
	public static void registerEntities() {
		
		RenderingRegistry.registerEntityRenderingHandler(honey_bolt, m -> new SpriteRenderer<>(m, Minecraft.getInstance().getItemRenderer()));
		
	}		
}
	