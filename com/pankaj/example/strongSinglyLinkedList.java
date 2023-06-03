package com.pankaj.example;

import java.util.*;
public class strongSinglyLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }Node head=null;

    public void creation2(){
        Scanner sc = new Scanner (System.in);
        int n;
        do {
            System.out.println("Enter Data here:");
            int data = sc.nextShort();
            Node newNode = new Node(data);

            if (head == null) {

                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;

            }
            System.out.println("Do you want to enter other data in linked list..press 1 ");
            n=sc.nextInt();
        }while(n==1);

    }
    public void traverse(){
        Node temp1=head;
        if(head==null){
            System.out.println("Here not linked list exist please try..");

        }
        else{
            while(temp1!=null){
                System.out.println(temp1.data);
                temp1=temp1.next;
            }

        }

    }


    public static void  main(String [] args){
        strongSinglyLinkedList st= new strongSinglyLinkedList();
        st.creation2();
        st.traverse();
    }
}
