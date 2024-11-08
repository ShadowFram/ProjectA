package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

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

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (>=1) {{
Entity _ent = entity;
Scoreboard _sc = _ent.level().getScoreboard();
Objective _so = _sc.getObjective("lives");
if (_so == null)
_so = _sc.addObjective("lives", ObjectiveCriteria.DUMMY, Component.literal("lives"), ObjectiveCriteria.RenderType.INTEGER);
_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int));
}if (==0&&(new Object(){
public boolean checkGamemode(Entity _ent){
if(_ent instanceof ServerPlayer _serverPlayer) {
return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
} else if(_ent.level().isClientSide() && _ent instanceof Player _player) {
return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
}
return false;
}
}.checkGamemode(entity))!=true) {if (entity instanceof ServerPlayer _player) _player.setGameMode(GameType.SPECTATOR);}if (!=0) {if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(((Component.translatable("LiveWarningText").getString()+"")+""+(new java.text.DecimalFormat("##.##").format()+""))), false);}}
}
}
