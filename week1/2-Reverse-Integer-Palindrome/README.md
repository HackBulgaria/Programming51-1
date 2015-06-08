# Is n + nReveresed a palindrome

In a `com.hackbulgaria.51.week1` package, create a `IntegerPalindrome.java` class, where you:

* read one integer `n` from the standard input
* Output `"YES"` **if the sum of `n` and the reversed number `n`** is palindrome.
* Output `"NO"` otherwise.

An integer `n` is palindrome if you reverse it and get the same number `n`.

For example, `121` is a palindrome.

## Examples

Input:

```
123
```

Output:

We have to calculate `123 + 321 = 444` and check if `444` is a palindrome.

```
YES
```

---

Input:

```
5
```

Output:

We have to calculate `5 + 5 = 10` and check if `10` is a palindrome.

```
NO
```

---

Input:

```
48
```

Output:

We have to calculate `48 + 84 = 132` and check if `132` is a palindrome

```
NO
```

---

Input:

```
132
```

Output:

We have to calculate `132 + 321 = 363` and check if `363` is a palindrome.

```
YES
```
