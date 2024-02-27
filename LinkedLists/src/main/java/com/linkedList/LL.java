package com.linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    // insert first element in linkedList
    public void insertFirst (int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size +=1;
    }
    // insert last element in linkedList
    public void insertLast(int val){
        Node node2 = new Node(val);
        tail.next = node2;
        node2 = tail;
        size++;
        if(tail==null){
            insertFirst(val);
        }

    }

    // insert element in between nodes

    void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        else if (index == size){
            insertLast(val);
        }
        else {
            Node temp = head;
            for(int i=1; i<index;i++){
                temp = temp.next;
            }
            Node n = new Node(val, temp.next);
            Node last = temp.next;
            temp.next = n;
            n.next = last;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }
     private class Node{
         private int value;
         private Node next;

         public Node(){}

         public Node(int value) {
             this.value = value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }
     }



}
