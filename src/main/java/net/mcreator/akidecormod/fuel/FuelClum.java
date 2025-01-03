
package net.mcreator.akidecormod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.akidecormod.block.BlockMangroveLog;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class FuelClum extends ElementsAkidecorMod.ModElement {
	public FuelClum(ElementsAkidecorMod instance) {
		super(instance, 300);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockMangroveLog.block, (int) (1)).getItem())
			return 100;
		return 0;
	}
}
