package com.lsb.client;

import com.lsb.client.entity.model.ModelMoissanite;
import com.lsb.client.entity.render.RenderLsbMoissanite;
import com.lsb.client.entity.render.RenderVaryTest;
import com.lsb.lsb;
import com.lsb.client.entity.model.ModelTest;
import com.lsb.client.entity.model.ModelVaryTest;
import com.lsb.client.entity.render.RenderTest;
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
            event.registerEntityRenderer(AddonEntities.MOISSANITE.get(), m -> new RenderLsbMoissanite(m, new ModelMoissanite<>(m.bakeLayer(ModelMoissanite.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.VARYTEST.get(), m -> new RenderVaryTest(m, new ModelVaryTest<>(m.bakeLayer(ModelVaryTest.LAYER_LOCATION))));
            event.registerEntityRenderer(AddonEntities.TEST.get(), m -> new RenderTest(m, new ModelTest<>(m.bakeLayer(ModelMoissanite.LAYER_LOCATION))));
        }

        @SubscribeEvent
        public static void doSetup(FMLClientSetupEvent event) {
            AddonItemProperties.addCustomItemProperties();
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            //register layers here
            event.registerLayerDefinition(ModelVaryTest.LAYER_LOCATION, ModelVaryTest::createBodyLayer);
            event.registerLayerDefinition(ModelTest.LAYER_LOCATION, ModelTest::createBodyLayer);
            event.registerLayerDefinition(ModelMoissanite.LAYER_LOCATION, ModelMoissanite::createBodyLayer);
        }

        @SubscribeEvent
        public void buildContents(CreativeModeTabEvent.BuildContents event) {
            if (event.getTab() == com.gempire.proxy.ClientProxy.GEMPIRE_GEMSTONES) {
                event.accept(AddonItems.TEST_GEM.get());
            }
        }

    }
}
