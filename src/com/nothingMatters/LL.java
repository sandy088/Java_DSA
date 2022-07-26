package com.nothingMatters;


import jdk.dynalink.NamedOperation;

public class LL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    //Adding elements in Linked List
    //Two types of adds available ---- 1.)add First 2.) add Last

    //adfirst
    public void addFirst(int Data){
        Node newNode= new Node(Data);

        if( head == null){
            head = newNode;
            return;
        }

        newNode.next= head;
        head= newNode;

    }

    //adlast

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
        if (head== null){
            System.out.println("Linked List is Empty!!");
            return;
        }

        Node curNode= head;
        while(curNode != null){
            System.out.print(curNode.data+"->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public void reverseIterative(){

        if (head==null || head.next==null){
            return;
        }

        Node prevNode= head;
        Node currNode= head.next;
        while(currNode != null){
            Node nextNode= currNode.next;
            currNode.next= prevNode;

            //update
            prevNode= currNode;
            currNode= nextNode;
        }

        head.next=null;
        head= prevNode;
    }

    public Node removeNthFromEnd(Node head,int n){
        if(head.next== null){
            return null;
        }

        //Now we have to find size of Linked List
        int size=0;
        Node curr= head;
        while(curr != null){
            curr= curr.next;
            size++;
        }

        if(n== size){
            return head.next;
        }

        //Now I have to find previous Node for deletion of nth Node---> formula which I have made (size-n)

        Node prevNode=head;
        int indexToSearch= size-n;
        int i=1;
        while (i != indexToSearch){
            prevNode= prevNode.next;
            i++;
        }
        prevNode.next= prevNode.next.next;
        return head;
    }

    public Node deleteLast(){
        if(head==null|| head.next==null){
            System.out.println("Only one element present");
            return head;
        }
        Node n1= head;
        while(n1.next.next!= null){
            n1= n1.next;
        }
        n1.next= null;
        return head;
    }

    //// Find out middle of the linked list with hare and turtle methods-----> (means using two pointers)
    public Node returnMiddle(Node head){
        Node hare= head;
        Node turtle= head;

        while(hare.next != null && hare.next.next != null){
            hare= hare.next.next;
            turtle= turtle.next;

        }
        System.out.println(turtle.data);
        return turtle;
    }

    //detecting a cycle in a loop
    public boolean hasCycle(Node head){

        Node hare= head;
        Node turtle= head;
        while(hare != null && hare.next != null){
            hare= hare.next.next;
            turtle = turtle.next;

            if (hare== turtle){
                System.out.println("This Linked List has a cycle !!");
                return true;
            }
        }
        System.out.println("This Linked List is Cycle free or Virus Free");
        return false;
    }






    public static void main(String[] args) {

        LL list= new LL();

      list.addFirst(66);
      list.addLast(445);
      list.addFirst(4);
        list.addLast(4555);
        list.addLast(4444);
        list.addLast(151);
        list.addLast(1544);

      list.printLL();
//      list.removeNthFromEnd(list.head, 2);

        System.out.println("Middle of the Linked List 🧐");
        System.out.println(list.returnMiddle(list.head));

        System.out.println("Checking if this Linked-list has a cycle or not ");
        list.hasCycle(list.head);

//        list.printLL();
//        list.reverseIterative();
//        list.printLL();
    }
}
