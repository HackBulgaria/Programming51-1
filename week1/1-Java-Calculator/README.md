# Java Calculator

In a `com.hackbulgaria.51.week1` package create a `Calculator.java` class, where you:

* read one integer `a` from the standard input
* read one character `oper` - the operation of the calculator - from the standard input
* read one more integer `b`
* output the result from `a oper b` to the console.

We are going to cover the following operations:

* Standard arithmetics - `+`, `-`, `*`, `/`
* Exponentiation - `^`. If the input is `2 ^ 8` you should output 256
* A special `?` operator, which does the following: `a ? b = a! + b!` where `a!` is the factorial of `a`

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
