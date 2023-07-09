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

public class ModelMoissanite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "test"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart larm;
	private final ModelPart rarm;
	private final ModelPart lthigh;
	private final ModelPart rthigh;
	private final ModelPart purpleskirt;
	private final ModelPart greenskirt;
	private final ModelPart cape;

	public ModelMoissanite(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.larm = root.getChild("larm");
		this.rarm = root.getChild("rarm");
		this.lthigh = root.getChild("lthigh");
		this.rthigh = root.getChild("rthigh");
		this.purpleskirt = root.getChild("purpleskirt");
		this.greenskirt = root.getChild("greenskirt");
		this.cape = root.getChild("cape");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hairspike = head.addOrReplaceChild("hairspike",
				CubeListBuilder.create().texOffs(32, 48).mirror()
						.addBox(0.5F, -8.0F, 0.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6632F, -0.6632F, -0.4538F));

		PartDefinition rhorn = head
				.addOrReplaceChild("rhorn",
						CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(3.5F, -7.5F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition lhorn = head.addOrReplaceChild("lhorn",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -7.5F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(8, 16).addBox(
				-2.0F, -8.0F, -4.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 8.0F, 2.0F));

		PartDefinition larm = partdefinition.addOrReplaceChild("larm", CubeListBuilder.create().texOffs(0, 16).addBox(
				-8.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 1.0F, 0.0F));

		PartDefinition lhwshoulder = larm.addOrReplaceChild("lhwshoulder", CubeListBuilder.create().texOffs(0, 49)
				.addBox(1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 0.0F, 0.0F));

		PartDefinition lredshoulder = larm.addOrReplaceChild("lredshoulder", CubeListBuilder.create().texOffs(50, 34)
				.addBox(-9.5F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lpurpleshoulder = larm.addOrReplaceChild("lpurpleshoulder", CubeListBuilder.create()
				.texOffs(13, 38).addBox(-10.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rarm = partdefinition.addOrReplaceChild("rarm", CubeListBuilder.create().texOffs(28, 16).addBox(
				6.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 1.0F, 0.0F));

		PartDefinition rhwshoulder = rarm.addOrReplaceChild("rhwshoulder", CubeListBuilder.create().texOffs(0, 49)
				.addBox(-3.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition rredshoulder = rarm.addOrReplaceChild("rredshoulder",
				CubeListBuilder.create().texOffs(50, 34).mirror()
						.addBox(6.0F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rpurpleshoulder = rarm.addOrReplaceChild("rpurpleshoulder", CubeListBuilder.create()
				.texOffs(13, 38).addBox(-4.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition lthigh = partdefinition.addOrReplaceChild("lthigh", CubeListBuilder.create().texOffs(5, 30)
				.addBox(-4.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 10.0F, 0.0F));

		PartDefinition lleg = lthigh.addOrReplaceChild("lleg", CubeListBuilder.create().texOffs(0, 38).addBox(-4.0F,
				0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition rthigh = partdefinition.addOrReplaceChild("rthigh", CubeListBuilder.create().texOffs(19, 30)
				.addBox(1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 10.0F, 0.0F));

		PartDefinition rleg = rthigh.addOrReplaceChild("rleg", CubeListBuilder.create().texOffs(27, 38).addBox(2.0F,
				0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition purpleskirt = partdefinition.addOrReplaceChild("purpleskirt", CubeListBuilder.create()
				.texOffs(44, 16).addBox(-2.0F, -8.0F, -4.0F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 18.0F, 2.0F));

		PartDefinition greenskirt = partdefinition.addOrReplaceChild("greenskirt", CubeListBuilder.create()
				.texOffs(8, 45).addBox(-3.0F, -8.0F, -4.0F, 7.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 15.0F, 1.5F));

		PartDefinition cape = partdefinition.addOrReplaceChild("cape",
				CubeListBuilder.create().texOffs(35, 34).addBox(-3.0F, 2.0F, 0.0F, 6.0F, 14.0F, 0.0F,
						new CubeDeformation(0.0F, 2.0F, 0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lthigh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rthigh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		purpleskirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		greenskirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cape.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.larm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.lthigh.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rthigh.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}