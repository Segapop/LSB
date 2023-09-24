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

public class ModelZoisite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelZoisite"), "main");
	private final ModelPart Head;
	private final ModelPart Chest;
	private final ModelPart ArmL;
	private final ModelPart ArmR;
	private final ModelPart ThighL;
	private final ModelPart ThighR;

	public ModelZoisite(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Chest = root.getChild("Chest");
		this.ArmL = root.getChild("ArmL");
		this.ArmR = root.getChild("ArmR");
		this.ThighL = root.getChild("ThighL");
		this.ThighR = root.getChild("ThighR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -6.3F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.0F)), PartPose.offset(0.0F, -3.2F, 1.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F,
				-6.3F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(8, 16)
				.addBox(-5.0F, 0.0F, 0.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(-0.2F, 0.2F, -0.4F)),
				PartPose.offset(2.5F, -2.2F, -1.0F));

		PartDefinition ArmL = partdefinition.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(0, 16)
				.addBox(0.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(2.0F, -1.3F, 1.0F));

		PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR", CubeListBuilder.create().texOffs(26, 16)
				.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(-2.0F, -1.3F, 1.0F));

		PartDefinition ThighL = partdefinition.addOrReplaceChild("ThighL", CubeListBuilder.create().texOffs(0, 31)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(1.1F, 9.0F, 1.0F));

		PartDefinition ThighR = partdefinition.addOrReplaceChild("ThighR", CubeListBuilder.create().texOffs(26, 31)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-1.1F, 9.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ThighL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ThighR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.ThighL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.ArmR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.ThighR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.ArmL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}