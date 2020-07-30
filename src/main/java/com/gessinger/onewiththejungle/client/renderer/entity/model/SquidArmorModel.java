package com.gessinger.onewiththejungle.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SquidArmorModel extends BipedModel<LivingEntity>
{
	public SquidArmorModel (float modelSize)
	{
		super(modelSize, 0.0F, 64, 64);
		textureWidth = 64;
		textureHeight = 64;

		ModelRenderer arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-0.1F, 4.0F, -3.5F);
		bipedRightLeg.addChild(arm2);
		setRotationAngle(arm2, -0.1745F, 0.0F, 0.0F);
		arm2.setTextureOffset(0, 32).addBox(1.0F, -6.9001F, -0.8913F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		ModelRenderer arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(-2.1F, 3.0F, -2.0F);
		bipedRightLeg.addChild(arm3);
		setRotationAngle(arm3, -0.1745F, 0.8727F, 0.0F);
		arm3.setTextureOffset(0, 32).addBox(-0.5553F, -5.8674F, -0.9893F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		ModelRenderer arm4 = new ModelRenderer(this);
		arm4.setRotationPoint(-2.1F, 3.0F, 2.25F);
		bipedRightLeg.addChild(arm4);
		setRotationAngle(arm4, 0.1745F, -0.7854F, 0.0F);
		arm4.setTextureOffset(0, 32).addBox(-1.0F, -5.9842F, -0.9228F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		ModelRenderer arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(2.1F, 4.0F, -2.0F);
		bipedLeftLeg.addChild(arm1);
		setRotationAngle(arm1, -0.1745F, -0.9163F, 0.0F);
		arm1.setTextureOffset(0, 32).addBox(-1.2906F, -6.8822F, -0.993F, 2.0F, 13.0F, 2.0F, 0.0F, true);

		ModelRenderer arm5 = new ModelRenderer(this);
		arm5.setRotationPoint(2.1F, 3.0F, 2.25F);
		bipedLeftLeg.addChild(arm5);
		setRotationAngle(arm5, 0.1745F, 0.7854F, 0.0F);
		arm5.setTextureOffset(0, 32).addBox(-0.6464F, -5.9842F, -0.9228F, 2.0F, 13.0F, 2.0F, 0.0F, true);

		ModelRenderer arm6 = new ModelRenderer(this);
		arm6.setRotationPoint(-3.9F, 3.0F, 3.5F);
		bipedLeftLeg.addChild(arm6);
		setRotationAngle(arm6, 0.1745F, 0.0F, 0.0F);
		arm6.setTextureOffset(0, 32).addBox(1.0F, -6.1324F, -1.5133F, 2.0F, 13.0F, 2.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}