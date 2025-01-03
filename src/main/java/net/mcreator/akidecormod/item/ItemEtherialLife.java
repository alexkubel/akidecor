
package net.mcreator.akidecormod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.akidecormod.creativetab.TabAkimodMisc;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class ItemEtherialLife extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:etheriallife")
	public static final Item block = null;
	public ItemEtherialLife(ElementsAkidecorMod instance) {
		super(instance, 182);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("akidecor:etheriallife", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("etheriallife", ElementsAkidecorMod.sounds.get(new ResourceLocation("akidecor:an_ethereal_ending")));
			setUnlocalizedName("etheriallife");
			setRegistryName("etheriallife");
			setCreativeTab(TabAkimodMisc.tab);
		}
	}
}
