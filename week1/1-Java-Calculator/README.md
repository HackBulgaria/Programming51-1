# Java Calculator

In a `com.hackbulgaria.programming51.week1` package create a `Calculator` class, where you:

* read one integer `a` from the standard input
* read one character `oper` - the operation of the calculator - from the standard input
* read one more integer `b`
* output the result from `a oper b` to the console.

We are going to cover the following operations:

* Standard arithmetics - `+`, `-`, `*`, `/`
* Exponentiation - `^`. If the input is `2 ^ 8` you should output 256
* A special `?` operator, which does the following: `a ? b = a! + b!` where `a!` is the factorial of `a`

Here is the code to read from the standard input:

```java
package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    char oper = scanner.next().charAt(0);
    int b = scanner.nextInt();

    System.out.println(a);
    System.out.println(oper);
    System.out.println(b);
  }

}
```


## Examples

Input:

```
1 + 2
```

Output:

```
3
```

---

Input

```
2 ^ 8
```

Output

```
256
```

---

Input

```
5 ? 2
```

Output

```
122
```
