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

public class ModelSbOpal<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbopal"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart armr;
	private final ModelPart arml;
	private final ModelPart legr;
	private final ModelPart legl;

	public ModelSbOpal(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.armr = root.getChild("armr");
		this.arml = root.getChild("arml");
		this.legr = root.getChild("legr");
		this.legl = root.getChild("legl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(64, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ponytail = head.addOrReplaceChild("ponytail", CubeListBuilder.create().texOffs(56, 17).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(-0.5F, 0.0F, -0.5F)), PartPose.offset(2.0F, -11.0F, 4.0F));

		PartDefinition ponytaill = head.addOrReplaceChild("ponytaill", CubeListBuilder.create().texOffs(72, 17).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(-0.5F, 0.0F, -0.5F)), PartPose.offset(8.0F, -11.0F, -1.0F));

		PartDefinition ponytailr = head.addOrReplaceChild("ponytailr", CubeListBuilder.create().texOffs(40, 17).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(-0.5F, 0.0F, -0.5F)), PartPose.offset(-4.0F, -11.0F, -1.0F));

		PartDefinition bun = head.addOrReplaceChild("bun", CubeListBuilder.create().texOffs(56, 31).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -11.5F, 4.0F));

		PartDefinition bunl = head.addOrReplaceChild("bunl", CubeListBuilder.create().texOffs(72, 31).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -11.5F, -1.0F));

		PartDefinition bunr = head.addOrReplaceChild("bunr", CubeListBuilder.create().texOffs(40, 31).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -11.5F, -1.0F));

		PartDefinition bouffant = head.addOrReplaceChild("bouffant", CubeListBuilder.create().texOffs(96, 0).addBox(-4.0F, -12.0F, 2.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.4F, 0.5F, 0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bows = head.addOrReplaceChild("bows", CubeListBuilder.create().texOffs(92, 13).addBox(-4.5F, -10.5F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(-0.1F, 0.0F, -0.1F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition hatbrim = head.addOrReplaceChild("hatbrim", CubeListBuilder.create().texOffs(61, 53).mirror().addBox(-3.5F, 0.0F, -3.5F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2F, -9.3F, -3.4F, 0.5236F, 0.6109F, -0.1571F));

		PartDefinition hat = hatbrim.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-3.5F, 0.0F, -3.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, -2.0F, 1.5F));

		PartDefinition hatmesh3 = hatbrim.addOrReplaceChild("hatmesh3", CubeListBuilder.create().texOffs(51, 66).mirror().addBox(-4.5F, 0.0F, -7.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(-2.5F, 0.0F, -2.5F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.6F, -2.7F, 0.6981F, 0.0F, 0.0F));

		PartDefinition hatmesh1 = hatbrim.addOrReplaceChild("hatmesh1", CubeListBuilder.create().texOffs(51, 66).mirror().addBox(-4.5F, 0.0F, -6.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(-2.5F, 0.0F, -2.5F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 0.0F, -0.5F, 0.6981F, 1.5708F, 0.0F));

		PartDefinition hatmesh2 = hatbrim.addOrReplaceChild("hatmesh2", CubeListBuilder.create().texOffs(51, 66).mirror().addBox(-4.3F, -0.5F, -7.3F, 9.0F, 0.0F, 9.0F, new CubeDeformation(-2.5F, 0.0F, -2.5F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.0F, 0.6981F, 0.7854F, 0.0F));

		PartDefinition hairclip = head.addOrReplaceChild("hairclip", CubeListBuilder.create().texOffs(80, 63).mirror().addBox(1.5F, -5.5F, -0.8F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -5.2F, -3.9F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(8, 17).addBox(-3.0F, -9.0F, -4.0F, 7.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -1.0F, 1.5F));

		PartDefinition skirtflat = body.addOrReplaceChild("skirtflat", CubeListBuilder.create().texOffs(36, 71).addBox(-3.0F, -9.0F, -4.0F, 7.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition skirtflatsider = skirtflat.addOrReplaceChild("skirtflatsider", CubeListBuilder.create().texOffs(70, 97).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 5.0F, -2.0F));

		PartDefinition skirtflatsidel = skirtflat.addOrReplaceChild("skirtflatsidel", CubeListBuilder.create().texOffs(60, 97).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 5.0F, -2.0F));

		PartDefinition skirtlarge = body.addOrReplaceChild("skirtlarge", CubeListBuilder.create().texOffs(0, 62).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 10.0F, -1.5F));

		PartDefinition skirtbustle = body.addOrReplaceChild("skirtbustle", CubeListBuilder.create().texOffs(70, 94).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 24.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 10.0F, -0.5F));

		PartDefinition skirtpannier = body.addOrReplaceChild("skirtpannier", CubeListBuilder.create().texOffs(0, 94).addBox(-21.0F, -9.0F, -4.0F, 25.0F, 24.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 10.0F, -2.5F));

		PartDefinition skirtfull = body.addOrReplaceChild("skirtfull", CubeListBuilder.create().texOffs(82, 29).addBox(-9.0F, -9.0F, -4.0F, 13.0F, 24.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 10.0F, -2.5F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(12, 51).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.5F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shawl = body.addOrReplaceChild("shawl", CubeListBuilder.create().texOffs(42, 39).addBox(-6.0F, -9.5F, -3.0F, 13.0F, 8.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.5F, -1.5F));

		PartDefinition skirttrain = body.addOrReplaceChild("skirttrain", CubeListBuilder.create().texOffs(53, 69).addBox(-25.0F, 0.0F, 0.0F, 25.0F, 0.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, 24.9F, -14.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -1.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -9.0F, 0.0F, 0.0F, 0.0F, 0.1222F));

		PartDefinition armrside = armr.addOrReplaceChild("armrside", CubeListBuilder.create().texOffs(8, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.0F, 0.0F));

		PartDefinition armrflare = armr.addOrReplaceChild("armrflare", CubeListBuilder.create().texOffs(4, 55).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 13.0F, 0.0F));

		PartDefinition armrshoulder = armr.addOrReplaceChild("armrshoulder", CubeListBuilder.create().texOffs(36, 54).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -1.5F, -1.0F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(32, 17).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -9.0F, 0.0F, 0.0F, 0.0F, -0.1222F));

		PartDefinition armlside = arml.addOrReplaceChild("armlside", CubeListBuilder.create().texOffs(24, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -1.0F, 0.0F));

		PartDefinition armlflare = arml.addOrReplaceChild("armlflare", CubeListBuilder.create().texOffs(20, 55).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 13.0F, 0.0F));

		PartDefinition armlshoulder = arml.addOrReplaceChild("armlshoulder", CubeListBuilder.create().texOffs(52, 54).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -1.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 6.0F, 0.0F));

		PartDefinition legrside = legr.addOrReplaceChild("legrside", CubeListBuilder.create().texOffs(8, 44).addBox(-5.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 14.0F, 0.0F));

		PartDefinition legrflare = legr.addOrReplaceChild("legrflare", CubeListBuilder.create().texOffs(28, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(32, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 6.0F, 0.0F));

		PartDefinition leglside = legl.addOrReplaceChild("leglside", CubeListBuilder.create().texOffs(24, 44).addBox(3.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 14.0F, 0.0F));

		PartDefinition leglflare = legl.addOrReplaceChild("leglflare", CubeListBuilder.create().texOffs(44, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch) {
		this.setRotateAngle(this.head, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.arml, Mth.cos(limbSwing * 0.5F + 3.1415927F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, -0.1745f);
		this.setRotateAngle(this.armr, Mth.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.1745f);
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