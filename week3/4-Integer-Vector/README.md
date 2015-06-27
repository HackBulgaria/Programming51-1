# IntegerVector

In a `com.hackbulgaria.programming51.week3` package do the following:

## Define a `class IntegerVector` that has:
	* public void add(int e) method for adding an element to the vector
	* public int size() method that returns the size of the vector
	* public int sum() method that returns the sum of the numbers in the vector
	* public void addAll(int [] n) method that adds all the elements from n to the back of the vector
	* public int get(int index) method that returns the value of the element on place index
	* public String toString() method
	* public void insert(int index, int data) method that inserts an element in the vector on the place marked by index
	* public void remove(int index) method that removes an element from the array

## Examples:

### Example for `add(int e)` and `toString()`: 

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 20; i++) {
		v.add(i);
	}
	System.out.println(v);
```

Should print:

```
	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
```

### Example for `size()`:

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 20; i++) {
		v.add(i);
	}
	v.add(50);
	System.out.println(v.size());
```

Should print:

```
	21
```

### Example for `sum()`:

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 20; i++) {
		v.add(i);
	}
	System.out.println(v.sum());
```

Should print:

```
	190
```

### Example for `addAll(int [] n)`:

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 20; i++) {
		v.add(i);
	}

	int [] b = new int[10];
	for (int i = 0; i < 10; i++) {
		b[i] = i;
	}
	v.addAll(b);
	System.out.println(v);
```

Should print:

```
	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 0 1 2 3 4 5 6 7 8 9
```

### Example for `get(int index)`:

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 20; i++) {
		v.add(i);
	}

	System.out.println(v.get(3));
	System.out.println(v.get(9));

```

Should print:

```
	3
	9
```

### Example for `insert(int index, int data)`

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 10; i++) {
		v.add(i);
	}
	System.out.println(v);
	v.insert(3,10);
	System.out.println(v);
```

Should print:

```
	0 1 2 3 4 5 6 7 8 9
	0 1 2 10 3 4 5 6 7 8 9
```

### Example for `remove(int index)`

```java
	IntegerVector v = new IntegerVector();
	for (int i = 0; i < 10; i++) {
		v.add(i);
	}
	System.out.println(v);
	v.remove(3);
	System.out.println(v);
```

Should print:

```
	0 1 2 3 4 5 6 7 8 9
	0 1 2 4 5 6 7 8 9
```
