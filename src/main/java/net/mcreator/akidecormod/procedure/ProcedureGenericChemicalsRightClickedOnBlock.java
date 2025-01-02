package net.mcreator.akidecormod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.akidecormod.block.BlockSootyBrick;
import net.mcreator.akidecormod.block.BlockBrick3;
import net.mcreator.akidecormod.ElementsAkidecorMod;

import java.util.Map;

@ElementsAkidecorMod.ModElement.Tag
public class ProcedureGenericChemicalsRightClickedOnBlock extends ElementsAkidecorMod.ModElement {
	public ProcedureGenericChemicalsRightClickedOnBlock(ElementsAkidecorMod instance) {
		super(instance, 303);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenericChemicalsRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenericChemicalsRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenericChemicalsRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenericChemicalsRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((BlockSootyBrick.block.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockBrick3.block.getDefaultState(), 3);
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.cat.purr")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		}
	}
}
