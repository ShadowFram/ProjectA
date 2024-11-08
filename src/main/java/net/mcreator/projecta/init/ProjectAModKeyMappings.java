
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projecta.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.projecta.network.STRKEYMessage;
import net.mcreator.projecta.network.LFKEYMessage;
import net.mcreator.projecta.ProjectAMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ProjectAModKeyMappings {
	public static final KeyMapping LFKEY = new KeyMapping("key.project_a.lfkey", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ProjectAMod.PACKET_HANDLER.sendToServer(new LFKEYMessage(0, 0));
				LFKEYMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STRKEY = new KeyMapping("key.project_a.strkey", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ProjectAMod.PACKET_HANDLER.sendToServer(new STRKEYMessage(0, 0));
				STRKEYMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(LFKEY);
		event.register(STRKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				LFKEY.consumeClick();
				STRKEY.consumeClick();
			}
		}
	}
}
