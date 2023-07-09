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

public class ModelPyrite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelPyrite"), "Main");
	private final ModelPart gemHead;
	private final ModelPart gemBody;
	private final ModelPart gemLArm;
	private final ModelPart gemRArm;
	private final ModelPart gemHair;
	private final ModelPart gemSkirt1;
	private final ModelPart gemSkirt2;
	private final ModelPart gemRLeg;
	private final ModelPart gemLLeg;

	public ModelPyrite(ModelPart root) {
		this.gemHead = root.getChild("gemHead");
		this.gemBody = root.getChild("gemBody");
		this.gemLArm = root.getChild("gemLArm");
		this.gemRArm = root.getChild("gemRArm");
		this.gemHair = root.getChild("gemHair");
		this.gemSkirt1 = root.getChild("gemSkirt1");
		this.gemSkirt2 = root.getChild("gemSkirt2");
		this.gemRLeg = root.getChild("gemRLeg");
		this.gemLLeg = root.getChild("gemLLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gemHead = partdefinition.addOrReplaceChild("gemHead", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemBody = partdefinition.addOrReplaceChild("gemBody", CubeListBuilder.create().texOffs(12, 16)
				.addBox(-7.0F, 0.0F, 0.0F, 7.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 0.0F, -2.5F));

		PartDefinition gemSkirt = gemBody.addOrReplaceChild("gemSkirt", CubeListBuilder.create().texOffs(88, 22).addBox(
				-10.0F, 0.0F, 0.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 8.5F, -2.5F));

		PartDefinition gemLArm = partdefinition.addOrReplaceChild("gemLArm", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-9.5F, -1.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(3.2F, 1.0F, 0.0F));

		PartDefinition gemRArm = partdefinition.addOrReplaceChild("gemRArm", CubeListBuilder.create().texOffs(36, 16)
				.addBox(6.6F, -1.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-3.3F, 1.0F, 0.0F));

		PartDefinition gemHair = partdefinition.addOrReplaceChild("gemHair", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemBeehiveHair = gemHair.addOrReplaceChild("gemBeehiveHair", CubeListBuilder.create()
				.texOffs(64, 0).addBox(-4.5F, -7.0F, -4.0F, 9.0F, 9.0F, 8.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, -2.0F, 1.5F));

		PartDefinition gemSkirt1 = partdefinition.addOrReplaceChild("gemSkirt1", CubeListBuilder.create()
				.texOffs(64, 41).addBox(-16.0F, 0.0F, 0.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 17.0F, -8.0F));

		PartDefinition gemSkirt2 = partdefinition.addOrReplaceChild("gemSkirt2", CubeListBuilder.create()
				.texOffs(48, 17).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 10.0F, -3.5F));

		PartDefinition gemRLeg = partdefinition.addOrReplaceChild("gemRLeg", CubeListBuilder.create().texOffs(32, 31)
				.addBox(1.6F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-1.8F, 12.0F, 0.0F));

		PartDefinition gemLLeg = partdefinition.addOrReplaceChild("gemLLeg", CubeListBuilder.create().texOffs(0, 31)
				.addBox(-5.6F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(1.8F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gemHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemHair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemSkirt1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemSkirt2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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