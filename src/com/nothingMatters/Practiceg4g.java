package com.nothingMatters;

public class Practiceg4g {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }


    public void addLast(int data){
        Node newNode= new Node(data);
        if( head == null){
            head =newNode;
            return;
        }

        Node currNode= head;
        while(currNode.next != null){
            currNode= currNode.next;
        }

        currNode.next= newNode;

    }

    public void printLL(){
        if (head==null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node currNode= head;
        while (currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode= currNode.next;
        }

        System.out.print("null");
    }

    public void detectCycle(Node head){

        Node fast= head;
        Node slow= head;

        while(fast !=null && fast.next !=null){
            fast= fast.next.next;
            slow= slow.next;

            if (slow== fast){

                System.out.println("Cycle is present");

            }

        }
        System.out.println("Cycle is not present !!");
    }


    public static void main(String[] args) {

        Practiceg4g list= new Practiceg4g();

        list.addLast(100);

        for (int i=1;i<6;i++) {
            list.addFirst(i);
        }

        list.detectCycle(list.head);


        list.printLL();

    }
}
