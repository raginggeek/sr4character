package com.raginggeek.sr4character;

public class Attribute {
    protected static final int DEFAULT_BASE = 1;
    protected String name;
    protected int base;
    protected int modified;

    public Attribute(String name) {
        this(name, DEFAULT_BASE);
    }

    public Attribute(String name, int base) {
        this.name = name;
        this.base = base;
        this.modified = base;
    }

    public void applyModifier(int amount) {
        this.modified += amount;
    }

    public String getName() {
        return this.name;
    }

    public int getBase() {
        return this.base;
    }

    public int getModified() {
        return this.modified;
    }

    @Override
    public String toString() {
        return "" + this.name + ":= " + this.base + " (" + this.modified + ")";
    }
}
