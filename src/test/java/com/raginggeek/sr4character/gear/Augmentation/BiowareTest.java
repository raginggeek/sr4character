package com.raginggeek.sr4character.gear.Augmentation;

import com.raginggeek.sr4character.gear.AvailabilityRating;
import com.raginggeek.sr4character.gear.GearSizes;
import com.raginggeek.sr4character.gear.MatrixAttributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class BiowareTest {

    @Test
    public void DefaultConstructorTestName(){
        Bioware instance = new Bioware();
        assertEquals("Custom Gear", instance.getName());
    }

    @Test
    public void DefaultConstructorTestEssence() {
        Bioware instance = new Bioware();
        assertEquals(0.0, instance.getEssenceCost(), 0.001);
    }

    @Test
    public void DefaultConstructorTestRating() {
        Bioware instance = new Bioware();
        assertEquals(1, instance.getRating());
    }

    @Test
    public void DefaultConstructorTestAugType() {
        Bioware instance = new Bioware();
        assertEquals("Bioware", instance.getAugmentType());
    }

    @Test
    public void DefaultConstructorTestDescription() {
        Bioware instance = new Bioware();
        assertEquals("Custom Gear Item", instance.getDescription());
    }

    @Test
    public void DefaultConstructorTestCost() {
        Bioware instance = new Bioware();
        assertEquals(0, instance.getCost());
    }

    @Test
    public void DefaultConstructorTestAvailability() {
        Bioware instance = new Bioware();
        assertEquals("0", instance.getAvailability().toString());
    }

    @Test
    public void DefaultConstructorTestWireless() {
        Bioware instance = new Bioware();
        assertTrue(instance.isWireless());
    }

    @Test
    public void DefaultConstructorTestRfid() {
        Bioware instance = new Bioware();
        assertTrue(instance.isRfid());
    }

    @Test
    public void DefaultConstructorTestMatrixAttributes() {
        Bioware instance = new Bioware();
        assertEquals(0, instance.getMatrixAttributes().getSystem());
    }

    @Test
    public void DefaultConstructorTestSize() {
        Bioware instance = new Bioware();
        assertEquals("Human/Elf/Ork Size", instance.getSize().toString());
    }

    @Test
    public void CustomCyberwareNameTest() {
        Bioware instance = new Bioware("foobar");
        assertEquals("foobar", instance.getName());
    }

    @Test
    public void CustomCyberwareCostTest() {
        Bioware instance = new Bioware("foobar", 4000);
        assertEquals(4000, instance.getCost());
    }

    @Test
    public void CustomCyberwareTestEssence() {
        Bioware instance = new Bioware("foobar", 4000, 4.0);
        assertEquals(4.0, instance.getEssenceCost(), 0.001);
    }

    @Test
    public void CustomCyberwareTestRating() {
        Bioware instance = new Bioware("foobar", 4000, 4.0, 4);
        assertEquals(4, instance.getRating());
    }

    @Test
    public void CustomCyberwareTestAvailability() {
        Bioware instance = new Bioware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4));
        assertEquals("4", instance.getAvailability().toString());
    }

    @Test
    public void CustomCyberwareTestDescription() {
        Bioware instance = new Bioware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos");
        assertEquals("A thing that foos", instance.getDescription());
    }

    @Test
    public void CustomCyberwareTestWireless() {
        Bioware instance = new Bioware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos", false, false);
        assertFalse(instance.isWireless());
    }

    @Test
    public void CustomCyberwareTestRfid() {
        Bioware instance = new Bioware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos", false, false);
        assertFalse(instance.isRfid());
    }

    @Test
    public void CustomCyberwareTestSize() {
        Bioware instance = new Bioware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos",
                false, false, GearSizes.TROLL);
        assertEquals("Troll Size", instance.getSize().toString());
    }

    @Test
    public void CustomCyberwareTestMatrixAttributes() {
        Bioware instance = new Bioware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos",
                false, false, GearSizes.DWARF, new MatrixAttributes(4,0,0,0));
        assertEquals(4, instance.getMatrixAttributes().getSignal());
    }

}
