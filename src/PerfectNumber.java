public class PerfectNumber {
	public static void main(String[] args) {

		System.out.println(isPerfectNumber(28));
//		listDivisor(30);

	}

	public static boolean isPerfectNumber(int number) {
		//A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
		//Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
		//For example, take the number 6:
		//Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.

		if (number < 1) {
			return false;
		}

		int sum = 0;
		for (int div = 1; div < number; div++) {
			if (number % div == 0) {
				sum += div;
			}
		}
		return sum == number;
	}
}

//	public static void listDivisor(int num) {
//		for (int divisor = 1; divisor <= num; divisor++) {
//			if (num % divisor == 0) {
//				System.out.println(" " + divisor);
//			}
//		}
//	}
//
//}
