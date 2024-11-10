package org.workout11.ex1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercitii1 {

    /**
     * TODO:a) Scrieti o metoda ce primeste doua Stringuri si verifica daca unul dintre ele este substring al celuilalt (eg: text si context sau javascript si java)
     * @param a is String;
     * @param b is String.
     * @return true if 'a' is substring of 'b' or 'b' is substring of 'b'
     * <br>false otherwise.
     */
    public static boolean substring(String a, String b) {
        return a.contains(b) || b.contains(a);
    }

    /**
     * TODO:b) Scrieti o metoda ce verifica daca un String se potriveste pe patternul unui numar de inmatriculare romanesc (Eg. "B 153 ABC")
     * Folositi ca resurse: https://www.vogella.com/tutorials/JavaRegularExpressions/article.html si https://www.freeformatter.com/java-regex-tester.html#ad-output
     * @param plateNumber a String text
     * @return true if the plateNumber matches the model of Romanian plate numbers,
     *  <br> false otherwise.
     */
    public static boolean isPlateNumber(String plateNumber) {
        return plateNumber.matches("(B\\s[0-9]{2,3}|[A-Z]{2}\\s[0-9]{2})\\s[A-PR-Z]{3}");
    }



    /**
     * //TODO:c) Scrieti o metoda ce elimina elementele duplicate dintr-un array
     */
    public static ArrayList<?> removeDuplicates(ArrayList<?> arrayList){
        return new ArrayList<>( new LinkedHashSet<>(arrayList));
    }

    /**TODO:d) Scrieti o metoda ce verifica de cate ori se gaseste un anumit element intr-un array
     */
    public static int occurences(Object element, ArrayList<?> arrayList){
        int counter = 0;
        for(var elementArray: arrayList){
            if(elementArray.equals(element)){
                counter++;
            }
        }
        return counter;
    }

    //TODO:e) Scrieti o metoda ce inmulteste (in sens matematic) doua matrice.

    //TODO:f) Creati doua HashSeturi si realizati metode pentru operatiile caracteristice multimilor intersectie, reuniune si diferenta.

}
