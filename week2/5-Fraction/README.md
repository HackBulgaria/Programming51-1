# 5-Fraction

In a `com.hackbulgaria.programming51.week2` package create a `Fraction` class where you:

* Define a fraction with numerator and denominator.
* Create a method `public float getReal()` that returns the fraction as a number with a decimal point.
* Create a method `public void sum(Fraction F)` that sums the current Fraction with another Fraction
* Create a method `public void simplify()` that simplifies your `Fraction`

## Examples

### Example 1:

#### In main:

```java
Fraction a = new Fraction();
a.num = 4;
a.den = 12;

System.println(a);
```

#### Should print:

```java
4/12
```

### Example 2:

####In main:

```java
Fraction a = new Fraction();
a.num = 4;
a.den = 12;

System.out.println(a.getReal());
```

#### Should print:

```java
0.3333333333
```

### Example 3:
In main:

```java
Fraction a = new Fraction();
a.num = 4;
a.den = 12;
Fraction b = new Fraction();
b.num = 5;
b.den = 24;
a.sum(b);
System.out.println(a);
```

#### Should print:

```java
13/24
```

### Example 4:

#### In main:

```java
Fraction a = new Fraction();
a.num = 4;
a.den = 12;
System.out.println(a);
a.simplify();
System.out.println(a);
```

#### Should print:

```java
4/12
1/3
```