
package net.mcreator.akidecormod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.akidecormod.block.BlockCutCopper;
import net.mcreator.akidecormod.block.BlockCopperCutWeathered;
import net.mcreator.akidecormod.block.BlockCopperCutExposed;
import net.mcreator.akidecormod.block.BlockCopperBlockWeathered;
import net.mcreator.akidecormod.block.BlockCopperBlockOxidised;
import net.mcreator.akidecormod.block.BlockCopperBlockExposed;
import net.mcreator.akidecormod.block.BlockCopperBlock;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class OreDictBlockCopper extends ElementsAkidecorMod.ModElement {
	public OreDictBlockCopper(ElementsAkidecorMod instance) {
		super(instance, 299);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperBlock.block, (int) (1)));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperBlockExposed.block, (int) (1)));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperBlockWeathered.block, (int) (1)));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperBlockOxidised.block, (int) (1)));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCutCopper.block, (int) (1)));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperCutExposed.block, (int) (1)));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperCutWeathered.block, (int) (1)));
	}
}
