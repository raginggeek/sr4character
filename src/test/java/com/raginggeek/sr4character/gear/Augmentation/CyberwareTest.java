package com.raginggeek.sr4character.gear.Augmentation;

import com.raginggeek.sr4character.gear.AvailabilityRating;
import com.raginggeek.sr4character.gear.GearSizes;
import com.raginggeek.sr4character.gear.MatrixAttributes;
import com.raginggeek.sr4character.gear.MatrixAttributesTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class CyberwareTest {

    @Test
    public void DefaultConstructorTestName(){
        Cyberware instance = new Cyberware();
        assertEquals("Custom Gear", instance.getName());
    }

    @Test
    public void DefaultConstructorTestEssence() {
        Cyberware instance = new Cyberware();
        assertEquals(0.0, instance.getEssenceCost(), 0.001);
    }

    @Test
    public void DefaultConstructorTestRating() {
        Cyberware instance = new Cyberware();
        assertEquals(1, instance.getRating());
    }

    @Test
    public void DefaultConstructorTestAugType() {
        Cyberware instance = new Cyberware();
        assertEquals("Cyberware", instance.getAugmentType());
    }

    @Test
    public void DefaultConstructorTestDescription() {
        Cyberware instance = new Cyberware();
        assertEquals("Custom Gear Item", instance.getDescription());
    }

    @Test
    public void DefaultConstructorTestCost() {
        Cyberware instance = new Cyberware();
        assertEquals(0, instance.getCost());
    }

    @Test
    public void DefaultConstructorTestAvailability() {
        Cyberware instance = new Cyberware();
        assertEquals("0", instance.getAvailability().toString());
    }

    @Test
    public void DefaultConstructorTestWireless() {
        Cyberware instance = new Cyberware();
        assertTrue(instance.isWireless());
    }

    @Test
    public void DefaultConstructorTestRfid() {
        Cyberware instance = new Cyberware();
        assertTrue(instance.isRfid());
    }

    @Test
    public void DefaultConstructorTestMatrixAttributes() {
        Cyberware instance = new Cyberware();
        assertEquals(0, instance.getMatrixAttributes().getSystem());
    }

    @Test
    public void DefaultConstructorTestSize() {
        Cyberware instance = new Cyberware();
        assertEquals("Human/Elf/Ork Size", instance.getSize().toString());
    }

    @Test
    public void CustomCyberwareNameTest() {
        Cyberware instance = new Cyberware("foobar");
        assertEquals("foobar", instance.getName());
    }

    @Test
    public void CustomCyberwareCostTest() {
        Cyberware instance = new Cyberware("foobar", 4000);
        assertEquals(4000, instance.getCost());
    }

    @Test
    public void CustomCyberwareTestEssence() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0);
        assertEquals(4.0, instance.getEssenceCost(), 0.001);
    }

    @Test
    public void CustomCyberwareTestRating() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0, 4);
        assertEquals(4, instance.getRating());
    }

    @Test
    public void CustomCyberwareTestAvailability() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4));
        assertEquals("4", instance.getAvailability().toString());
    }

    @Test
    public void CustomCyberwareTestDescription() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos");
        assertEquals("A thing that foos", instance.getDescription());
    }

    @Test
    public void CustomCyberwareTestWireless() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos", false, false);
        assertFalse(instance.isWireless());
    }

    @Test
    public void CustomCyberwareTestRfid() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos", false, false);
        assertFalse(instance.isRfid());
    }

    @Test
    public void CustomCyberwareTestSize() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos",
                false, false, GearSizes.TROLL);
        assertEquals("Troll Size", instance.getSize().toString());
    }

    @Test
    public void CustomCyberwareTestMatrixAttributes() {
        Cyberware instance = new Cyberware("foobar", 4000, 4.0,
                4, new AvailabilityRating(4), "A thing that foos",
                false, false, GearSizes.DWARF, new MatrixAttributes(4,0,0,0));
        assertEquals(4, instance.getMatrixAttributes().getSignal());
    }



}
