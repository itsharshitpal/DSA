/*
    Quick Sort

    Description
    Write a program in Java that sorts a given array in descending order using quicksort. Use the following array for this purpose.
        2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 | 18 | 20

    Input:
        No input required

    Output:
        20
        18
        16
        14
        12
        10
        8
        6
        4
        2

    Execution Time Limit
        15 seconds
* */


package com.DSA.Sorting.QuickSort_5;

import java.util.Random;

public class Problem3 {

    static Random random = new Random();

    public static int[] sort(int[] numbers) {
        // let's sort numbers using quicksort
        quickSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    public static void quickSort(int[] numbers, int first, int last) {
        if (first < last) {
            // select a pivot point
            int pivotIndex = first + random.nextInt(last - first + 1);
            int pivot = numbers[pivotIndex];
            int k = partition(numbers, first, last, pivot);

            // recursively sort the elements to the left of the pivot
            quickSort(numbers, first, k);
            // recursively sort the elements to the right of the pivot
            quickSort(numbers, k + 1, last);
        }
    }

    public static int partition(int[] numbers, int first, int last, int pivot) {
        int l = first;
        int r = last;

        while (l <= r) {
            // In each iteration, we will identify a number
            // from left side which is greater than the pivot
            // value, and also we will identify a number from
            // right side which is less than the pivot value.
            // Once the search is done, then we exchange both numbers.

            while (l <= r && numbers[l] >= pivot) {
                l++;
            }

            while (l <= r && numbers[r] < pivot) {
                r--;
            }

            if (l <= r) {
                exchangeNumbers(numbers, l, r);
                //move index to next position on both sides
                l++;
                r--;
            }
        }

        return l - 1;
    }

    public static void exchangeNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

        // exchange numbers using XOR, which doesn't require a temp variable
    }

    public static void main(String[] args) {
        int[] randomNumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] sortedNumbers;

        sortedNumbers = sort(randomNumbers); // selection sort

        // print out the sorted numbers
        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }
}
