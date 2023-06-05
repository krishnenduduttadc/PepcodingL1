/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author krish
 */
public class MyLL {
     static Node head;  // head of list 


    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    void printList(Node head) {
        Node t=head;
        while(t!=null){
            System.out.print(" "+t.data);
            t=t.next;
        }
        System.out.println();
    }
    
    void push(int d) {
        Node nw=new Node(d);
        nw.next=head;
        head=nw;
    }
    
    public static void main(String[] args) {
        MyLL llist = new MyLL();
        llist.push(11);
        llist.push(10);
        llist.push(9);
        llist.push(6);
        llist.push(4);
        llist.push(1);
        llist.push(0);
        System.out.println("Origional Linked List");
        llist.printList(head);
    }
}
