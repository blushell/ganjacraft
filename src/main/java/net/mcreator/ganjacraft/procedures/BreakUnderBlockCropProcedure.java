package net.mcreator.ganjacraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.ganjacraft.item.WeedseedsItem;
import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;

@GanjacraftModElements.ModElement.Tag
public class BreakUnderBlockCropProcedure extends GanjacraftModElements.ModElement {
	public BreakUnderBlockCropProcedure(GanjacraftModElements instance) {
		super(instance, 106);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency x for procedure BreakUnderBlockCrop!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency y for procedure BreakUnderBlockCrop!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency z for procedure BreakUnderBlockCrop!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency world for procedure BreakUnderBlockCrop!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(WeedseedsItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
