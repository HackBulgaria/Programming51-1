# 4-Auto-Shop

In a `com.hackbulgaria.programming51.week2` package create an `AutoShop` class where you:

* Contain an array of `Auto`
* Create a method for adding cars to the shop `public static void addCar(Auto)`
* Create a method for finding the car in the shop with the top speed `public Auto getTopSpeed()`
* Create a method for printing all the cars in `AutoShop`. Brand, Max Speed, Price, Owner

Example:
In main:

```java
Person ivan = new Person();
ivan.name = "Ivan";
ivan.age = 25;

Auto audi = new Auto();

audi.owner = ivan;
audi.maxSpeed = 200;
audi.brand = "Audi";
audi.name = "Begachka";
audi.price = 5000;

Person gosho = new Person();
gosho.name = "Gosho";
gosho.age = 25;

Auto peugeot = new Auto();

audi.owner = gosho;
audi.maxSpeed = 220;
audi.brand = "Peugeot";
audi.name = "Dragster";
audi.price = 10000;

AutoShop as = new AutoShop();
as.addCar(audi);
as.addCar(peugeot);

System.out.println(as.getTopSpeed());
```

Should print:

```java
Audi Begachka, Max Speed: 200, Price: 5000, Owner: Ivan(25)
```