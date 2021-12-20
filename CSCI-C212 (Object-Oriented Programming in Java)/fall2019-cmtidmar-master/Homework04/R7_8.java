package homework_04;
import java.util.Arrays;
import java.util.Random;

public class R7_8 {
	public static void main(String[] args) {

		int[] a = new int[10];
		Random random = new Random();
		// Single
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
			}
		System.out.println(Arrays.toString(a));
		// Nested
		for (int i = 0; i < a.length; i++) {
			int num = 1 + random.nextInt(100);
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] == num) {
					count = count + 1;
					}
			}
		if (count > 0)
			i -= 1;
		else
			a[i] = num;

		}
		System.out.println(Arrays.toString(a));
	}

}
		