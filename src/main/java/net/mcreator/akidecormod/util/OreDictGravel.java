
package net.mcreator.akidecormod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.akidecormod.block.BlockBalastgravel2;
import net.mcreator.akidecormod.block.BlockBalastgravel;
import net.mcreator.akidecormod.block.BlockBalastGravel3;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class OreDictGravel extends ElementsAkidecorMod.ModElement {
	public OreDictGravel(ElementsAkidecorMod instance) {
		super(instance, 294);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gravel", new ItemStack(BlockBalastgravel.block, (int) (1)));
		OreDictionary.registerOre("gravel", new ItemStack(BlockBalastgravel2.block, (int) (1)));
		OreDictionary.registerOre("gravel", new ItemStack(BlockBalastGravel3.block, (int) (1)));
		OreDictionary.registerOre("gravel", new ItemStack(Blocks.GRAVEL, (int) (1)));
	}
}
