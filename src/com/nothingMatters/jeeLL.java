package com.nothingMatters;

public class jeeLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        Node currNode= head;
        while(currNode.next !=null){
            currNode= currNode.next;
        }
        currNode.next= newNode;
    }

    public void printLL(Node head){
        if (head==null){
            System.out.println("List is Empty !!");
        }
        Node currNode= head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode= currNode.next;
        }
    }

    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        newNode.next= head;
        head= newNode;

    }
    public static void main(String[] args) {
        jeeLL list= new jeeLL();
        list.addLast(5);
        list.addFirst(6);
        list.printLL(list.head);
    }
}
