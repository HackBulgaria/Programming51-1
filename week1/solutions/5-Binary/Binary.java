package week1;

public class Binary {
	
	public static String toBinary(int n) {
		String binary = "";
		while (n > 0) {
			int lastBinDigit = n % 2;
			binary = lastBinDigit + binary;

			n = n / 2;
		}
		return binary;
	}

	public static int toNumber(String binary) {
		int n=0;
		int len = binary.length() -1;
		for (int i = len; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				n += pow(2,(len-i));
			}
		}

		return n;
	}
	
	public static int pow(int num, int power){
		int sum = 1;
		for(int i=0;i<power;i++){
			sum *= num;
		}
		return sum;
	}
	
	public static int countBits(int n){
		int counter = 0;
		while(n>0){
			n = n / 2;
			counter++;
		}
		return counter;
	}
	
	public static boolean isPowerOfTwo(String binary){
		int counter = 0;
		for(int i=0;i<binary.length();i++){
			if(binary.charAt(i) == '1'){
				counter++;
			}
		}
		return counter == 1;
	}
}
