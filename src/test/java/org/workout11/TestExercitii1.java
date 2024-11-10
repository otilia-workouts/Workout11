package org.workout11;

import org.junit.jupiter.api.Test;
import org.workout11.ex1.Exercitii1;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestExercitii1 {

    @Test
    void testAIsSubstringOfB(){
        assertTrue(Exercitii1.substring("text","context"));
    }

    @Test
    void testBIsSubstringOfA(){
        assertTrue(Exercitii1.substring("javascript","java"));
    }
    @Test
    void testIsNotSubstring(){
        assertFalse(Exercitii1.substring("test","context"));
    }

    @Test
    void testIsPlateNumber(){
        assertTrue(Exercitii1.isPlateNumber("B 68 BAE"));
        assertTrue(Exercitii1.isPlateNumber("B 153 ABC"));
        assertTrue(Exercitii1.isPlateNumber("MS 49 IUB"));
        assertTrue(Exercitii1.isPlateNumber("IS 23 TAV"));
        assertFalse(Exercitii1.isPlateNumber("OT 25 UTBI"));
        assertFalse(Exercitii1.isPlateNumber("SJ 124 BAE"));
        assertFalse(Exercitii1.isPlateNumber("I 68 BAE"));
    }

    @Test
    void testRemoveDuplicates(){
        ArrayList<Integer> listWithDuplicates = new ArrayList<>(List.of(5, 0, 3, 1, 2, 3, 0, 0));
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(List.of(5, 0, 3, 1, 2));
        assertEquals(listWithoutDuplicates, Exercitii1.removeDuplicates(listWithDuplicates));
    }

    @Test
    void testOccurences(){
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 0, 3, 1, 2, 3, 0, 0));
        assertEquals(3, Exercitii1.occurences(0,arrayList));
        assertEquals(2, Exercitii1.occurences(3,arrayList));
        assertEquals(1, Exercitii1.occurences(1,arrayList));
        assertEquals(1, Exercitii1.occurences(2,arrayList));
        assertEquals(1, Exercitii1.occurences(5,arrayList));
        assertEquals(0, Exercitii1.occurences(8,arrayList));
    }

}
