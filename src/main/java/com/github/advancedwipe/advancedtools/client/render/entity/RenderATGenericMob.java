package com.github.advancedwipe.advancedtools.client.render.entity;

import com.github.advancedwipe.advancedtools.AdvancedToolsMod;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;

public class RenderATGenericMob<T extends MobEntity, M extends EntityModel<T>> extends MobRenderer<T, M> {

	private final ResourceLocation textureLocation;

	public RenderATGenericMob(EntityRendererManager renderManagerIn, M entityModelIn, float shadowSizeIn, String textureName) {
		super(renderManagerIn, entityModelIn, shadowSizeIn);
		
		if (textureName.startsWith("textures")) {
			textureLocation = new ResourceLocation(textureName);
		} else {
			textureLocation = AdvancedToolsMod.getModelTexture(textureName);
		}
	}

	@Override
	public ResourceLocation getEntityTexture(T entity) {
		return null;
	}
}
