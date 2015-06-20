package week2;

public class Coffee {
	public String brand;
	public double price;
	
	public Coffee(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return brand + " " + price;
	}
}
