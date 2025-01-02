
package net.mcreator.akidecormod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.akidecormod.item.ItemMusicDick;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class TabAkimodMisc extends ElementsAkidecorMod.ModElement {
	public TabAkimodMisc(ElementsAkidecorMod instance) {
		super(instance, 304);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabakimod_misc") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemMusicDick.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
