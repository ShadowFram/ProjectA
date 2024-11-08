package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LightFootgainProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (3 >= ProjectAModVariables.MapVariables.get(world).Speed_count_modifier) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, (int) (100 + 20 * ProjectAModVariables.MapVariables.get(world).Speed_count_modifier), (int) ProjectAModVariables.MapVariables.get(world).Speed_count_modifier, false, false));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, (int) (100 + 20 * ProjectAModVariables.MapVariables.get(world).Speed_count_modifier), 4, false, false));
		}
	}
}
