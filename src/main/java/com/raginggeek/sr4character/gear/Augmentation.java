package com.raginggeek.sr4character.gear;

abstract public class Augmentation extends Gear {
    protected static final double DEFAULT_ESSENCE_COST = 0.0;
    protected static final int DEFAULT_RATING = 1;

    public Augmentation() {
        this(DEFAULT_NAME, DEFAULT_COST);
    }

    public Augmentation(String name, int cost) {
        this(name, cost, DEFAULT_ESSENCE_COST);
    }

    public Augmentation(String name, int cost, double essenceCost) {
        this(name, cost, essenceCost, DEFAULT_RATING);
    }

    public Augmentation(String name, int cost, double essenceCost, int rating) {
        this(name, cost, essenceCost, rating, new AvailabilityRating());
    }

    public Augmentation(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar) {
        this(name, cost, essenceCost, rating, ar, DEFAULT_DESCRIPTION);
    }

    public Augmentation(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar, String description) {
        this(name, cost, essenceCost, rating, ar, description, DEFAULT_WIRELESS, DEFAULT_RFID);
    }

    public Augmentation(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar, String description,
                        boolean wireless, boolean rfid) {
        this(name, cost, essenceCost, rating, ar, description, wireless, rfid, new MatrixAttributes());
    }

    public Augmentation(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar, String description,
                        boolean wireless, boolean rfid, MatrixAttributes ma) {
        super(name, description, cost, ar, wireless, rfid, ma);
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

    protected double essenceCost;
    protected int rating;
}
