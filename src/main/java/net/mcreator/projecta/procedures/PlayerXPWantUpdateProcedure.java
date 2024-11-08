package net.mcreator.projecta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.projecta.network.ProjectAModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerXPWantUpdateProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).XP_to_level_up
					* (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.5 + 30;
			entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.XP_to_level_up = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
