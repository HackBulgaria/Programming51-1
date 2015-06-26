# Ingeger-Vector-Static

In a `com.hackbulgaria.programming51.week3` package do the following:

## Define a `class IntegerVectorStatic` where you

### Define the following

* `public static String toString(IntegerVector v)` method that recieves an integer array and returns a string of the array, separated by ","
* `public static void sort(IntegerVector v)` method that recieves an array of int and sorts it
* `public static IntegerVector reverse(IntegerVector v)` method that recieves an integer array and returns the reversed array
* `public static String join(IntegerVector v, String glue)` method that recieves an array of int and a string and returns a String of the array elements with 'glue' between them
* `public static IntegerVector range(int a, int b)` that returns an array of int with elements in the range between a and b
* `public static IntegerVector filterOdd(IntegerVector v)` method that returns an array with only the Odd numbers from 'v'

## Examples


### Example for `IntegerVectorStatic.toString(IntegerVector v)`

```java
  int [] a = {1,2,3,4,5};
  IntegerVector v = new IntegerVector();
  v.addAll(a);
  System.out.println(IntegerVectorStatic.toString(v));
```

Should print:

```
  1, 2, 3, 4, 5
```

### Example for `IntegerVectorStatic.sort(IntegerVector v)`

```java
  int [] a = {3,1,-40,200,5};
  IntegerVector v = new IntegerVector();
  v.addAll(a);
  IntegerVectorStatic.sort(v);
  System.out.println(IntegerVectorStatic.toString(v));
```

Should print:

```
  -40, 1, 3, 5, 200
```

### Example for `reverse(IntegerVector v)`

```java
  int [] a = {3,1,-40,200,5};
  IntegerVector v = new IntegerVector();
  IntegerVector temp = IntegerVectorStatic.reverse(v);
  System.out.println(IntegerVectorStatic.toString(temp));
```

Should print:

```
  5, 200, -40, 1, 3
```

### Example for `join(IntegerVector v, String glue)`

```java
  int [] a = {3,1,-40,200,5};
  IntegerVector v = new IntegerVector();
  v.addAll(a);
  System.out.println(IntegerVectorStatic.join(v,": "));
  System.out.println(IntegerVectorStatic.join(v,"->"));
```

Should print:

```
  3: 1: -40: 200: 5
  3->1->-40->200->5
```

### Example for `sum(IntegerVector v)`

```java
  int [] a = {1,2,3,4,5};
  IntegerVector v = new IntegerVector();
  v.addAll(a);
  System.out.println(IntegerVectorStatic.sum(v));
```

Should print:

```
  15
```

### Example for `range(int a, int b)`

```java
  IntegerVector v = new IntegerVector();
  v = IntegerStatic.range(10,20);
  System.out.println(IntegerVectorStatic.toString(v));
```

Should print:

```java
  10, 11, 12, 13, 14, 15, 16, 17, 18, 19
```

### Example for `filterOdd(IntegerVector v)`

```java
  int [] a = {2,3,4,8,9,11,13,15};
  IntegerVector v = new IntegerVector();
  v.addAll(a);
  IntegerVector temp = IntegerVectorStatic.filterOdd(v);
  System.out.println(temp);
```

Should print:

```
  3, 9, 11, 13, 15
```
