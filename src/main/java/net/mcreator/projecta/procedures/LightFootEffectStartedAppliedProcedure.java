package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LightFootEffectStartedAppliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
				.hasModifier((new AttributeModifier(UUID.fromString("b33de305-4d4b-48c7-ae4b-7589c6cae1ee"), "LightFoot", (0.5 * ProjectAModVariables.MapVariables.get(world).Speed_count_modifier), AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).addTransientModifier(
					(new AttributeModifier(UUID.fromString("b33de305-4d4b-48c7-ae4b-7589c6cae1ee"), "LightFoot", (0.5 * ProjectAModVariables.MapVariables.get(world).Speed_count_modifier), AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
