package org.workout11;

import org.junit.jupiter.api.Test;
import org.workout11.ex1.Exercitii1;

import java.util.*;

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

    @Test
    void testMultiplyMatrixs() throws Exception {
        Integer[][] A = { { 1, 1, 1 }
                ,{ 2, 2, 2 }
                ,{ 3, 3, 3 }
                ,{ 4, 4, 4 } };

        Integer[][] B = { { 1, 1, 1, 1 }
                ,{ 2, 2, 2, 2 }
                ,{ 3, 3, 3, 3 }};

        Integer[][] X = { { 1, 1, 1, 1 }
                ,{ 2, 2, 2, 2 }};

        Integer[][] C ={ { 6, 6, 6, 6}
                ,{ 12, 12, 12, 12 }
                ,{ 18, 18, 18, 18 }
                ,{ 24, 24, 24, 24}};


        assertTrue(Arrays.deepEquals(Exercitii1.multiplyMatrix(A, B), C));
        Exception exception= assertThrows(Exception.class,()->Exercitii1.multiplyMatrix(A,X));
        assertEquals("matrixA[0].length must be equal with matrixB.length.", exception.getMessage());
    }

    @Test
    void testIntersect(){
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(5);
        setA.add(7);
        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        Set<Integer> setC = new HashSet<>();
        setC.add(3);
        setC.add(7);
        assertEquals(setC,Exercitii1.intersect(setA,setB));
    }

    @Test
    void testUnion(){
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(5);
        setA.add(7);
        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        Set<Integer> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);
        assertEquals(setC, Exercitii1.union(setA,setB));
    }

    @Test
    void testDifference(){
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(3);
        setA.add(5);
        setA.add(7);
        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        Set<Integer> setC = new HashSet<>();
        setC.add(1);
        setC.add(5);
        Set<Integer> setD = new HashSet<>();
        setD.add(6);
        setD.add(8);
        assertEquals(setC,Exercitii1.difference(setA,setB));
        assertEquals(setD,Exercitii1.difference(setB,setA));

        assertEquals(Exercitii1.union(setC,setD),Exercitii1.symmetricDifference(setB,setA));
    }

}
