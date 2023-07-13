package com.lsb.client;

import com.gempire.client.entity.model.ModelNephrite;
import com.lsb.client.entity.model.*;
import com.lsb.client.entity.render.*;
import com.lsb.lsb;
import com.lsb.init.AddonEntities;
import com.lsb.init.AddonItemProperties;
import com.lsb.init.AddonItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientProxy {

    @Mod.EventBusSubscriber(modid = lsb.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModBusEvents {


        @SubscribeEvent
        public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(AddonEntities.SBMOISSANITE.get(), m -> new RenderSbMoissanite(m, new ModelSbMoissanite<>(m.bakeLayer(ModelSbMoissanite.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBOPAL.get(), m -> new RenderSbOpal(m, new ModelSbOpal<>(m.bakeLayer(ModelSbOpal.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBJADE.get(), m -> new RenderSbJade(m, new ModelSbJade<>(m.bakeLayer(ModelSbJade.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBMOONSTONE.get(), m -> new RenderSbMoonstone(m, new ModelSbMoonstone<>(m.bakeLayer(ModelSbMoonstone.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBGOLD.get(), m -> new RenderSbGold(m, new ModelSbGold<>(m.bakeLayer(ModelSbGold.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBPYRITE.get(), m -> new RenderSbPyrite(m, new ModelSbPyrite<>(m.bakeLayer(ModelSbPyrite.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBPLATINUM.get(), m -> new RenderSbPlatinum(m, new ModelSbPlatinum<>(m.bakeLayer(ModelSbPlatinum.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBCOPPER.get(), m -> new RenderSbCopper(m, new ModelSbCopper<>(m.bakeLayer(ModelSbCopper.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBSILVER.get(), m -> new RenderSbSilver(m, new ModelSbSilver<>(m.bakeLayer(ModelSbSilver.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBJEREMEJEVITE.get(), m -> new RenderSbJeremejevite(m, new ModelSbJeremejevite<>(m.bakeLayer(ModelSbJeremejevite.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.SBZIRCONIA.get(), m -> new RenderSbZirconia(m, new ModelNephrite<>(m.bakeLayer(ModelNephrite.LAYER_LOCATION))));
        }

        @SubscribeEvent
        public static void doSetup(FMLClientSetupEvent event) {
            AddonItemProperties.addCustomItemProperties();
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            //register layers here
            event.registerLayerDefinition(ModelSbMoissanite.LAYER_LOCATION, ModelSbMoissanite::createBodyLayer);
            event.registerLayerDefinition(ModelSbOpal.LAYER_LOCATION, ModelSbOpal::createBodyLayer);
            event.registerLayerDefinition(ModelSbJade.LAYER_LOCATION, ModelSbJade::createBodyLayer);
            event.registerLayerDefinition(ModelSbMoonstone.LAYER_LOCATION, ModelSbMoonstone::createBodyLayer);
            event.registerLayerDefinition(ModelSbGold.LAYER_LOCATION, ModelSbGold::createBodyLayer);
            event.registerLayerDefinition(ModelSbPyrite.LAYER_LOCATION, ModelSbPyrite::createBodyLayer);
            event.registerLayerDefinition(ModelSbPlatinum.LAYER_LOCATION, ModelSbPlatinum::createBodyLayer);
            event.registerLayerDefinition(ModelSbCopper.LAYER_LOCATION, ModelSbCopper::createBodyLayer);
            event.registerLayerDefinition(ModelSbSilver.LAYER_LOCATION, ModelSbSilver::createBodyLayer);
            event.registerLayerDefinition(ModelSbJeremejevite.LAYER_LOCATION, ModelSbJeremejevite::createBodyLayer);
        }

        @SubscribeEvent
        public void buildContents(CreativeModeTabEvent.BuildContents event) {
            if (event.getTab() == com.gempire.proxy.ClientProxy.GEMPIRE_GEMSTONES) {
                event.accept(AddonItems.PURPLE_SBMOISSANITE_GEM.get());
            }
        }

    }
}
