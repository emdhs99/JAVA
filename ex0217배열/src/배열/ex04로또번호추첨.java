package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex04로또번호추첨 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] array = new int[6];

		System.out.println("======로또타임======");
		System.out.println("이번주 출력 번호는요...!!두근두근두근!!");

		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					i--;
					break;

				}
			}
			
		}
		Arrays.sort(array);
		//Arrays.sort 오름차순
		//Arrays.toString 배열
		System.out.println(Arrays.toString(array));

	}
}
