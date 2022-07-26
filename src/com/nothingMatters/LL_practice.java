package com.nothingMatters;


public class LL_practice {
    Node head;
    class Node{
        int data;
        Node next;



        public  Node(int data){
            this.data= data;
            this.next=null;
        }

    }

    public void Addfirst(int Data){
        Node newNode= new Node(Data);

        if(head==null){
            head= newNode;
            return;
        }

        newNode.next= head;
        head= newNode;
    }



    public static void main(String[] args) {

        LL_practice listo= new LL_practice();
        listo.Addfirst(50);
        System.out.println(listo.head);
    }
}
