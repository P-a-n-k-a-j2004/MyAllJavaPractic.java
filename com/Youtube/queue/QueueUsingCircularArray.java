package com.Youtube.queue;

public class QueueUsingCircularArray {
    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        CircularQueue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1 & front ==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front== -1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String [] args){
    CircularQueue cq=new CircularQueue(5);
    cq.add(1);
    cq.add(2);
    cq.add(3);
    cq.add(4);
    cq.add(5);
 System.out.println(cq.remove());
    cq.add(6);
 System.out.println(cq.remove());
    cq.add(7);
 //System.out.println(cq.remove());
    while(!cq.isEmpty()){
        System.out.println(cq.peek());
        cq.remove();
    }
    }
}
