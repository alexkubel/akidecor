
package net.mcreator.akidecormod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.akidecormod.block.BlockDeepslate;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class TabFutureNordale extends ElementsAkidecorMod.ModElement {
	public TabFutureNordale(ElementsAkidecorMod instance) {
		super(instance, 293);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabfuturenordale") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockDeepslate.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
