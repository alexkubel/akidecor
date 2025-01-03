
package net.mcreator.akidecormod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.akidecormod.block.BlockDeepslateCobble;
import net.mcreator.akidecormod.block.BlockDeepslate;
import net.mcreator.akidecormod.ElementsAkidecorMod;

@ElementsAkidecorMod.ModElement.Tag
public class RecipeDeepslatesmelt extends ElementsAkidecorMod.ModElement {
	public RecipeDeepslatesmelt(ElementsAkidecorMod instance) {
		super(instance, 292);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeepslateCobble.block, (int) (1)), new ItemStack(BlockDeepslate.block, (int) (4)), 1F);
	}
}
