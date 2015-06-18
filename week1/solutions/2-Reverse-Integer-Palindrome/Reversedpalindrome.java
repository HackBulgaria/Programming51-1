package week1;

import java.util.Scanner;

public class ReversedPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int nRev = 0;
		int nTemp = n;
		// reverse n
		while (nTemp > 0) {
			nRev = (nRev * 10) + nTemp % 10;
			nTemp = nTemp / 10;
		}

		// check if n + nRev is a palindrome

		int nSum = n + nRev;
		int nSumRev = 0;
		while (nSum > 0) {
			nSumRev = (nSumRev * 10) + nSum % 10;
			nSum = nSum / 10;
		}

		// check if (n + nRev) == Reversed(n + nRev) to see if the sum is a
		// palindrome
		if (nSumRev == n + nRev) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
