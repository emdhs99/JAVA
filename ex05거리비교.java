package festival5일차;

import java.util.Random;

public class ex05거리비교 {

	public static void main(String[] args) {
		int[] array = { 92, 32, 52, 9, 81, 2, 68 };


		int min1 = 100;
		for (int i = 0; i < 7; i++) {

			for (int j = 1; j < 7; j++) {

				if (array[i] - array[j] > 0) {
					if (array[i] - array[j] < min1) {
						min1 = array[i] - array[j];
					}
				}
			}
		}

		for (int i = 0; i < 7; i++) {

			for (int j = 1; j < 7; j++) {

				if (array[i] - array[j] == min1) {
					System.out.print("result = [" + i + "," + j + "]");
				}
			}
		}

	}
}
