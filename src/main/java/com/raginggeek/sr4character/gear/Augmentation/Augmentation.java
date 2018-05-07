package com.raginggeek.sr4character.gear.Augmentation;

import com.raginggeek.sr4character.gear.AvailabilityRating;
import com.raginggeek.sr4character.gear.Gear;
import com.raginggeek.sr4character.gear.GearSizes;
import com.raginggeek.sr4character.gear.MatrixAttributes;

abstract public class Augmentation extends Gear {
    protected static final double DEFAULT_ESSENCE_COST = 0.0;
    protected static final int DEFAULT_RATING = 1;

    public Augmentation(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar, String description,
                        boolean wireless, boolean rfid, GearSizes size, MatrixAttributes ma) {
        super(name, description, cost, ar, wireless, rfid, size, ma);
        this.setEssenceCost(essenceCost);
        this.setRating(rating);

    }

    public double getEssenceCost() {
        return essenceCost;
    }

    public void setEssenceCost(double essenceCost) {
        this.essenceCost = essenceCost;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public abstract String getAugmentType();

    protected double essenceCost;
    protected int rating;
    protected String augmentType;

}
