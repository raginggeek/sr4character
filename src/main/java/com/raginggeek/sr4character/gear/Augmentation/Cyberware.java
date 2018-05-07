package com.raginggeek.sr4character.gear.Augmentation;

import com.raginggeek.sr4character.gear.AvailabilityRating;
import com.raginggeek.sr4character.gear.GearSizes;
import com.raginggeek.sr4character.gear.MatrixAttributes;

public class Cyberware extends Augmentation {
    private static final String AUGMENT_TYPE = "Cyberware";

    public Cyberware() {
        this(DEFAULT_NAME);
    }

    public Cyberware(String name) {
        this(name, DEFAULT_COST);
    }

    public Cyberware(String name, int cost) {
        this(name, cost, DEFAULT_ESSENCE_COST);
    }

    public Cyberware(String name, int cost, double essenceCost) {
        this(name, cost, essenceCost, DEFAULT_RATING);
    }

    public Cyberware(String name, int cost, double essenceCost, int rating) {
        this(name, cost, essenceCost, rating, new AvailabilityRating());
    }

    public Cyberware(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar) {
        this(name, cost, essenceCost, rating, ar, DEFAULT_DESCRIPTION);
    }

    public Cyberware(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar, String description) {
        this(name, cost, essenceCost, rating, ar, description, DEFAULT_WIRELESS, DEFAULT_RFID);
    }

    public Cyberware(String name, int cost, double essenceCost,
                        int rating, AvailabilityRating ar, String description,
                        boolean wireless, boolean rfid) {
        this(name, cost, essenceCost, rating, ar, description, wireless, rfid, DEFAULT_SIZE);
    }

    public Cyberware(String name, int cost, double essenceCost,
                     int rating, AvailabilityRating ar, String description,
                     boolean wireless, boolean rfid, GearSizes size) {
        this(name, cost, essenceCost, rating, ar, description, wireless, rfid, size, new MatrixAttributes());

    }

    public Cyberware(String name, int cost, double essenceCost,
                     int rating, AvailabilityRating ar, String description,
                     boolean wireless, boolean rfid, GearSizes size, MatrixAttributes ma) {
        super(name, cost, essenceCost, rating, ar, description, wireless, rfid, size, ma);

    }


    public String getAugmentType() {
        return AUGMENT_TYPE;
    }
}
