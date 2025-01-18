
package net.mcreator.akidecormod.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockWall;
import net.minecraft.block.Block;

import net.mcreator.akidecormod.creativetab.TabAkisbricks;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class BlockOakWoodWall extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:oak_wood_wall")
	public static final Block block = null;
	public BlockOakWoodWall(ElementsAkidecorMod instance) {
		super(instance, 370);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("oak_wood_wall"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("akidecor:oak_wood_wall", "inventory"));
	}
	public static class BlockCustom extends BlockWall {
		public BlockCustom() {
			super(new Block(Material.WOOD));
			setUnlocalizedName("oak_wood_wall");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 2);
			setHardness(3F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabAkisbricks.tab);
		}

		@Override
		public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
			items.add(new ItemStack(this));
		}
	}
}
