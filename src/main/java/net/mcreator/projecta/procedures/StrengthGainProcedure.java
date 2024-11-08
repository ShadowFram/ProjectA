package net.mcreator.projecta.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StrengthGainProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (3>=) {if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,(int)(100+20*),(int), false, false));}else{if(entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,(int)(100+20*),4, false, false));}
}
}
