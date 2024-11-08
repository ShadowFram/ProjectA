package net.mcreator.projecta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.projecta.network.ProjectAModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HardcoreMechanicProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Count_Lives >= 1) {
			{
				double _setval = (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Count_Lives - 1;
				entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Count_Lives = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("lives");
				if (_so == null)
					_so = _sc.addObjective("lives", ObjectiveCriteria.DUMMY, Component.literal("lives"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Count_Lives);
			}
			if ((entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Count_Lives == 0 && (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
					}
					return false;
				}
			}.checkGamemode(entity)) != true) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SPECTATOR);
			}
			if ((entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Count_Lives != 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(((Component.translatable("LiveWarningText").getString() + "") + ""
							+ (new java.text.DecimalFormat("##.##").format((entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Count_Lives) + ""))), false);
			}
			{
				double _setval = 1;
				entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			PlayerXPWantUpdateProcedure.execute(entity);
		}
	}
}
