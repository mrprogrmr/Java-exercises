public class LastDigitChecker {
	public static void main(String[] args) {

		System.out.println(hasSameLastDigit(33, 23, 830));
		System.out.println(isValid(270));
	}

	public static boolean isValid(int num) {
		return num >= 10 && num <= 1000;
	}

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {

		if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
			return false;
		}

		int lastDigit1 = num1 % 10;
		int lastDigit2 = num2 % 10;
		int lastDigit3 = num3 % 10;

		return lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3;
	}
}
