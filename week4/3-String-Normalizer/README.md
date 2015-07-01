# A String Normalizer

In a package `com.hackbulgaria.programming51.week4` do the following:

You are given the task to normalize all the strings in a file.
A normalized string is a string where:
* Every word begins with a capital letter
* All the other letters in the word are lowercase
* There is a maximum of 1 whitespace (interval) between two words
* There are no spaces in the beginning or in the end of the string

## The Task:

Create a static method `public static String normalizeString(String s)` that recieves a string `s` and returns a normalized version of `s`

## Examples:

### Example 1:

Somewhere in main:

```java
String s = "  wHaT  iS UP? ";
System.out.println(normalizeString(s));
```

Should print:

```
What Is Up?
```

### Example 2:

Somewhere in main:

```java
String s = " HACK bULGARIA     iS a Cool PLACE for PROGRAMMING!";
System.out.println(normalizeString(s));
```

Should print:

```
Hack Bulgaria Is A Cool Place For Programming!
```