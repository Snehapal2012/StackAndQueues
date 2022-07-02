package com.stackandqueue;

import java.util.Scanner;

public class Dequeue {
    QNode front=null;
    QNode rear=null;
    private static int count = 0;
    // Utility function to add an item to the queue
    public void enqueue(int item)     // insertion at the end
    {
        QNode node = new QNode(item); // allocate a new node in a heap
        System.out.println("Inserting: "+item);
        if(front == null)   // special case: queue was empty
        {
            front = node;  // initialize both front and rear
            rear = node;
        }
        else {
            rear.next = node;   // update rear
            rear = node;
        }
        count += 1;  // increase the node's count by 1
    }
    // Utility function to dequeue the front element
    public void dequeue()     // delete at the beginning
    {
        if (front == null)
        {
            System.out.println("Queue is empty");
        }
        QNode temp = front;
        System.out.println("Removing: "+temp.key);
        front = front.next;  // advance front to the next node
        if (front == null) {   // if the list becomes empty
            rear = null;
        }
        count -= 1;  // decrease the node's count by 1
    }

    public void display() { //display() will display all the nodes present in the list
        if (front == null) {
            System.out.println("Linked list is empty");
        } else {
            QNode current = rear;
            while (current != null) {
                current = current.next;
            }
        }
    }
    public static void enqueueOperation(){
        Dequeue list=new Dequeue();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.display();
    }
    public static void dequeueOperation(){
        Dequeue list=new Dequeue();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.display();
        System.out.println("After Dequeue Operation:---------------");
        list.dequeue();
        list.display();
        list.dequeue();
        list.display();
        list.dequeue();
        list.display();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Queue Operation Program");
        System.out.println();
        System.out.println("Note: Only 10 times operation you can perform.");
        System.out.println();
        for(int i=0;i<10;i++) {
            System.out.println("Choose 1) Enqueue operation 2) Dequeue operation 3) End of program");
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter the operation you would like to perform: ");
            int operation = scan.nextInt();
            if (operation < 3) {
                switch (operation){
                    case 1: enqueueOperation();
                        break;
                    case 2: dequeueOperation();
                        break;
                }
            }
            else
            {
                System.out.println("Bye Bye !");
                break;
            }
        }
    }
}
