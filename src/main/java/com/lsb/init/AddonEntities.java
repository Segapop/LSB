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

    public static final RegistryObject<EntityType<EntitySbJade>> SBJADE = ENTITIES.register("sbjade",
            () -> EntityType.Builder.of(EntitySbJade::new, MobCategory.CREATURE)
                    .sized(.75f, 1.8f)
                    .build(new ResourceLocation(lsb.MODID, "sbjade").toString()));

    public static final RegistryObject<EntityType<EntitySbPentagonite>> SBPENTAGONITE = ENTITIES.register("sbpentagonite",
            () -> EntityType.Builder.of(EntitySbPentagonite::new, MobCategory.CREATURE)
                    .sized(.75f, 2f)
                    .build(new ResourceLocation(lsb.MODID, "sbpentagonite").toString()));

    public static void registerCruxes() {
        //register cruxes
        ModEntities.CRUXTOGEM.put("sbjade", AddonCruxes.SBJADE_CONDITIONS());
        ModEntities.CRUXTOGEM.put("sbpentagonite", AddonCruxes.SBPENTAGONITE_CONDITIONS());
        //possible to be injected with tier one (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbjade");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("sbpentagonite");
        //possible to be injected with tier two (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbjade");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("sbpentagonite");
    }

    public static void setAddonGems(){
        //registers entity as a gem
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbjade", AddonEntities.class);
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("sbpentagonite", AddonEntities.class);
    }
}
