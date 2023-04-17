package org.example;

import static org.example.Piramida.heapify;
import static org.example.Sort.sort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{
                4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5
        };

        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//    Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

