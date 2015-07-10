# Another LinkedList

In your `class LinkedList` where you should have an implementation of a LinkedList add the following methods:

* `public T[] toArray()` - returns the linked list in the form of an array
* `public void addArray(T[] arr)` - appends all the elements of the array to the end of this list
* `public void clear()` - removes all the elements from the list
* `public void insertListAfter(int index, LinkedList l)` - inserts all the elements from `l` into the List after the index element. Use a very fast algorithm.
* `public void insertListBefore(int index, LinkedList l)` - inserts all the elements from `l` into the List before the index element

## Here's a boilerplate for the methods in the class:

```java
	public T[] toArray() {
		// Returns an array with all the elements in the list
	}
	
	public void addArray(T[] arr) {
		// Appends the array at the end of the list
	}
	
	public void insertListAfter(int index, LinkedList<T> l) {
		// Inserts all the elements of l after the index element
	}
	public void insertListBefore(int index, LinkedList<T> l){
		// Inserts all the elements of l before the index element
	}
```

Here's the boilerplate for main:

```java
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		Integer [] arr;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			list1.addLast(scanner.nextInt());
		}
		n = scanner.nextInt();
		arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		list2.addArray(arr);
		list1.insertListBefore(0, list2);
		list1.insertListAfter(0, list2);
		
		System.out.println(list1);
	}
}
```

## Example:

Example input:
```
3
1 5 10
2
3 7
```

Should print:
```
[3, 3, 7, 7, 1, 5, 10]
```