package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.projecta.network.ProjectAModVariables;

import java.util.UUID;

public class LightFootEffectStartedAppliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).hasModifier((new AttributeModifier(UUID.fromString("b33de305-4d4b-48c7-ae4b-7589c6cae1ee"), "LightFoot",
				(0.5 * (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Speed_count_modifier), AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).addTransientModifier((new AttributeModifier(UUID.fromString("b33de305-4d4b-48c7-ae4b-7589c6cae1ee"), "LightFoot",
					(0.5 * (entity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Speed_count_modifier), AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
