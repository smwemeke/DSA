package com.linkedLists;

public class MainSoln {
    String [] strData = {"Sue", "Damien", "Alvron"};
    private Node startNode = null;

    public static void main(String[] args) {
        MainSoln s = new MainSoln();
        System.out.println(s.startNode);
        s.populate();
        System.out.println(s.startNode);
        System.out.println(s.search("Alvron"));
        s.addFirst("derr");
        System.out.println(s.startNode);
        s.addLast("Oscar");
        System.out.println(s.startNode);

    }
    void populate(){
        startNode = new Node();
        startNode.data = strData[0];

        Node temp = startNode;

        for(int i=1;i< strData.length;i++){
            temp.next =new Node();
            temp.next.data = strData[i];
            temp = temp.next;

        }
    }
    boolean search(String s){
        if(s== null)return false;
        Node temp = startNode;
        while(temp!=null){
            if(temp.data.equals(s))return true;
            temp = temp.next;
        }
        return false;

    }
    void addFirst(String str){
     Node firstNode = new Node();
        firstNode.data = str;
        firstNode.next = startNode;
        startNode = firstNode;
    }
    void addLast(String str){
      Node lastNode = new Node();
      lastNode.data = str;

      if(startNode==null){
          startNode = lastNode;
       }
      Node temp = startNode;
      while(temp.next != null){
          temp = temp.next;
      }
      temp.next = lastNode;


    }

}
