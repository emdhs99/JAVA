package javafestival6;

import java.util.Scanner;

public class ex02배열스네이크 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int num1 = sc.nextInt();
		System.out.print("열 : ");
		int num2 = sc.nextInt();
		int[][] array = new int[num1][num2];

		int num = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + "\t");

				}

			} else {
				for (int j = array.length-1 ; j >= 0; j--) {
					System.out.print(array[i][j] + "\t");
				}
			}

			System.out.println();
		}

	}

}
