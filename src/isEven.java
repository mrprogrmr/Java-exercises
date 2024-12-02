public class isEven {

	public static void main(String[] args) {

		int startnumber = 4;
		int finishnumber = 20;
		int evenCount = 0;
		int oddCount = 0;

		while (startnumber <= finishnumber) {
			startnumber++;
			if (!isEvenNumber(startnumber)) {
				oddCount++;
				continue;
			}
			System.out.println("Even number " + startnumber);
			evenCount++;
			if (evenCount >= 5) {
				break;
			}
		}
		System.out.println("Total odd numbers found = " + oddCount);
		System.out.println("Total even numbers found = " + evenCount);


	}

	public static boolean isEvenNumber(int num) {
		return num > 0 && num % 2 == 0;
	}
}
