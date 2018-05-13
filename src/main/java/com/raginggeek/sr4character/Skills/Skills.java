package com.raginggeek.sr4character.Skills;

abstract public class Skills {
    protected static final boolean DEFAULT_GROUPED = false;
    protected static final boolean DEFAULT_SPECIALIZED = false;
    protected static final String DEFAULT_BONUS_TEXT = "";
    protected static final String DEFAULT_DESCRIPTION = "placeholder description text";
    protected static final String DEFAULT_NAME = "Default Skill";
    protected static final int DEFAULT_NATURAL_MAX = 6;
    protected static final int DEFAULT_BASE = 0;
    protected static final int DEFAULT_MODIFIED = 0;
    protected static final int DEFAULT_AUGMENTED_MAX = 6;

    protected String name;
    protected String description;
    protected int base;
    protected int modified;
    protected int naturalMax;
    protected int augmentedMax;
    protected String groupName;
    protected boolean grouped;
    protected boolean specialized;
    protected String bonusText;

    public Skills(String name, int base, int naturalMax, int modified,
                  int augmentedMax, String group, boolean isGrouped, boolean isSpecialized, String bonusText,
                  String description) {
        this.setName(name);
        this.setBase(base);
        this.setNaturalMax(naturalMax);
        this.setModified(modified);
        this.setAugmentedMax(augmentedMax);
        this.setGroupName(group);
        this.setGrouped(isGrouped);
        this.setSpecialized(isSpecialized);
        this.setBonusText(bonusText);
        this.setDescription(description);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getModified() {
        return modified;
    }

    public void setModified(int modified) {
        this.modified = modified;
    }

    public int getNaturalMax() {
        return naturalMax;
    }

    public void setNaturalMax(int naturalMax) {
        this.naturalMax = naturalMax;
    }

    public int getAugmentedMax() {
        return augmentedMax;
    }

    public void setAugmentedMax(int augmentedMax) {
        this.augmentedMax = augmentedMax;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean isGrouped() {
        return grouped;
    }

    public void setGrouped(boolean grouped) {
        this.grouped = grouped;
    }

    public boolean isSpecialized() {
        return specialized;
    }

    public void setSpecialized(boolean specialized) {
        this.specialized = specialized;
    }

    public String getBonusText() {
        return bonusText;
    }

    public void setBonusText(String bonusText) {
        this.bonusText = bonusText;
    }
}
