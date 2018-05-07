package com.raginggeek.sr4character.gear;

abstract public class Gear {
    public static final String DEFAULT_NAME = "Custom Gear";
    public static final String DEFAULT_DESCRIPTION = "Custom Gear Item";
    public static final int DEFAULT_COST = 0;
    public static final boolean DEFAULT_WIRELESS = true;
    public static final boolean DEFAULT_RFID = true;

    public Gear() {
        this(DEFAULT_NAME);
    }

    public Gear(String name) {
        this(name, DEFAULT_COST);
    }

    public Gear(String name, int cost){
        this(name, cost, new AvailabilityRating());
    }

    public Gear(String name, int cost, AvailabilityRating ar) {
        this(name, cost, DEFAULT_DESCRIPTION, ar);
    }

    public Gear(String name, int cost, String description, AvailabilityRating ar) {
        this(name, description, cost, ar, DEFAULT_WIRELESS, DEFAULT_RFID);
    }

    public Gear(String name,
                String description,
                int cost,
                AvailabilityRating ar,
                boolean wireless,
                boolean rfid) {
        this(name, description, cost, ar, wireless, rfid, new MatrixAttributes());
    }

    public Gear(String name,
                String description,
                int cost,
                AvailabilityRating ar,
                boolean wireless,
                boolean rfid,
                MatrixAttributes ma) {
        this.setName(name);
        this.setDescription(description);
        this.setCost(cost);
        this.setAvailability(ar);
        this.setWireless(wireless);
        this.setRfid(rfid);
        this.setMatrixAttributes(ma);
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public AvailabilityRating getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityRating availability) {
        this.availability = availability;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public boolean isRfid() {
        return rfid;
    }

    public void setRfid(boolean rfid) {
        this.rfid = rfid;
    }

    public MatrixAttributes getMatrixAttributes() {
        return matrixAttributes;
    }

    public void setMatrixAttributes(MatrixAttributes matrixAttributes) {
        this.matrixAttributes = matrixAttributes;
    }

    protected String name;
    protected String description;
    protected int cost;
    protected AvailabilityRating availability;
    protected boolean wireless;
    protected boolean rfid;
    protected MatrixAttributes matrixAttributes;


}
