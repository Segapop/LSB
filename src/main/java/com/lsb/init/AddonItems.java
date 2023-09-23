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

     //Jade
     public static final RegistryObject<Item> WHITE_SBJADE_GEM = ITEMS.register("sbjade_gem_0", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> ORANGE_SBJADE_GEM = ITEMS.register("sbjade_gem_1", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> MAGENTA_SBJADE_GEM = ITEMS.register("sbjade_gem_2", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIGHT_BLUE_SBJADE_GEM = ITEMS.register("sbjade_gem_3", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> YELLOW_SBJADE_GEM = ITEMS.register("sbjade_gem_4", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIME_SBJADE_GEM = ITEMS.register("sbjade_gem_5", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PINK_SBJADE_GEM = ITEMS.register("sbjade_gem_6", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> GRAY_SBJADE_GEM = ITEMS.register("sbjade_gem_7", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIGHT_GRAY_SBJADE_GEM = ITEMS.register("sbjade_gem_8", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> CYAN_SBJADE_GEM = ITEMS.register("sbjade_gem_9", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PURPLE_SBJADE_GEM = ITEMS.register("sbjade_gem_10", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLUE_SBJADE_GEM = ITEMS.register("sbjade_gem_11", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BROWN_SBJADE_GEM = ITEMS.register("sbjade_gem_12", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> GREEN_SBJADE_GEM = ITEMS.register("sbjade_gem_13", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> RED_SBJADE_GEM = ITEMS.register("sbjade_gem_14", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLACK_SBJADE_GEM = ITEMS.register("sbjade_gem_15", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     //Pentagonite
     public static final RegistryObject<Item> SBPENTAGONITE_GEM = ITEMS.register("sbpentagonite_gem", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
}


