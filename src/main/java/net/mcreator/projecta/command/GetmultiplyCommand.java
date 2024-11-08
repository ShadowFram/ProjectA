
package net.mcreator.projecta.command;

@Mod.EventBusSubscriber
public class GetmultiplyCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("getmultiply")

		);
	}

}
