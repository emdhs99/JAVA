package dowhile문;

import java.util.Scanner;

public class dowhile과제 {
	public static void main(String[] args) {

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 입력 받기
		System.out.print("현재 몸무게 입력 : ");
		int weight = sc.nextInt();
		// 3. 목표 몸무게 입력받기
		System.out.print("목표 몸무게 입력 : ");
		int goal = sc.nextInt();

		// 4. 주차별 감량 몸무게 입력
		int week = 1;
		while (true) {
			System.out.println(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			// 5. 현재몸무게 = 원래 몸무게 - 감량몸무게
			weight = weight - minus;
			// 5-2. 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
			if (weight <= goal) {
				System.out.println(weight + "kg 달성!! 축하합니다!");
				break;
			}

		}
//			Scanner sc = new Scanner(System.in);
//
//			System.out.print("현재 몸무게 : ");
//			int num1 = sc.nextInt();
//
//			System.out.print("목표 몸무게 : ");
//			int num2 = sc.nextInt();
//
//			int num3 = 1;
//			while (true) {
//
//				if (num2 < num1) {
//					System.out.print(num3 + "주차 감량 몸무게 : ");
//					int num4 = sc.nextInt();
//
//					num1 = num1 - num4;
//
//				} else if (num2 >= num1) {
//					System.out.println(num1 + "kg 달성! 축하드립니다!!");
//					break;
//				}
//				num3++;
//
//			}

	}

}
