# Books of Lili

There is a girl named Lili. She loves books. She has many books.

But it is total chaos - there are many copies of different titles and the books cannot be searched easily.

So you have to help Lili. She wants to sort her books alphabetically and also, know for each title, how man copies she have.

Implement a class called `LilisLibrary` where you have the following static method:

```java
public class LilisLibrary {
  
  public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
    // implementation
  }
}
```

The result should be a `Vector` of `Pairs` where each `Pair` has:

* The book title
* Count of how many books with that title there is

**Also, sort the result by the titles of the book, alphabetically, from a -> z**

## Generic Pair class

```java
public class Pair<F, S> {

  public F first;
  public S second;
}
```

## Examples

Have this boilerplate:

```java
package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {
  public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
    return new Vector<Pair<String, Integer>>();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Vector<String> books = new Vector<String>();
    int booksCount = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < booksCount; i++) {
      books.add(scanner.nextLine());
    }
    
    Vector<Pair<String, Integer>> result = orderBooks(books);
    
    for(Pair<String, Integer> titleCount: result) {
      System.out.println(titleCount.first + " : " + titleCount.second);
    }
  }
}
```

For input:

```
6
Harry Potter
Harry Potter
The book of books
Harry Potter
Night Watch
Thud!
```

Give the following output:

```
Harry Potter : 3
Night Watch : 1
The book of books : 1
Thud! : 1
```

---

For input:

```
10
Z
C
A
A
D
F
G
H
I
C
```

Give the following output:

```
A : 2
C : 2
D : 1
F : 1
G : 1
H : 1
I : 1
Z : 1
```
