public class EvenDigitSum {

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(123456789));

	}

	public static int getEvenDigitSum(int number) {
		if (number < 0) {return -1;}


		int evenSum = 0;
		int oddSum = 0;

		for (int i = number; i > 0; i /= 10){
			int lastDigit = i % 10;
			if (isEven(lastDigit)) {
				evenSum += lastDigit;
			} else {
				oddSum += lastDigit;
			}
		}

		// == alternative using while loop ==
		// while (number > 0) {
		//     int lastDigit = number % 10;
		//     if (lastDigit % 2 == 0) {
		//         sum += lastDigit;
		//     }
		//     number /= 10;
		// }

		System.out.println("The sum of odd digits is: " + oddSum);
		System.out.println("The sum of odd digits is: " + evenSum);
		return evenSum;

	}
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
