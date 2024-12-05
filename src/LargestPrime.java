public class LargestPrime {
	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
	}

	public  static int getLargestPrime(int number) {
		if (number < 0) {
			return -1;
		}

//		int largestFactor = 0;
		int largesPrimeFactor = 0;

		for (int factor = 1; factor < number; factor++) {
			if (number % factor == 0) {
//				largestFactor = factor;
			}
			if (isPrime(factor)) {
				largesPrimeFactor = factor;
			}
		}
		return largesPrimeFactor;
	}

	public static boolean isPrime(int num) {
		if (num <= 2) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
