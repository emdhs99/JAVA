package festival5일차;

import java.util.Scanner;

public class ex02의배수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[11];

		for (int i = 1; i < array.length; i++) {
			System.out.print(i + "번 째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수 : ");

		for (int i = 1; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
