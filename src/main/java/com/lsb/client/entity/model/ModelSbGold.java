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

public class ModelSbGold<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbgold"), "main");
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Body;
	private final ModelPart Skirt;
	private final ModelPart RSleeve;
	private final ModelPart armr;
	private final ModelPart LSleeve;
	private final ModelPart arml;

	public ModelSbGold(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = root.getChild("Hair");
		this.Body = root.getChild("Body");
		this.Skirt = root.getChild("Skirt");
		this.RSleeve = root.getChild("RSleeve");
		this.armr = root.getChild("armr");
		this.LSleeve = root.getChild("LSleeve");
		this.arml = root.getChild("arml");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(8, 16)
				.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)),
				PartPose.offset(3.0F, 1.8F, -2.5F));

		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-16.0F, 0.0F, 0.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(8.0F, 9.0F, -8.0F));

		PartDefinition RSleeve = partdefinition.addOrReplaceChild("RSleeve",
				CubeListBuilder.create().texOffs(24, 1).mirror()
						.addBox(6.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.0F, 2.5F, -1.5F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(30, 16).addBox(
				6.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 3.0F, 0.0F));

		PartDefinition LSleeve = partdefinition.addOrReplaceChild("LSleeve", CubeListBuilder.create().texOffs(24, 1)
				.addBox(-12.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 2.5F, -1.5F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(0, 16).addBox(
				-8.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 3.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RSleeve.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LSleeve.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch) {
		this.setRotateAngle(this.Head, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.Hair, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.arml, Mth.cos(limbSwing * 0.5F + 3.1415927F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.armr, Mth.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
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