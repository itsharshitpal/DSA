/*
    Insertion Sort Code

    Description
    Write a program in Java that can return an array in descending order of elements using insertion sort.
    The program will take the size of the array and the elements of the array as inputs.

    Sample Input:
    4
    1
    2
    3
    4

    Sample Output:
    4
    3
    2
    1

    Here, input value ‘4’ (the first input) corresponds to the array size, and the rest of the numbers correspond to the elements of the array.

    Execution Time Limit
    15 seconds
* */


package com.DSA.Sorting.InsertionSort_3;

import java.util.Scanner;

import static java.lang.System.out;

public class Problem2 {
    public static void insertionSortDescending(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] < key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort in descending order
        insertionSortDescending(array);
        for (int i = 0; i < array.length; i++) {
        out.println(array[i]);
        }
    }
}

