public class EvenDigitSum {

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(922));

	}

	public static int getEvenDigitSum(int number) {
		//return the sum of the even digits within the number
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number != 0) {
			int remainder = number % 10;
			int afterdivision = number / 10;
			if (remainder % 2 == 0) {
				sum += remainder;
			} else {
				continue;
			}
		}
		return sum;
	}
}
