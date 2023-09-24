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

public class ModelSbMoissanite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbmoissanite"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart arml;
	private final ModelPart armr;
	private final ModelPart legl;
	private final ModelPart legr;
	private final ModelPart purpleskirt;
	private final ModelPart greenskirt;
	private final ModelPart cape;

	public ModelSbMoissanite(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
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

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(0, 16).addBox(
				-8.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 1.0F, 0.0F));

		PartDefinition lhwshoulder = arml.addOrReplaceChild("lhwshoulder", CubeListBuilder.create().texOffs(0, 49)
				.addBox(1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 0.0F, 0.0F));

		PartDefinition lredshoulder = arml.addOrReplaceChild("lredshoulder", CubeListBuilder.create().texOffs(50, 34)
				.addBox(-9.5F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lpurpleshoulder = arml.addOrReplaceChild("lpurpleshoulder", CubeListBuilder.create()
				.texOffs(13, 38).addBox(-10.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(28, 16).addBox(
				6.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 1.0F, 0.0F));

		PartDefinition rhwshoulder = armr.addOrReplaceChild("rhwshoulder", CubeListBuilder.create().texOffs(0, 49)
				.addBox(-3.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition rredshoulder = armr.addOrReplaceChild("rredshoulder",
				CubeListBuilder.create().texOffs(50, 34).mirror()
						.addBox(6.0F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rpurpleshoulder = armr.addOrReplaceChild("rpurpleshoulder", CubeListBuilder.create()
				.texOffs(13, 38).addBox(-4.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(5, 30)
				.addBox(-4.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 10.0F, 0.0F));

		PartDefinition cafl = legl.addOrReplaceChild("calfl", CubeListBuilder.create().texOffs(0, 38).addBox(-4.0F,
				0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(19, 30)
				.addBox(1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 10.0F, 0.0F));

		PartDefinition calfr = legr.addOrReplaceChild("calfr", CubeListBuilder.create().texOffs(27, 38).addBox(2.0F,
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
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		purpleskirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		greenskirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cape.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.setRotateAngle(this.head, headPitch * 0.9F * 0.017453292F, netHeadYaw * 0.017453292F, 0.0F);
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