package while문;

import java.util.Scanner;

public class ex02while문예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		int input = 0;

		// 2. 정수 입력 : 출력하기
//		while (input < 10) {
//			System.out.print("정수 입력 : ");
//
//			// 3. 정수 입력 받기
//			input = sc.nextInt();
//		}
//		System.out.println("종료되었습니다.");

		// 2~3구간이 반복! 10보다 큰수를 입력하면 종료!!

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		while(num1 <= 10) {
//			System.out.print("정수 입력 : ");
//			 num1 = sc.nextInt();		
//			}
//		System.out.println("종료되었습니다.");

		// 무한 반복문
		while (true) {
			System.out.print("정수 입력 : ");

			input = sc.nextInt();
			if(input > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
