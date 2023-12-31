package com.lsb.entity.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import net.minecraft.network.chat.Component;

public class ModelAbility extends Ability implements IIdleAbility {

    //Idle abilities are used for abilities like torch bearer, or beastmaster
    public ModelAbility() {
        // The id and weight of your ability
        // the id should be in a new 100s digit depending on your addon
        // this prevents compat issues
        // the weight is what determines how likely gems are to have the ability
        super(299,5);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.lsb.model");
    }

    @Override
    public void execute() {
        // either absolutely nothing, or she'll passively calm gems down, maybe only if she's assigned to them, if wandering, she'll go to gems and dye their colors to match hers,
        //emotional outburst will randomize the colors of any nearby gems, maybe make a way for her to walk a set path like a runway

    }
}
