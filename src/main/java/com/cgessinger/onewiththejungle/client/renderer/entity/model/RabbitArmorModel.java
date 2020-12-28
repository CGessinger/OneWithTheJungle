package com.cgessinger.onewiththejungle.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class RabbitArmorModel extends BipedModel<LivingEntity>
{
	public RabbitArmorModel (float modelSize)
	{
		super(modelSize, 0.0F, 64, 64);
		textureWidth = 64;
		textureHeight = 64;

		ModelRenderer tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(tail);
		tail.setTextureOffset(8, 33).addBox(-2.0F, 7.0F, 2.5F, 4.0F, 4.0F, 3.0F, -0.2F, false);

		ModelRenderer leftEar = new ModelRenderer(this);
		leftEar.setRotationPoint(2.0F, -7.5F, -0.5F);
		bipedHead.addChild(leftEar);
		setRotationAngle(leftEar, 0.0F, -1.309F, 0.0F);
		leftEar.setTextureOffset(0, 32).addBox(-0.5F, -5.5F, -1.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);

		ModelRenderer rightEar = new ModelRenderer(this);
		rightEar.setRotationPoint(-2.0F, -7.5F, -0.5F);
		bipedHead.addChild(rightEar);
		setRotationAngle(rightEar, 0.0F, 1.309F, 0.0F);
		rightEar.setTextureOffset(0, 32).addBox(-0.5F, -5.5F, -1.5F, 1.0F, 5.0F, 3.0F, 0.0F, true);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}