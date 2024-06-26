/*
    Insertion Sort

    Description
        There is a total of N students in Professor X’s school for mutants. Each student has a first name as well as a last name, maintained separately in two separate database columns. One day, Professor X asks a student named Logan to copy the items of both these columns in two separate arrays and sort them using insertion sort. However, the first names should be in ascending order and the last names in descending order. Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

    Input:
         1. The first line will be 'n', the size of the two arrays.
         2. The next 'n' lines are the first name of the students.
         3. The next 'n' lines are the last name of the students.

    Output:
        1. The first 'n' lines are first names arranged in ascending order.
        2. The next 'n' lines are the last names arranged in descending order.

    HINT: You can use the compareTo() method to compare two strings lexically.

    Sample Input-1:
        2
        logan
        jean
        gray
        wolverine
        Sample Output-1:
        jean
        logan
        wolverine
        gray

    Here 2 represents the size of the arrays for first and last name.
    Next 2 lines are first names of 2 students "logan" and "jean".
    Followed by next 2 inputs of their last names, "gray" and "wolverine".
    The output has first 2 lines representing first names arranged in ascending order (lexicographically).
    The next two outputs represent last name of the students arranged in descending order (lexicographically).

    Sample Input-2
        10
        janella
        arianna
        bob
        sheryll
        katelynn
        alphonso
        bertha
        ivette
        michiko
        evelin
        valene
        krista
        lyn
        melony
        laila
        laree
        raylene
        lynwood
        tim
        keech

    Sample Output-2:
        alphonso
        arianna
        bertha
        bob
        evelin
        ivette
        janella
        katelynn
        michiko
        sheryll
        valene
        tim
        raylene
        melony
        lynwood
        lyn
        laree
        laila
        krista
        keech

    Here 10 represents the size of the arrays for first and last name.
    Next 10 lines are first names of 10 students. Followed by next 10 inputs of their last names.
    The output has first 10 lines representing first names arranged in ascending order (lexicographically).
    The next two outputs represent last name of the students arranged in descending order (lexicographically).

    Execution Time Limit
        15 seconds
*/


package com.DSA.Sorting.InsertionSort_3;

import java.util.Scanner;

import static java.lang.System.out;

public class Problem3 {
    public static void main(String[] ss) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] firstNames = new String[size];
        String[] lastNames = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        // Sort in ascending order
        sortAescending(firstNames);
        for (String i : firstNames) {
            out.println(i);
        }

        // Sort in descending order
        sortDescending(lastNames);
        for (String i : lastNames) {
            out.println(i);
        }
    }

    private static void sortDescending(String[] lastNames) {
        int n = lastNames.length;
        for (int j = 1; j < n; j++) {
            String key = lastNames[j];
            int i = j - 1;
            while ((i > -1) && (lastNames[i].compareTo(key) < 0)) {
                lastNames[i + 1] = lastNames[i];
                i--;
            }
            lastNames[i + 1] = key;
        }
    }

    private static void sortAescending(String[] firstNames) {
        int n = firstNames.length;
        for (int j = 1; j < n; j++) {
            String key = firstNames[j];
            int i = j - 1;
            while ((i > -1) && (firstNames[i].compareTo(key) >= 0)) {
                firstNames[i + 1] = firstNames[i];
                i--;
            }
            firstNames[i + 1] = key;
        }
    }
}

