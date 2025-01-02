
package net.mcreator.akidecormod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.akidecormod.ElementsAkidecorMod;

import java.util.Set;
import java.util.HashMap;

@ElementsAkidecorMod.ModElement.Tag
public class ItemNickelSteelToolHoe extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:nickelsteeltoolhoe")
	public static final Item block = null;
	public ItemNickelSteelToolHoe(ElementsAkidecorMod instance) {
		super(instance, 258);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("NICKELSTEELTOOLHOE", 6, 1164, 12f, 0f, 42)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 6);
				return ret.keySet();
			}
		}.setUnlocalizedName("nickelsteeltoolhoe").setRegistryName("nickelsteeltoolhoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("akidecor:nickelsteeltoolhoe", "inventory"));
	}
}
