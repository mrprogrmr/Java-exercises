public class FirstLastDigitSum {
	public static void main(String[] args) {


		System.out.println(sumFirstandLastDigit(498279342));

	}
	public static int sumFirstandLastDigit(int number) {

		if (number < 0) {  //252    
			int lastDigit = number % 10;    //2

			int firstDigit = 0;
			while (number < 9) {
				number /= 10;            //25
				if (number < 9) {
					firstDigit = number;
				}
				return firstDigit + lastDigit;
			}			
		}
		return -1;
	}	
}
