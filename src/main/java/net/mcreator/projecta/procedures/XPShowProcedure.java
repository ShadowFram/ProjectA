package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class XPShowProcedure {
	public static String execute() {
		return ((new java.text.DecimalFormat("##").format() + "") + "/") + "" + ((new java.text.DecimalFormat("##").format() + "") + "");
	}
}
