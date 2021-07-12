package com.company;

import java.util.ArrayDeque;

public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>(34);
        ad1.add(45);
        ad1.add(35);
        ad1.add(55);
        ad1.add(15);

        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.offerFirst(345));
        System.out.println(ad1);

    }
}
