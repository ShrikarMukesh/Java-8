package org.elevens;

 class Node {
    int data;
    Node next;
    public Node(int data){
       this.data = data;
       this.next = null;
    }
}
public class CusLinkedList {
    // 23 -> 12 -> 78 -> 13 -> 1
    static void reverseLinkedList(Node head) {
        Node previous = null;
        Node current = head;

        while(current.next != null){
             current = current.next;
             previous = current;
             System.out.println(current.data + " ");
        }
        //current.next  =
    }

     static void printLL(Node head) {
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(12);
        head.next.next = new Node(78);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(1);
        //printLL(head);
        reverseLinkedList(head);
    }
}
