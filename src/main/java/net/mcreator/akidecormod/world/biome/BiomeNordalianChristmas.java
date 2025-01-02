
package net.mcreator.akidecormod.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityAgeable;

import net.mcreator.akidecormod.ElementsAkidecorMod;

import java.util.Random;

@ElementsAkidecorMod.ModElement.Tag
public class BiomeNordalianChristmas extends ElementsAkidecorMod.ModElement {
	@GameRegistry.ObjectHolder("akidecor:nordalian_christmas")
	public static final BiomeGenCustom biome = null;
	public BiomeNordalianChristmas(ElementsAkidecorMod instance) {
		super(instance, 302);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Nordalian Christmas").setRainfall(0.5F).setBaseHeight(0.2F).setWaterColor(-14329397)
					.setHeightVariation(0.2F).setTemperature(0.2F));
			setRegistryName("nordalian_christmas");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAgeable.class, 15, 1, 15));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -13261999;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -13261999;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -5916161;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return BIG_TREE_FEATURE;
		}
	}
}
