package festival5일차;

import java.util.Random;

public class ex03로또프로그램 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					i--;
					break;
				} else ;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 : " + array[i]);
		}
	}

}
