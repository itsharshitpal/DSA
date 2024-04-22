package com.DSA.Sorting.QuickSort_5;

import static java.lang.System.out;

public class Problem1 {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void quickSort(int[] ar, int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                int temp1 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp1;
                i++;
            }
        }
        int temp2 = arr[i];
        arr[i] = arr[end];
        arr[end] = temp2;

        return i;
    }

    static void printArray(int[] arr)
    {
        for (int i : arr) out.print(i + " ");
        out.println();
    }
}
