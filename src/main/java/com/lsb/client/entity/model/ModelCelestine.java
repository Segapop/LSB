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

public class ModelCelestine<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelCelestine"), "main");
	private final ModelPart Hair;
	private final ModelPart Head;
	private final ModelPart Neck;
	private final ModelPart Body;
	private final ModelPart Waist;
	private final ModelPart SkirtBig;
	private final ModelPart Skirt;
	private final ModelPart SkirtEdge;
	private final ModelPart LArm;
	private final ModelPart RArm;

	public ModelCelestine(ModelPart root) {
		this.Hair = root.getChild("Hair");
		this.Head = root.getChild("Head");
		this.Neck = root.getChild("Neck");
		this.Body = root.getChild("Body");
		this.Waist = root.getChild("Waist");
		this.SkirtBig = root.getChild("SkirtBig");
		this.Skirt = root.getChild("Skirt");
		this.SkirtEdge = root.getChild("SkirtEdge");
		this.LArm = root.getChild("LArm");
		this.RArm = root.getChild("RArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0).addBox(
				-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.5F, 0.0F));

		PartDefinition HairBack = Hair.addOrReplaceChild("HairBack", CubeListBuilder.create().texOffs(0, 31)
				.addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F, 0.2F, 0.0F)),
				PartPose.offset(0.0F, 8.2F, 2.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -7.4F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, -25.5F, 0.0F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F, 0.2F, -0.4F)),
				PartPose.offset(1.0F, -25.3F, -1.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(
				-5.0F, 0.0F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -23.2F, -2.0F));

		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(28, 0)
				.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, -0.3F, -0.4F)),
				PartPose.offset(1.5F, -14.7F, -1.5F));

		PartDefinition SkirtBig = partdefinition.addOrReplaceChild("SkirtBig", CubeListBuilder.create().texOffs(8, 40)
				.addBox(-8.0F, 0.0F, 0.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(1.3F, 9.6F, 0.3F)),
				PartPose.offset(4.0F, -3.6F, -3.0F));

		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt", CubeListBuilder.create().texOffs(36, 40)
				.addBox(-8.0F, 0.0F, 0.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.2F, 9.5F, 0.1F)),
				PartPose.offset(4.0F, -3.5F, -3.0F));

		PartDefinition SkirtEdge = partdefinition.addOrReplaceChild("SkirtEdge", CubeListBuilder.create().texOffs(3, 16)
				.addBox(-15.0F, 0.0F, 0.0F, 15.0F, 0.0F, 15.0F, new CubeDeformation(1.3F, 0.0F, 0.3F)),
				PartPose.offset(7.5F, 24.0F, -7.5F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(48, 16)
				.addBox(0.0F, -1.0F, -1.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(2.3F, -22.2F, 0.0F));

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(56, 16)
				.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 22.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-2.3F, -22.2F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SkirtBig.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SkirtEdge.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Hair.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Hair.xRot = headPitch / (180F / (float) Math.PI);
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}