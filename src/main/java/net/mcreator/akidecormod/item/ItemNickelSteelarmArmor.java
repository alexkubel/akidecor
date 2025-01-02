
package net.mcreator.akidecormod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class ItemNickelSteelarmArmor extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:nickelsteelarmarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("akidecor:nickelsteelarmarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("akidecor:nickelsteelarmarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("akidecor:nickelsteelarmarmorboots")
	public static final Item boots = null;
	public ItemNickelSteelarmArmor(ElementsAkidecorMod instance) {
		super(instance, 253);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("NICKELSTEELARMARMOR", "akidecor:nickelsteelarm", 45, new int[]{6, 18, 15, 6}, 27,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("nickelsteelarmarmorhelmet")
				.setRegistryName("nickelsteelarmarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("nickelsteelarmarmorbody")
				.setRegistryName("nickelsteelarmarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("nickelsteelarmarmorlegs")
				.setRegistryName("nickelsteelarmarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("nickelsteelarmarmorboots")
				.setRegistryName("nickelsteelarmarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("akidecor:nickelsteelarmarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("akidecor:nickelsteelarmarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("akidecor:nickelsteelarmarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("akidecor:nickelsteelarmarmorboots", "inventory"));
	}
}
