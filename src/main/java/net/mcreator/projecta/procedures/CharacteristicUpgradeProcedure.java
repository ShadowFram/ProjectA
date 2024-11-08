package net.mcreator.projecta.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.projecta.network.ProjectAModVariables;

import java.util.UUID;

public class CharacteristicUpgradeProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!(((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).hasModifier(
				(new AttributeModifier(UUID.fromString("43bfe5bb-258e-43e0-bfed-d3066c34d4a0"), "maxhealthupgrade", (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue()
						+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.5), AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).addTransientModifier(
					(new AttributeModifier(UUID.fromString("43bfe5bb-258e-43e0-bfed-d3066c34d4a0"), "maxhealthupgrade", (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue()
							+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.5), AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (!(((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).hasModifier(
				(new AttributeModifier(UUID.fromString("4aca0493-e116-409f-95c3-df49e995fa1b"), "movementupgrade", (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getBaseValue()
						+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.01), AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) sourceentity)
					.getAttribute(
							net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.addTransientModifier((new AttributeModifier(UUID.fromString("4aca0493-e116-409f-95c3-df49e995fa1b"), "movementupgrade",
							(((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getBaseValue()
									+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.01),
							AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (!(((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
				.hasModifier((new AttributeModifier(UUID.fromString("ef4423a4-5509-4a23-ace5-db3285f8c015"), "armorupgrade", (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue()
						+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.01), AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) sourceentity)
					.getAttribute(
							net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
					.addTransientModifier(
							(new AttributeModifier(UUID.fromString("ef4423a4-5509-4a23-ace5-db3285f8c015"), "armorupgrade", (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue()
									+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.01), AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (!(((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier(
				(new AttributeModifier(UUID.fromString("6401e853-8f89-429c-a361-4988f9d7c8bb"), "attackdamageupgrade", (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue()
						+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.005), AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) sourceentity)
					.getAttribute(
							net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.addTransientModifier((new AttributeModifier(UUID.fromString("6401e853-8f89-429c-a361-4988f9d7c8bb"), "attackdamageupgrade",
							(((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue()
									+ (sourceentity.getCapability(ProjectAModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ProjectAModVariables.PlayerVariables())).Level * 0.005),
							AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
