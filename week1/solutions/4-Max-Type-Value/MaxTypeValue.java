package week1;

public class MaxTypeValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 0;
		while (a >= 0) {
			a += 50000;
			System.out.println(a);
		}
		
		long  b = 0;
		while(b>=0){
			b += 1000000000000000l; // This lower-case L means that the number I typed is in Long format
			System.out.println(b);
		}
		
		// This is an Endless Loop, because float does not overflow due to the way it is presented in the memory
		float c = 0;
		while( c>= 0){
			c += 100000000000000000000000000000000000000f;
			System.out.println(c);
		}
		
		// This is also an Endless Loop because double is presented differently in the computer memory
		double d = 0;
		while( d>= 0){
			// Yes, double can hold such a big number
			d += 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000d;
			System.out.println(d);
		}
	}

}
