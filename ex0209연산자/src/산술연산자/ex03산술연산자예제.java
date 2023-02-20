package 산술연산자;

import java.util.Scanner;

public class ex03산술연산자예제 {

	public static void main(String[] args) {

		//1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 출력하기(개행없이)
		System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		int num = sc.nextInt();
		// 4. 백의 자리 이하를 버리기
		// 백의 자리만 구하기
		int result = num / 100 * 100;
		// 백의 자리 미만의 숫자를 구하기
		int result2 = num % 100;
		
		// 5. 결과값 출력하기
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + result2);
		
		
		
	}

}
