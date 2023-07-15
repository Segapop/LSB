package com.lsb.init;

import com.gempire.init.ModEntities;
import com.lsb.entity.entities.*;
import com.lsb.lsb;
import com.gempire.Gempire;
import com.gempire.init.AddonHandler;
import com.gempire.systems.injection.GemFormation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AddonEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Gempire.MODID);

    public static final RegistryObject<EntityType<EntitySbMoissanite>> SBMOISSANITE = ENTITIES.register("sbmoissanite",
            () -> EntityType.Builder.of(EntitySbMoissanite::new, MobCategory.CREATURE)
                    .sized(.75f, 2f)
                    .build(new ResourceLocation(lsb.MODID, "sbmoissanite").toString()));

    public static final RegistryObject<EntityType<EntitySbOpal>> SBOPAL = ENTITIES.register("sbopal",
            () -> EntityType.Builder.of(EntitySbOpal::new, MobCategory.CREATURE)
                    .sized(.75f, 2.3f)
                    .build(new ResourceLocation(lsb.MODID, "sbopal").toString()));

    public static final RegistryObject<EntityType<EntitySbJade>> SBJADE = ENTITIES.register("sbjade",
            () -> EntityType.Builder.of(EntitySbJade::new, MobCategory.CREATURE)
                    .sized(.75f, 1.8f)
                    .build(new ResourceLocation(lsb.MODID, "sbjade").toString()));

    public static final RegistryObject<EntityType<EntitySbMoonstone>> SBMOONSTONE = ENTITIES.register("sbmoonstone",
            () -> EntityType.Builder.of(EntitySbMoonstone::new, MobCategory.CREATURE)
                    .sized(.75f, 1.1f)
                    .build(new ResourceLocation(lsb.MODID, "sbmoonstone").toString()));

    public static final RegistryObject<EntityType<EntitySbGold>> SBGOLD = ENTITIES.register("sbgold",
            () -> EntityType.Builder.of(EntitySbGold::new, MobCategory.CREATURE)
                    .sized(.75f, 1.1f)
                    .build(new ResourceLocation(lsb.MODID, "sbgold").toString()));

    public static final RegistryObject<EntityType<EntitySbPyrite>> SBPYRITE = ENTITIES.register("sbpyrite",
            () -> EntityType.Builder.of(EntitySbPyrite::new, MobCategory.CREATURE)
                    .sized(.75f, 1.1f)
                    .build(new ResourceLocation(lsb.MODID, "sbpyrite").toString()));

    public static final RegistryObject<EntityType<EntitySbPlatinum>> SBPLATINUM = ENTITIES.register("sbplatinum",
            () -> EntityType.Builder.of(EntitySbPlatinum::new, MobCategory.CREATURE)
                    .sized(.75f, 1.5f)
                    .build(new ResourceLocation(lsb.MODID, "sbplatinum").toString()));

    public static final RegistryObject<EntityType<EntitySbCopper>> SBCOPPER = ENTITIES.register("sbcopper",
            () -> EntityType.Builder.of(EntitySbCopper::new, MobCategory.CREATURE)
                    .sized(.75f, 1.3f)
                    .build(new ResourceLocation(lsb.MODID, "sbcopper").toString()));

    public static final RegistryObject<EntityType<EntitySbSilver>> SBSILVER = ENTITIES.register("sbsilver",
            () -> EntityType.Builder.of(EntitySbSilver::new, MobCategory.CREATURE)
                    .sized(.75f, 1.7f)
                    .build(new ResourceLocation(lsb.MODID, "sbsilver").toString()));

    public static final RegistryObject<EntityType<EntitySbJeremejevite>> SBJEREMEJEVITE = ENTITIES.register("sbjeremejevite",
            () -> EntityType.Builder.of(EntitySbJeremejevite::new, MobCategory.CREATURE)
                    .sized(.75f, 2.5f)
                    .build(new ResourceLocation(lsb.MODID, "sbjeremejevire").toString()));

    public static final RegistryObject<EntityType<EntitySbZirconia>> SBZIRCONIA = ENTITIES.register("sbzirconia",
            () -> EntityType.Builder.of(EntitySbZirconia::new, MobCategory.CREATURE)
                    .sized(.75f, 2f)
                    .build(new ResourceLocation(lsb.MODID, "sbzirconia").toString()));


    public static void registerCruxes() {
        //register cruxes
        ModEntities.CRUXTOGEM.put("sbmoissanite", AddonCruxes.SBMOISSANITE_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbopal", AddonCruxes.SBOPAL_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbjade", AddonCruxes.SBJADE_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbmoonstone", AddonCruxes.SBMOONSTONE_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbgold", AddonCruxes.SBGOLD_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbpyrite", AddonCruxes.SBPYRITE_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbplatinum", AddonCruxes.SBPLATINUM_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbcopper", AddonCruxes.SBCOPPER_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbsilver", AddonCruxes.SBSILVER_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbjeremejevite", AddonCruxes.SBJEREMEJEVITE_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbzirconia", AddonCruxes.SBZIRCONIA_CONDITIONS());
        //possible to be injected with tier one (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbmoissanite");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbopal");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbjade");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbmoonstone");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbpyrite");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbplatinum");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbcopper");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbjeremejevite");
        //possible to be injected with tier two (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbmoissanite");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbopal");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbjade");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbmoonstone");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbgold");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbpyrite");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbplatinum");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbcopper");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbsilver");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbjeremejevite");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbzirconia");
        //GemFormation.POSSIBLE_GEMS_TIER_2.add("sbsunstone");
    }

    public static void setAddonGems(){
        //registers entity as a gem
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbmoissanite", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbopal", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbjade", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbmoonstone", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbgold", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbpyrite", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbplatinum", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbcopper", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbsilver", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbjeremejevite", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbzirconia", AddonEntities.class);

    }
}
