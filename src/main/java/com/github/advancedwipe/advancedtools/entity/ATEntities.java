package com.github.advancedwipe.advancedtools.entity;

import java.util.ArrayList;
import java.util.List;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;
import com.github.advancedwipe.advancedtools.client.model.entity.ModelATDeer;
import com.github.advancedwipe.advancedtools.client.render.entity.RenderATGenericMob;
import com.github.advancedwipe.advancedtools.entity.passiv.EntityATDeer;
import com.github.advancedwipe.advancedtools.entity.projectile.EntityATTwilightWandBolt;
import com.github.advancedwipe.advancedtools.item.ATItems;
import com.github.advancedwipe.advancedtools.util.ATEntityNames;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = AdvancedToolsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ATEntities {
	
	// Following Code was copied from the TwilightForestMod for understanding the implementation of entities in Minecraft.
	
	private static final List<EntityType<?>> ALL = new ArrayList<>();
	public static final EntityType<EntityATDeer> deer = make(ATEntityNames.DEER, EntityATDeer::new, EntityClassification.CREATURE, 0.7F, 1.8F);
	
	public static final EntityType<EntityATTwilightWandBolt> wand_bolt = build(ATEntityNames.WAND_BOLT, makeCastedBuilder(EntityATTwilightWandBolt.class, EntityATTwilightWandBolt::new, EntityClassification.MISC).size(0.25F, 0.25F).setTrackingRange(150).setUpdateInterval(5));

	
	
	
	private static <E extends Entity> EntityType<E> make(ResourceLocation id, EntityType.IFactory<E> factory, EntityClassification classification, float width, float height) {
		return build(id, makeBuilder(factory, classification).size(width, height));
	}

	private static <E extends Entity> EntityType<E> make(ResourceLocation id, EntityType.IFactory<E> factory, EntityClassification classification) {
		return make(id, factory, classification, 0.6F, 1.8F);
	}
	
	@SuppressWarnings("unchecked")
	private static <E extends Entity> EntityType<E> build(ResourceLocation id, EntityType.Builder<E> builder) {
		boolean cache = SharedConstants.useDatafixers;
		SharedConstants.useDatafixers = false;
		EntityType<E> ret = (EntityType<E>) builder.build(id.toString()).setRegistryName(id);
		SharedConstants.useDatafixers = cache;
		ALL.add(ret);
		return ret;
	}
	
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
	
	private static Item spawnEgg(EntityType<?> type, int color, int color2) {
		ResourceLocation eggId = new ResourceLocation(type.getRegistryName().getNamespace(), type.getRegistryName().getPath() + "_spawn_egg");
		return new SpawnEggItem(type, color, color2, ATItems.defaultBuilder()).setRegistryName(eggId);
	}
	
	
	
	
	@SubscribeEvent
	public static void registerSpawnEggs(RegistryEvent.Register<Item> evt) {
		IForgeRegistry<Item> r = evt.getRegistry();
		r.register(spawnEgg(deer, 0x7b4d2e, 0x4b241d));
	}
	
	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> evt) {
		evt.getRegistry().registerAll(ALL.toArray(new EntityType<?>[0]));
		
		EntitySpawnPlacementRegistry.register(deer, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
	}
	
	public static void addEntityAttributes() {
		GlobalEntityTypeAttributes.put(deer, EntityATDeer.registerAttributes().create());
	}
	
	@OnlyIn(Dist.CLIENT)
	public static void registerEntityRenderer() {
		RenderingRegistry.registerEntityRenderingHandler(deer, m -> new RenderATGenericMob<>(m, new ModelATDeer(), 0.7F, "wilddeer.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(wand_bolt, m -> new SpriteRenderer<>(m, Minecraft.getInstance().getItemRenderer()));
	}

	
}
