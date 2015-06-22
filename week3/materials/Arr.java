package week3;

public class Arr {

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int[] messUp(int[] a) {
		int[] temp = Arr.copy(a);
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				temp[i] = 0;
			}
		}
		return temp;
	}

	public static int[] copy(int[] a) {
		int[] temp = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		return temp;
	}

	public static int[] sort(int[] a) {
		int[] result = copy(a);
		for (int i = 0; i < result.length; i++) {

			int index = i;
			for (int j = i; j < result.length; j++) {
				if (result[j] < result[index]) {
					index = j;
				}
			}

			int temp = result[i];
			result[i] = result[index];
			result[index] = temp;
		}

		return result;
	}

	public static void kamenSort(int[] a) {
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[j] < a[i]){
					//swap
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				print(a);
			}
		}
	}
}




