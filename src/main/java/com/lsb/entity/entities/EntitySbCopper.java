package com.lsb.entity.entities;

import com.gempire.entities.abilities.*;
import com.gempire.entities.abilities.base.Ability;
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.bases.EntityVaryingGem;
import com.gempire.entities.gems.EntityEmerald;
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityCrawler;
import com.gempire.entities.other.EntityShambler;
import com.gempire.util.GemPlacements;
import com.lsb.entity.abilities.InstrumentAbility;
import com.lsb.entity.abilities.SupervisorAbility;
import com.lsb.init.AddonItems;
import com.lsb.lsb;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.ArrayList;

public class EntitySbCopper extends EntityVaryingGem {

    //This gem was copied from topaz
    public EntitySbCopper(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    @Override
    public int[] NeglectedColors() {
        return new int[] {
                0,2,3,4,5,6,7,8,10,11,14,15,16,17
        };
    }

    @Override
    public String getModID() {
        //THIS DEFINES THE GEM AS BEING AN ADDON GEM
        return lsb.MODID;
    }

    @Override
    public Class getItemRegister() {
        //THIS TOO
        return AddonItems.class;
    }

    @Override
    public boolean isPopular() {
        return false;
    }

    public boolean flocksTo(EntityGem gem) {
        return gem.isPopular() || gem instanceof EntitySbGold;
    }

    @Override
    public SoundEvent getInstrument()
    {
        return SoundEvents.NOTE_BLOCK_HARP.get();
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(7, new FloatGoal(this));
        this.goalSelector.addGoal(6, new PanicGoal(this, 1.1D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 4.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(8, new EntityAIWander(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowGarnet(this, 0.7D));
        this.goalSelector.addGoal(7, new EntityAIFollowOwner(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Mob.class, 6.0F, 1.0D, 1.2D, (mob)-> mob.getClassification(true)== MobCategory.MONSTER));
        this.goalSelector.addGoal(1, new EntityAISludged(this, 0.6));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkBothSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, 1, false, false, this::checkSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityGem.class, 6.0F, 1.0D, 1.2D, this::checkElseSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityCrawler.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityShambler.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityAbomination.class, 6.0F, 1.0D, 1.2D));
    }

    @Override
    public Float baseXScale() {
        return .7F;
    }

    @Override
    public Float baseYScale() {
        return .75F;
    }

    @Override
    public Float baseZScale() {
        return .7F;
    }

    public int generateHardness() {
        return 3;
    }

    @Override
    public int getColor() {
        return 0;
    }

    @Override
    public boolean hasMarkings() {
        return this.getSkinColorVariant() == 12 || this.getSkinColorVariant() == 13;
    }

    @Override
    public int generateSkinVariant() {
        return 0;
    }

    @Override
    public GemPlacements[] getPlacements() {
        return new GemPlacements[]{
                GemPlacements.TOP_OF_HEAD, GemPlacements.FOREHEAD, GemPlacements.BACK_OF_HEAD, GemPlacements.LEFT_EYE, GemPlacements.RIGHT_EYE, GemPlacements.NOSE,
                GemPlacements.LEFT_CHEEK, GemPlacements.RIGHT_CHEEK, GemPlacements.LEFT_EAR, GemPlacements.RIGHT_EAR, GemPlacements.CHEST, GemPlacements.BACK, GemPlacements.BELLY,
                GemPlacements.LEFT_SHOULDER, GemPlacements.RIGHT_SHOULDER, GemPlacements.LEFT_HAND, GemPlacements.RIGHT_HAND, GemPlacements.LEFT_PALM, GemPlacements.RIGHT_PALM,
        };
    }

    @Override
    public int generateHairVariant() { return this.random.nextInt(3); }

    @Override
    public int exitHoleSize() {
        return 2;
    }

    @Override
    public int generateOutfitVariant() {
        return this.random.nextInt(1);
    }

    @Override
    public int generateInsigniaVariant() {
        return this.getOutfitVariant();
    }

    public int generateRebelInsigniaVariant() {
        return this.getRebelOutfitVariant();
    }

    @Override
    public int generateVisorVariant() {
        return this.random.nextInt(2);
    }

    @Override
    public int generateSkinColorVariant() {
        return this.random.nextInt(1);
    }

    @Override
    public boolean UsesUniqueNames() {
        return true;
    }

    @Override
    public String NameFromColor(byte i) {
        switch(i){
            case 9:
                return "oxidized";
            case 12:
                return "exposed";
            case 13:
                return "weathered";
            default:
                return "copper";
        }
    }

    @Override
    public boolean hasSkinColorVariant() {
        return true;
    }

    @Override
    public boolean generateIsEmotional() {
        return true;
    }

    @Override
    public byte EmotionThreshold() {
        return 4;
    }

    @Override
    public boolean canChangeUniformColorByDefault() {
        return true;
    }

    @Override
    public boolean canChangeInsigniaColorByDefault() {
        return true;
    }

    public ArrayList<Ability> possibleAbilities() {
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new AbilityZilch());
        arrayList.add(new AbilityBeefcake());
        arrayList.add(new AbilityUnhinged());
        arrayList.add(new AbilityElectrokinesis());
        return arrayList;
    }

    public ArrayList<Ability> definiteAbilities() {
        ArrayList<Ability> arrayList = new ArrayList<>();
        arrayList.add(new InstrumentAbility());
        return arrayList;
    }

    @Override
    public int baseFocus() {
        return 6;
    }

    @Override
    public boolean hasOutfitPlacementVariant() {
        return false;
    }

    @Override
    public int[] outfitPlacementVariants() {
        return new int[]{
        };
    }
}
