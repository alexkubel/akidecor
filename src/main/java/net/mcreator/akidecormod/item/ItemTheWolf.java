
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
public class ItemTheWolf extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:thewolf")
	public static final Item block = null;
	public ItemTheWolf(ElementsAkidecorMod instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("akidecor:thewolf", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("thewolf", ElementsAkidecorMod.sounds.get(new ResourceLocation("akidecor:the_wolf")));
			setUnlocalizedName("thewolf");
			setRegistryName("thewolf");
			setCreativeTab(TabAkimodMisc.tab);
		}
	}
}
