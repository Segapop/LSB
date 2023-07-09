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

public class ModelMoonstone<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelMoonstone"), "main");
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Body;
	private final ModelPart LArm;
	private final ModelPart RArm;
	private final ModelPart LLeg;
	private final ModelPart RLeg;
	private final ModelPart Shawl;
	private final ModelPart Skirt;

	public ModelMoonstone(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = root.getChild("Hair");
		this.Body = root.getChild("Body");
		this.LArm = root.getChild("LArm");
		this.RArm = root.getChild("RArm");
		this.LLeg = root.getChild("LLeg");
		this.RLeg = root.getChild("RLeg");
		this.Shawl = root.getChild("Shawl");
		this.Skirt = root.getChild("Skirt");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition Mask = Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(26, 0).addBox(-3.0F,
				-6.0F, -3.2F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition MaskNose = Head.addOrReplaceChild("MaskNose", CubeListBuilder.create().texOffs(0, 0)
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

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(22, 16).addBox(
				3.4F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(-1.7F, 3.5F, 0.0F));

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(0, 16).addBox(
				-5.4F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offset(1.7F, 3.5F, 0.0F));

		PartDefinition LLeg = partdefinition.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(22, 30).addBox(
				1.4F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2F, 12.0F, 0.0F));

		PartDefinition RLeg = partdefinition.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(0, 30).addBox(
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
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Hair.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Hair.xRot = headPitch / (180F / (float) Math.PI);
		this.LLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}