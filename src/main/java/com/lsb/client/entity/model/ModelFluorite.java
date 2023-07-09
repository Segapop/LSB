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

public class ModelFluorite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelFluorite"), "main");
	private final ModelPart Head;
	private final ModelPart Chest;
	private final ModelPart Waist;
	private final ModelPart Hips;
	private final ModelPart LShoulder;
	private final ModelPart RShoulder;
	private final ModelPart LThigh;
	private final ModelPart RThigh;

	public ModelFluorite(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Chest = root.getChild("Chest");
		this.Waist = root.getChild("Waist");
		this.Hips = root.getChild("Hips");
		this.LShoulder = root.getChild("LShoulder");
		this.RShoulder = root.getChild("RShoulder");
		this.LThigh = root.getChild("LThigh");
		this.RThigh = root.getChild("RThigh");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -5.6F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-2.2F)),
				PartPose.offset(-0.2F, 13.5F, -0.2F));

		PartDefinition Head2 = Head.addOrReplaceChild("Head2", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F,
				-6.6F, -3.8F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-2.2F)), PartPose.offset(0.0F, 0.0F, -0.2F));

		PartDefinition HeadTop = Head.addOrReplaceChild("HeadTop", CubeListBuilder.create().texOffs(36, 16)
				.addBox(-3.0F, -0.7F, -4.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-2.0F, -0.5F, -2.0F)),
				PartPose.offset(-0.5F, -4.2F, 0.5F));

		PartDefinition HeadBottom = Head.addOrReplaceChild("HeadBottom", CubeListBuilder.create().texOffs(36, 25)
				.addBox(-3.0F, -7.3F, -4.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-2.0F, -0.5F, -2.0F)),
				PartPose.offset(-0.5F, 6.0F, 0.5F));

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-6.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(-2.4F, -1.5F, -1.2F)),
				PartPose.offset(1.8F, 12.5F, -0.2F));

		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(18, 35)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-1.2F, -0.6F, -0.6F)),
				PartPose.offset(-0.2F, 15.4F, 0.8F));

		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 43)
				.addBox(-6.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(-2.4F, -1.5F, -1.2F)),
				PartPose.offset(1.8F, 15.3F, -0.2F));

		PartDefinition LShoulder = partdefinition.addOrReplaceChild("LShoulder", CubeListBuilder.create().texOffs(0, 25)
				.addBox(-1.2F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.2F, -1.7F, -1.2F)),
				PartPose.offset(1.4F, 14.8F, -0.2F));

		PartDefinition Larm = LShoulder.addOrReplaceChild("Larm", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F,
				0.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.7F, -1.7F, -0.7F)),
				PartPose.offset(1.8F, 0.1F, -1.0F));

		PartDefinition RShoulder = partdefinition.addOrReplaceChild("RShoulder",
				CubeListBuilder.create().texOffs(16, 25).addBox(-2.8F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(-1.2F, -1.7F, -1.2F)),
				PartPose.offset(-1.8F, 14.8F, -0.2F));

		PartDefinition RArm = RShoulder.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(8, 35).addBox(-2.0F,
				0.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.7F, -1.7F, -0.7F)),
				PartPose.offset(0.2F, 0.1F, -1.0F));

		PartDefinition LThigh = partdefinition.addOrReplaceChild("LThigh", CubeListBuilder.create().texOffs(32, 34)
				.addBox(-2.0F, -1.7F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.2F, -1.7F, -1.2F)),
				PartPose.offset(0.6F, 18.8F, -0.2F));

		PartDefinition LLeg = LThigh.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(36, 44).addBox(-2.0F,
				0.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.7F, -1.7F, -0.7F)),
				PartPose.offset(1.0F, 0.9F, -1.0F));

		PartDefinition RThigh = partdefinition.addOrReplaceChild("RThigh", CubeListBuilder.create().texOffs(48, 34)
				.addBox(-2.0F, -1.7F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-1.2F, -1.7F, -1.2F)),
				PartPose.offset(-1.0F, 18.8F, -0.2F));

		PartDefinition RLeg = RThigh.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(52, 44).addBox(-2.0F,
				0.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.7F, -1.7F, -0.7F)),
				PartPose.offset(1.0F, 0.9F, -1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LShoulder.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RShoulder.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LThigh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RThigh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RShoulder.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RThigh.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LThigh.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LShoulder.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}