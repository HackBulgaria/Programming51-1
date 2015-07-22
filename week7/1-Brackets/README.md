# Brackets

Here are some examples of correctly closed brackets:

* `()`
* `()[]`
* `([])[]`
* `{[]([]())}`

And here are some examples of **incorrectly** closed brackets:

* `(}`
* `([)]`
* `[({)]}`

## The task:

The task is to create a method that recieves a `String` with brackets and returns true if these brackets are closed correctly.

The method should look like this:

```java
public class Brackets {
	public static boolean areCorrect(String brackets) {
		// Your implementation here
		return true;
	}
}
```

Here's a boilerplate for the `main` function:

```java
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String brackets = scanner.next();
		System.out.println(Brackets.areCorrect(brackets));
	}
}
```

## Examples:

### Example 1:

Input:

```
()[{}{]}
```

Output:
```
false
```

### Example 2:

Input:
```
()[{}[]][()]
```

Output:
```
true
```

### Example 3:

Input:
```
[]{}()[]({}[)
```
Output:
```
false
```

### Example 4:

Input:
```
{[]{}()[]{}(){}}
```

Output:

```
true
```
