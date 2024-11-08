package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.projecta.network.ProjectAModVariables;

public class LevelShowProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level) + "";
	}
}
