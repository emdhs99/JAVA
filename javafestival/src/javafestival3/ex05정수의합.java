package javafestival3;

import java.util.Scanner;

public class ex05정수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		int sum = 0;

		while (true) {
			
			sum += num % 10;
			num = num / 10;
			
			if (num == 0) {
				System.out.print("합은" + sum + "입니다.");
				break;
			}
		}

	}

}