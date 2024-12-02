public class NumberPalindrome {
	// write code here

	public static void main(String[] args) {
		boolean test = isPalindrome(575);
		System.out.println(test);
	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int original = number;

		while (0 != original) {
			reverse = reverse * 10 + original % 10;
			original /= 10;
		}
		return reverse == number;
	}
}