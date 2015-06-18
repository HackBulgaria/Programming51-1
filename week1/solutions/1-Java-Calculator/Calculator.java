package week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		if (oper == '+') {
			System.out.println(a + " + " + b + " = " + (a + b));
		}

		if (oper == '-') {
			System.out.println(a + " - " + b + " = " + (a - b));
		}

		if (oper == '*') {
			System.out.println(a + " * " + b + " = " + (a * b));
		}

		if (oper == '/') {
			System.out.println(a + " / " + b + " = " + (a / b));
		}

		if (oper == '^') {
			int p = 1;
			for (int i = 0; i < b; i++) {
				p *= a;
			}
			System.out.println(a + " ^ " + b + " = " + p);
		}

		if (oper == '?') {
			int factA = 1;
			for(int i=1;i<=a;i++){
				factA *= i;
			}
			
			int factB = 1;
			for(int i=1;i<=b;i++){
				factB *= i;
			}
			System.out.println(a + " ? " + b + " = " + (factA + factB));
		}

	}

}