package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.Entity;

public class PlayerNameShowProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getDisplayName().getString() + "";
	}
}
