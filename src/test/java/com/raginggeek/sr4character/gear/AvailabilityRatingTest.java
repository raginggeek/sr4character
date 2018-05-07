package com.raginggeek.sr4character.gear;

import org.junit.Test;

import static org.junit.Assert.*;

public class AvailabilityRatingTest {

    @Test
    public void getZeroRatingTest() {
     AvailabilityRating ar = new AvailabilityRating();
     assertEquals(0, ar.getRating());
    }

    @Test
    public void getRatingTest() {
        AvailabilityRating ar = new AvailabilityRating(4);
        assertEquals(4, ar.getRating());
    }

    @Test
    public void getClassificationTest() {
        AvailabilityRating ar = new AvailabilityRating(4, "Restricted");
        assertEquals("Restricted", ar.getClassification());
    }

    @Test
    public void toStringTest() {
        AvailabilityRating ar = new AvailabilityRating(4, "Restricted");
        assertEquals("4R", ar.toString());
    }
}