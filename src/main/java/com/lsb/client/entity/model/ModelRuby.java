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

public class ModelRuby<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelRuby"), "main");
	private final ModelPart gemHead;
	private final ModelPart gemRightLeg;
	private final ModelPart gemLeftArm;
	private final ModelPart gemLeftLeg;
	private final ModelPart gemBody;
	private final ModelPart gemRightArm;
	private final ModelPart gemSkirt;
	private final ModelPart gemShawl;

	public ModelRuby(ModelPart root) {
		this.gemHead = root.getChild("gemHead");
		this.gemRightLeg = root.getChild("gemRightLeg");
		this.gemLeftArm = root.getChild("gemLeftArm");
		this.gemLeftLeg = root.getChild("gemLeftLeg");
		this.gemBody = root.getChild("gemBody");
		this.gemRightArm = root.getChild("gemRightArm");
		this.gemSkirt = root.getChild("gemSkirt");
		this.gemShawl = root.getChild("gemShawl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gemHead = partdefinition.addOrReplaceChild("gemHead", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-7.0F, -7.0F, -4.5F, 14.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition gemHeadTop = gemHead.addOrReplaceChild("gemHeadTop", CubeListBuilder.create().texOffs(0, 38)
				.addBox(-7.0F, -11.0F, -4.5F, 14.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHeadPoint = gemHead.addOrReplaceChild("gemHeadPoint", CubeListBuilder.create().texOffs(0, 51)
				.addBox(-5.0F, -11.0F, -4.5F, 10.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHair = gemHead.addOrReplaceChild("gemHair", CubeListBuilder.create().texOffs(48, 0).addBox(
				-4.0F, -8.0F, -4.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHead2 = gemHead.addOrReplaceChild("gemHead2", CubeListBuilder.create().texOffs(38, 48).addBox(
				-4.0F, -8.0F, -4.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemCrown = gemHead.addOrReplaceChild("gemCrown", CubeListBuilder.create().texOffs(16, 30).addBox(
				-3.6F, -12.3F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHornRightLow = gemHead.addOrReplaceChild("gemHornRightLow", CubeListBuilder.create()
				.texOffs(0, 0).addBox(4.0F, -4.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHornRightHigh = gemHead.addOrReplaceChild("gemHornRightHigh", CubeListBuilder.create()
				.texOffs(0, 1).addBox(4.0F, -7.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHornHorn = gemHead.addOrReplaceChild("gemHornHorn", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -5.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemPomp = gemHead.addOrReplaceChild("gemPomp", CubeListBuilder.create().texOffs(62, 47)
				.addBox(-6.0F, -12.0F, -3.5F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 4.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHeadSideRight = gemHead.addOrReplaceChild("gemHeadSideRight",
				CubeListBuilder.create().texOffs(72, 24).mirror()
						.addBox(-6.5F, -6.0F, -4.5F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.0F, 1.0F, 0.0F))
						.mirror(false),
				PartPose.offset(10.5F, 0.0F, 0.0F));

		PartDefinition gemHeadSideLeft = gemHead
				.addOrReplaceChild(
						"gemHeadSideLeft", CubeListBuilder.create().texOffs(72, 24).addBox(4.5F, -6.0F, -4.5F, 2.0F,
								5.0F, 9.0F, new CubeDeformation(0.0F, 1.0F, 0.0F)),
						PartPose.offset(-10.5F, 0.0F, 0.0F));

		PartDefinition gemBunLeft = gemHead.addOrReplaceChild("gemBunLeft", CubeListBuilder.create().texOffs(72, 0)
				.addBox(3.5F, -11.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemBunRight = gemHead.addOrReplaceChild("gemBunRight",
				CubeListBuilder.create().texOffs(72, 0).mirror()
						.addBox(-7.5F, -11.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemRightLeg = partdefinition.addOrReplaceChild("gemRightLeg", CubeListBuilder.create()
				.texOffs(58, 20).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 18.0F, 0.0F));

		PartDefinition gemLeftArm = partdefinition.addOrReplaceChild("gemLeftArm", CubeListBuilder.create()
				.texOffs(42, 16).addBox(-4.0F, -1.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 10.5F, 0.0F));

		PartDefinition gemLeftArmPoof = gemLeftArm.addOrReplaceChild("gemLeftArmPoof", CubeListBuilder.create()
				.texOffs(37, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F, 0.2F, 0.4F)),
				PartPose.offset(-2.0F, -2.0F, 0.0F));

		PartDefinition gemLeftArmBand = gemLeftArm
				.addOrReplaceChild(
						"gemLeftArmBand", CubeListBuilder.create().texOffs(84, 38).addBox(-2.0F, 3.5F, -2.0F, 4.0F,
								3.0F, 4.0F, new CubeDeformation(0.4F, 0.2F, 0.4F)),
						PartPose.offset(-2.0F, -2.0F, 0.0F));

		PartDefinition gemLeftLeg = partdefinition.addOrReplaceChild("gemLeftLeg", CubeListBuilder.create()
				.texOffs(0, 28).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 18.0F, 0.0F));

		PartDefinition gemBody = partdefinition.addOrReplaceChild("gemBody", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-4.0F, -4.5F, -2.5F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.5F, 0.0F));

		PartDefinition gemRightArm = partdefinition.addOrReplaceChild("gemRightArm", CubeListBuilder.create()
				.texOffs(0, 16).addBox(0.0F, -1.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 10.5F, 0.0F));

		PartDefinition gemRightArmPoof = gemRightArm.addOrReplaceChild("gemRightArmPoof", CubeListBuilder.create()
				.texOffs(37, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F, 0.2F, 0.4F)),
				PartPose.offset(2.0F, -2.0F, 0.0F));

		PartDefinition gemRightArmBand = gemRightArm.addOrReplaceChild("gemRightArmBand", CubeListBuilder.create()
				.texOffs(84, 38).addBox(-2.0F, 3.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F, 0.2F, 0.4F)),
				PartPose.offset(2.0F, -2.0F, 0.0F));

		PartDefinition gemSkirt = partdefinition.addOrReplaceChild("gemSkirt", CubeListBuilder.create().texOffs(44, 30)
				.addBox(-6.0F, -4.5F, -2.5F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 19.5F, -1.5F));

		PartDefinition gemShawl = partdefinition.addOrReplaceChild("gemShawl", CubeListBuilder.create().texOffs(70, 16)
				.addBox(-10.0F, -3.5F, -0.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(3.0F, 0.0F, 1.0F)),
				PartPose.offset(4.5F, 12.0F, -1.5F));

		return LayerDefinition.create(meshdefinition, 100, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gemHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemSkirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemShawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.gemHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.gemHead.xRot = headPitch / (180F / (float) Math.PI);
		this.gemRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.gemLeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.gemLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.gemRightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}