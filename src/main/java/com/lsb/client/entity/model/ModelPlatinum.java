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

public class ModelPlatinum<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelPlatinum"), "main");
	private final ModelPart gemHead;
	private final ModelPart gemHair;
	private final ModelPart gemBody;
	private final ModelPart gemSkirt;
	private final ModelPart gemPelvis;
	private final ModelPart gemLLeg;
	private final ModelPart gemRLeg;
	private final ModelPart gemLArm;
	private final ModelPart gemRArm;

	public ModelPlatinum(ModelPart root) {
		this.gemHead = root.getChild("gemHead");
		this.gemHair = root.getChild("gemHair");
		this.gemBody = root.getChild("gemBody");
		this.gemSkirt = root.getChild("gemSkirt");
		this.gemPelvis = root.getChild("gemPelvis");
		this.gemLLeg = root.getChild("gemLLeg");
		this.gemRLeg = root.getChild("gemRLeg");
		this.gemLArm = root.getChild("gemLArm");
		this.gemRArm = root.getChild("gemRArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gemHead = partdefinition.addOrReplaceChild("gemHead", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition gemHair = partdefinition.addOrReplaceChild("gemHair", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition gemBeehive = gemHair.addOrReplaceChild("gemBeehive",
				CubeListBuilder.create().texOffs(32, 47).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F,
						new CubeDeformation(0.6F, 0.5F, 0.5F)),
				PartPose.offsetAndRotation(0.0F, -5.8F, 1.6F, -0.7428F, 0.0F, 0.0F));

		PartDefinition gemCrystal1 = gemHair.addOrReplaceChild("gemCrystal1", CubeListBuilder.create().texOffs(38, 16)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition gemCrystal2 = gemHair.addOrReplaceChild("gemCrystal2", CubeListBuilder.create().texOffs(38, 32)
				.addBox(-4.0F, -8.0F, 5.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition gemCrystal3 = gemHair.addOrReplaceChild("gemCrystal3", CubeListBuilder.create().texOffs(38, 16)
				.addBox(4.7F, -8.0F, -3.5F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition gemCrystal4 = gemHair.addOrReplaceChild("gemCrystal4", CubeListBuilder.create().texOffs(38, 32)
				.addBox(4.7F, -7.5F, -3.5F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F, 0.5F, 0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition gemBody = partdefinition.addOrReplaceChild("gemBody", CubeListBuilder.create().texOffs(8, 16)
				.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.3F, 0.0F, 0.0F)),
				PartPose.offset(3.0F, -3.0F, -2.5F));

		PartDefinition gemSkirt = partdefinition.addOrReplaceChild("gemSkirt", CubeListBuilder.create().texOffs(0, 44)
				.addBox(-11.0F, 0.0F, 0.0F, 11.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, 5.0F, -3.5F));

		PartDefinition gemPelvis = partdefinition.addOrReplaceChild("gemPelvis", CubeListBuilder.create().texOffs(8, 29)
				.addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F, 0.0F, -0.2F)),
				PartPose.offset(2.0F, 5.0F, -2.0F));

		PartDefinition gemLLeg = partdefinition.addOrReplaceChild("gemLLeg", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-1.3F, 8.0F, 0.0F));

		PartDefinition gemRLeg = partdefinition.addOrReplaceChild("gemRLeg", CubeListBuilder.create().texOffs(30, 34)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(1.3F, 8.0F, 0.0F));

		PartDefinition gemLArm = partdefinition.addOrReplaceChild("gemLArm", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(-3.0F, -2.0F, 0.0F));

		PartDefinition gemLArmPuff = gemLArm.addOrReplaceChild("gemLArmPuff", CubeListBuilder.create().texOffs(8, 39)
				.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 11.5F, -1.5F));

		PartDefinition gemRArm = partdefinition.addOrReplaceChild("gemRArm", CubeListBuilder.create().texOffs(30, 16)
				.addBox(0.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(3.0F, -2.0F, 0.0F));

		PartDefinition gemRArmPuff = gemRArm.addOrReplaceChild("gemRArmPuff", CubeListBuilder.create().texOffs(8, 39)
				.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 11.5F, -1.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gemHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemHair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemSkirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemPelvis.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.gemLArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.gemHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.gemHead.xRot = headPitch / (180F / (float) Math.PI);
		this.gemRArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.gemRLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.gemHair.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.gemHair.xRot = headPitch / (180F / (float) Math.PI);
		this.gemLLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}