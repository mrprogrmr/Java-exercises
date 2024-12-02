public class primeCounter {

	public static void main(String[] args) {

		int counter = 0;
		for (int i = 50; i <= 140; i++) {
			if (isPrime(i)) {
				System.out.println("The number " + i + " is a prime number.");
				counter++;
				if (counter == 5) {
					System.out.println(counter);
					break;
				}
			}
		}
		System.out.println("Total number of prime numbers is: " + counter);
	}

	public static boolean isPrime(int num) {
		if (num <= 2) {
			return (num == 2);
		}
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
