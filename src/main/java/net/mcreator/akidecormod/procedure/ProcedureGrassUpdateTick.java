package net.mcreator.akidecormod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

import net.mcreator.akidecormod.ElementsAkidecorMod;

import java.util.Map;

@ElementsAkidecorMod.ModElement.Tag
public class ProcedureGrassUpdateTick extends ElementsAkidecorMod.ModElement {
	public ProcedureGrassUpdateTick(ElementsAkidecorMod instance) {
		super(instance, 295);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GrassUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GrassUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GrassUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GrassUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z))) == (false))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = Blocks.DIRT.getStateFromMeta(0);
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
