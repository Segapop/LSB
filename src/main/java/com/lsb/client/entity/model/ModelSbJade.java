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

public class ModelSbJade<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbjade"), "main");
	private final ModelPart arml;
	private final ModelPart armr;
	private final ModelPart Head;
	private final ModelPart Hair;
	private final ModelPart Body;
	private final ModelPart SkirtFull;
	private final ModelPart legl;
	private final ModelPart legr;
	private final ModelPart SkirtThin;
	private final ModelPart Shawl;

	public ModelSbJade(ModelPart root) {
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
		this.Head = root.getChild("Head");
		this.Hair = root.getChild("Hair");
		this.Body = root.getChild("Body");
		this.SkirtFull = root.getChild("SkirtFull");
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
		this.SkirtThin = root.getChild("SkirtThin");
		this.Shawl = root.getChild("Shawl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(56, 16)
				.addBox(-7.4F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(2.7F, 0.0F, 0.0F));

		PartDefinition LShoulder = arml
				.addOrReplaceChild(
						"LShoulder", CubeListBuilder.create().texOffs(39, 54).addBox(-11.4F, -1.0F, -1.5F, 4.0F,
								3.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)),
						PartPose.offset(2.0F, -0.5F, 0.0F));

		PartDefinition LShoulderSpike = LShoulder.addOrReplaceChild("LShoulderSpike", CubeListBuilder.create()
				.texOffs(56, 46).addBox(-13.2F, -0.8F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LShoulderRound = arml.addOrReplaceChild("LShoulderRound", CubeListBuilder.create()
				.texOffs(44, 42).addBox(-9.7F, -0.7F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(1.2F, -0.5F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(56, 31)
				.addBox(5.4F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)),
				PartPose.offset(-2.7F, 0.0F, 0.0F));

		PartDefinition RShoulder = armr.addOrReplaceChild("RShoulder", CubeListBuilder.create().texOffs(50, 58)
				.addBox(7.4F, -1.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)),
				PartPose.offset(-2.0F, -0.5F, 0.0F));

		PartDefinition RShoulderSpike = RShoulder
				.addOrReplaceChild(
						"RShoulderSpike", CubeListBuilder.create().texOffs(56, 49).addBox(-3.8F, -0.8F, -1.0F, 2.0F,
								1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)),
						PartPose.offset(15.0F, 0.0F, 0.0F));

		PartDefinition RShoulderRound = armr.addOrReplaceChild("RShoulderRound", CubeListBuilder.create()
				.texOffs(41, 48).addBox(7.5F, -0.7F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(-2.0F, -0.5F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition HairCog = Head.addOrReplaceChild("HairCog", CubeListBuilder.create().texOffs(0, 96)
				.addBox(-8.0F, -10.0F, -4.0F, 16.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = partdefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition HairBun = Hair.addOrReplaceChild("HairBun", CubeListBuilder.create().texOffs(27, 0)
				.addBox(1.0F, -8.0F, -4.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -3.5F, 6.5F));

		PartDefinition HairSpike = Hair.addOrReplaceChild("HairSpike", CubeListBuilder.create().texOffs(20, 16)
				.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition HairRHorn = Hair.addOrReplaceChild("HairRHorn",
				CubeListBuilder.create().texOffs(35, 29).addBox(1.0F, -11.7F, -1.5F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition HairLHorn = Hair
				.addOrReplaceChild("HairLHorn",
						CubeListBuilder.create().texOffs(44, 34).addBox(-4.0F, -11.7F, -1.5F, 3.0F, 5.0F, 3.0F,
								new CubeDeformation(0.5F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition HairRCat = Hair.addOrReplaceChild("HairRCat", CubeListBuilder.create().texOffs(28, 24)
				.addBox(-4.0F, -10.8F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.5F, 0.3F, 0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition HairLCat = Hair.addOrReplaceChild("HairLCat", CubeListBuilder.create().texOffs(20, 24)
				.addBox(2.0F, -10.8F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.5F, 0.3F, 0.5F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition HairWide = Hair.addOrReplaceChild("HairWide", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-6.0F, -2.5F, -2.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition HairBunBallet = Hair.addOrReplaceChild("HairBunBallet", CubeListBuilder.create()
				.texOffs(8, 26).addBox(0.5F, -8.0F, -4.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -4.5F, 5.5F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 16)
				.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F, 0.5F, 0.0F)),
				PartPose.offset(3.0F, -0.5F, -2.0F));

		PartDefinition SkirtFull = partdefinition.addOrReplaceChild("SkirtFull", CubeListBuilder.create()
				.texOffs(64, 0).addBox(-8.0F, 0.0F, -4.0F, 12.0F, 19.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 5.0F, -2.0F));

		PartDefinition SkirtStar = SkirtFull.addOrReplaceChild("SkirtStar",
				CubeListBuilder.create().texOffs(64, 31).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 19.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition SkirtCog1 = SkirtFull.addOrReplaceChild("SkirtCog1", CubeListBuilder.create()
				.texOffs(0, 46).addBox(-2.0F, 0.0F, -9.5F, 4.0F, 19.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 0.0F, 2.0F));

		PartDefinition SkirtCog2 = SkirtFull.addOrReplaceChild("SkirtCog2",
				CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, -9.5F, 4.0F, 19.0F, 19.0F,
						new CubeDeformation(0.0F, 0.0F, 1.50F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition SkirtCog3 = SkirtFull.addOrReplaceChild("SkirtCog3",
				CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, -9.5F, 4.0F, 19.0F, 19.0F,
						new CubeDeformation(0.0F, 0.0F, 1.50F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 1.0036F, 0.0F));

		PartDefinition SkirtUnkown1 = SkirtFull
				.addOrReplaceChild(
						"SkirtUnkown1", CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F,
								11.0F, 16.0F, new CubeDeformation(0.0F, 0.0F, 1.40F)),
						PartPose.offset(-2.0F, 0.0F, 2.0F));

		PartDefinition SkirtUnkown2 = SkirtFull.addOrReplaceChild("SkirtUnkown2",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition SkirtUnkown3 = SkirtFull.addOrReplaceChild("SkirtUnkown3",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 2.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition SkirtUnkown4 = SkirtFull.addOrReplaceChild("SkirtUnkown4",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 2.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition SkirtUnkown5 = SkirtFull.addOrReplaceChild("SkirtUnkown5",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition SkirtUnkown6 = SkirtFull.addOrReplaceChild("SkirtUnkown6",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition SkirtUnkown7 = SkirtFull.addOrReplaceChild("SkirtUnkown7",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, -2.0071F, 0.0F));

		PartDefinition SkirtUnkown8 = SkirtFull.addOrReplaceChild("SkirtUnkown8",
				CubeListBuilder.create().texOffs(89, 62).addBox(-1.0F, 8.0F, -8.0F, 2.0F, 11.0F, 16.0F,
						new CubeDeformation(0.0F, 0.0F, 1.40F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 2.0F, 0.0F, 2.0071F, 0.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-4.0F, 2.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F, 2.5F, 0.0F)),
				PartPose.offset(1.5F, 8.0F, 0.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(0, 29)
				.addBox(2.0F, 2.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F, 2.5F, 0.0F)),
				PartPose.offset(-1.5F, 8.0F, 0.0F));

		PartDefinition SkirtThin = partdefinition.addOrReplaceChild("SkirtThin", CubeListBuilder.create()
				.texOffs(59, 62).addBox(-4.0F, 0.0F, -3.5F, 8.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition SkirtWheel1 = SkirtThin.addOrReplaceChild("SkirtWheel1", CubeListBuilder.create()
				.texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition SkirtWheel2 = SkirtThin.addOrReplaceChild("SkirtWheel2",
				CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F,
						new CubeDeformation(0.0F, 0.0F, 0.40F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition SkirtWheel3 = SkirtThin.addOrReplaceChild("SkirtWheel3",
				CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F,
						new CubeDeformation(0.0F, 0.0F, 0.50F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.8465F, 0.0F));

		PartDefinition SkirtWheel4 = SkirtThin.addOrReplaceChild("SkirtWheel4",
				CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 15.0F, 12.0F,
						new CubeDeformation(0.0F, 0.0F, 0.50F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.8465F, 0.0F));

		PartDefinition Shawl = partdefinition.addOrReplaceChild("Shawl", CubeListBuilder.create().texOffs(0, 84)
				.addBox(-5.0F, 0.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 126, 126);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SkirtFull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SkirtThin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Shawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch) {
		this.setRotateAngle(this.Head, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.Hair, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
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