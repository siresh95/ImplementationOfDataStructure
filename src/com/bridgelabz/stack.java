package com.bridgelabz;


public class stack {
    private static class Node {// node class represent  every single node of link list
        int data;
        Node next;

        Node(int data) { //creating node
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;//creating head
        public static boolean isEmpty() { //if head = null  will return true
            return head == null;
        }
        public static void push(int data) {//creating push function
            Node newNode = new Node(data);//creating new node

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;//insertion at head
            head = newNode;
        }



        public static int pop() {//creating pop function
            if(head == null) {
                return -1;// represent stack is empty
            }
            int top = head.data;// finding head element
            head = head.next;
            return top;


        }

        public static int peek() {//creating peek function
            if(isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}