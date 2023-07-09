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

public class ModelJade<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "ModelJade"), "main");
	private final ModelPart gemLArm;
	private final ModelPart gemRArm;
	private final ModelPart gemHead;
	private final ModelPart gemHair;
	private final ModelPart gemBody;
	private final ModelPart gemSkirtFull;
	private final ModelPart gemLLeg;
	private final ModelPart gemRLeg;
	private final ModelPart gemSkirtThin;
	private final ModelPart gemShawl;

	public ModelJade(ModelPart root) {
		this.gemLArm = root.getChild("gemLArm");
		this.gemRArm = root.getChild("gemRArm");
		this.gemHead = root.getChild("gemHead");
		this.gemHair = root.getChild("gemHair");
		this.gemBody = root.getChild("gemBody");
		this.gemSkirtFull = root.getChild("gemSkirtFull");
		this.gemLLeg = root.getChild("gemLLeg");
		this.gemRLeg = root.getChild("gemRLeg");
		this.gemSkirtThin = root.getChild("gemSkirtThin");
		this.gemShawl = root.getChild("gemShawl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gemLArm = partdefinition.addOrReplaceChild("gemLArm", CubeListBuilder.create().texOffs(56, 16)
				.addBox(-7.4F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(2.7F, 0.0F, 0.0F));

		PartDefinition gemLShoulder = gemLArm
				.addOrReplaceChild(
						"gemLShoulder", CubeListBuilder.create().texOffs(39, 54).addBox(-11.4F, -1.0F, -1.5F, 4.0F,
								3.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)),
						PartPose.offset(2.0F, -0.5F, 0.0F));

		PartDefinition gemLShoulderSpike = gemLShoulder.addOrReplaceChild("gemLShoulderSpike", CubeListBuilder.create()
				.texOffs(56, 46).addBox(-13.2F, -0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemLShoulderRound = gemLArm.addOrReplaceChild("gemLShoulderRound", CubeListBuilder.create()
				.texOffs(44, 42).addBox(-9.7F, -0.7F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(1.2F, -0.5F, 0.0F));

		PartDefinition gemRArm = partdefinition.addOrReplaceChild("gemRArm", CubeListBuilder.create().texOffs(56, 31)
				.addBox(5.4F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(-2.7F, 0.0F, 0.0F));

		PartDefinition gemRShoulder = gemRArm.addOrReplaceChild("gemRShoulder", CubeListBuilder.create().texOffs(50, 58)
				.addBox(7.4F, -1.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)),
				PartPose.offset(-2.0F, -0.5F, 0.0F));

		PartDefinition gemRShoulderSpike = gemRShoulder
				.addOrReplaceChild(
						"gemRShoulderSpike", CubeListBuilder.create().texOffs(56, 49).addBox(-3.8F, -0.8F, -1.0F, 2.0F,
								1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)),
						PartPose.offset(15.0F, 0.0F, 0.0F));

		PartDefinition gemRShoulderRound = gemRArm.addOrReplaceChild("gemRShoulderRound", CubeListBuilder.create()
				.texOffs(41, 48).addBox(7.5F, -0.7F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(-2.0F, -0.5F, 0.0F));

		PartDefinition gemHead = partdefinition.addOrReplaceChild("gemHead", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gemHairCog = gemHead.addOrReplaceChild("gemHairCog", CubeListBuilder.create().texOffs(0, 96)
				.addBox(-8.0F, -10.0F, -4.0F, 16.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gemHair = partdefinition.addOrReplaceChild("gemHair", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gemHairBun = gemHair.addOrReplaceChild("gemHairBun", CubeListBuilder.create().texOffs(27, 0)
				.addBox(1.0F, -8.0F, -4.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -3.5F, 6.5F));

		PartDefinition gemHairSpike = gemHair.addOrReplaceChild("gemHairSpike", CubeListBuilder.create().texOffs(20, 16)
				.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gemHairRHorn = gemHair.addOrReplaceChild("gemHairRHorn",
				CubeListBuilder.create().texOffs(35, 29).addBox(1.0F, -11.7F, -1.5F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition gemHairLHorn = gemHair
				.addOrReplaceChild("gemHairLHorn",
						CubeListBuilder.create().texOffs(44, 34).addBox(-4.0F, -11.7F, -1.5F, 3.0F, 5.0F, 3.0F,
								new CubeDeformation(0.5F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition gemHairRCat = gemHair.addOrReplaceChild("gemHairRCat", CubeListBuilder.create().texOffs(28, 24)
				.addBox(-4.0F, -10.8F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.5F, 0.3F, 0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gemHairLCat = gemHair.addOrReplaceChild("gemHairLCat", CubeListBuilder.create().texOffs(20, 24)
				.addBox(2.0F, -10.8F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.5F, 0.3F, 0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gemHairWide = gemHair.addOrReplaceChild("gemHairWide", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-6.0F, -2.5F, -2.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gemHairBunBallet = gemHair.addOrReplaceChild("gemHairBunBallet", CubeListBuilder.create()
				.texOffs(8, 26).addBox(0.5F, -8.0F, -4.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -4.5F, 5.5F));

		PartDefinition gemBody = partdefinition.addOrReplaceChild("gemBody", CubeListBuilder.create().texOffs(36, 16)
				.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F, 0.5F, 0.0F)),
				PartPose.offset(3.0F, -0.5F, -2.0F));

		PartDefinition gemSkirtFull = partdefinition.addOrReplaceChild("gemSkirtFull", CubeListBuilder.create()
				.texOffs(64, 0).addBox(-8.0F, 0.0F, -4.0F, 12.0F, 19.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 5.0F, -2.0F));

		PartDefinition gemSkirtStar = gemSkirtFull.addOrReplaceChild("gemSkirtStar",
				CubeListBuilder.create().texOffs(64, 31).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 19.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition gemSkirtCog1 = gemSkirtFull.addOrReplaceChild("gemSkirtCog1", CubeListBuilder.create()
				.texOffs(0, 46).addBox(-2.0F, 0.0F, -9.5F, 4.0F, 19.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 0.0F, 2.0F));

		PartDefinition gemSkirtCog2 = gemSkirtFull.addOrReplaceChild("gemSkirtCog2",
				CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, -9.5F, 4.0F, 19.0F, 19.0F,
						new CubeDeformation(0.0F, 0.0F, 1.50F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition gemSkirtCog3 = gemSkirtFull.addOrReplaceChild("gemSkirtCog3",
				CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, -9.5F, 4.0F, 19.0F, 19.0F,
						new CubeDeformation(0.0F, 0.0F, 1.50F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition gemSkirtUnkown1 = gemSkirtFull
				.addOrReplaceChild(
						"gemSkirtUnkown1", CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F,
								11.0F, 16.0F, new CubeDeformation(0.0F, 0.0F, 1.40F)),
						PartPose.offset(-2.0F, 0.0F, 2.0F));

		PartDefinition gemSkirtUnkown2 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown2",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition gemSkirtUnkown3 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown3",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 2.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition gemSkirtUnkown4 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown4",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 2.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition gemSkirtUnkown5 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown5",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition gemSkirtUnkown6 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown6",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition gemSkirtUnkown7 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown7",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -2.0071F, 0.0F));

		PartDefinition gemSkirtUnkown8 = gemSkirtFull.addOrReplaceChild("gemSkirtUnkown8",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 2.0071F, 0.0F));

		PartDefinition gemLLeg = partdefinition.addOrReplaceChild("gemLLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-4.0F, 2.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F, 2.5F, 0.0F)),
				PartPose.offset(1.5F, 8.0F, 0.0F));

		PartDefinition gemRLeg = partdefinition.addOrReplaceChild("gemRLeg", CubeListBuilder.create().texOffs(0, 29)
				.addBox(2.0F, 2.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F, 2.5F, 0.0F)),
				PartPose.offset(-1.5F, 8.0F, 0.0F));

		PartDefinition gemSkirtThin = partdefinition.addOrReplaceChild("gemSkirtThin", CubeListBuilder.create()
				.texOffs(59, 62).addBox(-4.0F, 0.0F, -3.5F, 8.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition gemSkirtWheel1 = gemSkirtThin.addOrReplaceChild("gemSkirtWheel1", CubeListBuilder.create()
				.texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition gemSkirtWheel2 = gemSkirtThin.addOrReplaceChild("gemSkirtWheel2",
				CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F,
						new CubeDeformation(0.0F, 0.0F, 0.40F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition gemSkirtWheel3 = gemSkirtThin.addOrReplaceChild("gemSkirtWheel3",
				CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F,
						new CubeDeformation(0.0F, 0.0F, 0.50F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.8465F, 0.0F));

		PartDefinition gemSkirtWheel4 = gemSkirtThin.addOrReplaceChild("gemSkirtWheel4",
				CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F,
						new CubeDeformation(0.0F, 0.0F, 0.50F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.8465F, 0.0F));

		PartDefinition gemShawl = partdefinition.addOrReplaceChild("gemShawl", CubeListBuilder.create().texOffs(0, 84)
				.addBox(-5.0F, 0.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 126, 126);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gemLArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemHair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemSkirtFull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemLLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemRLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemSkirtThin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gemShawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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