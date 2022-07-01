package com.stackandqueue;

import java.util.Scanner;

public class StackPop {
    Node top;
    StackPop(){           // constructor
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
            System.out.println("Stack is Empty");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data); // print node data
                temp = temp.link; // assign temp link to temp
            }
        }
    }
    public void pop() // remove at the beginning
    {
        if (top == null) {  // check for stack underflow
            System.out.println("Stack is Empty");
        }
        else {
            Node temp = top;// update the top pointer to point to the next node
            top = top.link;
        }
    }
    public static void pushStack(){
        StackPop list=new StackPop();
        list.push(70);
        list.push(30);
        list.push(56);
        System.out.println();
        list.display();
    }
    public static void popStack(){
        StackPop list=new StackPop();
        list.push(70);
        list.push(30);
        list.push(56);
        System.out.println();
        list.display();
        System.out.println("After Pop Operation:-------------");
        list.pop();
        list.display();
        list.pop();
        list.display();
        list.pop();
        list.display();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Stack Push Program");
        System.out.println();
        System.out.println("Note: Only 10 times operation you can perform.");
        System.out.println();
        for(int i=0;i<10;i++) {
            System.out.println("Choose 1) Push operation 2) Pop operation 3) End of program");
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter the operation you would like to perform: ");
            int operation = scan.nextInt();
            if (operation < 3) {
                switch (operation){
                    case 1: pushStack();
                    break;
                    case 2: popStack();
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

