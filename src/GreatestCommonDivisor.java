public class GreatestCommonDivisor {
	// write code here

	public static void main(String[] args) {

		System.out.println(getGreatestCommonDivisor(15, 45));
	}

	public static int getGreatestCommonDivisor(int num1, int num2) {
		if (num1 < 10 || num2 < 10) {
			return -1;
		}

		int min = num1 < num2 ? num1 : num2;
		int gcd = 1;
		for (int j = 1; j <= min; j++) {
			if (num1 % j == 0 && num2 % j == 0) {
				gcd = j;
			}
		}
		return gcd;
	}
}