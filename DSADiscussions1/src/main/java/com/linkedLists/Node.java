package com.linkedLists;

public class Node {
    String data;
    Node next;

    public static void main(String[] args) {
        //Single node list
        Node firstNode = new Node();
        firstNode.data = "A";
        System.out.println(firstNode.data);

        //Two-node list
        Node secondNode = new Node();
        secondNode.data = " B";
        firstNode.next = secondNode;
        System.out.println(firstNode);

        //Three-node list
        Node thirdNode = new Node();
        thirdNode.data = " C";
        secondNode.next = thirdNode;
        System.out.println(firstNode);
    }

    @Override
    public String toString() {
        String result = data;
        Node current = this.next;
        while(current != null){
            result += current.data;
            current = current.next;
        }
        return result;
    }
}