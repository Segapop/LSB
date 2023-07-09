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

public class ModelAngelite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "test"), "main");
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Neck;
	private final ModelPart Chest;
	private final ModelPart Shawl;
	private final ModelPart Skirt;
	private final ModelPart Waist;
	private final ModelPart Hips;
	private final ModelPart LArm;
	private final ModelPart RArm;
	private final ModelPart LLeg;
	private final ModelPart RLeg;

	public ModelAngelite(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Hair = root.getChild("Hair");
		this.Neck = root.getChild("Neck");
		this.Chest = root.getChild("Chest");
		this.Shawl = root.getChild("Shawl");
		this.Skirt = root.getChild("Skirt");
		this.Waist = root.getChild("Waist");
		this.Hips = root.getChild("Hips");
		this.LArm = root.getChild("LArm");
		this.RArm = root.getChild("RArm");
		this.LLeg = root.getChild("LLeg");
		this.RLeg = root.getChild("RLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -7.3F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-1.5F)),
				PartPose.offset(0.5F, -2.0F, -0.1F));

		PartDefinition Bun = Head
				.addOrReplaceChild("Bun",
						CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, -7.5F, 0.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(0.5F, -2.0F, -0.1F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -1.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F, 0.5F, -0.3F)),
				PartPose.offset(0.5F, -2.0F, -0.1F));

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-9.0F, 0.0F, 0.0F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)),
				PartPose.offset(5.0F, -2.2F, -3.5F));

		PartDefinition Shawl = partdefinition.addOrReplaceChild("Shawl", CubeListBuilder.create().texOffs(0, 50)
				.addBox(-16.0F, 0.0F, 0.0F, 16.0F, 7.0F, 7.0F, new CubeDeformation(0.4F, 0.6F, 0.4F)),
				PartPose.offset(8.5F, -1.8F, -3.5F));

		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt", CubeListBuilder.create().texOffs(40, 17)
				.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 19.0F, 6.0F, new CubeDeformation(0.0F, 0.2F, 0.0F)),
				PartPose.offset(3.5F, 4.8F, -3.0F));

		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(32, 40)
				.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, -0.3F, 0.0F)),
				PartPose.offset(2.0F, 4.3F, -1.0F));

		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(32, 45).addBox(
				-5.0F, 0.0F, 0.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 7.0F, -1.5F));

		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(16, 30)
				.addBox(-0.2F, -1.5F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(5.0F, -0.5F, 0.0F));

		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(0, 30)
				.addBox(-3.8F, -1.5F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-4.0F, -0.5F, 0.0F));

		PartDefinition LLeg = partdefinition.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(56, 47)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(2.0F, 9.0F, 0.0F));

		PartDefinition RLeg = partdefinition.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(48, 47)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, -0.2F)),
				PartPose.offset(-1.0F, 9.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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