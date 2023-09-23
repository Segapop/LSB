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
     //Ammolite
     public static final RegistryObject<Item> SBAMMOLITE_GEM = ITEMS.register("sbammolite_gem", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     //Calcite
     public static final RegistryObject<Item> WHITE_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_0", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> ORANGE_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_1", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> MAGENTA_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_2", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIGHT_BLUE_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_3", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> YELLOW_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_4", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIME_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_5", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PINK_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_6", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> GRAY_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_7", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> LIGHT_GRAY_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_8", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> CYAN_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_9", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> PURPLE_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_10", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLUE_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_11", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BROWN_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_12", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> GREEN_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_13", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> RED_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_14", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> BLACK_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_15", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     public static final RegistryObject<Item> RAINBOW_SBCALCITE_GEM = ITEMS.register("sbcalcite_gem_16", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     //Holtite
     public static final RegistryObject<Item> SBHOLTITE_GEM = ITEMS.register("sbholtite_gem", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
     //Cuprite
     public static final RegistryObject<Item> SBCUPRITE_GEM = ITEMS.register("sbcuprite_gem", () ->
             new ItemGem(new Item.Properties(), lsb.MODID));
}


