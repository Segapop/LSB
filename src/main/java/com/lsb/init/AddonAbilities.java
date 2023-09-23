package com.lsb.init;

import com.lsb.entity.abilities.*;
import com.gempire.init.ModAbilities;

public class AddonAbilities {
    public static void registerAbilities() {
        ModAbilities.abilities.add(new SupervisorAbility());
        ModAbilities.abilities.add(new ModelAbility());;
        ModAbilities.abilities.add(new NightAbility());
        ModAbilities.abilities.add(new SingerAbility());
        ModAbilities.abilities.add(new WranglerAbility());
        ModAbilities.abilities.add(new BackupSingerAbility());
        ModAbilities.abilities.add(new BackupDancerAbility());
        ModAbilities.abilities.add(new InstrumentAbility());
        ModAbilities.abilities.add(new ConductorAbility());
        ModAbilities.abilities.add(new AcrobatAbility());
        ModAbilities.abilities.add(new ComposerAbility());
        ModAbilities.abilities.add(new EscortAbility());

        ModAbilities.abilities.add(new HerderAbility());
        ModAbilities.abilities.add(new DayAbility());
    }
}
