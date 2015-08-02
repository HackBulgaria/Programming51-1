# A Simple REPL

In case you are missing the Python REPL, we are going to impleent one.

This is continuation of [that problem](https://github.com/HackBulgaria/Programming51-1/tree/master/week7/8-Function-Calls-Extended)

Make a Java Swing application that has:

* An input for our code
* A place to show the output (Can be the same place)

Our language should understand:

* Mathematical expressions with: `+-*/%()^!`, where `!` is the factorial symbol and `^` means to the power of.
* Every construct in our langauge is going to be on one line. No constructs are going to span on multiple lines.
* Declaration of variables. We are going to declare our variables with the keyword `var`. Our language should be statically typed:
* Declaration of functions. Our functions are going to have type declaration. Functions are declared with the `def` keyword.
* Our language is not going to do implicit type casting. You cannot do: `1 + "1"`.
* We are going to have a few "built-in" functions.

## Types

We are going to support the following types:

* `integer` - you can map this to the standard `int` type in Java.
* `double` - you can map this to the standard `double` type in Java.
* `string` - strings are defined with **double quotes**. The operator `+` is doing string concatenation.

## Functions

We are going to have the following syntax for function declarations:

```
>>> def inc (integer -> integer) x = x + 1
>>> def exclamate (string -> string) word = word + "!"
```

**We call functions in the standard way: `functionName(argument)`. Nothing fancy here.**

The thing in the brackets is called type declaration - this tells you how many arguments there are and what to except for their type.

Our REPL should give us erros if we try to do things like that:

```
>>> var integer a = 5
>>> exclamate(a)
Error! exclamate expects string, but integer was given.
```

## Built-in functions

We are having the following functions, that are predefined in our language:

* `def strToInt (string -> integer)` - tries to turn a string into integer
* `def doubleToStr (string -> double)` - tries to turn a strin into double
* `def intToStr (integer -> string)` - turns integer into string
* `def doubleToStr (double -> string)` - turns double into string

## Examples

We should be able to compute such expressions:

```
>>> 1 + 2! + (3 * 5)
18
>>> "a" + "a"
"aa"
```

We should be able to declare variables with the `var` keyword.

```
>>> var integer a = 5
>>> a
5
>>> a + a
10
```

A more complete example:

```
>>> var integer a = 5;
>>> var integer b = 6;
>>> def inc (integer -> integer) x = x + 1
>>> def squareSum (integer -> integer -> integer) x y = x ^ 2 + y ^ 2
>>> def exclamate (string -> string) s = s + "!"
>>> "Let me give you some result " + exclamate(intToStr(squareSum(inc(a), inc(b))))
"Let me give you some result 85!"
```
