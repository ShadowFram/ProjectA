package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerStartedLivesWhenJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
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
if (==false) {{
Entity _ent = entity;
Scoreboard _sc = _ent.level().getScoreboard();
Objective _so = _sc.getObjective("lives");
if (_so == null)
_so = _sc.addObjective("lives", ObjectiveCriteria.DUMMY, Component.literal("lives"), ObjectiveCriteria.RenderType.INTEGER);
_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int));
}if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal(((Component.translatable("LiveText").getString()+"")+""+(new java.text.DecimalFormat("##").format()+""))), false);}
}
}
