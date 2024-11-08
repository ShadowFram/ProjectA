
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projecta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.projecta.potion.StrengtheningMobEffect;
import net.mcreator.projecta.potion.LightFooteffectMobEffect;
import net.mcreator.projecta.ProjectAMod;

public class ProjectAModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ProjectAMod.MODID);
	public static final RegistryObject<MobEffect> STRENGTHENING = REGISTRY.register("strengthening", () -> new StrengtheningMobEffect());
	public static final RegistryObject<MobEffect> LIGHT_FOOTEFFECT = REGISTRY.register("light_footeffect", () -> new LightFooteffectMobEffect());
}
