package com.github.nikuyoshi;

public class Sample {
  
  public static void main(String... args){
    new Sample().execute();
  }
  
  public void execute(){
    MyQueue<Object> myQueue = new MyQueue<Object>();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    
    myQueue.enqueue(node1);
    myQueue.enqueue(node2);
    myQueue.peek();
    myQueue.enqueue(node3);
    myQueue.dequeue();
    myQueue.dequeue();
    myQueue.peek();
    myQueue.dequeue();
    
    
    
  }
}
