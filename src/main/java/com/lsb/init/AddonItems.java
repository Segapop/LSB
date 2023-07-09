package com.lsb.init;

import com.lsb.lsb;
import com.gempire.Gempire;
import com.gempire.items.ItemGem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AddonItems {
     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, lsb.MODID);

     public static final RegistryObject<Item> TEST_GEM = ITEMS.register("test_gem", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));

     public static final RegistryObject<Item> WHITE_VARYTEST_GEM = ITEMS.register("varytest_gem_0", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> YELLOW_VARYTEST_GEM = ITEMS.register("varytest_gem_4", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLUE_VARYTEST_GEM = ITEMS.register("varytest_gem_11", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PINK_VARYTEST_GEM = ITEMS.register("varytest_gem_6", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
//Moissanite Gems
     public static final RegistryObject<Item> WHITE_MOISSANITE_GEM = ITEMS.register("moissanite_gem_0", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> ORANGE_MOISSANITE_GEM = ITEMS.register("moissanite_gem_1", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> MAGENTA_MOISSANITE_GEM = ITEMS.register("moissanite_gem_2", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIGHT_BLUE_MOISSANITE_GEM = ITEMS.register("moissanite_gem_3", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> YELLOW_MOISSANITE_GEM = ITEMS.register("moissanite_gem_4", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIME_MOISSANITE_GEM = ITEMS.register("moissanite_gem_5", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PINK_MOISSANITE_GEM = ITEMS.register("moissanite_gem_6", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> GRAY_MOISSANITE_GEM = ITEMS.register("moissanite_gem_7", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIGHT_GRAY_MOISSANITE_GEM = ITEMS.register("moissanite_gem_8", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> CYAN_MOISSANITE_GEM = ITEMS.register("moissanite_gem_9", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PURPLE_MOISSANITE_GEM = ITEMS.register("moissanite_gem_10", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLUE_MOISSANITE_GEM = ITEMS.register("moissanite_gem_11", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BROWN_MOISSANITE_GEM = ITEMS.register("moissanite_gem_12", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> GREEN_MOISSANITE_GEM = ITEMS.register("moissanite_gem_13", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> RED_MOISSANITE_GEM = ITEMS.register("moissanite_gem_14", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLACK_MOISSANITE_GEM = ITEMS.register("moissanite_gem_15", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));

}


