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

public class ModelChiastolite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelChiastolite"), "main");
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Body;
	private final ModelPart Pants;
	private final ModelPart LArm;
	private final ModelPart RArm;
	private final ModelPart LLeg;
	private final ModelPart RLeg;

	public ModelChiastolite(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = root.getChild("Hair");
		this.Body = root.getChild("Body");
		this.Pants = root.getChild("Pants");
		this.LArm = root.getChild("LArm");
		this.RArm = root.getChild("RArm");
		this.LLeg = root.getChild("LLeg");
		this.RLeg = root.getChild("RLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition Bun = Hair.addOrReplaceChild("Bun", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, 0.0F,
				0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -10.5F, 2.5F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(8, 16).addBox(
				-9.0F, 0.0F, 0.0F, 9.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 6.0F, -2.5F));

		PartDefinition Pants = partdefinition.addOrReplaceChild("Pants", CubeListBuilder.create().texOffs(0, 55).addBox(
				-10.0F, 0.0F, 0.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 11.0F, -3.0F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(0, 16).addBox(
				-2.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 7.0F, 0.0F));

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(36, 16).addBox(
				0.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 7.0F, 0.0F));

		PartDefinition LLeg = partdefinition.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(0, 39).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 14.0F, 0.0F));

		PartDefinition LLegPoof = LLeg.addOrReplaceChild("LLegPoof", CubeListBuilder.create().texOffs(0, 29).addBox(
				-6.0F, 0.0F, 0.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4F, 0.0F, -3.0F));

		PartDefinition RLeg = partdefinition.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(16, 39).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 14.0F, 0.0F));

		PartDefinition RLegPoof = RLeg.addOrReplaceChild("RLegPoof", CubeListBuilder.create().texOffs(24, 29).addBox(
				-6.0F, 0.0F, 0.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.4F, 0.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pants.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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