# Missing Students

You are implementing a classroom software. You have to datasets:

* All students in your classroom.
* A list of students, for each day, that were present during the class.

You have to write some code to determine which students were mising for each day during the class.

For example, if you have the students:

```
Maria, Kamen, Ivo, Tanya, Rado
```

And the presence:

```
Day1 - Kamen, Ivo
Day2 - Maria, Rado
```

Then the missing students for each day are:

```
Missing students for Day1 - Maria, Tanya, Rado
Missing students for Day2 - Kamen, Ivo, Tanya
```

In a class, called `MissingStudents`, implement the  following static method:

```java
public class MissingStudents {

  public static Vector<Vector<String>> missingStudents(Vector<String> students, Vector<Vector<String>> presence) {
      // implementation
  }
}

```

* The first argument - `students` consist of all students (with no repetitions) taking a given class.
* The second argument - `presence` consists of vector of students that have been present for the given day (lets say the index of the vector is the day that we are talking about)

The result should be a vector of vectors, where each element is a list of students, missing for that day.

## Boilerplate

Here is the code, ready for taking input:

```java
package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class MissingStudents {

  public static Vector<Vector<String>> missingStudents(
      Vector<String> students, Vector<Vector<String>> presence) {
      
      return new Vector<Vector<String>>();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Vector<String> students = new Vector<>();
    Vector<Vector<String>> presence = new Vector<>();

    int studentsCount = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < studentsCount; i++) {
      String student = scanner.nextLine();
      students.add(student);
    }

    int days = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < days; i++) {
      int studentsForThatDay = Integer.parseInt(scanner.nextLine());
      Vector<String> presenceForDay = new Vector<>();
      for (int j = 0; j < studentsForThatDay; j++) {
        presenceForDay.add(scanner.nextLine());
      }
      
      presence.add(presenceForDay);
    }
    
    Vector<Vector<String>> missing = missingStudents(students, presence);
    
    System.out.println(missing);
  }
}
```


## Examples

For the input:

```
5
Maria
Kamen
Ivo
Tanya
Rado
2
2
Kamen
Ivo
2
Maria
Rado
```

Give the following output:

```
[[Maria, Tanya, Rado], [Kamen, Ivo, Tanya]]
```

---

For the following input:

```
5
Ivo
Rado
Maria
Aneta
Tanya
4
4
Ivo
Maria
Aneta
Tanya
4
Ivo
Maria
Aneta
Tanya
3
Ivo
Aneta
Tanya
1
Ivo
```

Give the following output:

```
[[Rado], [Rado], [Rado, Maria], [Rado, Maria, Aneta, Tanya]]
```
