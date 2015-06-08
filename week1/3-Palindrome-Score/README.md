# Palindrome Score

We denote the "Palindrome score" of an integer by the following function:

* `P(n) = 1`, if `n` is palindrome
* `P(n) = 1 + P(s)` where `s` is the sum of `n` and the `reverse of n`

In a `com.hackbulgaria.51.week1` package, in a `PalindromeScore` class, implement a program that:

* Reads one integer `n` from the standard input
* Output the palindrome score for `n`

## Examples

Lets see two examples:

* `P(121) = 1`, because `121` is a palindrome.
* `P(48) = 3`, because:

1. `P(48) = 1 + P(48 + 84) = 132`
1. `P(132) = 1 + 1 + P(132 + 321 = 363)`
1. `P(363) = 1`.
1. When we return from the recursion, we get 3.

## Help

This is a recursive problem by nature. But try to solve it with a `while(true) {}` cycle. Break when you think it is time to break.
