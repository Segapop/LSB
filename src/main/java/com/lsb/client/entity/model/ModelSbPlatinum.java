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

public class ModelSbPlatinum<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbplatinum"), "main");
	private final ModelPart head;
	private final ModelPart hair;
	private final ModelPart body;
	private final ModelPart skirt;
	private final ModelPart pelvis;
	private final ModelPart legl;
	private final ModelPart legr;
	private final ModelPart arml;
	private final ModelPart armr;

	public ModelSbPlatinum(ModelPart root) {
		this.head = root.getChild("head");
		this.hair = root.getChild("hair");
		this.body = root.getChild("body");
		this.skirt = root.getChild("skirt");
		this.pelvis = root.getChild("pelvis");
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition hair = partdefinition.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition beehive = hair.addOrReplaceChild("beehive",
				CubeListBuilder.create().texOffs(32, 47).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F,
						new CubeDeformation(0.6F, 0.5F, 0.5F)),
				PartPose.offsetAndRotation(0.0F, -5.8F, 1.6F, -0.7428F, 0.0F, 0.0F));

		PartDefinition crystal1 = hair.addOrReplaceChild("crystal1", CubeListBuilder.create().texOffs(38, 16)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition crystal2 = hair.addOrReplaceChild("crystal2", CubeListBuilder.create().texOffs(38, 32)
						.addBox(-4.0F, -8.0F, 5.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition crystal3 = hair.addOrReplaceChild("crystal3", CubeListBuilder.create().texOffs(38, 16)
						.addBox(4.7F, -8.0F, -3.5F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition crystal4 = hair.addOrReplaceChild("crystal4", CubeListBuilder.create().texOffs(38, 32)
						.addBox(4.7F, -7.5F, -3.5F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F, 0.5F, 0.0F)),
				PartPose.offset(0.0F, -8.5F, -0.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(8, 16)
						.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.3F, 0.0F, 0.0F)),
				PartPose.offset(3.0F, -3.0F, -2.5F));

		PartDefinition skirt = partdefinition.addOrReplaceChild("skirt", CubeListBuilder.create().texOffs(0, 44)
						.addBox(-11.0F, 0.0F, 0.0F, 11.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, 5.0F, -3.5F));

		PartDefinition pelvis = partdefinition.addOrReplaceChild("pelvis", CubeListBuilder.create().texOffs(8, 29)
						.addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F, 0.0F, -0.2F)),
				PartPose.offset(2.0F, 5.0F, -2.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(0, 34)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-1.3F, 8.0F, 0.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(30, 34)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(1.3F, 8.0F, 0.0F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(-3.0F, -2.0F, 0.0F));

		PartDefinition armlpuff = arml.addOrReplaceChild("armlpuff", CubeListBuilder.create().texOffs(8, 39)
						.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 11.5F, -1.5F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(30, 16)
						.addBox(0.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(3.0F, -2.0F, 0.0F));

		PartDefinition armrpuff = armr.addOrReplaceChild("armrpuff", CubeListBuilder.create().texOffs(8, 39)
						.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 11.5F, -1.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
							   float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pelvis.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch) {
		this.setRotateAngle(this.head, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
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