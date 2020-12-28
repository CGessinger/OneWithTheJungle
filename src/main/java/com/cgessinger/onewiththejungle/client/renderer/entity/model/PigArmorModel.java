package com.cgessinger.onewiththejungle.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class PigArmorModel extends BipedModel<LivingEntity>
{
	public PigArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		textureWidth = 64;
		textureHeight = 64;

		ModelRenderer nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(nose);
		nose.setTextureOffset(0, 41).addBox(-2.0F, -7.0F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer tail = new ModelRenderer(this);
		tail.setRotationPoint(1.48F, -0.3159F, 3.5798F);
		bipedRightLeg.addChild(tail);
		setRotationAngle(tail, -0.0436F, 0.0F, 0.0F);

		ModelRenderer tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.02F, -0.1841F, 0.1702F);
		tail.addChild(tail1);
		setRotationAngle(tail1, 0.1309F, 0.0F, 0.0F);
		tail1.setTextureOffset(0, 38).addBox(-0.5F, -0.3634F, -0.9918F, 1.0F, 1.0F, 2.0F, -0.05F, false);

		ModelRenderer tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.02F, -1.3719F, 1.7018F);
		tail.addChild(tail2);
		setRotationAngle(tail2, -0.3491F, 0.0F, 0.0F);
		tail2.setTextureOffset(0, 38).addBox(-0.5F, -0.2807F, -0.9178F, 1.0F, 2.0F, 1.0F, -0.05F, false);

		ModelRenderer tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.02F, -2.4322F, 0.8329F);
		tail.addChild(tail3);
		setRotationAngle(tail3, -0.2182F, 0.0F, 0.0F);
		tail3.setTextureOffset(0, 38).addBox(-0.5F, -0.3274F, -0.8102F, 1.0F, 1.0F, 2.0F, -0.05F, false);

		ModelRenderer tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.02F, -2.6395F, -0.1225F);
		tail.addChild(tail4);
		setRotationAngle(tail4, -0.2182F, 0.0F, 0.0F);
		tail4.setTextureOffset(0, 38).addBox(-0.5F, -0.3318F, -0.7325F, 1.0F, 2.0F, 1.0F, -0.05F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
