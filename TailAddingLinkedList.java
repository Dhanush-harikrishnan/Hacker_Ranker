import java.io.*;
import java.util.*;

import java.util.Scanner;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsertAtTail {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            SinglyLinkedListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            
            current.next = newNode;
        }

        return head;
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        SinglyLinkedListNode head = null;
         for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            head = insertNodeAtTail(head, value);
        }
        printLinkedList(head);

        scanner.close();
    }
}
