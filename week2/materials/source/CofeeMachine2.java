package week2_beforehand;

public class CoffeeMachine {
	public Coffee[] coffees;
	public int capacity = 10;
	public int coffeeCount = 0;
	public double balance = 0;

	public CoffeeMachine() {
		this.coffees = new Coffee[capacity];
	}

	public CoffeeMachine(int capacity) {
		this.capacity = capacity;
		this.coffees = new Coffee[capacity];
	}

	public boolean addCoffee(Coffee c) {
		if (coffeeCount < capacity) {
			coffees[coffeeCount] = c;
			coffeeCount++;
			return true;
		}
		return false;
	}

	public double buyCoffee(String name, double money) {

		for (int i = 0; i < coffeeCount; i++) {
			if (coffees[i].brand.equals(name)) {
				if (coffees[i].price <= money) {
					money -= coffees[i].price;
					balance += coffees[i].price;
				}
				
				return money;
			}
		}
		return money;
	}
}