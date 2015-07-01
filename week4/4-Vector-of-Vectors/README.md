# A Vector of Vectors

In a package `com.hackbulgaria.programming51.week4` do the following:

You are given the following data structure: `Vector< Vector<Integer> >`

## The task:

In a `class VectorOfVectors` create a static method `public static Vector<Integer> sortAndUnique(Vector< Vector<Integer> >)` that recieves a vector of vectors of integers, sorts them and filters only the unique numbers. Return the result in a Vector of integers.

## `class VectorOfVectors` should look like:

```java
package week4;

public class VectorOfVectors {

	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v){
		
		return null;
	}

}
```

## Examples:

**Here is a boilerplate class ready to take console input:**

```java
package week4;

import java.util.Scanner;

public class VectorOfVectors {

	public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
		// TODO: add implementation here
		return null;
	}

	public static void main(String[] args) {

		Vector<Vector<Integer>> vi;
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Vector<Integer> v = new Vector<Integer>();
			int num = scanner.nextInt();
			for (int k = 0; k < num; k++) {
				v.add(scanner.nextInt());
			}
			vi.add(v);
		}
		System.out.println(sortAndUnique(vi));
	}

}
```

And now, for input:

```
3
5 5 10 -20 4 50
3 1 55 28
4 20 10 4 50
```

We should get output:
```
-20 1 4 5 10 20 28 50 55
```

---

And for input:

```
5
3 4 50 120
3 1 55 28
4 20 10 4 -19
2 -30 10
5 3 5 2 7 4
```

We should get output:
```
-30 -19 1 2 3 4 5 7 10 20 28 50 55 120
```
