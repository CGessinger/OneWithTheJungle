package com.gessinger.onewiththejungle.effects;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public enum PotionEffects
{
	Resistance(new EffectInstance(Effects.RESISTANCE, 0, 0, false, false)),
	Regeneration(new EffectInstance(Effects.REGENERATION, 0, 0, false, false)),
	Water_Breathing(new EffectInstance(Effects.WATER_BREATHING, 0, 0, false, false));


	private final EffectInstance effect;

	PotionEffects (EffectInstance eff){
		this.effect = eff;
	}

	public EffectInstance get(){
		return this.effect;
	}
}
