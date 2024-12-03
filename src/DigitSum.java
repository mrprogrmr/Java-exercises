public class DigitSum {

	public static void main(String[] args) {

		System.out.println("The sum of digits in 1234 is: " + sumDigit(1234));
		System.out.println("The sum of digits in 986 is: " + sumDigit(986));
		System.out.println("The sum of digits in -98220 is: " + sumDigit(-98220));

	}

	public static int sumDigit(int number) {
		if(number < 0) {
			return -1;
		}

		int sum = 0;
		while (number > 9) {
			sum += (number % 10);
			number = number / 10;
		}

		sum += number;
		return sum;
	}
}
