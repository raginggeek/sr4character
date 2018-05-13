package com.raginggeek.sr4character.Skills;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActiveSkillTest {

    @Test
    public void getDefaultNameTest() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals("Default Skill",instance.getName());
    }

    @Test
    public void getModifiedNameTest() {
        ActiveSkill instance = new ActiveSkill("foo");
        assertEquals("foo", instance.getName());
    }

    @Test
    public void getDefaultDescriptionTest() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals("placeholder description text",instance.getDescription());
    }

    @Test
    public void getModifiedDescriptionTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertEquals("foos the bars", instance.getDescription());
    }

    @Test
    public void getDefaultBaseTest() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals(0, instance.getBase());
    }

    @Test
    public void getModifiedBaseTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertEquals(4, instance.getBase());
    }

    @Test
    public void getDefaultModifiedTest() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals(0, instance.getModified());
    }

    @Test
    public void getModifiedModifiedTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertEquals(10, instance.getModified());
    }

    @Test
    public void getDefaultNaturalMaxTest() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals(6, instance.getNaturalMax());
    }

    @Test
    public void getModifiedNaturalMaxTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertEquals(8, instance.getNaturalMax());
    }

    @Test
    public void getDefaultAugmentedMax() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals(6, instance.getAugmentedMax());
    }

    @Test
    public void getModifiedAugmentedMaxTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertEquals(15, instance.getAugmentedMax());
    }

    @Test
    public void getDefaultGroupName() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals("Active Skill", instance.getGroupName());
    }

    @Test
    public void getModifiedGroupNameTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertEquals("bars", instance.getGroupName());
    }

    @Test
    public void getDefaultIsGrouped() {
        ActiveSkill instance = new ActiveSkill();
        assertFalse(instance.isGrouped());
    }

    @Test
    public void getModifiedIsGroupedTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertTrue(instance.isGrouped());
    }

    @Test
    public void getDefaultIsSpecialized() {
        ActiveSkill instance = new ActiveSkill();
        assertFalse(instance.isSpecialized());
    }

    @Test
    public void getModifiedIsSpecializedTest() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 8, 10,
                15, "bars", true, true,
                "Golden Gun +4", "foos the bars");
        assertTrue(instance.isSpecialized());
    }

    @Test
    public void getDefaultBonusText() {
        ActiveSkill instance = new ActiveSkill();
        assertEquals("", instance.getBonusText());
    }

    @Test
    public void getSpecializedText() {
        ActiveSkill instance = new ActiveSkill("foo", 4, 6, 4,
                6, "bars", false, "Golden Gun +2");
        assertEquals("Golden Gun +2", instance.getBonusText());
        assertTrue(instance.isSpecialized());
    }
}
