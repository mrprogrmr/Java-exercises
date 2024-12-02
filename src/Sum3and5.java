public class Sum3and5 {
	public static void main(String[] args) {

		int totalnums = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("The number " + i + " is divisible by 3 and 5.");
				totalnums++;
				if (totalnums == 5) {
					break;
				}
			}
		}
		System.out.println("The total number of numbers divisible by " +
				"3 and 5 in the range for 1 to 1000 is: " + totalnums);

	}
}
