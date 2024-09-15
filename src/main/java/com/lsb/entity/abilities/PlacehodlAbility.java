package com.lsb.entity.abilities;

import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.abilities.interfaces.IIdleAbility;
import net.minecraft.network.chat.Component;

public class PlacehodlAbility extends Ability implements IIdleAbility {

    //Idle abilities are used for abilities like torch bearer, or beastmaster
    public PlacehodlAbility() {
        // The id and weight of your ability
        // the id should be in a new 100s digit depending on your addon
        // this prevents compat issues
        // the weight is what determines how likely gems are to have the ability
        super(294,5);
    }

    @Override
    public Component getName() {
        return Component.translatable("ability.lsb.placehodl");
    }

    @Override
    public void execute() {
        // "hue shifts" when experiencing certain emotions
        //(marking layer unhides when close to rebelling, wing layer unhides when about to outburst, ect)
        //when targeting something she goes invisible and "sneaks" up to it (just moves slower than normal)
        //maybe emits particles so she can be found

    }
}
