package com.lsb.init;

import com.gempire.systems.injection.Crux;
import com.gempire.systems.injection.GemConditions;
import com.gempire.util.CruxType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;

public class AddonCruxes {
    private static final int stoneCruxValue = 1;

    public static GemConditions SBJADE_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = -0.7f;
        float gemTemperatureMax = 0.8f;
        //add a primer
        Item primer = Items.QUARTZ;
        //add essences
        String essences = "pink-blue";
        //add crux blocks
        gemCruxes.add(new Crux(Blocks.STONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.TERRACOTTA.defaultBlockState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.defaultBlockState(), 3, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.IRON_ORE.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SPONGE.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.defaultBlockState(), 16, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 1;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBPENTAGONITE_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 2.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.BONE;
        //add essences
        String essences = "pink-blue";
        //add crux blocks
        gemCruxes.add(new Crux(Blocks.STONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.TERRACOTTA.defaultBlockState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.defaultBlockState(), 3, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.IRON_ORE.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.defaultBlockState(), 9, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BONE_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 4;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

}
