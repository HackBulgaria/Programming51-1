# 6-Fridge

In a `com.hackbulgaria.programming51.week2` package do the following:

## Define a `class Food` where you:

### Define the following:
	* name
	* type - "Milk", "Sweet", "Vegetable", "Fruit", "Bevarage"
	* weight - in grams
	* Proper constructors
	* public String toString() method

## Define a `class Fridge` where you:

### Define the following:
	* An array of Food
	* Capacity - maximum number of Foods in the fridge
	* Weight - maximum capacity of Fridge
	* Proper consructors
	* public boolean addFood(Food f) method to add food to your refrigerator
	* public int getFoodsCount() method to count the foods you've added
	* public String toString() method
	* public String [] getProductsOfType(String type) that returns all the Food of a certain type
	* public int getWeight() that returns the weight of the Fridge at the moment
	* public int getMaxWeight() that returns the maximum weight capacity of the Fridge
	* public Food getHeaviestFood() that returns the heaviest Food in the Fridge
	* public int getCapacity() that returns the capacity of the Fridge


## Examples:

### Example for `addFood(Food f)` and `toString()`

```java
	Fridge fridge = new Fridge(10);
	fridge.addFood(new Food("Cheese", "Milk", 300));
	fridge.addFood(new Food("Milk", "Milk", 1000));
	fridge.addFood(new Food("Beer", "Bevarage", 500));

	System.out.println(fridge);
```

Should print:

```
Cheese - Milk: 300grams
Milk - Milk: 1000grams
Beer - Bevarage: 500grams
```

### Example for `getFoodsCount()`

```java
	Fridge fridge = new Fridge(10);
	fridge.addFood(new Food("Cheese", "Milk", 300));
	fridge.addFood(new Food("Milk", "Milk", 1000));
	fridge.addFood(new Food("Beer", "Bevarage", 500));

	System.out.println(fridge.getFoodsCount());
```

Should print:

```
	3
```

### Example for `getProductsOfType(String type)`

```java
	Fridge fridge = new Fridge(10);
	fridge.addFood(new Food("Cheese", "Milk", 300));
	fridge.addFood(new Food("Milk", "Milk", 1000));
	fridge.addFood(new Food("Beer", "Bevarage", 500));

	String [] temp = fridge.getProductsOfType("Milk");
	for(int i=0; i<type.length; i++){
		System.out.println(temp[i]);
	};
```

Should print:

```
	Cheese - Milk: 300grams
	Milk - Milk: 1000grams
```

### Example for `getWeight()`

```java
	Fridge fridge = new Fridge(10);
	fridge.addFood(new Food("Cheese", "Milk", 300));
	fridge.addFood(new Food("Milk", "Milk", 1000));
	fridge.addFood(new Food("Beer", "Bevarage", 500));

	System.out.println(fridge.getWeight());
```

Should print:

```
	1800
```

### Example for `getMaxWeight()`

```java
	Fridge fridge = new Fridge(10, 3000);
	
	System.out.println(fridge.getMaxWeight());
```

Should print:

```
	3000
```

### Example for `getHeaviestFood()`

```java
	Fridge fridge = new Fridge(10, 3000);
	fridge.addFood(new Food("Cheese", "Milk", 300));
	fridge.addFood(new Food("Milk", "Milk", 1000));
	fridge.addFood(new Food("Beer", "Bevarage", 500));

	System.out.println(fridge.getHeaviestFood());
```

Should print:

```
	Milk - Milk: 1000grams
```
### Example for `getCapacity()`

```java
	Fridge fridge = new Fridge(10, 3000);
	
	System.out.println(fridge.getCapacity());
```

Should print:

```
	10
```