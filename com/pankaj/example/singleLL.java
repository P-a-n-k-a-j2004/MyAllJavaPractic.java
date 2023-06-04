package com.pankaj.example;
import java.util.*;
public class singleLL {

    static class SecondNode{
        int data;
        SecondNode next;

        SecondNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    SecondNode head=null;

    public void creationOfSingleLinkedList(){
        int data,n;
        Scanner sc=new Scanner(System.in);
    do {
        System.out.println("Enter Data In Singly Linked List:");
        data = sc.nextInt();
        SecondNode sn = new SecondNode(data);
        if (head == null) {
            head = sn;
        } else {
            sn.next = head;
            head = sn;
        }
        System.out.println("If you want to enter more data in single linked list then press 1..and other any key..");
        n=sc.nextInt();
    }while(n==1);


    }
    public void traversSecondNode(){
    SecondNode temp=head;
    if(head==null){
        System.out.println("Here any linked list is not exist:");
    }
    else{
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    }
    public static void main(String [] args){
        singleLL myLinked=new singleLL();
    myLinked.creationOfSingleLinkedList();
    myLinked.traversSecondNode();
    }
}
