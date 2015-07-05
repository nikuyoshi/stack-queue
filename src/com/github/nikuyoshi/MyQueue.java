package com.github.nikuyoshi;

public class MyQueue<T> {
  Stack newestStack;
  Stack oldestStack;
  
  public MyQueue(){
    newestStack = new Stack();
    oldestStack = new Stack();
  }
  

  public void enqueue(T value){
    newestStack.push(value);
  }
  
  @SuppressWarnings("unchecked")
  public T peek(){
    shiftStacks();
    return (T) oldestStack.peek();
  }
  
  private void shiftStacks(){
    if(oldestStack.isEmpty()){
      while(!newestStack.isEmpty()){
        oldestStack.push(newestStack.pop());
      }
    }
  }
  
  @SuppressWarnings("unchecked")
  public T dequeue(){
    shiftStacks();
    return (T) oldestStack.pop();
  }
}
