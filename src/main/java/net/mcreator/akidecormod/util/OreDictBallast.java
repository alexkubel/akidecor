
package net.mcreator.akidecormod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.akidecormod.block.BlockHighlandTuffBalast;
import net.mcreator.akidecormod.block.BlockGraniteBallast;
import net.mcreator.akidecormod.block.BlockDioriteBallast;
import net.mcreator.akidecormod.block.BlockBallastRough;
import net.mcreator.akidecormod.block.BlockBalastgravel2;
import net.mcreator.akidecormod.block.BlockBalastgravel;
import net.mcreator.akidecormod.block.BlockBalastGravel3;
import net.mcreator.akidecormod.block.BlockAndesiteBallast;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class OreDictBallast extends ElementsAkidecorMod.ModElement {
	public OreDictBallast(ElementsAkidecorMod instance) {
		super(instance, 366);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ballast", new ItemStack(BlockBalastgravel.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockBalastgravel2.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockBalastGravel3.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockBallastRough.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockHighlandTuffBalast.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockAndesiteBallast.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockDioriteBallast.block, (int) (1)));
		OreDictionary.registerOre("ballast", new ItemStack(BlockGraniteBallast.block, (int) (1)));
	}
}
