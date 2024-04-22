/*
    Sort a Linked List of 0s, 1s and 2s

    Description

        You are given a linked list consisting of just 0s, 1s and 2s. You need to return the sorted linked list.

    Input Format:
        The input contains the number of elements in the linked list, followed by the elements in the linked list.

    Output Format:
        The output contains the sorted linked list.

    Sample Test Cases:

        Input:
            5 1 0 2 1 0

        Output:
            0 0 1 1 2

        Input:
            8 0 1 2 0 2 1 0 2

        Output:
            0 0 0 1 1 2 2 2

    Execution Time Limit
        5 seconds
* */

package com.DSA.IWQuestions;

import java.util.Scanner;

class LinkedList {
    Node head;

    void sortList() {
        int[] count = {0, 0, 0};

        Node ptr = head;

        while (ptr != null) {
            count[ptr.data]++;
            ptr = ptr.next;
        }

        int i = 0;
        ptr = head;

        while (ptr != null) {
            if (count[i] == 0) i++;
            else {
                ptr.data = i;
                --count[i];
                ptr = ptr.next;
            }
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}

class Source {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        LinkedList li = new LinkedList();

        for (int i = 0; i < n; i++) {
            int a;
            a = s.nextInt();
            li.push(a);
        }

        li.sortList();
        li.printList();
    }
}