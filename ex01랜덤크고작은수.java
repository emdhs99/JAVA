package festival5일차;

import java.util.Random;

public class ex01랜덤크고작은수 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] array = new int[8];

		int max = 0;
		int min = 100;
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;

			if (array[i] > max) {
				max = array[i];

			} else if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.print("배열에 있는 모든 값 : ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
