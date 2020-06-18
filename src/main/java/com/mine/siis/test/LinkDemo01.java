package com.mine.siis.test;

public class LinkDemo01 {
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n1 = new Node("车厢-A");
        Node n2 = new Node("车厢-B");
        Node n3 = new Node("车厢-C");

        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        printNode(root);
    }
    public static void printNode(Node node){
        System.out.println(node.getData() + "\t");
        if (node.getNext() != null){
            printNode(node.getNext());
        }
    }

}

class Node{
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
}
