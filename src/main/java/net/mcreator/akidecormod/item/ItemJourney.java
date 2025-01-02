
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
public class ItemJourney extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:journey")
	public static final Item block = null;
	public ItemJourney(ElementsAkidecorMod instance) {
		super(instance, 162);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("akidecor:journey", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("journey", ElementsAkidecorMod.sounds.get(new ResourceLocation("akidecor:song.journey")));
			setUnlocalizedName("journey");
			setRegistryName("journey");
			setCreativeTab(TabAkimodMisc.tab);
		}
	}
}
