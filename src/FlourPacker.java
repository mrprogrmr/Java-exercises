public class FlourPacker {
	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}

		int bigbag = bigCount * 5;
		int smallbag = smallCount * 1;
		boolean isMoreThanGoal = (bigbag + smallbag) >= goal ? true : false;

		if (!isMoreThanGoal) {
			return false;
		}

		if (bigbag > goal - smallbag) {
			return false;
		}

		while (bigbag > 0) {
			goal -= bigbag;
			if (bigbag == 0) {
				goal -= smallbag;
			}
			if (goal < 0) {
				return true;
			}
		}
		return true;
	}
}
