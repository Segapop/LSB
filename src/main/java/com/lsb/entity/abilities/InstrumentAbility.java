package com.lsb.entity.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import net.minecraft.network.chat.Component;

public class InstrumentAbility extends Ability implements IIdleAbility {

    //Idle abilities are used for abilities like torch bearer, or beastmaster
    public InstrumentAbility() {
        // The id and weight of your ability
        // the id should be in a new 100s digit depending on your addon
        // this prevents compat issues
        // the weight is what determines how likely gems are to have the ability
        super(298,5);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.lsb.instrument");
    }

    @Override
    public void execute() {
        // Plays music discs if given them or compositions

    }
}
