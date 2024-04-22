/*
        Linear Search Algorithm

        Description

        Given an array of non-negative integers,
        write a code to search the position of an element in the array in the reverse order.
        Do not print anything when the element is not present in the given array.
        Also, if the key is repeated, print the index where the key is appearing for the first time
        in reverse order.

        The code should :
        Take the size of the array as an input from the user.
        The elements of the array as an input from the user.
        The key you are searching for, as an input from the user.

        Sample Input:
        7
        6 8 3 5 9 1 2
        9
        Sample Output:
        2
        Here the output is 2 because the position of number 9 is 2 from the reverse order
        as mentioned in the question.

        Execution Time Limit
        15 seconds

        Input :
            10
            44 55 66 77 88 22 11 66 99 33
            66
*/



package com.DSA.Searching.LinearSearch1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int count;
        int i;

        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        int[] array = new int[count];

        for (i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }

        int key = input.nextInt();
        input.close();
        int result=0;
        for (i = 0; i < count; i++) {
            if (array[i] == key) {
                result = (count-1)-i;
            }
        }
        if (result>=0) System.out.println(result);
    }
}