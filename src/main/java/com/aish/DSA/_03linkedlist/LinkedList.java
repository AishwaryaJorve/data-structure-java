package com.aish.DSA._03linkedlist;

public class LinkedList
{

    static Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {

        LinkedList linkList=new LinkedList();

        //Creating and inserting node data
        linkList.head= new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        Node fourth=new Node(5);

        //Connection of node
        LinkedList.head.next=second;
        second.next=third;
        third.next=fourth;


        LinkedList.printnode(LinkedList.head);    //   2 3 4 5
    }

    private static void printnode(Node node) {
        if(node==null){
            return;
        }
        printnode(node.next);
        System.out.print(node.data+" ");    // 5 4 3 2   Reverse order using head - recursion



//        Node current=head;
//        while(current!=null){
//            System.out.print(current.data+" ");
//            current=current.next;
//        }

    }

}
