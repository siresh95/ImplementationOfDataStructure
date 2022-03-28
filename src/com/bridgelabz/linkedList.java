package com.bridgelabz;

class linkedList {
    //creating head
    Node head;
    private int size;

    linkedList() {
        this.size = 0;
    }

    public static void main(String[] args) {
        //creating object for Linked list class
        linkedList list = new linkedList(); // Initialization of list

        list.addLast("is"); //adding node to last position
        list.addLast("a");
        list.addLast("list");
        list.printList(); // printing list
        System.out.println(list.getSize());

        list.addFirst("this");  //adding node to first position
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst(); //deleting first
        list.printList();
        System.out.println(list.getSize());

        list.removeLast(); // deleting last
        list.printList();
        System.out.println(list.getSize());
    }

    //function to add  node  first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; //checking value of head
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // function to add node  last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; //checking value of head
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {

            currNode = currNode.next;
        }

        currNode.next = newNode;

    }
  //function to printing list

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
// function to remove first
    public void removeFirst() {
        //checking corner case
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = head.next;
        size--;
    }
// function to remove last
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        } //checking corner case
        if (head.next == null) {
            head = null;
            return;
        }


        size--;
        Node secondLast = head;
        Node lastNode = head.next; //head.next = null -> lastNode=null
        while (lastNode.next != null) { //null next(not possible)
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    //creating node  class
    public class Node {
        String data; //storing data
        Node next; //storing next

        //creating constructor taking string data type
        Node(String data) {
            this.data = data;
            this.next = null; // assigning null value to new node
            size++;
        }
    }
}
