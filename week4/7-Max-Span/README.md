# Max Span

Consider the leftmost and righmost appearances of some value in an array:

* **We'll say that the "span" is the number of elements between the two inclusive.** 
* A single value has a span of 1. 

For example, if we have the array `1, 2, 1, 1, 3`, the max span is between 1 and 1 with value `4`: `-->1, 2, 1, 1<--, 3`

In a class called `MaxSpan`, implement a static method that **returns the largest span found in the given array.**

## Boilerplate

```java
import java.util.Scanner;

public class MaxSpan {
  
  public static int maxSpan(int[] numbers) {
    return 0;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    
    for(int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    
    System.out.println(maxSpan(numbers));
  }

}
```

## Examples

Input:

```
5
1 2 1 1 3
```

Output:

```
4
```

---

Input:

```
7
1 4 2 1 4 1 4
```

Output:

```
6
```

---

Input:

```
7
1 4 2 1 4 4 4
```

Output:

```
6
```

---

Input:

```
10
1 1 1 1 1 1 1 1 1 1
```

Output:

```
10
```
