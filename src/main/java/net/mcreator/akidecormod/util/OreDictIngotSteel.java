
package net.mcreator.akidecormod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.akidecormod.item.ItemBarSteel;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class OreDictIngotSteel extends ElementsAkidecorMod.ModElement {
	public OreDictIngotSteel(ElementsAkidecorMod instance) {
		super(instance, 279);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSteel", new ItemStack(ItemBarSteel.block, (int) (1)));
	}
}
