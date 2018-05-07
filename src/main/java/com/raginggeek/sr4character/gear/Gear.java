package com.raginggeek.sr4character.gear;

abstract public class Gear {
    protected static final String DEFAULT_NAME = "Custom Gear";
    protected static final String DEFAULT_DESCRIPTION = "Custom Gear Item";
    protected static final GearSizes DEFAULT_SIZE = GearSizes.NORMAL;
    protected static final int DEFAULT_COST = 0;
    protected static final boolean DEFAULT_WIRELESS = true;
    protected static final boolean DEFAULT_RFID = true;

    public Gear(String name,
                String description,
                int cost,
                AvailabilityRating ar,
                boolean wireless,
                boolean rfid,
                GearSizes size,
                MatrixAttributes ma) {
        this.setName(name);
        this.setDescription(description);
        this.setCost(cost);
        this.setAvailability(ar);
        this.setWireless(wireless);
        this.setRfid(rfid);
        this.setSize(size);
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

    public void setSize(GearSizes size) {
        this.size = size;
    }

    public GearSizes getSize() {
        return this.size;
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
    protected GearSizes size;


}
