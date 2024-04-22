/*
    Maximum product Quadruple in an array

    Description

        You've to find the maximum product quadruple in the array. i.e. the largest number that can be achieved by multiplying any four elements of the array

    Input:
        The input should be in the following format:
        The first line should be an integer ‘n’ representing the number of elements in the array.
        The second line should be n space separated integers representing the elements of the array.
    Output:
        The output should be in the following format:
        Print maximum product quadruple of the array.

    Example:
        Input:
            5
            1 -2 3 4 5

        Output:
            60

    Execution Time Limit
    15 seconds
* */

package com.DSA.IWQuestions;

import java.util.Scanner;

import static java.lang.System.out;

public class Maximum_Product_Quadruple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maxProdQuad(n, arr);
        if (max == -1) out.println("No Maximum Product Quadruple");
        else out.println(max);

    }

    static int maxProdQuad(int n, int[] arr) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        if (n < 4) return -1;

        int maxA = INT_MIN, maxB = INT_MIN, maxC = INT_MIN, maxD = INT_MIN;

        int minA = INT_MAX, minB = INT_MAX, minC = INT_MAX, minD = INT_MAX;


        for (int i = 0; i < n; i++) {

            // Update Maximum, second maximum, third
            // maximum and fourth maximum element
            if (arr[i] > maxA) {
                maxD = maxC;
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }

            // Update second maximum, third maximum
            // and fourth maximum element
            else if (arr[i] > maxB) {
                maxD = maxC;
                maxC = maxB;
                maxB = arr[i];
            }

            // Update third maximum and
            // fourth maximum element
            else if (arr[i] > maxC) {
                maxD = maxC;
                maxC = arr[i];
            }

            // Update fourth maximum element
            else if (arr[i] > maxD) maxD = arr[i];

            // Update Minimum, second minimum
            // third minimum and fourth minimum element
            if (arr[i] < minA) {
                minD = minC;
                minC = minB;
                minB = minA;
                minA = arr[i];
            }

            // Update second minimum, third
            // minimum and fourth minimum element
            else if (arr[i] < minB) {
                minD = minC;
                minC = minB;
                minB = arr[i];
            }

            // Update third minimum and
            // fourth minimum element
            else if (arr[i] < minC) {
                minD = minC;
                minC = arr[i];
            }

            // Update fourth minimum element
            else if (arr[i] < minD) minD = arr[i];
        }

        int x = maxA * maxB * maxC * maxD;
        int y = minA * minB * minC * minD;
        int z = minA * minB * maxA * maxB;

        return Integer.max(x, Integer.max(y, z));
    }
}
