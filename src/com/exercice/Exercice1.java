package com.exercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercice1 {
    public static void main(String[] args) {
        ordonner2();
    }

    private static void ordonner1() {
        List<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(11);
        list.add(5);
        list.add(6);
        Collections.sort(list);
        System.out.println(list);
    }
    private static void ordonner2() {
        Set<Integer> list = new TreeSet<Integer>();
        list.add(16);
        list.add(11);
        list.add(5);
        list.add(6);
        System.out.println(list);
    }
}