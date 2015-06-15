# 3-Auto

In a `com.hackbulgaria.programming51.week2` package create an `Auto` class, and a `Person`

The `Person` class represents the owner of the car and has:
* `firstName`
* `lastName`.

The `Auto` class represents a car and has:
* `owner` (Person)
* `maxSpeed`
* `brand` 
* `name`
* `price`

Define toString method to both classes and print them.

Example:
In main:

```java
Person Ivan = new Person();
Ivan.name = "Ivan";
Ivan.age = 25;

Auto audi = new Auto();

audi.owner = Ivan;
audi.maxSpeed = 200;
audi.brand = "Audi";
audi.name = "Begachka";
audi.price = 5000;

System.out.println(audi);
```

Should print:

```java
Audi Begachka, Max Speed: 200, Price: 5000, Owner: Ivan(25)
```