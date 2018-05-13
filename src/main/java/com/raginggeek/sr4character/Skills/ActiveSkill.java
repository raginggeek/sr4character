package com.raginggeek.sr4character.Skills;

public class ActiveSkill extends Skills {
    protected static final String DEFAULT_GROUP = "Active Skill";

    public ActiveSkill() {
        this(DEFAULT_NAME);
    }

    public ActiveSkill(String name) {
        this(name, DEFAULT_BASE);
    }

    public ActiveSkill(String name, int base) {
        this(name, base, DEFAULT_NATURAL_MAX);
    }

    public ActiveSkill(String name, int base, int naturalMax) {
        this(name, base, naturalMax, DEFAULT_MODIFIED);
    }

    public ActiveSkill(String name, int base, int naturalMax, int modified) {
        this(name, base, naturalMax, modified, DEFAULT_AUGMENTED_MAX);
    }

    public ActiveSkill(String name, int base, int naturalMax, int modified, int augmentedMax) {
        this(name, base, naturalMax, modified, augmentedMax, DEFAULT_GROUP);
    }

    public ActiveSkill(String name, int base, int naturalMax, int modified, int augmentedMax, String group) {
        this(name, base, naturalMax, modified, augmentedMax, group, DEFAULT_GROUPED);
    }

    public ActiveSkill(String name, int base, int naturalMax, int modified,
                       int augmentedMax, String group, boolean isGrouped) {
        this(name, base, naturalMax, modified, augmentedMax, group, isGrouped, DEFAULT_SPECIALIZED, DEFAULT_BONUS_TEXT);
    }

    public ActiveSkill(String name, int base, int naturalMax, int modified,
                       int augmentedMax, String group, boolean isGrouped, String bonusText) {
        this(name, base, naturalMax, modified, augmentedMax, group, isGrouped, true, bonusText);
    }

    public ActiveSkill(String name, int base, int naturalMax, int modified,
                       int augmentedMax, String group, boolean isGrouped, boolean isSpecialized, String bonusText) {
        this(name, base, naturalMax, modified, augmentedMax, group, isGrouped,
                isSpecialized, bonusText, DEFAULT_DESCRIPTION);

    }

    public ActiveSkill(String name, int base, int naturalMax, int modified,
                       int augmentedMax, String group, boolean isGrouped, boolean isSpecialized, String bonusText,
                       String description) {
        super(name, base, naturalMax, modified, augmentedMax, group, isGrouped, isSpecialized, bonusText, description);

    }

}
