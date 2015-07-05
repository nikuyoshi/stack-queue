package com.github.nikuyoshi;

public class Queue {
  Node first, last;
  
  void enqueue(Object item){
    if(first == null){
      last = new Node(item);
      first = last;
    } else {
      last.next = new Node(item);
      last = last.next;
    }
  }
  
  Node dequeue(){
    if(first != null){
      Object item = first.data;
      first = first.next;
      return (Node) item;
    }
    return null;
  }
  
}
