
package net.mcreator.akidecormod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.akidecormod.item.ItemIngotBronze;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class OreDictBarBronze extends ElementsAkidecorMod.ModElement {
	public OreDictBarBronze(ElementsAkidecorMod instance) {
		super(instance, 226);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotBronze", new ItemStack(ItemIngotBronze.block, (int) (1)));
	}
}
