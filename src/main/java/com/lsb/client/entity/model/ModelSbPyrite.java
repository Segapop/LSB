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

public class ModelSbPyrite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbpyrite"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart arml;
	private final ModelPart armr;
	private final ModelPart hair;
	private final ModelPart skirt1;
	private final ModelPart skirt2;
	private final ModelPart legr;
	private final ModelPart legl;

	public ModelSbPyrite(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
		this.hair = root.getChild("hair");
		this.skirt1 = root.getChild("skirt1");
		this.skirt2 = root.getChild("skirt2");
		this.legr = root.getChild("legr");
		this.legl = root.getChild("legl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(12, 16)
						.addBox(-7.0F, 0.0F, 0.0F, 7.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 0.0F, -2.5F));

		PartDefinition skirt = body.addOrReplaceChild("skirt", CubeListBuilder.create().texOffs(88, 22).addBox(
				-10.0F, 0.0F, 0.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 8.5F, -2.5F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(0, 16)
						.addBox(-9.5F, -1.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(3.2F, 1.0F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(36, 16)
						.addBox(6.6F, -1.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-3.3F, 1.0F, 0.0F));

		PartDefinition hair = partdefinition.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition beehivehair = hair.addOrReplaceChild("beehivehair", CubeListBuilder.create()
						.texOffs(64, 0).addBox(-4.5F, -7.0F, -4.0F, 9.0F, 9.0F, 8.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, -2.0F, 1.5F));

		PartDefinition skirt1 = partdefinition.addOrReplaceChild("skirt1", CubeListBuilder.create()
						.texOffs(64, 41).addBox(-16.0F, 0.0F, 0.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 17.0F, -8.0F));

		PartDefinition skirt2 = partdefinition.addOrReplaceChild("skirt2", CubeListBuilder.create()
						.texOffs(48, 17).addBox(-9.0F, 0.0F, 0.0F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 10.0F, -3.5F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(32, 31)
						.addBox(1.6F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-1.8F, 12.0F, 0.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(0, 31)
						.addBox(-5.6F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(1.8F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
							   float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		skirt1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		skirt2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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