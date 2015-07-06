# Generic Linked List

Create a `class LList` where you should implement a Generic Linked List by creating a seperate nodes and linking them.

In your class you should have a private Node class that should look like this:

```java
private class Node<T>{
	T data;
	Node next;

	public Node(T data){
		this.data = data;
		next = null;
	}
}
```

In `class LList` you should define the following methods:

* `public void add(T el)` method that adds an element to the end of the list
* `public T get(int index)` method that returns the element on the `index` place
* `public void set(int index, T el)` method that sets the element on the `index` place
* `public void remove(int index)` method that removes the element on the `index` place (and connects the other elements)
* `public void insert(int index, T el)` method that inserts an element `el` at the `index` place

## Here's the boilerplate for the class:

```java
package week5;

public class LList<T> {
	
	private class Node<T> {
		public T data;
		public Node next;

		public Node(T data) {
			this.data = data;
		}
		
	}
	
	private Node<T> head;
	private Node<T> tail;
	
	public void add(T el){
		// Append an element to the end of the list
	}
	
	public T get(int index){
		// Return the element at the index place
		return null;
	}
	
	public void set(int index, T el){
		// Set the value at the index place
	}
	
	public void remove(int index){
		// Remove an element form the index place
	}
	
	public void insert(int index, T el){
		// Insert an element on the index place
	}
	
	public String toString(){
		return "Implement toString() method";
	}
}
```

## And the boilerplate for Main:

```java
package week5;

public class Main {
	
	public static void main(String[] args){
		LList<Integer> l = new LList<>();
		for (int i = 10; i < 20; i++) {
			l.add(i);
		}
		l.insert(2, 5);
		l.remove(1);
		System.out.println(l);
	}
}
```

This should print:

```
10 5 12 13 14 15 16 17 18 19
```