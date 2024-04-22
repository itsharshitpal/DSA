/*
    Sum Closest to Zero

    Description

        You are given an array. The array can contain positive and negative integers. You need to find two elements such that their sum is closest to zero.

        For example, you are given an array {-4, 7, 6, 2, -5}. The two elements with the sum closest to zero will be -5 and 6.

    Input Format:
        The input contains the number of elements in the array, followed by the elements in the array.

    Output Format:
        The output contains the two elements with the sum closest to zero.

    Sample Test Cases:

        Input:
            5 -4 7 6 2 -5

        Output:
            -5 6

        Input:
            8 -50 34 -19 24 33 10 -46 -38

        Output:
            -38 34

    Execution Time Limit
        5 seconds
* */

package com.DSA.IWQuestions;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Sum_Closest_to_Zero {

    static void sumClosestToZero(int[] arr, int n) {
        int sum, min_sum = Integer.MAX_VALUE;
        int l = 0, r = n - 1;

        int min_l = l, min_r = n - 1;

        if (n < 2) {
            out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);

        while (l < r) {
            sum = arr[l] + arr[r];
            if (Math.abs(sum) < Math.abs(min_sum)) {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }

            if (sum < 0) l++;
            else r--;
        }
        out.println(arr[min_l] + " " + arr[min_r]);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sumClosestToZero(arr, n);
    }
}
