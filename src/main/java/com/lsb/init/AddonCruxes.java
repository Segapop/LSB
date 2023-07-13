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

    public static GemConditions SBMOISSANITE_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 1.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.NETHER_STAR;
        //add essences
        String essences = "white";
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
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SOIL.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 1;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBOPAL_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 1.0f;
        //add a primer
        Item primer = Items.WATER_BUCKET;
        //add essences
        String essences = "blue";
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
        gemCruxes.add(new Crux(Blocks.WATER.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SOUL_SAND.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.MUD.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 3;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

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

    public static GemConditions SBMOONSTONE_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 0.25f;
        float gemTemperatureMax = 1.0f;
        //add a primer
        Item primer = Items.QUARTZ;
        //add essences
        String essences = "white-yellow";
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
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 3;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBGOLD_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 1.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.GOLD_NUGGET;
        //add essences
        String essences = "yellow";
        //add crux blocks
        gemCruxes.add(new Crux(Blocks.STONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.TERRACOTTA.defaultBlockState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.defaultBlockState(), 4, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.IRON_ORE.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GOLD_ORE.defaultBlockState(), 5, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState(), 5, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHERRACK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GOLD_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RAW_GOLD_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.NETHER_GOLD_ORE.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 2;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBPYRITE_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 0.8f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.IRON_INGOT;
        //add essences
        String essences = "yellow";
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
        gemCruxes.add(new Crux(Blocks.DEAD_BRAIN_CORAL_BLOCK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEAD_BUBBLE_CORAL_BLOCK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEAD_FIRE_CORAL_BLOCK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEAD_HORN_CORAL_BLOCK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEAD_TUBE_CORAL_BLOCK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.COAL_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 0;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBPLATINUM_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 1.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.IRON_NUGGET;
        //add essences
        String essences = "white";
        //add crux blocks
        gemCruxes.add(new Crux(Blocks.STONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.TERRACOTTA.defaultBlockState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.defaultBlockState(), 4, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.IRON_ORE.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_GRANITE.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 2;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBCOPPER_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 1.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.GUNPOWDER;
        //add essences
        String essences = "yellow-pink";
        //add crux blocks
        gemCruxes.add(new Crux(Blocks.STONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.TERRACOTTA.defaultBlockState(), 2, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RED_SANDSTONE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.GRANITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DIORITE.defaultBlockState(), stoneCruxValue, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.MAGMA_BLOCK.defaultBlockState(), 4, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.IRON_ORE.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.BASALT.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.COPPER_ORE.defaultBlockState(), 6, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState(), 6, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.COPPER_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.EXPOSED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.EXPOSED_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.OXIDIZED_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.OXIDIZED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WEATHERED_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WEATHERED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_COPPER_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_EXPOSED_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_EXPOSED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_OXIDIZED_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_OXIDIZED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_WEATHERED_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.WAXED_WEATHERED_CUT_COPPER.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 1;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBSILVER_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 1.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.IRON_BLOCK;
        //add essences
        String essences = "white";
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
        gemCruxes.add(new Crux(Blocks.LAPIS_BLOCK.defaultBlockState(), 5, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.IRON_BLOCK.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.RAW_IRON_BLOCK.defaultBlockState(), 16, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 2;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBJEREMEJEVITE_CONDITIONS(){
        ArrayList<Crux> gemCruxes = new ArrayList<>();
        //add temperatures, these are biome temperatures, reference other gems to set these
        float gemTemperatureMin = 1.0f;
        float gemTemperatureMax = 2.0f;
        //add a primer
        Item primer = Items.FEATHER;
        //add essences
        String essences = "blue";
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
        gemCruxes.add(new Crux(Blocks.NETHER_QUARTZ_ORE.defaultBlockState(), 3, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.POLISHED_DIORITE.defaultBlockState(), 9, CruxType.INORGANIC, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.QUARTZ_BLOCK.defaultBlockState(), 9, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        gemCruxes.add(new Crux(Blocks.SMOOTH_QUARTZ.defaultBlockState(), 16, CruxType.MINERAL, gemTemperatureMin, gemTemperatureMax));
        //set a rarity to make the gem more/less rare
        int rarity = 2;
        return new GemConditions(gemCruxes, essences, primer, gemTemperatureMin, gemTemperatureMax, rarity);
    }

    public static GemConditions SBZIRCONIA_CONDITIONS(){
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
