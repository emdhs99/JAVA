package 이차원배열;

import java.util.Scanner;

public class ex02이차원배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int num1 = sc.nextInt();
		System.out.print("열 : ");
		int num2 = sc.nextInt();
		int[][] array = new int[num1][num2];
		System.out.print("몇부터 시작할래? : ");
		int num3 = sc.nextInt();
		
		int num = num3;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
