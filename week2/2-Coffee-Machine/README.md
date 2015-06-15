# Coffee Machine

In a `com.hackbulgaria.programming51.week2` package create a `CoffeeMachine` class, where you have the following attributes:

* `Coffee[] cupsOfCoffee` - an array for `Coffee`. One coffee machine can hold up to `100` cups of coffee.
* `float balance` - the current money balance in the coffee machine.


**And the following methods:**

* Create method for adding `Coffee` in the machine - `public boolean addCoffee(Coffee coffee)`. The method should return `true` if you can add that coffe to the machine. Otherwise, return `false` (more than 100 cups are added)
* Create function for buying `Coffee` from the Coffee Machine `public float buyCoffee(String name, float price)`. This method recieves coffee name and money given by the buyer. If the coffee name exsists in the coffee array - return the change. If it doesn't - return `-1`.

Example in main:

```java
CoffeeMachine cm = new CoffeeMachine();
Coffee java = new Coffee();
Coffee latte = new Coffee();

java.name = "Java";
java.price = 1.00;

latte.name = "Latte";
latte.price = 1.50;

cm.addCoffee(java);
cm.addCoffee(latte);

System.out.println(cm.buyCoffee("Latte",3.40));
System.out.println("Current balance: " + cm.balance));
```

Should return:

```java
1.90
Current balance: 1.50
```
