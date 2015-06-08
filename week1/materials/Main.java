package datastructures;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int a = 5; int b = 13; System.out.println("a + b = " + (a + b));
		 * 
		 * for (int i = 0; i < 10; i++) { System.out.println("i = " + i); }
		 * 
		 * if (a == b) { System.out.println("a is smaller!"); } else {
		 * System.out.println("b is smaller!"); }
		 * 
		 * int i = 0; while (i < 10) { System.out.println("i = " + i); i++; }
		 * 
		 * i = 0; do { System.out.println("i = " + i); if(i >= 10){ break; } i++; }
		 * while (true);
		 */

		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(a[0]);
		a[1] = 15;
		System.out.println(a[1]);

		int[] b = new int[10];
		
		char c = 'h';
		
		char [] str = new char[20];

		for (int i = 10; i < 20; i++) {
			b[i - 10] = i;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(b[i]);
		}

	}
}

