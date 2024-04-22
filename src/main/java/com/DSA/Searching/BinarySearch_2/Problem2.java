/*
    Number of Unsuccessful Attempts
    Description
        Write a code that returns the number of unsuccessful attempts made to search for an element in the array using Binary search.
        The code should
        Take the size of the array as an input from the user
        The elements of the array as an input from the user
        The key you are searching for as an input from the user
    Sample Input:
        5
        2 3 4 5 8
        8

    Sample Output:
        2
    So in this sample test case, the first input is the size of the array i.e the array has 5 elements. Next 5 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take 2 unsuccessful steps for the code to reach 8, so the output is 2.

    Hint: To calculate the middle index use the recommended formula instead of using the formula used in pseudocode.

    Execution Time Limit
        15 seconds
*/

package com.DSA.Searching.BinarySearch_2;

import java.util.Scanner;

public class Problem2 {
        public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
            int l = 0;
            int r = inputArr.length - 1;
            int count = 0;
            while (l <= r) {
                int mid = l + (r-l) /2;
                if (key == inputArr[mid]) {
                    return count;
                }
                //Increment the unsuccessful comparison count here.
                count++;
                if (key < inputArr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return count;
        }

        public static void main(String args[] ) throws Exception {
            Problem2 bs = new Problem2();
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            int key = scanner.nextInt();
            System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
        }
    }

