package com.sortingapi;

import static edu.princeton.cs.introcs.StdIn.readAllStrings;
import static edu.princeton.cs.introcs.StdOut.print;
import static edu.princeton.cs.introcs.StdOut.println;

public class SortSelection {

    public static void sort(Comparable[] array) {
        int n = array.length;
        int h = 1;

        while (h < n/3) h = 3*h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i++) {

                for (int j = i; j >= h && less(array[j], array[j-h]); j-=h)
                    exchange(array, j,j-h);
            }

            h = h/3;
        }
    }

/*    public static void sort(Comparable[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (less(array[j], array[min])) min = j;

            exchange(array, i, min);
        }
    }*/

/*    public static void sort(Comparable[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(array[j], array[j-1]); j--)
                exchange(array, j,j-1);
        }
    }*/

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable [] array, int i, int j) {
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static void show(Comparable [] array) {
        for (Comparable item : array)
            print(item + " ");

        println();
    }

    private static boolean isSorted(Comparable [] array) {
        for (int i = 1; i < array.length; i++)
            if (less(array[i], array[i - 1])) return false;

        return true;
    }

    public static void main(String[] args) {
        String [] array = readAllStrings();
        sort(array);
        assert isSorted(array);
        show(array);
    }
}