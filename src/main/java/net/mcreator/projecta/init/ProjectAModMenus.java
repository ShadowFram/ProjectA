
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projecta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.projecta.world.inventory.PlayerInfoMenu;
import net.mcreator.projecta.ProjectAMod;

public class ProjectAModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ProjectAMod.MODID);
	public static final RegistryObject<MenuType<PlayerInfoMenu>> PLAYER_INFO = REGISTRY.register("player_info", () -> IForgeMenuType.create(PlayerInfoMenu::new));
}
