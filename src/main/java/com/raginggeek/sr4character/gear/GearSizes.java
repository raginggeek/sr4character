package com.raginggeek.sr4character.gear;

public enum GearSizes {
    NORMAL("Human/Elf/Ork Size"),
    DWARF("Dwarf Size"),
    TROLL("Troll Size");

    private final String size;

    GearSizes(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size;
    }
}
