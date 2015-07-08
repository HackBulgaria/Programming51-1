# More Linked List methods

In your `class LinkedList` where you should have an implementation of a LinkedList add the following methods:

* `public void addFirst(T data)` - inserts an element at the beginning of the list
* `public void addLast(T data)` - inserts an element at the end of the list
* `public T getFirst()` - returns the first element of this list
* `public T getLast()` - returns the last element of this list
* `public boolean contains(T data)` - returns true if the list contains the specified element
* `public int getElementIndex(T data)` - returns the index of the specified element. If the list does not contain the element - return -1;
* `public int size()` - returns the size of the list

## Here is a boilerplate for the methods. You should copy-paste them into your LinkedList class:

```java
public class LinkedList<T> {

	// The rest of the List

	public void addFirst(T data) {
		// Insert the data at the beginning of the list
	}

	public void addLast(T data) {
		// Insert data at the end of the list
	}
	
	public T getFirst() {
		// Return the first element of the list
		return null;
	}
	
	public T getLast() {
		// Return the last element of the list
		return null;
	}
	
	public boolean contains(T data) {
		// Returns true if the list contains the element
		return false;
	}
	
	public int getElementIndex(T data) {
		// Returns the index of the specified element
		return 0;
	}

	public int size() {
		// Returns the size of the list
		return -1;
	}
}
```

## And a boilerplate for Main:

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		int n;
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			l.addLast(scanner.nextInt());
		}
		
		l.insertAfter(3,scanner.nextInt());
		
		l.remove(2);
		
		l.addFirst(scanner.nextInt());
		
		int x = scanner.nextInt();
		
		System.out.println(l.contains(x));
		System.out.println(l.getFirst() + " " + l.getLast());
		System.out.println(l);

		
	}

}
```

## Example: 

If you paste this into the console:
```
5
10 23 4 15 90 100 120 112
```

The result should be:

```
false
120 90
[120, 10, 23, 15, 100, 90]
```