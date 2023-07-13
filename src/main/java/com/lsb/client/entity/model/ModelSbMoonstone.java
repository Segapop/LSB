package com.lsb.client.entity.model;

import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;

public class ModelSbMoonstone<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbmoonstone"), "main");
	private final ModelPart head;
	private final ModelPart Hair;
	private final ModelPart Body;
	private final ModelPart arml;
	private final ModelPart armr;
	private final ModelPart legl;
	private final ModelPart legr;
	private final ModelPart Shawl;
	private final ModelPart Skirt;

	public ModelSbMoonstone(ModelPart root) {
		this.head = root.getChild("head");
		this.Hair = root.getChild("Hair");
		this.Body = root.getChild("Body");
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
		this.Shawl = root.getChild("Shawl");
		this.Skirt = root.getChild("Skirt");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition Mask = head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(26, 0).addBox(-3.0F,
				-6.0F, -3.2F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition MaskNose = head.addOrReplaceChild("MaskNose", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, -2.5F, -4.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, -0.1F, -0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0).addBox(
				-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition Pigtails = Hair.addOrReplaceChild("Pigtails", CubeListBuilder.create().texOffs(32, 16).addBox(
				-4.0F, -7.0F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition Doodle = Hair.addOrReplaceChild("Doodle", CubeListBuilder.create().texOffs(0, 44).addBox(-6.0F,
				-8.5F, -1.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bun1 = Hair.addOrReplaceChild("Bun1", CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F,
				-10.5F, 2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bun2 = Hair.addOrReplaceChild("Bun2", CubeListBuilder.create().texOffs(8, 28).addBox(2.0F, -8.0F,
				-1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bun3 = Hair.addOrReplaceChild("Bun3", CubeListBuilder.create().texOffs(8, 34).addBox(-5.0F,
				-8.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bangs = Hair.addOrReplaceChild("Bangs", CubeListBuilder.create().texOffs(24, 45).addBox(-6.0F,
				-8.5F, -3.5F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(8, 16)
				.addBox(-4.0F, 0.0F, 0.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)),
				PartPose.offset(2.0F, 3.0F, -1.5F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(22, 16).addBox(
				3.4F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(-1.7F, 3.5F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(0, 16).addBox(
				-5.4F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(1.7F, 3.5F, 0.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(22, 30).addBox(
				1.4F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2F, 12.0F, 0.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(0, 30).addBox(
				-3.4F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2F, 12.0F, 0.0F));

		PartDefinition Shawl = partdefinition.addOrReplaceChild("Shawl", CubeListBuilder.create().texOffs(34, 29)
				.addBox(-4.5F, -7.0F, -3.0F, 9.0F, 10.0F, 6.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 9.5F, 0.0F));

		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt", CubeListBuilder.create().texOffs(44, 53)
				.addBox(-7.0F, 0.0F, 0.0F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.5F)),
				PartPose.offset(3.5F, 8.0F, -1.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch) {
		this.setRotateAngle(this.head, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.Hair, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.arml, Mth.cos(limbSwing * 0.5F + 3.1415927F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.armr, Mth.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.legl, Mth.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.legr, Mth.cos(limbSwing * 0.5F + 3.1415927F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
	}

	public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public ModelPart getArm(HumanoidArm p_102852_) {
		return p_102852_ == HumanoidArm.LEFT ? this.arml : this.armr;
	}
}