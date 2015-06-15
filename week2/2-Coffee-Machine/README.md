# 2-Coffee-Machine

In a `com.hackbulgaria.programming51.week2` package create a `CoffeeMachine` class, where you:

* Use an array of Coffee
* Create method for adding `Coffee` type to the array `public void addCoffee(Coffee coffee)`
* Create function for buying `Coffee` from the Coffee Machine `public float buyCoffee(String name, float price)`. This method recieves coffee name and money given by the buyer. If the coffee name exsists in the coffee array - return the change. If it doesn't - return the ammout given.

Example:
In main:

```java
CoffeeMachine cm = new CoffeeMachine();
cm.addCoffee("Java",1.00);
cm.addCoffee("Latte",1.50);
System.out.println(cm.buyCoffee("Latte",3.40));
```

Should return:

```java
1.90
```