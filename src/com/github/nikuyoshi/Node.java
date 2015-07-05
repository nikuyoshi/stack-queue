package com.github.nikuyoshi;

public class Node {
  Node next = null;
  Object data;
  
  public Node(Object d){
    data = d;
  }
  
  void appendToTail(int d){
    Node end = new Node(d);
    Node n = this;
    while(n.next != null){
      n = n.next;
    }
    n.next = end;
  }
}
