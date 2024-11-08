package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.projecta.network.ProjectAModVariables;

public class TestEntityDiesProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			double _setval = (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Current_XP + 1000;
			sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Current_XP = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		XPDropProcedure.execute(entity, sourceentity);
	}
}
