package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.projecta.network.ProjectAModVariables;

public class GiveLevelsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level + 10;
			entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Level = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
