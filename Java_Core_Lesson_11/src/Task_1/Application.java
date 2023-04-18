package Task_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		Integer[] arr = new Integer[randomInt(5, 20)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomInt(0, 1000);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.deepToString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(arr));
	}

	static int randomInt(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
