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

public class ModelGold<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelGold"), "main");
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Body;
	private final ModelPart Skirt;
	private final ModelPart RSleeve;
	private final ModelPart RArm;
	private final ModelPart LSleeve;
	private final ModelPart LArm;

	public ModelGold(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = root.getChild("Hair");
		this.Body = root.getChild("Body");
		this.Skirt = root.getChild("Skirt");
		this.RSleeve = root.getChild("RSleeve");
		this.RArm = root.getChild("RArm");
		this.LSleeve = root.getChild("LSleeve");
		this.LArm = root.getChild("LArm");
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

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(30, 16).addBox(
				6.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 3.0F, 0.0F));

		PartDefinition LSleeve = partdefinition.addOrReplaceChild("LSleeve", CubeListBuilder.create().texOffs(24, 1)
				.addBox(-12.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 2.5F, -1.5F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(0, 16).addBox(
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
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LSleeve.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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