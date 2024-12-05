import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(reverse(array)));
	}

	private static int[] reverse(int[] array) {

		int temp;
		int j = array.length-1;
		for (int i = 0; i < (array.length/2); i++) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}
		return array;
	}
}
