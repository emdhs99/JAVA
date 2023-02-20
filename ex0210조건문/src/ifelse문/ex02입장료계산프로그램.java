package ifelse문;

import java.util.Scanner;

public class ex02입장료계산프로그램 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);	
		System.out.print("나이를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		

		
		
		//*****지역변수(local variable)******
		// : {} 영역 안에서 선언된 변수는 {} 영역안에서만 사용 가능하다!!!
		// ->{} : scope
		if(num1 < 20) {
	
			System.out.println((int)(5000 * 0.5 * num2) + "원 입니다");
			
		} else {

			System.out.println(5000 * num2 + "원 입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
