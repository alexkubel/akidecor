
package net.mcreator.akidecormod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.akidecormod.block.BlockBrick1;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class TabAkisbricks extends ElementsAkidecorMod.ModElement {
	public TabAkisbricks(ElementsAkidecorMod instance) {
		super(instance, 286);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabakisbricks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockBrick1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
