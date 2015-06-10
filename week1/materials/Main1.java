package week1;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String name = "Kamen"; String sirname = "Kotsev";
		 * 
		 * int a = 612341234; String fullname = name + " " + sirname + a;
		 * 
		 * System.out.println(fullname);
		 */
		/*
		 * int [] a = new int[5];
		 * 
		 * a[5] = 3;
		 */
		
		double a = 5;
		double b = 2;

		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();

		System.out.println( devider(a,b) );
		
	}
	
	public static double devider(double a, double b){
		double c = a/b;
		return c;
	}

	public static String reverse(String name) {

		String tempName = "";

		for (int i = 0; i < name.length(); i++) {
			tempName = name.charAt(i) + tempName;
		}

		return tempName;
	}

	public static int sum(int x, int y) {
		return x + y;
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

}
