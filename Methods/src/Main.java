

public class Main {

	public static void main(String[] args) {
		numFinder();
		numFinder();
	}

	private static void numFinder() {
		// mükemmel sayı örn:6-->6 1,2,3e tam bolunur ve 1+2+3=6dır.
		// örn:28-->28 1,2,4,7,14e tam bölünür ve 1+2+4+7+14=28dir.
		int num = 576;
		int total = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total += i;
			}
		}
		if (total == num) {
			Output(num);
		} else {
			System.out.println("mükemmel sayı değildir:"+num);
		}

	}
	public static void Output(int num) {
		System.out.println("mükemmel sayı:"+num);
	}
}
