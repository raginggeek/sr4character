package com.raginggeek.sr4character;

import com.raginggeek.sr4character.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttributeTest {

    @Test
    public void testGetName() {
        Attribute testAttribute = new Attribute("nametest");
        assertEquals("nametest", testAttribute.getName());
    }

    @Test
    public void testGetDefaultBase() {
        Attribute testAttribute = new Attribute("nametest");
        assertEquals(1, testAttribute.getBase());
    }

    @Test
    public void testGetCustomBase() {
        Attribute testAttribute = new Attribute("nametest", 4);
        assertEquals(4, testAttribute.getBase());
    }

    @Test
    public void testGetCustomModified() {
        Attribute testAttribute = new Attribute("nametest", 4);
        assertEquals(4, testAttribute.getModified());
    }

    @Test
    public void testGetAdjustedModified() {
        Attribute testAttribute = new Attribute("nametest", 4);
        testAttribute.applyModifier(-3);
        assertEquals(1, testAttribute.getModified());
    }

    @Test
    public void testStringOutput() {
        Attribute testAttribute = new Attribute("nametest", 4);
        testAttribute.applyModifier(-3);
        assertEquals("nametest:= 4 (1)", testAttribute.toString());
    }

}
