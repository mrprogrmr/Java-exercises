public class LastDigitChecker {
	public static void main(String[] args) {

		System.out.println(hasSameLastDigit(34, 23, 8932));
	}

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {

		if (num1 >= 10 && num1 <= 1000 && num2 >= 10
				&& num2 <= 1000 && num3 >= 10 && num3 <= 1000){



			return true;
		}

		return false;
	}
}
