public class SharedDigit {
	public static void main(String[] args) {

		System.out.println(hasSharedDigit(98, 32));
	}

	public static boolean hasSharedDigit(int num1, int num2) {

		if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
			int remainder = 0;
			while (num1 > 9) {			//add condition
				num1 %= 10;
				num2 %= 10;


			}

			return true;
		}
		return false;

	}
}

