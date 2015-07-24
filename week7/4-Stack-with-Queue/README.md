# Implement a Stack using only Queue

You have a Queue at your disposal. Implement the Stack data structure, using only the queue and the interface of it.

## Interface of Queue

```java
public interface Queue<T> {
  public T pop(); // removes the head and returns it
  public T peek(); // only returns the head without removing it
  public boolean isEmpty(); // returns true if empty
  public void push(T data); // pushes data into the queue
}
```

## The Stack class

Here is the Stack class:

```java
public class Stack<T> {
  
  private Queue<T> firstQueue = new LinkedList<T>();

  public T pop() {
    return null;
  }

  public T peek() {
    return null;
  }

  public boolean isEmpty() {
    return null;
  }

  public void push(T data) {
    return null;
  }
}
```

You cannot use `LinkedList`. Use only `Queue`.
