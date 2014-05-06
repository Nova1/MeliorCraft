package com.melior.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "meliorcraft")
public class MeliorCraft {
//Main Section of code

	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		//GameRegistry.registerBlock(MeliorBlocks, "Melior"); Not needed for now. THIS WILL BE ADDED IN LATER (HOPEFULLY)
		
		// This for some awesome dirt (Not really needed) you just cannot get enough of it
		GameRegistry.addRecipe(new ItemStack(Blocks.dirt, 6), new Object[] {
				"yyy", "yxy", "yyy", 'y', Blocks.sapling, 'x', Blocks.clay,

		});
        //Pretty useless but why not add a recipe to it?
		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 8), new Object[] {
				"bcb", "bbb", "cbc", 'b', Items.magma_cream, 'c', Blocks.clay,

		});
        //This still requires you to visit the nether, this is just on the off chance that people have the materials around for them to be able to do this.
		GameRegistry.addRecipe(new ItemStack(Blocks.soul_sand),
				new Object[] { "nnn", "nsn", "nnn", 'n', Blocks.netherrack,
						's', Blocks.sand, }); //This might be removed in an update

		/* Armour Structure is going here, really this bit here is just the chainmail crafting section. I will most likely add new section for the new
		* armour that is going to be added with this mod.
		*/

		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1),
				new Object[] { "ggg", "ghg", "ggg", 'g', Items.flint_and_steel,
						'h', Items.iron_helmet, });
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1),
				new Object[] { "ggg", "gcg", "ggg", 'g', Items.flint_and_steel,
						'c', Items.iron_chestplate, });
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1),
				new Object[] { "ggg", "glg", "ggg", 'g', Items.flint_and_steel,
						'l', Items.iron_leggings, });

		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1),
				new Object[] { "ggg", "gbg", "ggg", 'g', Items.flint_and_steel,
						'b', Items.iron_boots, });
		
		// Armour Linking
		//Iron to gold Armour, I'm not too sure about the recipe here it's a bit resource intensive but hey people may like using gold nuggets and ingots to craft gold armour.
		GameRegistry.addRecipe(new ItemStack(Items.golden_helmet, 1), new Object[] {
			"ubu","bhb","ubu", 'b', Items.gold_ingot, 'h', Items.iron_helmet, 'u', Items.gold_nugget,
		});
		GameRegistry.addRecipe(new ItemStack(Items.golden_chestplate, 1), new Object[] {
			"ubu","bhb","ubu", 'b', Items.gold_ingot, 'h', Items.iron_chestplate, 'u', Items.gold_nugget,
		});
		GameRegistry.addRecipe(new ItemStack(Items.golden_leggings, 1), new Object[] {
			"ubu","bhb","ubu", 'b', Items.gold_ingot, 'h', Items.iron_leggings, 'u', Items.gold_nugget,
		});
		GameRegistry.addRecipe(new ItemStack(Items.golden_boots, 1), new Object[] {
			"ubu","bhb","ubu", 'b', Items.gold_ingot, 'h', Items.iron_boots, 'u', Items.gold_nugget,
		});
		
		//Gold to Diamond Armour, This will most likely change.
		GameRegistry.addRecipe(new ItemStack(Items.diamond_helmet, 1), new Object[] {
			"gdg","dhd","gdg", 'g', Blocks.glass, 'h', Items.golden_helmet, 'd', Items.diamond,
		});
		GameRegistry.addRecipe(new ItemStack(Items.diamond_chestplate, 1), new Object[] {
			"gdg","dhd","gdg", 'g', Blocks.glass, 'h', Items.golden_chestplate, 'd', Items.diamond,
		});
		GameRegistry.addRecipe(new ItemStack(Items.diamond_leggings, 1), new Object[] {
			"gdg","dhd","gdg", 'g', Blocks.glass, 'h', Items.golden_leggings, 'd', Items.diamond,
		});
		GameRegistry.addRecipe(new ItemStack(Items.diamond_boots, 1), new Object[] {
			"gdg","dhd","gdg", 'g', Blocks.glass, 'h', Items.golden_boots, 'd', Items.diamond,
		});
		
		
		
		
		
		
		//Up here is the new added way in which to craft chain mail armour. There will be new sets of armour that will require special ways to be crafted.

		// Other stuff, recipes should be put up there ^. PLEASE DO IT
		

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

}
