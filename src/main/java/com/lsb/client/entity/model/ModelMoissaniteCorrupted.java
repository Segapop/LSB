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

public class ModelMoissaniteCorrupted<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelMoissaniteCorrupted"), "main");
	private final ModelPart Head;
	private final ModelPart Neck;
	private final ModelPart Chest;
	private final ModelPart Waist;
	private final ModelPart TailTop;
	private final ModelPart LBicep;
	private final ModelPart RBicep;

	public ModelMoissaniteCorrupted(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Neck = root.getChild("Neck");
		this.Chest = root.getChild("Chest");
		this.Waist = root.getChild("Waist");
		this.TailTop = root.getChild("TailTop");
		this.LBicep = root.getChild("LBicep");
		this.RBicep = root.getChild("RBicep");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.5F, -16.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F,
				-4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Ponytail = Head.addOrReplaceChild("Ponytail",
				CubeListBuilder.create().texOffs(36, 51).mirror()
						.addBox(-8.0F, 0.0F, -6.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.5F, -0.5F, 2.8798F, 0.9599F, -0.2007F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 5.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 15.0F, -18.7F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(36, 17)
				.addBox(-7.0F, 0.0F, 0.0F, 7.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 10.0F, -10.0F));

		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(0, 31).addBox(
				-7.0F, 0.0F, 0.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 17.0F, -3.0F));

		PartDefinition TailTop = partdefinition.addOrReplaceChild("TailTop", CubeListBuilder.create().texOffs(0, 51)
				.addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.5F, 5.0F));

		PartDefinition TailMid = TailTop.addOrReplaceChild("TailMid", CubeListBuilder.create().texOffs(40, 38).addBox(
				-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 8.0F));

		PartDefinition TailEnd = TailMid.addOrReplaceChild("TailEnd", CubeListBuilder.create().texOffs(18, 50).addBox(
				-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 8.0F));

		PartDefinition LBicep = partdefinition.addOrReplaceChild("LBicep",
				CubeListBuilder.create().texOffs(0, 46).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3F, 21.0F, -6.5F, 0.0F, 0.0F, 0.6109F));

		PartDefinition LArm = LBicep.addOrReplaceChild("LArm",
				CubeListBuilder.create().texOffs(20, 46).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2F, 0.3F, 0.0F, 0.0F, 0.0F, -2.1817F));

		PartDefinition RBicep = partdefinition.addOrReplaceChild("RBicep",
				CubeListBuilder.create().texOffs(20, 16).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3F, 21.0F, -6.5F, 3.1416F, 0.0F, 2.5307F));

		PartDefinition RArm = RBicep.addOrReplaceChild("RArm",
				CubeListBuilder.create().texOffs(20, 20).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2F, 0.3F, 0.0F, 0.0F, 0.0F, -2.1817F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TailTop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LBicep.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RBicep.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RBicep.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LBicep.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.TailTop.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}