# Priority-Queue

You are in a bus. You know that older people have bigger priority in a queue for the free seats.

Implement a Priority Queue data structure with the following interface.

## Interface of Queue

```java
public interface PriorityQueue {
  public int pop(); // remove and returns the oldest person.
  public int peek(); // only returns the oldest person without removing it
  public boolean isEmpty(); // returns true if empty
  public void push(int data); // pushes person into the queue
}
```

**You can use any data structure you know!**

## Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.push(60);
        queue.push(75);
        queue.push(85);
        queue.push(50);
        queue.push(56);

        System.out.println(queue.pop()); // 85
        System.out.println(queue.pop()); // 75
        System.out.println(queue.pop()); // 60
    }
}
```