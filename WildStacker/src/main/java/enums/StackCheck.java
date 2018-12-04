package xyz.wildseries.wildstacker.api.enums;

public enum StackCheck {

    AGE,
    EXACT_AGE,
    CAN_BREED,
    IS_TAMED,
    ANIMAL_OWNER,
    SKELETON_TYPE,
    ZOMBIE_BABY,
    SLIME_SIZE,
    ZOMBIE_PIGMAN_ANGRY,
    ENDERMAN_CARRIED_BLOCK,
    BAT_AWAKE,
    GUARDIAN_ELDER,
    PIG_SADDLE,
    SHEEP_SHEARED,
    SHEEP_COLOR,
    WOLF_ANGRY,
    WOLF_COLLAR_COLOR,
    OCELOT_TYPE,
    HORSE_TYPE,
    HORSE_COLOR,
    HORSE_STYLE,
    HORSE_CARRYING_CHEST,
    HORSE_TAME_PROGRESS,
    HORSE_MAX_TAME_PROGRESS,
    HORSE_JUMP,
    RABBIT_TYPE,
    VILLAGER_PROFESSION,
    LLAMA_COLOR,
    LLAMA_STRENGTH,
    PARROT_TYPE,
    PUFFERFISH_STATE,
    TROPICALFISH_TYPE,
    TROPICALFISH_BODY_COLOR,
    TROPICALFISH_TYPE_COLOR,
    PHANTOM_SIZE;

    private boolean enabled;

    StackCheck() {
        this.enabled = false;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
