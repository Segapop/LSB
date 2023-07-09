package com.lsb;

import com.lsb.entity.entities.EntityMoissanite;
import com.lsb.entity.entities.EntityTest;
import com.lsb.init.AddonAbilities;
import com.lsb.init.AddonEntities;
import com.lsb.entity.entities.EntityVaryingTest;
import com.lsb.init.RegistryHandler;
import com.gempire.init.EventHandler;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(lsb.MODID)
public class lsb
{

    public static final String MODID = "lsb";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public lsb()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        // Register the commonSetup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::EntityAttributes);
        modEventBus.addListener(this::commonSetup);

        RegistryHandler.init();

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    public void EntityAttributes(final EntityAttributeCreationEvent event) {
        //register entity attributes, these are set in the EntityTestGem class
        event.put(AddonEntities.TEST.get(), EntityTest.registerAttributes().build());
        event.put(AddonEntities.VARYTEST.get(), EntityVaryingTest.registerAttributes().build());
        event.put(AddonEntities.MOISSANITE.get(), EntityMoissanite.registerAttributes().build());
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        AddonEntities.setAddonGems();
        AddonEntities.registerCruxes();
        AddonAbilities.registerAbilities();
    }
}
