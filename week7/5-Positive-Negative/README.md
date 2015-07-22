# Positives and Negatives

You are given an array of integers.

Your job is to return a `Stack` of integers, where the negative integers are on top of the positive ones. Also, the negative integers should be sorted in **ascending order**, and the positive integers - in **descending order**.

Here is the boilerplate:

```java
public class PositivesAndNegatives {

  public Stack<Integer> reorder(int[] numbers) {
    return null;
  }

}

```

**For example:**

If we have the following array `int[] n = {1, 2, 3, -10, -5, 8, -100}`, if we traverse the resulting Stack and print each number like that:

```java
Stack<Integer> result = reorder(n); 

while(!result.isEmpty()) {
  System.out.println(result.pop());
}
```

The output should be:

```
-100
-10
-5
8
3
2
1
```

## Input

Write a program that:

* Reads one integer `n`
* Reads `n` more integers.
* Output the result of the reorder
