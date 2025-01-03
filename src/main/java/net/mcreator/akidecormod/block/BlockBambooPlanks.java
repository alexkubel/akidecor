
package net.mcreator.akidecormod.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.akidecormod.creativetab.TabFutureNordale;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class BlockBambooPlanks extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:bamboo_planks")
	public static final Block block = null;
	public BlockBambooPlanks(ElementsAkidecorMod instance) {
		super(instance, 354);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bamboo_planks"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("akidecor:bamboo_planks", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("bamboo_planks");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("pickaxe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabFutureNordale.tab);
		}
	}
}
