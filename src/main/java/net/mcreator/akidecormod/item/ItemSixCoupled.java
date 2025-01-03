
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

import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class ItemSixCoupled extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:sixcoupled")
	public static final Item block = null;
	public ItemSixCoupled(ElementsAkidecorMod instance) {
		super(instance, 289);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("akidecor:sixcoupled", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("sixcoupled", ElementsAkidecorMod.sounds.get(new ResourceLocation("akidecor:song.dnd")));
			setUnlocalizedName("sixcoupled");
			setRegistryName("sixcoupled");
			setCreativeTab(null);
		}
	}
}
