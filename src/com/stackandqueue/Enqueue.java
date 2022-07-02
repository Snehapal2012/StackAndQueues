package com.stackandqueue;
class QNode {     // Java program for linked-list implementation of queue
    int key;
    QNode next;

    // constructor to create a new linked list node
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}

public class Enqueue {
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
        Enqueue list=new Enqueue();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.display();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Queue Operations!");
        System.out.println();
        enqueueOperation();
    }
}
