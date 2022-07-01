package com.stackandqueue;
class Node{  //creating node
    int data;
    Node link;
}
public class StackPush {
    Node top;
    StackPush(){           // constructor
        this.top=null;
    }
    public void push(int x) // insert at the beginning
    {
        Node temp = new Node();  // create new node temp and allocate memory
        if (temp == null) {// check if stack (heap) is full. Then inserting an
            System.out.println("Heap Overflow");        //  element would lead to stack overflow
        }
        temp.data = x;  // initialize data into temp data field
        temp.link = top;  // put top into temp link
        top = temp; // update top
    }
    public void display()
    {
        if (top == null) {              // check for stack underflow
            System.out.println("Stack Underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data); // print node data
                temp = temp.link; // assign temp link to temp
            }
        }
    }
    public static void pushStack(){
        StackPush list=new StackPush();
        list.push(70);
        list.push(30);
        list.push(56);
        System.out.println();
        list.display();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Stack Push Program");
        pushStack();
    }
}


