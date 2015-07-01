# A String Normalizer

In a package `com.hackbulgaria.programming51.week4` do the following:

You are given the task to normalize all the strings in a file.
A normalized string is a string where:

* Every word begins with a capital letter
* All the other letters in the word are lowercase
* There is a maximum of 1 whitespace (interval) between two words
* There are no spaces in the beginning or in the end of the string

## The Task:

In a `class StringNormalizer` create a static method `public static String normalizeString(String s)` which recieves a string `s` and returns a normalized version of `s`

## `class StringNormalizer` shlould look like:

```java
package week4;

import java.util.Scanner;

public class StringNormalizer {

	public static String normalizeString(String str) {
		// TODO: implementation here
	}

}
```

## Examples:

**Here is a boilerplate class ready to take console input:**

```java
package week4;

import java.util.Scanner;

public class StringNormalizer {

	public static String normalizeString(String str) {
		// TODO: implementation here
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.println(normalizeString(s));
	}

}
```


And now, for input:

```
  wHaT  iS UP?   
```

We should get output:

```
What Is Up?
```

---

And for input:

```
   HACK bULGARIA     iS a Cool PLACE for PROGRAMMING!      
```

We should get output:

```
Hack Bulgaria Is A Cool Place For Programming!
```