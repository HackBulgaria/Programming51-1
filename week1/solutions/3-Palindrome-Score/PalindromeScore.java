package week1;

public class PalindromeScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 48;
		int counter = 1;
		while (true) { // reverse
			int num = a;
			int rev = 0;
			while (num > 0) {
				rev *= 10;
				rev += num % 10;
				num /= 10;
			}
			if (a == rev) {
				break;
			}
			a = a + rev;
			counter++;
		}

		System.out.println(counter);
	}

}
