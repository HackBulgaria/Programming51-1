# Static Linked List

Create a `class StaticLinkedList` and implement the following methods:

* `public static LinkedList<T> reverse(LinkedList<T> l)` - returns a reversed list
* `public static LinkedList<T> sort(LinkedList<T> l)` - returns a sorted list with the numbers from l
* `public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b)` - returns a list that has all the numbers from a and b sorted

## A boilerplate for the class:

```java
public class StaticLinkedList {
	
	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		// Reverses the list
		return null;
	}


	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		// Sorts the list
		return null;
	}
	
	public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
		// Merges a and b into one sorted list
		return null;
	}
}
```

## Example:

Input:
```
3
4 10 5
6
2 3 -10 29 4 50
```

Output:

```
[5, 10, 4]
[10, 5, 4]
[50, 29, 10, 5, 4, 4, 3, 2, -10]
```