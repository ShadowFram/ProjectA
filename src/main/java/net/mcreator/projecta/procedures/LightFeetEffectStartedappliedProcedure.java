package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LightFeetEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double multiplayer = 0;
		multiplayer = 0.5;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
				.hasModifier((new AttributeModifier(UUID.fromString("b33de305-4d4b-48c7-ae4b-7589c6cae1ee"), "LightFoot", multiplayer, AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.addTransientModifier((new AttributeModifier(UUID.fromString("b33de305-4d4b-48c7-ae4b-7589c6cae1ee"), "LightFoot", multiplayer, AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
