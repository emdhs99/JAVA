package fesrival2일차;

import java.util.Scanner;

public class ex몸무게 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int num1 = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int num2 = sc.nextInt();

		int target = 1;
		while (true) {

			if (num2 < num1) {
				System.out.print(target + "주차 감량 몸무게 : ");
				int num3 = sc.nextInt();

				num1 = num1 - num3;

			} else if (num2 >= num1) {
				System.out.println(num1 + "kg 달성! 축하드립니다!!");
				break;
			}
			target++;

		}

	}

}
