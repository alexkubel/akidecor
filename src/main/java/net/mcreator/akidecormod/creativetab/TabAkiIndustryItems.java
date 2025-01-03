
package net.mcreator.akidecormod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.akidecormod.item.ItemTractionEngine;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class TabAkiIndustryItems extends ElementsAkidecorMod.ModElement {
	public TabAkiIndustryItems(ElementsAkidecorMod instance) {
		super(instance, 302);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabakiindustryitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemTractionEngine.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
