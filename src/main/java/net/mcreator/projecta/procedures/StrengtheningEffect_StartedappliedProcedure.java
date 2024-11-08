package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class StrengtheningEffect_StartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
				.hasModifier((new AttributeModifier(UUID.fromString("55ed15d6-3529-4bff-86c2-2a02bb0dcb84"), "Strength", 1, AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.addTransientModifier((new AttributeModifier(UUID.fromString("55ed15d6-3529-4bff-86c2-2a02bb0dcb84"), "Strength", 1, AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
