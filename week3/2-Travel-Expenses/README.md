# A program that keeps track of travel expenses

You are given the task to create a simple Java program that keeps track of the travel expenses of the company.

In order to solve that problem, you will have to model:

* An `Employee` class. One employee should only have a `name`. Nothing else.
* A `Travel` class which represents a travel to a certain destination - country and city.
* A `TravelExpense` class which represents one expense for a given travel, made by a given employee

Here are full examples for each class:

## Employee

Somewhere in `main`:

```java
Employee rado = new Employee("Radoslav Georgiev");
System.out.println(rado.toString().equals("Radoslav Georgiev")); // true
```

## TravelExpense

A `TravelExpense` accepts type, employee and cost.

Somewhere in `main`:

```java
Employee ivo = new Employee("Ivaylo");
TravelExpense dinner = new TravelExpense("Dinner", ivo, 100);

System.out.println(dinner.getType().equals("Dinner")); // true
System.out.println(dinner.getEmployee().toString().equals("Ivaylo")); // true
System.out.println(dinner.getNetCost() == 100); // true
```

## Travel

This is the fattest class.

Here is how it should be initialized:

```java
Travel conf = new Travel("Berlin", "Germany", 20);

System.out.println(conf.getCity().equals("Berlin")); // true
System.out.println(conf.getCountry().equals("Germany")); // true
System.out.println(conf.getVat() == 20); // true, VAT = Value Added Tax = ДДС
```

And here is how to use that class with `TravelExpense`:

```java
conf.addExpense(dinner);

System.out.println(conf.totalNetCost() == 100); // true
System.out.println(conf.totalCost() == 120); // VAT Included -> true
```

Also, we should be able to ask which employees have made the most expenses.

**This method should return the top 2 employees, that have made the most expenses.**

```java
Employee[] toFire = conf.mostExpensesMadeBy();

System.out.println(toFire[0].getName().equals("Ivaylo")); // true
```

## Example Main

Here is the example `TravelMain` class which starts it all:

```java
package com.hackbulgaria.programming51.week3;

public class TravelMain {

  public static void main(String[] args) {
    Employee ivo = new Employee("Ivaylo");
    Employee rado = new Employee("Rado");
    
    Travel conf = new Travel("Sofia", "Bulgaria", 20);
    
    TravelExpense dinnerRado = new TravelExpense("Dinner", rado, 50);
    TravelExpense dinnerIvo = new TravelExpense("Dinner", ivo, 50);
    
    conf.addExpense(dinnerRado);
    conf.addExpense(dinnerIvo);
    
    System.out.println(conf.totalCost()); // 120
    
    Employee[] toFire = conf.mostExpensesMadeBy();
    
    for(Employee employee: toFire) {
      System.out.println(employee);
    }

  }

}
```
