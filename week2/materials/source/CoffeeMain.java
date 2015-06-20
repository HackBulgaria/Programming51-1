package week2;

public class CoffeeMain {

	/**
	 * 
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		CoffeeMachine hack = new CoffeeMachine();
		Coffee java = new Coffee("Java0", 10);
		
		for(int i = 0; i < 100; i += 1) {
			Coffee currentJava = new Coffee("Java" + i, 10);
			hack.addCoffee(currentJava);
		}
		
		System.out.println(java);
		
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		hack.buyCoffee(java, 10);
		
		System.out.println(hack.getBalance());
		
	}

}
