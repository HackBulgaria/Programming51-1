# Birthday Ranges

We are given the following input: 

* A vector of people's birthdays (range from 0 to 365). Each value is the day of the year when that person was born.
* A vector of ranges (one range is a pair of two numbers - start and end). Each pair will be between 0 and 365.

We want to calculate, for each pair, how many people are born in that range (between start and end inclusive)


For example:

```
Birthdays - [5, 10, 6, 7, 3, 4, 5, 11, 21, 300, 15]
Ranges - [(4, 9), (6, 7), (200, 225), (300, 365)]
```

Will give the result:

```
[5, 2, 0, 1]
```

* As we can see, betweeh 4 and 9, inclusive, there are 5 people with birthdays - 5, 6, 7, 4, 5
* Between 300 and 365 there is exatly one birthday - 300.


In a class called `BirthdayRanges` create a static method:

```java
public class BirthdayRanges {

  public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> ranges) {
    // implementation
  }

}
```

## IntPair class

Here is the implementation:

```java
public class IntPair {
  public int start;
  public int end;
}
```

## Examples

**Here is a boilerplate class ready to take console input:**

```java
public class BirthdayRanges {

  public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> ranges) {
    // implementation
  }
  
  public static void main(String[] args) {
   Vector<Integer> birthdays = new Vector<Integer>();
     Vector<IntPair> ranges = new Vector<IntPair>();
      
     Scanner scanner = new Scanner(System.in);
      
     int bdaysCount = scanner.nextInt();
      
     for(int i = 0; i < bdaysCount; i++) {
       birthdays.add(scanner.nextInt());
     }
      
     int rangesCount = scanner.nextInt();
      
     for(int i = 0; i < rangesCount; i ++) {
       IntPair pair = new IntPair();
        
       pair.start = scanner.nextInt();
       pair.end = scanner.nextInt();
        
       ranges.add(pair);
     }
      
     System.out.println("Result is:");
     Vector<Integer> result = birthdaysCount(birthdays, ranges);
      
     for(int count: result) {
       System.out.print(count);
       System.out.print(", ");
     }   
  }
}
```

And now, for input:

```
11
5 10 6 7 3 4 5 11 21 300 15
4
4 9
6 7
200 225
300 365
```

We should get output:

```
Result is:
5, 2, 0, 1,
```

---

For input:

```
5
1 2 3 4 5
5
1 2
1 3
1 4
1 5
4 6
```


We should get output:

```
Result is:
2, 3, 4, 5, 2,
```
