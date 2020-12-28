package com.cgessinger.onewiththejungle.client.renderer.entity.model;// Made with Blockbench 3.6.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CowArmorModel extends BipedModel<LivingEntity>
{
	public CowArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 32);

		textureWidth = 64;
		textureHeight = 32;

		ModelRenderer leftHorn = new ModelRenderer(this);
		leftHorn.setRotationPoint(3.5F, -8.5F, -2.0F);
		bipedHead.addChild(leftHorn);
		setRotationAngle(leftHorn, 0.0F, 0.0F, 1.0036F);
		leftHorn.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ModelRenderer leftHorn2 = new ModelRenderer(this);
		leftHorn2.setRotationPoint(0.0F, -2.0F, 0.0F);
		leftHorn.addChild(leftHorn2);
		setRotationAngle(leftHorn2, 0.0F, 0.0F, -0.9163F);
		leftHorn2.setTextureOffset(0, 0).addBox(-0.392F, -0.206F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);

		ModelRenderer leftHorn3 = new ModelRenderer(this);
		leftHorn3.setRotationPoint(-1.65F, -2.418F, 0.5F);
		leftHorn.addChild(leftHorn3);
		leftHorn3.setTextureOffset(0, 0).addBox(0.075F, -0.25F, -0.6F, 2.0F, 1.0F, 1.0F, -0.2F, false);

		ModelRenderer rightHorn = new ModelRenderer(this);
		rightHorn.setRotationPoint(-3.5F, -8.5F, -2.0F);
		bipedHead.addChild(rightHorn);
		setRotationAngle(rightHorn, 0.0F, 0.0F, -1.0036F);
		rightHorn.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		ModelRenderer rightHorn2 = new ModelRenderer(this);
		rightHorn2.setRotationPoint(0.0F, -2.0F, 0.0F);
		rightHorn.addChild(rightHorn2);
		setRotationAngle(rightHorn2, 0.0F, 0.0F, 0.9163F);
		rightHorn2.setTextureOffset(0, 0).addBox(-0.608F, -0.206F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1F, true);

		ModelRenderer rightHorn3 = new ModelRenderer(this);
		rightHorn3.setRotationPoint(1.65F, -2.418F, 0.5F);
		rightHorn.addChild(rightHorn3);
		rightHorn3.setTextureOffset(0, 0).addBox(-2.0751F, -0.25F, -0.6F, 2.0F, 1.0F, 1.0F, -0.2F, true);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}